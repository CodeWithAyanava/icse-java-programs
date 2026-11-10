<div align="center">

<img src="assets/banner.svg" alt="ICSE Java Programs — Class 10 Computer Applications" width="100%"/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JDK 21](https://img.shields.io/badge/JDK-21-0A66C2?style=for-the-badge)
![Programs](https://img.shields.io/badge/Programs-23-2EA44F?style=for-the-badge)
![ICSE Class 10](https://img.shields.io/badge/ICSE-Class%2010-8E44AD?style=for-the-badge)

**A complete revision kit for ICSE Class 10 Computer Applications (Java)** — every chapter of the syllabus with board-level theory, harder self-test questions and **23** fully tested programs.

</div>

---

## 📖 About

This repository follows the **ICSE Class 10 Computer Applications (86)** syllabus chapter by chapter. Each chapter folder contains:

- 📘 **`Theory.md`** — the complete theory in standard textbook language: definitions, comparison tables, flowcharts, predict-the-output questions with dry runs, error finding, library method tables and exam tips, ending with a set of **hard MCQs and short questions** (answers hidden in collapsible sections).
- 💻 **`Q_n.java`** files — one program per file, numbered continuously across the whole repository, the most frequently asked ones first in each chapter.

### Program conventions

| | |
|---|---|
| ☕ **Standard Java** | Plain Java with a `main` method (not BlueJ), no packages — every file runs on its own |
| ⌨️ **Input** | `Scanner` object always named `sc`; `import java.util.Scanner;` is the only import |
| 📝 **Header** | Program number, chapter and the full exam-style question (patterns are drawn exactly) |
| 📋 **Variable table** | Name of the Variable · Data Type · Purpose / Description, at the bottom of every file |
| 🌟 **[Extra]** | Creative programs slightly beyond the syllabus, still solved with syllabus-level Java |
| ✅ **Tested** | Every file compiled with `javac` on JDK 21 and run on normal and edge-case inputs |

### ▶️ How to run

```bash
cd 07-Iterative-Constructs
javac Q_82.java
java Q_82
```

---

## 🗺️ Chapter overview

| # | Chapter | Theory | Programs | Range |
|:---:|---|:---:|:---:|:---:|
| 01 | ☕ [Introduction to OOP and Java](#chapter-01) | [📘 Read](01-Introduction-to-OOP-and-Java/Theory.md) | **5** | Q1 – Q5 |
| 02 | 🔢 [Values and Data Types](#chapter-02) | [📘 Read](02-Values-and-Data-Types/Theory.md) | **8** | Q6 – Q13 |
| 03 | ➗ [Operators in Java](#chapter-03) | [📘 Read](03-Operators-in-Java/Theory.md) | **10** | Q14 – Q23 |
| | **Total** | | **23** | |

> [!NOTE]
> 🚧 Work in progress — 3 of 15 chapters published so far.

---

## 📚 Index

<a id="chapter-01"></a>

### ☕ Chapter 01 · Introduction to OOP and Java

📘 **[Theory, MCQs and short questions](01-Introduction-to-OOP-and-Java/Theory.md)** · 💻 5 programs

| No. | Program | |
|:---:|---|:---:|
| **Q1** | [Display Student Details using print() and println()](01-Introduction-to-OOP-and-Java/Q_1.java) |  |
| **Q2** | [Marks Table using Tab and New-Line Escape Sequences](01-Introduction-to-OOP-and-Java/Q_2.java) |  |
| **Q3** | [Quotation and File Path using Escape Sequences](01-Introduction-to-OOP-and-Java/Q_3.java) |  |
| **Q4** | [Class Box: Creating an Object and Finding its Volume](01-Introduction-to-OOP-and-Java/Q_4.java) |  |
| **Q5** | [Class Car: Two Objects, Same Behaviour, Different States](01-Introduction-to-OOP-and-Java/Q_5.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-02"></a>

### 🔢 Chapter 02 · Values and Data Types

📘 **[Theory, MCQs and short questions](02-Values-and-Data-Types/Theory.md)** · 💻 8 programs

| No. | Program | |
|:---:|---|:---:|
| **Q6** | [ASCII Code of an Entered Character](02-Values-and-Data-Types/Q_6.java) |  |
| **Q7** | [Character for an Entered ASCII Code](02-Values-and-Data-Types/Q_7.java) |  |
| **Q8** | [Implicit Type Conversion](02-Values-and-Data-Types/Q_8.java) |  |
| **Q9** | [Explicit Type Casting](02-Values-and-Data-Types/Q_9.java) |  |
| **Q10** | [Swap Two Numbers using a Third Variable](02-Values-and-Data-Types/Q_10.java) |  |
| **Q11** | [Swap Two Numbers without a Third Variable](02-Values-and-Data-Types/Q_11.java) |  |
| **Q12** | [Next and Previous Character](02-Values-and-Data-Types/Q_12.java) |  |
| **Q13** | [Uppercase to Lowercase using ASCII Arithmetic](02-Values-and-Data-Types/Q_13.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-03"></a>

### ➗ Chapter 03 · Operators in Java

📘 **[Theory, MCQs and short questions](03-Operators-in-Java/Theory.md)** · 💻 10 programs

| No. | Program | |
|:---:|---|:---:|
| **Q14** | [Area and Perimeter of a Rectangle](03-Operators-in-Java/Q_14.java) |  |
| **Q15** | [Area and Circumference of a Circle](03-Operators-in-Java/Q_15.java) |  |
| **Q16** | [Temperature Conversion: Celsius and Fahrenheit](03-Operators-in-Java/Q_16.java) |  |
| **Q17** | [Simple Interest and Amount](03-Operators-in-Java/Q_17.java) |  |
| **Q18** | [Convert Seconds into Hours, Minutes and Seconds](03-Operators-in-Java/Q_18.java) |  |
| **Q19** | [Convert Days into Years, Months and Days](03-Operators-in-Java/Q_19.java) |  |
| **Q20** | [Prefix and Postfix Increment and Decrement](03-Operators-in-Java/Q_20.java) |  |
| **Q21** | [Larger of Two Numbers using the Ternary Operator](03-Operators-in-Java/Q_21.java) |  |
| **Q22** | [Shorthand (Compound Assignment) Operators](03-Operators-in-Java/Q_22.java) |  |
| **Q23** | [Total, Average and Percentage of Five Subjects](03-Operators-in-Java/Q_23.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

---

<div align="center">

Made for ICSE Class 10 revision · Java · JDK 21

</div>
