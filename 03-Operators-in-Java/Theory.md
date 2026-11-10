<div align="center">

# ➗ Chapter 03 · Operators in Java

*Forms and types of operators · Precedence and associativity · Prefix and postfix · Counters and accumulators · `new` and dot operators · Output statements*

[⬅ Back to Index](../README.md)

</div>

---

## 📑 Contents

1. [Operators, operands and expressions](#1-operators-operands-and-expressions)
2. [Forms of operators](#2-forms-of-operators-unary-binary-ternary)
3. [Arithmetic operators](#3-arithmetic-operators)
4. [Increment and decrement operators](#4-increment-and-decrement-operators)
5. [Relational operators](#5-relational-operators)
6. [Logical operators](#6-logical-operators)
7. [Assignment and shorthand operators](#7-assignment-and-shorthand-operators)
8. [Ternary (conditional) operator](#8-ternary-conditional-operator)
9. [The `new` operator and the dot operator](#9-the-new-operator-and-the-dot-operator)
10. [Precedence and associativity](#10-precedence-and-associativity)
11. [Counters and accumulators](#11-counters-and-accumulators)
12. [Output: `print()` and `println()`, and the `+` operator with strings](#12-output-print-and-println)
13. [Writing Java expressions](#13-writing-java-expressions)
14. [Step-by-step evaluation — solved examples](#14-step-by-step-evaluation--solved-examples)
15. [Differentiate between](#15-differentiate-between)
16. [One-line facts](#16-one-line-facts)
17. [Test yourself](#-test-yourself)
18. [Programs in this chapter](#-programs-in-this-chapter)

---

## 1. Operators, operands and expressions

- An **operator** is a symbol or token that performs an **operation** (arithmetic, comparison, logical, etc.) on one or more values.
- An **operand** is the value or variable on which an operator acts.
- An **expression** is a valid combination of operators, operands and constants that produces a value. E.g. in `a + b * 2`, `+` and `*` are operators; `a`, `b` and `2` are operands.

| Kind of expression | Example | Result type |
|---|---|---|
| Arithmetic expression | `a * b + 5` | number |
| Relational / Boolean expression | `marks >= 40` | `boolean` |
| Logical expression | `(a > b) && (a > c)` | `boolean` |
| Pure expression | all operands of the same type, e.g. `int + int` | — |
| Mixed (impure) expression | operands of different types, e.g. `int + double` | highest type |

> [!NOTE]
> **Bitwise and shift operators** (`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`) are **not included** in the ICSE syllabus.

---

## 2. Forms of operators (unary, binary, ternary)

| Form | Number of operands | Examples |
|---|:---:|---|
| **Unary** | 1 | unary `+`, unary `-`, `++`, `--`, `!` |
| **Binary** | 2 | `+ - * / %`, `< > <= >= == !=`, `&& \|\|`, `=`, `+=` |
| **Ternary** | 3 | `? :` (conditional operator) |

> [!TIP]
> The **only ternary operator** in Java is `?:`. The `-` symbol is **unary** in `-a` and **binary** in `a - b`.

**Types of operators:** arithmetic, relational, logical, assignment, increment/decrement, shorthand (compound assignment), conditional (ternary), and special operators (`new`, dot `.`, `instanceof`).

---

## 3. Arithmetic operators

| Operator | Meaning | Example (`a = 17`, `b = 5`) | Result |
|:---:|---|---|---|
| `+` | Addition | `a + b` | 22 |
| `-` | Subtraction | `a - b` | 12 |
| `*` | Multiplication | `a * b` | 85 |
| `/` | Division (quotient) | `a / b` | **3** (integer division) |
| `%` | Modulus (remainder) | `a % b` | 2 |

**Important behaviour**

| Expression | Value | Rule |
|---|---|---|
| `17 / 5` | 3 | int ÷ int → int (fraction discarded) |
| `17 / 5.0` | 3.4 | at least one real operand → real division |
| `-17 / 5` | −3 | integer division truncates **towards zero** |
| `-17 % 5` | −2 | sign of `%` result = sign of the **dividend** (left operand) |
| `17 % -5` | 2 | — |
| `5 % 17` | 5 | if dividend < divisor, the remainder is the dividend |
| `7.5 % 2` | 1.5 | `%` also works on real numbers in Java |
| `10 / 0` | — | **ArithmeticException** at run time (`/ by zero`) |
| `10.0 / 0` | `Infinity` | no exception for floating-point division |

> [!WARNING]
> `double avg = (a + b) / 2;` with `int a, b` gives a **wrong (truncated) average**. Write `(a + b) / 2.0`.

---

## 4. Increment and decrement operators

`++` increases the value of a variable by 1; `--` decreases it by 1. They can be used only with **variables** (not constants: `5++` is an error).

| Form | Name | Working ("change-then-use" or "use-then-change") |
|---|---|---|
| `++a`, `--a` | **Prefix** | First **change** the value, then **use** the new value in the expression |
| `a++`, `a--` | **Postfix** | First **use** the current value in the expression, then **change** it |

```java
int a = 5, b;
b = a++;   // b = 5, a = 6   (use, then increment)
b = ++a;   // a = 7, b = 7   (increment, then use)
```

> [!IMPORTANT]
> **Evaluating an expression with several `++`/`--`:** go strictly **left to right**. Write the value each operand contributes, and update the variable immediately after each operand.

**Worked example:** `int a = 5; int b = a++ + ++a * a--;`

| Operand | Value used | `a` after it |
|---|:---:|:---:|
| `a++` | 5 | 6 |
| `++a` | 7 | 7 |
| `a--` | 7 | 6 |

`b = 5 + 7 * 7 = 5 + 49 = 54`, and finally `a = 6`.

---

## 5. Relational operators

Relational operators **compare** two values and return a **`boolean`** result (`true` / `false`).

| Operator | Meaning | `5 ? 8` |
|:---:|---|---|
| `<` | less than | `true` |
| `>` | greater than | `false` |
| `<=` | less than or equal to | `true` |
| `>=` | greater than or equal to | `false` |
| `==` | equal to | `false` |
| `!=` | not equal to | `true` |

> [!WARNING]
> `=` is **assignment**; `==` is **comparison**. `if (a = 5)` is a compile-time error in Java (an `int` is not a `boolean`). Characters can be compared because they have codes: `'a' > 'B'` is `true` (97 > 66).

---

## 6. Logical operators

Logical operators combine two or more **boolean** expressions.

| Operator | Name | Result is `true` when… |
|:---:|---|---|
| `&&` | Logical AND | **both** operands are `true` |
| `\|\|` | Logical OR | **at least one** operand is `true` |
| `!` | Logical NOT (unary) | the operand is `false` |

| A | B | A && B | A \|\| B | !A |
|:---:|:---:|:---:|:---:|:---:|
| true | true | true | true | false |
| true | false | false | true | false |
| false | true | false | true | true |
| false | false | false | false | true |

**Short-circuit evaluation:** `&&` does **not evaluate** the right operand if the left one is `false`; `||` does not evaluate the right operand if the left one is `true`.

```java
int x = 5;
boolean r = (x > 10) && (++x > 5);   // left is false → ++x never runs
System.out.println(r + " " + x);     // false 5
```

**Precedence among logical operators:** `!` (highest) → `&&` → `||` (lowest).

---

## 7. Assignment and shorthand operators

The **assignment operator** `=` stores the value of the expression on its right in the variable on its left. It is evaluated **right to left**: `a = b = c = 10;` assigns 10 to all three.

**Shorthand (compound assignment) operators** combine an arithmetic operation with assignment.

| Shorthand | Equivalent to | `a = 17` and `b = 5` |
|---|---|---|
| `a += b` | `a = a + b` | 22 |
| `a -= b` | `a = a - b` | 12 |
| `a *= b` | `a = a * b` | 85 |
| `a /= b` | `a = a / b` | 3 |
| `a %= b` | `a = a % b` | 2 |

> [!NOTE]
> A shorthand operator contains a **hidden cast** to the type of the left operand: `char ch = 'A'; ch += 2;` is valid (`'C'`), but `ch = ch + 2;` is an error. Also, `a *= b + 2` means `a = a * (b + 2)`, **not** `a * b + 2`.

---

## 8. Ternary (conditional) operator

**Syntax:** `variable = (condition) ? value_if_true : value_if_false;`

```java
int max = (a > b) ? a : b;
String res = (n % 2 == 0) ? "Even" : "Odd";
char grade = (m >= 90) ? 'A' : (m >= 75) ? 'B' : 'C';    // nested ternary
```

**Converting between ternary and if-else**

```java
// ternary
tax = (salary > 50000) ? salary * 0.1 : 0;

// equivalent if-else
if (salary > 50000)
    tax = salary * 0.1;
else
    tax = 0;
```

---

## 9. The `new` operator and the dot operator

- **`new` operator:** allocates **memory dynamically** (at run time) for an object or an array and returns a **reference** to it.
  ```java
  Scanner sc = new Scanner(System.in);
  int arr[] = new int[10];
  Student s1 = new Student();
  ```
- **Dot (`.`) operator:** used to **access the members** (data members and methods) of a class or an object, and to refer to a class inside a package.
  ```java
  s1.display();          // invoking a method of object s1
  System.out.println();  // out is a member of class System
  Math.sqrt(25);         // static method of class Math
  java.util.Scanner      // class Scanner inside package java.util
  ```

---

## 10. Precedence and associativity

**Precedence** decides **which operator is evaluated first** in an expression with more than one operator. **Associativity** decides the **order of evaluation of operators having the same precedence** (left to right or right to left).

| Rank | Operators | Description | Associativity |
|:---:|---|---|---|
| 1 | `()` `[]` `.` | parentheses, array subscript, member access | Left → Right |
| 2 | `a++` `a--` | postfix | Left → Right |
| 3 | `++a` `--a` `+a` `-a` `!` `(type)` | prefix, unary, NOT, cast | **Right → Left** |
| 4 | `new` | object creation | Right → Left |
| 5 | `*` `/` `%` | multiplicative | Left → Right |
| 6 | `+` `-` | additive (and string concatenation) | Left → Right |
| 7 | `<` `<=` `>` `>=` `instanceof` | relational | Left → Right |
| 8 | `==` `!=` | equality | Left → Right |
| 9 | `&&` | logical AND | Left → Right |
| 10 | `\|\|` | logical OR | Left → Right |
| 11 | `?:` | ternary | **Right → Left** |
| 12 | `=` `+=` `-=` `*=` `/=` `%=` | assignment | **Right → Left** |

> [!TIP]
> Memory aid: **U**nary → **A**rithmetic (`* / %` before `+ -`) → **R**elational → **E**quality → **L**ogical (`&&` before `||`) → **T**ernary → **A**ssignment.

---

## 11. Counters and accumulators

- A **counter** is a variable that **counts** the number of times something happens. It is usually incremented by **1** (or a fixed value). It is initialised to **0** (or 1).
  `count = count + 1;` or `count++;`
- An **accumulator** is a variable that **collects (accumulates) a running total** of values. It is initialised to **0** for a sum, or **1** for a product.
  `sum = sum + n;` or `prod = prod * n;`

| Basis | Counter | Accumulator |
|---|---|---|
| Purpose | Counts occurrences | Adds/multiplies values |
| Increases by | A fixed amount (usually 1) | A varying amount |
| Example | `c++;` | `s += n;` |

---

## 12. Output: `print()` and `println()`

| `System.out.print()` | `System.out.println()` |
|---|---|
| Prints and keeps the cursor **on the same line** | Prints and moves the cursor to the **next line** |
| Must have an argument | Can be used without an argument (prints a blank line) |

**The `+` operator with strings:** if **either** operand of `+` is a `String`, `+` performs **concatenation**. Evaluation is left to right:

| Statement | Output |
|---|---|
| `System.out.println(2 + 3 + "A");` | `5A` |
| `System.out.println("A" + 2 + 3);` | `A23` |
| `System.out.println("A" + (2 + 3));` | `A5` |
| `System.out.println("Sum=" + 2 * 3);` | `Sum=6` (`*` has higher precedence) |
| `System.out.println('A' + 'B' + "C");` | `131C` |

---

## 13. Writing Java expressions

| Mathematical expression | Java expression |
|---|---|
| $ut + \frac{1}{2}at^2$ | `u * t + 0.5 * a * t * t` (or `1.0 / 2 * a * t * t`) |
| $\frac{a + b}{c - d}$ | `(a + b) / (c - d)` |
| $\frac{9}{5}C + 32$ | `9.0 / 5 * c + 32` |
| $\frac{P \times R \times T}{100}$ | `p * r * t / 100` |
| $a^2 + 2ab + b^2$ | `a * a + 2 * a * b + b * b` |
| $\frac{x}{y} + \frac{y}{x}$ | `x / y + y / x` |

> [!WARNING]
> `1 / 2 * a * t * t` is **always 0** for `int` arithmetic, because `1 / 2` is 0. Use `0.5` or `1.0 / 2`.

(Expressions with powers and roots using the `Math` class are covered in Chapter 05.)

---

## 14. Step-by-step evaluation — solved examples

**Q1.** `int a = 10, b = 4; a += a++ - --b * 2;`

The shorthand stores `a = a + (a++ - --b * 2)` — the **old value of `a` (10)** is taken first.
- `a++` → 10 (a becomes 11)
- `--b` → 3
- `a++ - --b * 2` = 10 − 3 × 2 = 4
- `a` = 10 + 4 = **14** (the 11 is overwritten), `b` = **3**

**Q2.** `int x = 7; x = x++ + x++;` → 7 + 8 = 15, so **x = 15**.

**Q3.** `int p = 3, q = 6; boolean r = p > q || q % p == 0 && !(p == q);`
- `p > q` → false
- `q % p == 0` → true; `!(p == q)` → true; `true && true` → true
- `false || true` → **true**

**Q4.** `int m = 5; int n = m-- * 2 + --m;` → 5 × 2 + 3 = **13**, m = **3**.

**Q5.** `double d = 25 / 2 + 25 % 2 + 2.5;` → 12 + 1 + 2.5 = **15.5**.

**Q6.** `int k = 4; System.out.println(k++ + " " + k + " " + ++k);` → **4 5 6**.

**Q7.** `int a = 5; boolean r = (a > 2) || (++a > 3); System.out.println(r + " " + a);` → short-circuit: **true 5**.

**Q8.** `char c = 'D'; c -= 2; int x = c + 1;` → `c` = `'B'`, `x` = **67**.

---

## 15. Differentiate between

| Pair | Difference |
|---|---|
| `=` and `==` | Assignment vs comparison for equality |
| `/` and `%` | Quotient vs remainder |
| Prefix and postfix | Change-then-use vs use-then-change |
| Unary and binary | One operand vs two operands |
| `&&` and `\|\|` | True only if both are true vs true if either is true |
| Counter and accumulator | Counts by a fixed step vs adds varying values |
| `print()` and `println()` | Same line vs next line |
| Precedence and associativity | Which operator first vs order among equal-precedence operators |

---

## 16. One-line facts

- `%` gives the remainder; its sign follows the **dividend**.
- Integer division by zero throws an **`ArithmeticException`**.
- The **ternary** operator is the only operator with three operands.
- `!` has higher precedence than `&&`, which is higher than `||`.
- Assignment, ternary and unary operators are evaluated **right to left**.
- `new` allocates memory **dynamically** at run time.
- Increment/decrement operators cannot be applied to constants or expressions (`(a + b)++` is invalid).
- `a = a + 1`, `a += 1`, `a++` and `++a` (as standalone statements) all have the same effect.

---

## 🧠 Test Yourself

### Part A — Multiple choice

1. `int a = 3; a = a++ + a++ * --a;` What is `a`?
   (a) 19 (b) 28 (c) 16 (d) 15
2. Which expression gives `true` for **every** odd integer `n`, including negative odd numbers?
   (a) `n % 2 == 1` (b) `n % 2 != 0` (c) `n / 2 == 1` (d) `n % 2 > 0`
3. `System.out.println(10 + 20 + "30" + 10 * 2);` prints
   (a) 303020 (b) 1020302 (c) 3030 20 (d) 603020
4. *Assertion (A):* `int x = 0; if (x != 0 && 10 / x > 1)` does not throw an exception.
   *Reason (R):* `&&` evaluates both operands before deciding the result.
   (a) Both true; R explains A (b) Both true; R does not explain A (c) A true, R false (d) A false, R true
5. What is the value of `-15 % 4 + 15 % -4`?
   (a) 0 (b) −6 (c) 6 (d) −2
6. `int p = 2; p *= p++ + 3;` gives `p` =
   (a) 10 (b) 12 (c) 7 (d) 15
7. Which statement is a **compile-time error**? (a) `int a = 5; a++;` (b) `int b = (int) 7.9;` (c) `int c = 5++;` (d) `double d = 5 / 2;`
8. `int a = 6, b = 4; System.out.println(a > b ? a % b == 2 ? "X" : "Y" : "Z");` prints
   (a) X (b) Y (c) Z (d) Error
9. The associativity of `=` is right to left. Hence `int a, b, c; a = b = c = 4;`
   (a) assigns 4 only to `c` (b) assigns 4 to all three (c) is an error (d) assigns 4 to `a` only
10. `int i = 1; i = i++ + i++ + i++;` gives `i` = (a) 3 (b) 6 (c) 4 (d) 9
11. What is printed? `int n = 7; System.out.println(n++ > 7 || n-- == 8); System.out.println(n);`
    (a) true 7 (b) true 8 (c) false 7 (d) true / 7 on separate lines
12. Which operator has the **lowest** precedence? (a) `||` (b) `?:` (c) `+=` (d) `!`

### Part B — Short answer questions

1. Evaluate, given `int a = 8, b = 3;`: (i) `a / b * b + a % b` (ii) `a++ * 2 - --b`
2. Rewrite using the ternary operator: `if (x % 2 == 0) s = "Even"; else s = "Odd";`
3. Rewrite using if-else: `int d = (a > b) ? a - b : b - a;`
4. What is short-circuit evaluation? Give an example.
5. Write the Java expression (without using `Math` methods) for $\frac{a^3 + b^3}{a^2 - ab + b^2}$.
6. Give the output: `int x = 5, y = 2; System.out.println(x / y + " " + x % y + " " + (double) x / y);`
7. What are counters and accumulators? Write one statement of each.
8. State the use of the `new` operator and the dot operator with one example each.
9. Find the value of `k` after: `int k = 10; k -= k-- - --k;`
10. Why does `double avg = (m1 + m2 + m3) / 3;` sometimes give a wrong answer? Correct it.

<details>
<summary><b>✅ Answers — Part A</b></summary>

| Q | Ans | Working |
|---|---|---|
| 1 | (a) | `a++` → 3 (a=4), `a++` → 4 (a=5), `--a` → 4; `*` before `+`: 3 + (4 × 4) = **19**. Option (b) is the trap of ignoring precedence: (3 + 4) × 4 = 28 |
| 2 | (b) | For negative odd `n`, `n % 2` is −1 |
| 3 | (a) | 10 + 20 = 30 → `"3030"` → `10 * 2` = 20 is evaluated first (higher precedence) → `"303020"` |
| 4 | (c) | `&&` short-circuits, so R is false |
| 5 | (a) | −15 % 4 = −3; 15 % −4 = 3; total 0 |
| 6 | (a) | `p = p * (p++ + 3)` = 2 × (2 + 3) = 10 |
| 7 | (c) | Increment cannot be applied to a literal |
| 8 | (a) | 6 > 4 → `6 % 4 == 2` → true → "X" |
| 9 | (b) | — |
| 10 | (b) | 1 + 2 + 3 = 6 |
| 11 | (d) | `n++ > 7` → 7 > 7 false, n = 8; `n-- == 8` → true, n = 7. Prints `true` then `7` |
| 12 | (c) | Assignment operators have the lowest precedence |

</details>

<details>
<summary><b>✅ Answers — Part B</b></summary>

1. (i) 8 / 3 = 2, 2 × 3 = 6, 8 % 3 = 2 → **8** (ii) 8 × 2 − 2 = **14** (a becomes 9, b becomes 2)
2. `s = (x % 2 == 0) ? "Even" : "Odd";`
3. `if (a > b) d = a - b; else d = b - a;`
4. The right operand of `&&`/`||` is not evaluated when the result is already decided by the left operand. E.g. `(n != 0) && (100 / n > 2)` avoids division by zero.
5. `(a * a * a + b * b * b) / (a * a - a * b + b * b)`
6. `2 1 2.5`
7. A counter counts occurrences (`count++;`); an accumulator collects a running total (`sum += n;`).
8. `new` creates an object: `Scanner sc = new Scanner(System.in);`. Dot accesses a member: `sc.nextInt()`.
9. `k = k - (k-- - --k)` = 10 − (10 − 8) = **8**.
10. `int` ÷ `int` truncates the fraction. Correct: `double avg = (m1 + m2 + m3) / 3.0;`

</details>

---

## 💻 Programs in this chapter

<!-- PROGRAMS -->

| No. | Program | |
|:---:|---|:---:|
| **Q14** | [Area and Perimeter of a Rectangle](Q_14.java) |  |
| **Q15** | [Area and Circumference of a Circle](Q_15.java) |  |
| **Q16** | [Temperature Conversion: Celsius and Fahrenheit](Q_16.java) |  |
| **Q17** | [Simple Interest and Amount](Q_17.java) |  |
| **Q18** | [Convert Seconds into Hours, Minutes and Seconds](Q_18.java) |  |
| **Q19** | [Convert Days into Years, Months and Days](Q_19.java) |  |
| **Q20** | [Prefix and Postfix Increment and Decrement](Q_20.java) |  |
| **Q21** | [Larger of Two Numbers using the Ternary Operator](Q_21.java) |  |
| **Q22** | [Shorthand (Compound Assignment) Operators](Q_22.java) |  |
| **Q23** | [Total, Average and Percentage of Five Subjects](Q_23.java) |  |

<!-- /PROGRAMS -->
