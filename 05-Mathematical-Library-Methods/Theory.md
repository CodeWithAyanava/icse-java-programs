<div align="center">

# 📐 Chapter 05 · Mathematical Library Methods

*The `java.lang` package · Methods of the `Math` class · Java expressions using `Math` methods*

[⬅ Back to Index](../README.md)

</div>

---

## 📑 Contents

1. [Library methods and the `java.lang` package](#1-library-methods-and-the-javalang-package)
2. [Methods of the `Math` class](#2-methods-of-the-math-class)
3. [Behaviour with negative numbers — `ceil`, `floor`, `round`](#3-behaviour-with-negative-numbers)
4. [Return types — the most common exam trap](#4-return-types--the-most-common-exam-trap)
5. [Generating random numbers in a range](#5-generating-random-numbers-in-a-range)
6. [Writing Java expressions using `Math` methods](#6-writing-java-expressions-using-math-methods)
7. [Predict the output — solved](#7-predict-the-output--solved)
8. [Find the error](#8-find-the-error)
9. [One-line facts](#9-one-line-facts)
10. [Test yourself](#-test-yourself)
11. [Programs in this chapter](#-programs-in-this-chapter)

---

## 1. Library methods and the `java.lang` package

**Library methods** (built-in methods) are **pre-written methods** provided in the Java class library, which can be used directly in a program without writing their code.

The **`Math`** class belongs to the **`java.lang`** package, which is **imported by default** into every Java program. All its methods are **`static`**, so they are called using the **class name** and the dot operator — no object is needed:

```java
double r = Math.sqrt(49);    // ClassName.methodName(arguments)
```

---

## 2. Methods of the `Math` class

| Method | Purpose | Return type | Example | Result |
|---|---|---|---|---|
| `Math.pow(x, y)` | $x^y$ | `double` | `Math.pow(2, 5)` | `32.0` |
| `Math.sqrt(x)` | square root of $x$ | `double` | `Math.sqrt(81)` | `9.0` |
| `Math.cbrt(x)` | cube root of $x$ | `double` | `Math.cbrt(-27)` | `-3.0` |
| `Math.ceil(x)` | smallest whole number **≥ x** (rounds **up**) | `double` | `Math.ceil(4.1)` | `5.0` |
| `Math.floor(x)` | largest whole number **≤ x** (rounds **down**) | `double` | `Math.floor(4.9)` | `4.0` |
| `Math.round(x)` | nearest whole number; `.5` rounds **up** (towards +∞) | `long` (for double) / `int` (for float) | `Math.round(4.5)` | `5` |
| `Math.abs(a)` | absolute (positive) value | same as argument | `Math.abs(-7)` | `7` |
| `Math.max(a, b)` | larger of two | type of the wider argument | `Math.max(3, 8.0)` | `8.0` |
| `Math.min(a, b)` | smaller of two | type of the wider argument | `Math.min(-2, 5)` | `-2` |
| `Math.random()` | random number **≥ 0.0 and < 1.0** | `double` | `Math.random()` | e.g. `0.7281…` |

> [!IMPORTANT]
> `Math.round(x)` works as **`Math.floor(x + 0.5)`**. That is why `Math.round(-2.5)` is **−2** (not −3) — `.5` always goes **up**, towards positive infinity.

**Special results**

| Expression | Result | Reason |
|---|---|---|
| `Math.sqrt(-4)` | `NaN` | "Not a Number" — no real square root |
| `Math.cbrt(-8)` | `-2.0` | cube roots of negatives exist |
| `Math.pow(0, 0)` | `1.0` | defined as 1 |
| `Math.pow(4, 0.5)` | `2.0` | same as square root |
| `Math.pow(-8, 1.0/3)` | `NaN` | use `cbrt` for negative cube roots |
| `Math.abs(-0.0)` | `0.0` | — |

---

## 3. Behaviour with negative numbers

| x | `Math.ceil(x)` | `Math.floor(x)` | `Math.round(x)` | `(int) x` |
|---|---|---|---|---|
| 7.2 | 8.0 | 7.0 | 7 | 7 |
| 7.5 | 8.0 | 7.0 | 8 | 7 |
| 7.8 | 8.0 | 7.0 | 8 | 7 |
| −7.2 | −7.0 | −8.0 | −7 | −7 |
| −7.5 | −7.0 | −8.0 | **−7** | −7 |
| −7.8 | −7.0 | −8.0 | −8 | −7 |
| −0.4 | **−0.0** | −1.0 | 0 | 0 |
| 9.0 | 9.0 | 9.0 | 9 | 9 |

> [!TIP]
> On a number line: **ceil moves right**, **floor moves left**, **casting moves towards zero**, **round** goes to the nearest integer (ties go right).

---

## 4. Return types — the most common exam trap

| Statement | Valid? | Why |
|---|:---:|---|
| `int r = Math.sqrt(25);` | ❌ | `sqrt` returns `double` |
| `int r = (int) Math.sqrt(25);` | ✅ | explicit cast → 5 |
| `int p = Math.pow(2, 3);` | ❌ | `pow` returns `double` |
| `long n = Math.round(4.6);` | ✅ | `round(double)` returns `long` |
| `int n = Math.round(4.6);` | ❌ | `long` cannot go into `int` without a cast |
| `int n = Math.round(4.6f);` | ✅ | `round(float)` returns `int` |
| `int c = Math.ceil(4.2);` | ❌ | `ceil` returns `double` |
| `int m = Math.max(4, 9);` | ✅ | both `int` → returns `int` |
| `int m = Math.max(4, 9.0);` | ❌ | returns `double` |
| `int a = Math.abs(-5);` | ✅ | `abs(int)` returns `int` |

**Printing:** `System.out.println(Math.pow(2, 3));` prints **8.0**, not 8. `System.out.println(Math.round(2.6));` prints **3**. `System.out.println(Math.ceil(2.1));` prints **3.0**.

---

## 5. Generating random numbers in a range

`Math.random()` returns a `double` in the range **[0.0, 1.0)**.

| Required range | Expression |
|---|---|
| 0 to 9 | `(int) (Math.random() * 10)` |
| 1 to 6 (dice) | `(int) (Math.random() * 6) + 1` |
| 1000 to 9999 | `1000 + (int) (Math.random() * 9000)` |
| `min` to `max` (inclusive) | `min + (int) (Math.random() * (max - min + 1))` |
| 'A' to 'Z' | `(char) ('A' + (int) (Math.random() * 26))` |

> [!WARNING]
> `(int) Math.random() * 6` is **always 0** — the cast applies to `Math.random()` first (giving 0), then 0 × 6 = 0. Use brackets: `(int) (Math.random() * 6)`.

---

## 6. Writing Java expressions using `Math` methods

| Mathematical expression | Java expression |
|---|---|
| $\sqrt{a^2 + b^2}$ | `Math.sqrt(a * a + b * b)` or `Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))` |
| $\frac{-b + \sqrt{b^2 - 4ac}}{2a}$ | `(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)` |
| $\sqrt[3]{x} + \lvert y \rvert$ | `Math.cbrt(x) + Math.abs(y)` |
| $P\left(1 + \frac{R}{100}\right)^{T}$ | `p * Math.pow(1 + r / 100, t)` |
| $\frac{4}{3}\pi r^3$ | `4.0 / 3 * Math.PI * Math.pow(r, 3)` |
| $e^{x}$ | `Math.pow(Math.E, x)` (or `Math.exp(x)`) |
| $\lvert a - b \rvert^{3}$ | `Math.pow(Math.abs(a - b), 3)` |
| $\sqrt{\frac{x}{y}} + \frac{\sqrt{x}}{y}$ | `Math.sqrt(x / y) + Math.sqrt(x) / y` |
| $\frac{a^5 + b^5}{ab}$ | `(Math.pow(a, 5) + Math.pow(b, 5)) / (a * b)` |

> [!WARNING]
> `-b + Math.sqrt(d) / 2 * a` is **wrong** — division and multiplication are done before addition, and `/ 2 * a` multiplies by `a`. Always put the **whole numerator** and **whole denominator** in brackets.

---

## 7. Predict the output — solved

```java
System.out.println(Math.ceil(-4.7) + Math.floor(-4.2));   // (1)
System.out.println(Math.round(-6.5) + Math.round(6.5));   // (2)
System.out.println(Math.sqrt(Math.abs(-16)) * 2);         // (3)
System.out.println(Math.max(Math.min(15, 8), 10));        // (4)
System.out.println(Math.pow(Math.cbrt(27), 2));           // (5)
System.out.println((int) Math.ceil(7.01) / 2);            // (6)
System.out.println(Math.floor(Math.random()));            // (7)
System.out.println(Math.abs(Math.floor(-2.1)));           // (8)
```

<details>
<summary><b>Show answers with working</b></summary>

| # | Working | Output |
|---|---|---|
| 1 | −4.0 + (−5.0) | `-9.0` |
| 2 | −6 + 7 | `1` |
| 3 | `sqrt(16)` = 4.0 × 2 | `8.0` |
| 4 | `min(15, 8)` = 8 → `max(8, 10)` | `10` |
| 5 | `cbrt(27)` = 3.0 → `pow(3.0, 2)` | `9.0` |
| 6 | `ceil(7.01)` = 8.0 → `(int)` 8 → 8 / 2 | `4` |
| 7 | random is in [0, 1) → floor is always 0 | `0.0` |
| 8 | `floor(-2.1)` = −3.0 → abs | `3.0` |

</details>

---

## 8. Find the error

```java
int a = Math.pow(2, 4);
long b = Math.sqrt(64);
int c = Math.round(7.8);
double d = math.cbrt(27);
int e = Math.random(1, 6);
```

<details>
<summary><b>Show corrected code</b></summary>

```java
int a = (int) Math.pow(2, 4);            // pow returns double
long b = (long) Math.sqrt(64);           // sqrt returns double
int c = (int) Math.round(7.8);           // round(double) returns long
double d = Math.cbrt(27);                // class name is Math (capital M)
int e = (int) (Math.random() * 6) + 1;   // random() takes no arguments
```
</details>

---

## 9. One-line facts

- `Math` is a class of the **`java.lang`** package; its methods are **static**.
- `pow`, `sqrt`, `cbrt`, `ceil`, `floor` and `random` return **`double`**.
- `round` returns **`long`** for a `double` argument and **`int`** for a `float` argument.
- `abs`, `max` and `min` return the **same type** as their (promoted) arguments.
- `Math.sqrt` of a negative number gives **`NaN`**.
- `Math.random()` never returns **1.0**.
- `Math.ceil(-0.5)` is **`-0.0`**.
- `Math.PI` (≈ 3.141592653589793) and `Math.E` (≈ 2.718281828459045) are constants of the `Math` class.

---

## 🧠 Test Yourself

### Part A — Multiple choice

1. `System.out.println(Math.round(-0.5) + Math.ceil(-0.5));` prints
   (a) `-1.0` (b) `0.0` (c) `-0.0` (d) `1.0`
2. Which returns an `int` when its argument is `-9`? (a) `Math.sqrt` (b) `Math.abs` (c) `Math.cbrt` (d) `Math.ceil`
3. `Math.max(Math.ceil(2.3), Math.floor(3.7))` evaluates to
   (a) `3.0` (b) `3` (c) `4.0` (d) `2.0`
4. *Assertion (A):* `int x = Math.round(5.5);` gives a compile-time error.
   *Reason (R):* `Math.round()` with a `double` argument returns a `long`.
   (a) Both true; R explains A (b) Both true; R doesn't explain A (c) A true, R false (d) A false, R true
5. Which expression gives a random integer from 5 to 15 (both inclusive)?
   (a) `(int) (Math.random() * 15) + 5` (b) `5 + (int) (Math.random() * 11)` (c) `(int) Math.random() * 11 + 5` (d) `5 + (int) (Math.random() * 10)`
6. `Math.pow(2, -2)` is (a) `-4.0` (b) `0.25` (c) `4.0` (d) error
7. The output of `System.out.println(Math.sqrt(-25) + 5);` is (a) `0.0` (b) `-5.0` (c) `NaN` (d) runtime error
8. For which value of `x` are `Math.ceil(x)` and `Math.floor(x)` **equal**?
   (a) 2.0001 (b) −3.0 (c) 0.5 (d) −0.5
9. What is printed? `double d = 2.5; System.out.println(Math.round(d) + Math.round(-d));`
   (a) 0 (b) 1 (c) −1 (d) 5
10. Which statement is **false**?
    (a) `Math.cbrt(-64)` returns `-4.0` (b) `Math.abs(Math.floor(-1.1))` is `2.0` (c) `Math.min(-0.0, 0.0)` is `0.0` (d) `Math.pow(9, 0.5)` is `3.0`

### Part B — Short answer questions

1. Name the package of the Math class. Why is it not imported explicitly?
2. Write the return types of `Math.sqrt()`, `Math.round(double)`, `Math.abs(int)`, `Math.max(int, double)`.
3. Give the output: (i) `Math.floor(-3.6)` (ii) `Math.ceil(-3.6)` (iii) `Math.round(-3.6)` (iv) `Math.round(3.5f)`
4. Write Java expressions: (i) $\sqrt[3]{x^2 + y^2}$ (ii) $\frac{\lvert a - b \rvert}{\sqrt{a + b}}$ (iii) $\pi r^2 h$
5. Write a statement to generate a random two-digit number.
6. What is `NaN`? When does `Math.sqrt()` return it?
7. Why is `(int) Math.random() * 100` always 0?
8. Give the output: `System.out.println(Math.max(-5, -9) + Math.min(5.0, 9));`

<details>
<summary><b>✅ Answers — Part A</b></summary>

| Q | Ans | Working |
|---|---|---|
| 1 | (b) | `round(-0.5)` = 0 (long, promoted to 0.0); `ceil(-0.5)` = −0.0; 0.0 + (−0.0) = `0.0` |
| 2 | (b) | — |
| 3 | (a) | `max(3.0, 3.0)` |
| 4 | (a) | — |
| 5 | (b) | 11 possible values starting at 5 |
| 6 | (b) | $2^{-2} = \frac{1}{4}$ |
| 7 | (c) | NaN plus anything is NaN |
| 8 | (b) | Equal only for whole numbers |
| 9 | (b) | 3 + (−2) = 1 |
| 10 | (c) | `Math.min(-0.0, 0.0)` is `-0.0` |

</details>

<details>
<summary><b>✅ Answers — Part B</b></summary>

1. `java.lang`; it is imported automatically into every program.
2. `double`, `long`, `int`, `double`.
3. (i) `-4.0` (ii) `-3.0` (iii) `-4` (iv) `4`
4. (i) `Math.cbrt(x * x + y * y)` (ii) `Math.abs(a - b) / Math.sqrt(a + b)` (iii) `Math.PI * r * r * h`
5. `int n = 10 + (int) (Math.random() * 90);`
6. "Not a Number" — the result of an undefined operation; `Math.sqrt()` returns it for a negative argument.
7. The cast `(int)` is applied to `Math.random()` (a value less than 1) first, giving 0; then 0 × 100 = 0.
8. −5 + 5.0 = `0.0`

</details>

---

## 💻 Programs in this chapter

<!-- PROGRAMS -->

| No. | Program | |
|:---:|---|:---:|
| **Q32** | [Results of All Math Class Methods](Q_32.java) |  |
| **Q33** | [Hypotenuse of a Right-Angled Triangle](Q_33.java) |  |
| **Q34** | [Area of a Triangle using Heron's Formula](Q_34.java) |  |
| **Q35** | [Roots of a Quadratic Equation](Q_35.java) |  |
| **Q36** | [Distance between Two Points](Q_36.java) |  |
| **Q37** | [Compound Interest using Math.pow()](Q_37.java) |  |
| **Q38** | [Largest and Smallest of Three Numbers using Math.max() and Math.min()](Q_38.java) |  |
| **Q39** | [Round off a Number to Two Decimal Places](Q_39.java) |  |
| **Q40** | [Perfect Square Check using Math.sqrt()](Q_40.java) |  |
| **Q41** | [Rolling a Pair of Dice using Math.random()](Q_41.java) |  |
| **Q42** | [Evaluating Mathematical Formulas as Java Expressions](Q_42.java) |  |
| **Q43** | [Volume and Surface Area of a Sphere](Q_43.java) |  |
| **Q44** | [Integer Part, Fractional Part, Ceiling and Floor](Q_44.java) |  |
| **Q45** | [Four-Digit OTP Generator](Q_45.java) | 🌟 *Extra* |

<!-- /PROGRAMS -->
