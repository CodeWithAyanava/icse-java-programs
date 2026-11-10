<div align="center">

# ⌨️ Chapter 04 · Input in Java

*Initialisation · Parameters · Packages · Scanner class · Types of errors · Types of comments*

[⬅ Back to Index](../README.md)

</div>

---

## 📑 Contents

1. [Three ways of giving input](#1-three-ways-of-giving-input)
2. [Packages and the `import` statement](#2-packages-and-the-import-statement)
3. [The Scanner class](#3-the-scanner-class)
4. [The `nextLine()` trap](#4-the-nextline-trap)
5. [Types of errors](#5-types-of-errors)
6. [Types of comments](#6-types-of-comments)
7. [Find the error](#7-find-the-error)
8. [Differentiate between](#8-differentiate-between)
9. [One-line facts](#9-one-line-facts)
10. [Test yourself](#-test-yourself)
11. [Programs in this chapter](#-programs-in-this-chapter)

---

## 1. Three ways of giving input

| Method | When the data is given | Example |
|---|---|---|
| **Initialisation** (assignment) | **Before execution** — the values are written in the program itself | `int a = 5, b = 10;` |
| **Parameters** (arguments) | **At the time of execution** — values are passed to a method when it is called | `velocity(10, 2.5, 4);` → `void velocity(double u, double a, double t)` |
| **Input stream** (Scanner) | **During execution** — the user types the data while the program is running | `int n = sc.nextInt();` |

- **Initialisation** is simple, but the program always works on the same data; to change the data, the program must be edited and recompiled.
- **Parameters** allow the same method to work on different values each time it is called. (In BlueJ the values are typed into a dialog box when the method is invoked.)
- An **input stream** is a flow (sequence) of data from an input device (keyboard) to the program. `System.in` represents the **standard input stream** (keyboard).

---

## 2. Packages and the `import` statement

A **package** is a **collection (group) of related classes and interfaces**. It is like a folder that organises the Java library.

| Package | Contains | Import needed? |
|---|---|---|
| `java.lang` | `Math`, `String`, `System`, wrapper classes (`Integer`, `Character`, …) | **No** — imported **by default** |
| `java.util` | `Scanner` and other utility classes | Yes |
| `java.io` | Input/output classes (`BufferedReader`, `InputStreamReader`, …) | Yes |
| `java.awt`, `java.applet` | Graphics / applet classes | Yes |

The **`import` statement** makes the classes of a package available to a program. It is written at the **beginning** of the program, before the class.

```java
import java.util.Scanner;   // imports only the Scanner class
import java.util.*;         // imports all classes of java.util (* = wildcard)
```

> [!NOTE]
> `import` does **not** copy code into the program — it only tells the compiler where to find the class. `import java.util.*;` does **not** import sub-packages.

---

## 3. The Scanner class

The **Scanner** class of the **`java.util`** package is used to accept input from the keyboard (and other sources). It breaks the input into **tokens** using **whitespace** (space, tab, new line) as the **delimiter**.

**Creating a Scanner object**
```java
Scanner sc = new Scanner(System.in);
```

| Method | Return type | Reads |
|---|---|---|
| `nextShort()` | `short` | a short integer |
| `nextInt()` | `int` | an integer |
| `nextLong()` | `long` | a long integer |
| `nextFloat()` | `float` | a real number (float) |
| `nextDouble()` | `double` | a real number (double) |
| `nextBoolean()` | `boolean` | `true` / `false` |
| `next()` | `String` | **one word** (up to the next whitespace) |
| `nextLine()` | `String` | **the rest of the current line**, including spaces |
| `next().charAt(0)` | `char` | the first character of the next word |

> [!IMPORTANT]
> Scanner has **no `nextChar()`** method. A single character is read as `sc.next().charAt(0)`.

**Example**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter marks: ");
int m = sc.nextInt();
```
If the user types `abc` instead of a number, the program stops with an **`InputMismatchException`** (a runtime error).

---

## 4. The `nextLine()` trap

`nextInt()`, `nextDouble()`, `next()` etc. read a token but **leave the new-line character (`\n`)** of the Enter key in the input buffer. A following `nextLine()` reads that leftover `\n` and returns an **empty string** at once.

```java
int age = sc.nextInt();          // user types 15⏎  → "15" read, "\n" left behind
String name = sc.nextLine();     // ❌ reads the leftover "\n" → name = ""
```

**Fix:** add an extra `sc.nextLine();` to consume the leftover new line.

```java
int age = sc.nextInt();
sc.nextLine();                   // consumes the leftover "\n"
String name = sc.nextLine();     // ✅ now reads the full name
```

| Basis | `next()` | `nextLine()` |
|---|---|---|
| Reads | One word | The whole line |
| Stops at | Whitespace | End of line (new line) |
| Spaces in input | Not included | Included |
| Leading whitespace | Skipped | Kept |
| Input `"  Sachin Tendulkar"` gives | `"Sachin"` | `"  Sachin Tendulkar"` |

---

## 5. Types of errors

An **error** is a mistake in a program that either stops it from compiling/running or makes it give wrong results. A mistake is also called a **bug**, and removing it is **debugging**.

### 5.1 Syntax error (compile-time error)
Occurs when the **rules (grammar) of the language are violated**. It is detected by the **compiler**, and the program does not compile until it is corrected.

```java
int a = 5                     // missing semicolon
System.out.printn("Hi");      // misspelt method name
int x = 3.5;                  // incompatible types (lossy conversion)
Int n = 10;                   // Int instead of int (case sensitive)
```

### 5.2 Runtime error
Occurs **during execution** when the program asks the computer to do something **impossible**. The program compiles successfully but stops abruptly (**abnormal termination**) with an **exception**.

```java
int a = 10 / 0;               // ArithmeticException: / by zero
int arr[] = new int[5];
arr[5] = 1;                   // ArrayIndexOutOfBoundsException
int n = sc.nextInt();         // user enters "abc" → InputMismatchException
"Java".charAt(10);            // StringIndexOutOfBoundsException
Integer.parseInt("12a");      // NumberFormatException
```

### 5.3 Logical error
Occurs when the program compiles and runs **without stopping** but gives **wrong output** because of a **mistake in the logic**. It is the **hardest** to detect, as neither the compiler nor the JVM reports it.

```java
double avg = (a + b + c) / 3;       // integer division — wrong average
double area = 2 * 3.14 * r;         // circumference formula used for area
if (n % 2 == 1) ... "Odd"           // wrong for negative odd numbers
```

| Basis | Syntax error | Runtime error | Logical error |
|---|---|---|---|
| Cause | Grammar rules broken | Impossible operation during execution | Wrong logic |
| Detected by | Compiler | JVM, during execution | Programmer, by testing |
| Program compiles? | No | Yes | Yes |
| Program runs? | No | Stops abruptly | Runs, wrong output |
| Example | Missing `;` | Division by zero | Wrong formula |

---

## 6. Types of comments

**Comments** are non-executable remarks written in a program to **explain** it. They are **ignored by the compiler**.

| Type | Syntax | Use |
|---|---|---|
| **Single-line comment** | `// text` | A short remark up to the end of the line |
| **Multi-line comment** | `/* text over several lines */` | A longer explanation |
| **Documentation comment** | `/** text */` | Used by the `javadoc` tool to produce documentation |

```java
/* Program to find the area of a circle
   Written for ICSE practice */
double area = 3.14 * r * r;   // area = pi r squared
```

> [!WARNING]
> Multi-line comments **cannot be nested**: `/* outer /* inner */ still outer? */` — the first `*/` ends the comment and the rest causes a syntax error.

---

## 7. Find the error

```java
import java.util.scanner;
class Input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner();
        System.out.print("Enter radius")
        double r = sc.nextdouble();
        char c = sc.nextChar();
        System.out.println("Area = " + 3.14 * r * r);
    }
}
```

<details>
<summary><b>Show corrected code</b></summary>

```java
import java.util.Scanner;                    // class name Scanner (capital S)
class Input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // System.in must be passed
        System.out.print("Enter radius");    // missing semicolon
        double r = sc.nextDouble();          // nextDouble (capital D)
        char c = sc.next().charAt(0);        // there is no nextChar()
        System.out.println("Area = " + 3.14 * r * r);
    }
}
```
</details>

---

## 8. Differentiate between

| Pair | Difference |
|---|---|
| Initialisation vs Scanner input | Data fixed before execution vs typed by the user during execution |
| Parameter vs Scanner input | Values passed when the method is called vs values typed during execution |
| `next()` vs `nextLine()` | One word vs whole line |
| Syntax vs logical error | Detected by compiler vs not detected; gives wrong output |
| Runtime vs logical error | Program stops abruptly vs program runs with wrong output |
| `//` vs `/* */` | Single line vs multiple lines |
| `java.lang` vs `java.util` | Imported by default vs must be imported |

---

## 9. One-line facts

- `Scanner` belongs to the package **`java.util`**.
- The package imported by default is **`java.lang`**.
- `System.in` refers to the **standard input device (keyboard)**.
- Scanner uses **whitespace** as its default delimiter.
- A character is read using **`sc.next().charAt(0)`**.
- Entering a word when `nextInt()` expects a number causes **`InputMismatchException`**.
- **Logical errors** are the most difficult to find.
- `*` in `import java.util.*;` is called the **wildcard** character.
- Documentation comments begin with **`/**`**.

---

## 🧠 Test Yourself

### Part A — Multiple choice

1. Input typed: `25⏎Ravi Kumar⏎`. Code: `int a = sc.nextInt(); String s = sc.nextLine();` What is stored in `s`?
   <br>(a) `"Ravi Kumar"` (b) `"Ravi"` (c) `""` (empty string) (d) InputMismatchException
2. Input typed: `   hello world⏎`. Which call returns `"hello"`?
   <br>(a) `nextLine()` (b) `next()` (c) `nextLine().trim()` (d) `next().charAt(0)`
3. *Assertion (A):* `Math.sqrt()` can be used without any `import` statement.
   <br>*Reason (R):* The `Math` class belongs to the `java.lang` package, which is imported automatically.
   <br>(a) Both true; R explains A (b) Both true; R doesn't explain A (c) A true, R false (d) A false, R true
4. Which error is produced by `int n = sc.nextInt();` when the user types `4.5`?
   <br>(a) Syntax error (b) Logical error (c) InputMismatchException (runtime) (d) It stores 4
5. A program prints the circumference when asked for area. The error is
   <br>(a) Syntax (b) Runtime (c) Logical (d) Compile-time
6. Which of these compiles?
   <br>(a) `char c = sc.nextChar();` (b) `String s = sc.next().charAt(0);` (c) `char c = sc.next().charAt(0);` (d) `int c = sc.nextLine();`
7. Input typed on one line: `10 20 30⏎`. Code: `int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();`
   <br>(a) Error — each value must be on a new line (b) a=10, b=20, c=30 (c) a=10, b and c wait for more input (d) a=102030
8. Which is **not** a runtime error? (a) `10 / 0` (b) missing semicolon (c) `arr[10]` for a 10-element array (d) `"abc".charAt(5)`
9. What does `import java.util.*;` import?
   <br>(a) All classes of `java.util` and its sub-packages (b) All classes of `java.util` only (c) Only `Scanner` (d) Nothing — it is invalid
10. *Assertion (A):* Logical errors are the hardest to detect.
    <br>*Reason (R):* Neither the compiler nor the JVM reports them.
    <br>(a) Both true; R explains A (b) Both true; R doesn't explain A (c) A true, R false (d) A false, R true

### Part B — Short answer questions

1. Differentiate between initialisation and input through parameters.
2. Name the package that contains the Scanner class. Write the statement to import it.
3. Write statements to accept: (i) a character (ii) a long integer (iii) a full sentence.
4. Why does `nextLine()` sometimes return an empty string? How is this fixed?
5. Classify the errors: (i) `int x = "5";` (ii) `int y = 5 / 0;` (iii) `area = l + b;` for a rectangle.
6. State the three types of comments in Java with their syntax.
7. What is a package? Name two packages other than `java.util`.
8. What is debugging?

<details>
<summary><b>✅ Answers — Part A</b></summary>

| Q | Ans | Reason |
|---|---|---|
| 1 | (c) | `nextInt()` leaves the `\n`; `nextLine()` reads it immediately |
| 2 | (b) | `next()` skips leading spaces and reads one word |
| 3 | (a) | — |
| 4 | (c) | `4.5` is not an int token |
| 5 | (c) | — |
| 6 | (c) | — |
| 7 | (b) | Whitespace (including spaces) separates tokens |
| 8 | (b) | A missing semicolon is a syntax error |
| 9 | (b) | Sub-packages are not imported by `*` |
| 10 | (a) | — |

</details>

<details>
<summary><b>✅ Answers — Part B</b></summary>

1. In initialisation, values are written in the program before execution and remain the same for every run; in parameter input, values are supplied at the time of execution when the method is called, so they can change on every call.
2. `java.util`; `import java.util.Scanner;`
3. (i) `char ch = sc.next().charAt(0);` (ii) `long n = sc.nextLong();` (iii) `String s = sc.nextLine();`
4. Because a previous `nextInt()`/`next()` etc. leaves the new-line character in the buffer, and `nextLine()` reads it. Fix: write an extra `sc.nextLine();` before reading the line.
5. (i) Syntax (incompatible types) (ii) Runtime (ArithmeticException) (iii) Logical
6. Single-line `// …`, multi-line `/* … */`, documentation `/** … */`.
7. A package is a group of related classes and interfaces. Examples: `java.lang`, `java.io`.
8. The process of finding and removing errors (bugs) from a program.

</details>

---

## 💻 Programs in this chapter

<!-- PROGRAMS -->

| No. | Program | |
|:---:|---|:---:|
| **Q24** | [Input using Every Scanner Method](Q_24.java) |  |
| **Q25** | [Volume and Surface Area of a Cuboid](Q_25.java) |  |
| **Q26** | [Final Velocity: Input through Parameters](Q_26.java) |  |
| **Q27** | [Distance Travelled: Input by Initialisation](Q_27.java) |  |
| **Q28** | [Reading a Full Name with nextLine() after nextInt()](Q_28.java) |  |
| **Q29** | [Bill Amount after a 10% Discount](Q_29.java) |  |
| **Q30** | [Distance Conversion: Kilometres to Metres, Centimetres and Miles](Q_30.java) |  |
| **Q31** | [Gross and Net Salary of an Employee](Q_31.java) |  |

<!-- /PROGRAMS -->
