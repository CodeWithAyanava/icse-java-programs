<div align="center">

<img src="assets/banner.svg" alt="ICSE Java Programs — Class 10 Computer Applications" width="100%"/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JDK 21](https://img.shields.io/badge/JDK-21-0A66C2?style=for-the-badge)
![Programs](https://img.shields.io/badge/Programs-301-2EA44F?style=for-the-badge)
![ICSE Class 10](https://img.shields.io/badge/ICSE-Class%2010-8E44AD?style=for-the-badge)

**A complete revision kit for ICSE Class 10 Computer Applications (Java)** — every chapter of the syllabus with board-level theory, harder self-test questions and **301** fully tested programs.

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
| 04 | ⌨️ [Input in Java](#chapter-04) | [📘 Read](04-Input-in-Java/Theory.md) | **8** | Q24 – Q31 |
| 05 | 📐 [Mathematical Library Methods](#chapter-05) | [📘 Read](05-Mathematical-Library-Methods/Theory.md) | **14** | Q32 – Q45 |
| 06 | 🔀 [Conditional Constructs in Java](#chapter-06) | [📘 Read](06-Conditional-Constructs/Theory.md) | **32** | Q46 – Q77 |
| 07 | 🔁 [Iterative Constructs in Java](#chapter-07) | [📘 Read](07-Iterative-Constructs/Theory.md) | **54** | Q78 – Q131 |
| 08 | 🔲 [Nested for Loops](#chapter-08) | [📘 Read](08-Nested-for-Loops/Theory.md) | **44** | Q132 – Q175 |
| 09 | 🏛️ [Class as the Basis of all Computation](#chapter-09) | [📘 Read](09-Class-as-the-Basis-of-Computation/Theory.md) | **6** | Q176 – Q181 |
| 10 | 🧩 [User-Defined Methods](#chapter-10) | [📘 Read](10-User-Defined-Methods/Theory.md) | **30** | Q182 – Q211 |
| 11 | 🏗️ [Constructors](#chapter-11) | [📘 Read](11-Constructors/Theory.md) | **26** | Q212 – Q237 |
| 12 | 📚 [Library Classes](#chapter-12) | [📘 Read](12-Library-Classes/Theory.md) | **12** | Q238 – Q249 |
| 13 | 🔒 [Encapsulation](#chapter-13) | [📘 Read](13-Encapsulation/Theory.md) | **5** | Q250 – Q254 |
| 14 | 🗃️ [Arrays](#chapter-14) | [📘 Read](14-Arrays/Theory.md) | **47** | Q255 – Q301 |
| | **Total** | | **301** | |

> [!NOTE]
> 🚧 Work in progress — 14 of 15 chapters published so far.

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

<a id="chapter-04"></a>

### ⌨️ Chapter 04 · Input in Java

📘 **[Theory, MCQs and short questions](04-Input-in-Java/Theory.md)** · 💻 8 programs

| No. | Program | |
|:---:|---|:---:|
| **Q24** | [Input using Every Scanner Method](04-Input-in-Java/Q_24.java) |  |
| **Q25** | [Volume and Surface Area of a Cuboid](04-Input-in-Java/Q_25.java) |  |
| **Q26** | [Final Velocity: Input through Parameters](04-Input-in-Java/Q_26.java) |  |
| **Q27** | [Distance Travelled: Input by Initialisation](04-Input-in-Java/Q_27.java) |  |
| **Q28** | [Reading a Full Name with nextLine() after nextInt()](04-Input-in-Java/Q_28.java) |  |
| **Q29** | [Bill Amount after a 10% Discount](04-Input-in-Java/Q_29.java) |  |
| **Q30** | [Distance Conversion: Kilometres to Metres, Centimetres and Miles](04-Input-in-Java/Q_30.java) |  |
| **Q31** | [Gross and Net Salary of an Employee](04-Input-in-Java/Q_31.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-05"></a>

### 📐 Chapter 05 · Mathematical Library Methods

📘 **[Theory, MCQs and short questions](05-Mathematical-Library-Methods/Theory.md)** · 💻 14 programs

| No. | Program | |
|:---:|---|:---:|
| **Q32** | [Results of All Math Class Methods](05-Mathematical-Library-Methods/Q_32.java) |  |
| **Q33** | [Hypotenuse of a Right-Angled Triangle](05-Mathematical-Library-Methods/Q_33.java) |  |
| **Q34** | [Area of a Triangle using Heron's Formula](05-Mathematical-Library-Methods/Q_34.java) |  |
| **Q35** | [Roots of a Quadratic Equation](05-Mathematical-Library-Methods/Q_35.java) |  |
| **Q36** | [Distance between Two Points](05-Mathematical-Library-Methods/Q_36.java) |  |
| **Q37** | [Compound Interest using Math.pow()](05-Mathematical-Library-Methods/Q_37.java) |  |
| **Q38** | [Largest and Smallest of Three Numbers using Math.max() and Math.min()](05-Mathematical-Library-Methods/Q_38.java) |  |
| **Q39** | [Round off a Number to Two Decimal Places](05-Mathematical-Library-Methods/Q_39.java) |  |
| **Q40** | [Perfect Square Check using Math.sqrt()](05-Mathematical-Library-Methods/Q_40.java) |  |
| **Q41** | [Rolling a Pair of Dice using Math.random()](05-Mathematical-Library-Methods/Q_41.java) |  |
| **Q42** | [Evaluating Mathematical Formulas as Java Expressions](05-Mathematical-Library-Methods/Q_42.java) |  |
| **Q43** | [Volume and Surface Area of a Sphere](05-Mathematical-Library-Methods/Q_43.java) |  |
| **Q44** | [Integer Part, Fractional Part, Ceiling and Floor](05-Mathematical-Library-Methods/Q_44.java) |  |
| **Q45** | [Four-Digit OTP Generator](05-Mathematical-Library-Methods/Q_45.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-06"></a>

### 🔀 Chapter 06 · Conditional Constructs in Java

📘 **[Theory, MCQs and short questions](06-Conditional-Constructs/Theory.md)** · 💻 32 programs

| No. | Program | |
|:---:|---|:---:|
| **Q46** | [Electricity Bill (Slab System)](06-Conditional-Constructs/Q_46.java) |  |
| **Q47** | [Income Tax by Age, Gender and Slab](06-Conditional-Constructs/Q_47.java) |  |
| **Q48** | [Discount on Laptop or Desktop Purchase](06-Conditional-Constructs/Q_48.java) |  |
| **Q49** | [Menu-Driven Program: Area of Circle, Square or Rectangle](06-Conditional-Constructs/Q_49.java) |  |
| **Q50** | [Simple Calculator using switch](06-Conditional-Constructs/Q_50.java) |  |
| **Q51** | [Menu-Driven Temperature Conversion](06-Conditional-Constructs/Q_51.java) |  |
| **Q52** | [Day of the Week using switch](06-Conditional-Constructs/Q_52.java) |  |
| **Q53** | [Name of the Month and Number of Days](06-Conditional-Constructs/Q_53.java) |  |
| **Q54** | [Season of the Year using Fall-Through in switch](06-Conditional-Constructs/Q_54.java) |  |
| **Q55** | [Vowel or Consonant using switch](06-Conditional-Constructs/Q_55.java) |  |
| **Q56** | [Grade from Percentage](06-Conditional-Constructs/Q_56.java) |  |
| **Q57** | [Courier Charges by Weight and Type](06-Conditional-Constructs/Q_57.java) |  |
| **Q58** | [Telephone Bill with Monthly Rent](06-Conditional-Constructs/Q_58.java) |  |
| **Q59** | [Commission on Sales](06-Conditional-Constructs/Q_59.java) |  |
| **Q60** | [Fixed Deposit Interest by Period](06-Conditional-Constructs/Q_60.java) |  |
| **Q61** | [Taxi Fare by Distance](06-Conditional-Constructs/Q_61.java) |  |
| **Q62** | [Leap Year Check](06-Conditional-Constructs/Q_62.java) |  |
| **Q63** | [Largest of Three Numbers using Nested if](06-Conditional-Constructs/Q_63.java) |  |
| **Q64** | [Triangle Validity and Type by Sides](06-Conditional-Constructs/Q_64.java) |  |
| **Q65** | [Odd or Even Number](06-Conditional-Constructs/Q_65.java) |  |
| **Q66** | [Positive, Negative or Zero](06-Conditional-Constructs/Q_66.java) |  |
| **Q67** | [Eligibility to Vote](06-Conditional-Constructs/Q_67.java) |  |
| **Q68** | [Uppercase, Lowercase, Digit or Special Character](06-Conditional-Constructs/Q_68.java) |  |
| **Q69** | [Buzz Number](06-Conditional-Constructs/Q_69.java) |  |
| **Q70** | [Divisibility by 5 and 11](06-Conditional-Constructs/Q_70.java) |  |
| **Q71** | [Profit or Loss and its Percentage](06-Conditional-Constructs/Q_71.java) |  |
| **Q72** | [Quadrant of a Point](06-Conditional-Constructs/Q_72.java) |  |
| **Q73** | [Menu with an Exit Option using System.exit(0)](06-Conditional-Constructs/Q_73.java) |  |
| **Q74** | [Rock, Paper, Scissors against the Computer](06-Conditional-Constructs/Q_74.java) | 🌟 *Extra* |
| **Q75** | [Zodiac Sign from Date of Birth](06-Conditional-Constructs/Q_75.java) | 🌟 *Extra* |
| **Q76** | [Valid Date Checker](06-Conditional-Constructs/Q_76.java) | 🌟 *Extra* |
| **Q77** | [BMI Calculator with Category](06-Conditional-Constructs/Q_77.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-07"></a>

### 🔁 Chapter 07 · Iterative Constructs in Java

📘 **[Theory, MCQs and short questions](07-Iterative-Constructs/Theory.md)** · 💻 54 programs

| No. | Program | |
|:---:|---|:---:|
| **Q78** | [Prime Number](07-Iterative-Constructs/Q_78.java) |  |
| **Q79** | [Palindrome Number](07-Iterative-Constructs/Q_79.java) |  |
| **Q80** | [Armstrong Number](07-Iterative-Constructs/Q_80.java) |  |
| **Q81** | [Perfect Number](07-Iterative-Constructs/Q_81.java) |  |
| **Q82** | [Spy Number](07-Iterative-Constructs/Q_82.java) |  |
| **Q83** | [Niven (Harshad) Number](07-Iterative-Constructs/Q_83.java) |  |
| **Q84** | [Neon Number](07-Iterative-Constructs/Q_84.java) |  |
| **Q85** | [Automorphic Number](07-Iterative-Constructs/Q_85.java) |  |
| **Q86** | [Special Number (Krishnamurthy Number)](07-Iterative-Constructs/Q_86.java) |  |
| **Q87** | [Special Two-Digit Number](07-Iterative-Constructs/Q_87.java) |  |
| **Q88** | [Duck Number](07-Iterative-Constructs/Q_88.java) |  |
| **Q89** | [Pronic Number](07-Iterative-Constructs/Q_89.java) |  |
| **Q90** | [Disarium Number](07-Iterative-Constructs/Q_90.java) |  |
| **Q91** | [Kaprekar Number](07-Iterative-Constructs/Q_91.java) |  |
| **Q92** | [Tech Number](07-Iterative-Constructs/Q_92.java) |  |
| **Q93** | [Magic Number](07-Iterative-Constructs/Q_93.java) |  |
| **Q94** | [Happy Number](07-Iterative-Constructs/Q_94.java) |  |
| **Q95** | [Composite Number](07-Iterative-Constructs/Q_95.java) |  |
| **Q96** | [Emirp Number](07-Iterative-Constructs/Q_96.java) |  |
| **Q97** | [Sunny Number](07-Iterative-Constructs/Q_97.java) |  |
| **Q98** | [Evil Number](07-Iterative-Constructs/Q_98.java) |  |
| **Q99** | [Unique Number](07-Iterative-Constructs/Q_99.java) |  |
| **Q100** | [Abundant, Deficient or Perfect Number](07-Iterative-Constructs/Q_100.java) |  |
| **Q101** | [Fibonacci Series](07-Iterative-Constructs/Q_101.java) |  |
| **Q102** | [HCF and LCM of Two Numbers](07-Iterative-Constructs/Q_102.java) |  |
| **Q103** | [Factorial of a Number](07-Iterative-Constructs/Q_103.java) |  |
| **Q104** | [Sum and Product of Digits](07-Iterative-Constructs/Q_104.java) |  |
| **Q105** | [Reverse a Number and Count its Digits](07-Iterative-Constructs/Q_105.java) |  |
| **Q106** | [Largest and Smallest Digit of a Number](07-Iterative-Constructs/Q_106.java) |  |
| **Q107** | [Frequency of a Given Digit in a Number](07-Iterative-Constructs/Q_107.java) |  |
| **Q108** | [Count of Even and Odd Digits](07-Iterative-Constructs/Q_108.java) |  |
| **Q109** | [Factors of a Number and their Count](07-Iterative-Constructs/Q_109.java) |  |
| **Q110** | [Prime Factors of a Number](07-Iterative-Constructs/Q_110.java) |  |
| **Q111** | [Largest and Smallest of n Numbers](07-Iterative-Constructs/Q_111.java) |  |
| **Q112** | [Sum of Numbers until 0 is Entered](07-Iterative-Constructs/Q_112.java) |  |
| **Q113** | [Numbers from 1 to 50 not Divisible by 3 or 5 (continue)](07-Iterative-Constructs/Q_113.java) |  |
| **Q114** | [Sum of First n Natural Numbers and their Squares](07-Iterative-Constructs/Q_114.java) |  |
| **Q115** | [Sum of the Series 1 + 1/2 + 1/3 + ... + 1/n](07-Iterative-Constructs/Q_115.java) |  |
| **Q116** | [Sum of the Series x/1 + x^2/2 + x^3/3 + ... + x^n/n](07-Iterative-Constructs/Q_116.java) |  |
| **Q117** | [Sum of the Series 1 - 2 + 3 - 4 + ... n](07-Iterative-Constructs/Q_117.java) |  |
| **Q118** | [Sum of the Series a/2 + a/5 + a/8 + ... n Terms](07-Iterative-Constructs/Q_118.java) |  |
| **Q119** | [Series 1, 4, 9, 16, ... and 2, 5, 10, 17, 26, ...](07-Iterative-Constructs/Q_119.java) |  |
| **Q120** | [Series 0, 7, 26, 63, ...](07-Iterative-Constructs/Q_120.java) |  |
| **Q121** | [Series 1, 11, 111, 1111, ... and its Sum](07-Iterative-Constructs/Q_121.java) |  |
| **Q122** | [Series 1, -3, 5, -7, 9, ... and its Sum](07-Iterative-Constructs/Q_122.java) |  |
| **Q123** | [Looping Menu: Sum of Digits, Reverse, Count of Digits](07-Iterative-Constructs/Q_123.java) |  |
| **Q124** | [Decimal to Binary Conversion](07-Iterative-Constructs/Q_124.java) | 🌟 *Extra* |
| **Q125** | [Decimal to Octal Conversion](07-Iterative-Constructs/Q_125.java) | 🌟 *Extra* |
| **Q126** | [Decimal to Hexadecimal Conversion](07-Iterative-Constructs/Q_126.java) | 🌟 *Extra* |
| **Q127** | [Binary to Decimal Conversion](07-Iterative-Constructs/Q_127.java) | 🌟 *Extra* |
| **Q128** | [Collatz (Hailstone) Sequence](07-Iterative-Constructs/Q_128.java) | 🌟 *Extra* |
| **Q129** | [Number Guessing Game](07-Iterative-Constructs/Q_129.java) | 🌟 *Extra* |
| **Q130** | [Reverse-and-Add until a Palindrome](07-Iterative-Constructs/Q_130.java) | 🌟 *Extra* |
| **Q131** | [Smith Number](07-Iterative-Constructs/Q_131.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-08"></a>

### 🔲 Chapter 08 · Nested for Loops

📘 **[Theory, MCQs and short questions](08-Nested-for-Loops/Theory.md)** · 💻 44 programs

| No. | Program | |
|:---:|---|:---:|
| **Q132** | [Pattern: 1, 1 2, 1 2 3, ...](08-Nested-for-Loops/Q_132.java) |  |
| **Q133** | [Pattern: 1, 2 2, 3 3 3, ...](08-Nested-for-Loops/Q_133.java) |  |
| **Q134** | [Pattern: 1 2 3 4 5, 1 2 3 4, ...](08-Nested-for-Loops/Q_134.java) |  |
| **Q135** | [Pattern: 5, 5 4, 5 4 3, ...](08-Nested-for-Loops/Q_135.java) |  |
| **Q136** | [Pattern: 5 4 3 2 1, 4 3 2 1, ...](08-Nested-for-Loops/Q_136.java) |  |
| **Q137** | [Pattern: 1, 2 1, 3 2 1, ...](08-Nested-for-Loops/Q_137.java) |  |
| **Q138** | [Pattern: 5 5 5 5 5, 4 4 4 4, ...](08-Nested-for-Loops/Q_138.java) |  |
| **Q139** | [Floyd's Triangle](08-Nested-for-Loops/Q_139.java) |  |
| **Q140** | [Pattern: 1, 0 1, 1 0 1, ...](08-Nested-for-Loops/Q_140.java) |  |
| **Q141** | [Pattern: 1, 2 4, 3 6 9, ...](08-Nested-for-Loops/Q_141.java) |  |
| **Q142** | [Pattern: 1, 1 3, 1 3 5, ...](08-Nested-for-Loops/Q_142.java) |  |
| **Q143** | [Pattern: Right-Angled Triangle of Stars](08-Nested-for-Loops/Q_143.java) |  |
| **Q144** | [Pattern: Inverted Triangle of Stars](08-Nested-for-Loops/Q_144.java) |  |
| **Q145** | [Pattern: Alternating # and * Triangle](08-Nested-for-Loops/Q_145.java) |  |
| **Q146** | [Pattern: A, A B, A B C, ...](08-Nested-for-Loops/Q_146.java) |  |
| **Q147** | [Pattern: A, B B, C C C, ...](08-Nested-for-Loops/Q_147.java) |  |
| **Q148** | [Pattern: A B C D E, A B C D, ...](08-Nested-for-Loops/Q_148.java) |  |
| **Q149** | [Pattern: E, D E, C D E, ...](08-Nested-for-Loops/Q_149.java) |  |
| **Q150** | [Floyd's Triangle of Letters](08-Nested-for-Loops/Q_150.java) |  |
| **Q151** | [Pattern: Rows of Numbers and Letters Alternately](08-Nested-for-Loops/Q_151.java) |  |
| **Q152** | [Rectangular Pattern: 1 2 3 4 5 in Every Row](08-Nested-for-Loops/Q_152.java) |  |
| **Q153** | [Rectangular Pattern: Row Number Repeated](08-Nested-for-Loops/Q_153.java) |  |
| **Q154** | [Rectangular Pattern: 1 2 3 4 5, 2 3 4 5 6, ...](08-Nested-for-Loops/Q_154.java) |  |
| **Q155** | [Hollow Rectangle of Stars](08-Nested-for-Loops/Q_155.java) |  |
| **Q156** | [Rectangle with Alternate Rows of * and #](08-Nested-for-Loops/Q_156.java) |  |
| **Q157** | [Pyramid of Stars](08-Nested-for-Loops/Q_157.java) | 🌟 *Extra* |
| **Q158** | [Diamond of Stars](08-Nested-for-Loops/Q_158.java) | 🌟 *Extra* |
| **Q159** | [Number Pyramid: 1, 1 2 1, 1 2 3 2 1, ...](08-Nested-for-Loops/Q_159.java) | 🌟 *Extra* |
| **Q160** | [Pascal's Triangle](08-Nested-for-Loops/Q_160.java) | 🌟 *Extra* |
| **Q161** | [Hourglass of Stars](08-Nested-for-Loops/Q_161.java) | 🌟 *Extra* |
| **Q162** | [First n Multiples of Each Number from 1 to a Limit](08-Nested-for-Loops/Q_162.java) |  |
| **Q163** | [Multiplication Tables from 1 to 10 in a Grid](08-Nested-for-Loops/Q_163.java) |  |
| **Q164** | [Prime Numbers between Two Limits](08-Nested-for-Loops/Q_164.java) |  |
| **Q165** | [Perfect Numbers from 1 to n](08-Nested-for-Loops/Q_165.java) |  |
| **Q166** | [Armstrong Numbers in a Range](08-Nested-for-Loops/Q_166.java) |  |
| **Q167** | [Palindrome Numbers in a Range](08-Nested-for-Loops/Q_167.java) |  |
| **Q168** | [Twin Primes up to n](08-Nested-for-Loops/Q_168.java) |  |
| **Q169** | [Sum of the Series 1! + 2! + 3! + ... + n!](08-Nested-for-Loops/Q_169.java) |  |
| **Q170** | [Sum of the Series 1 + (1+2) + (1+2+3) + ...](08-Nested-for-Loops/Q_170.java) |  |
| **Q171** | [Sum of the Series x/1! + x^2/2! + ... + x^n/n!](08-Nested-for-Loops/Q_171.java) |  |
| **Q172** | [Sum of the Series 1 - x^2/2! + x^4/4! - ...](08-Nested-for-Loops/Q_172.java) |  |
| **Q173** | [Disarium Numbers between Two Limits](08-Nested-for-Loops/Q_173.java) |  |
| **Q174** | [break and continue in Nested Loops](08-Nested-for-Loops/Q_174.java) |  |
| **Q175** | [Pythagorean Triplets up to n](08-Nested-for-Loops/Q_175.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-09"></a>

### 🏛️ Chapter 09 · Class as the Basis of all Computation

📘 **[Theory, MCQs and short questions](09-Class-as-the-Basis-of-Computation/Theory.md)** · 💻 6 programs

| No. | Program | |
|:---:|---|:---:|
| **Q176** | [Class Rectangle with input(), area() and display()](09-Class-as-the-Basis-of-Computation/Q_176.java) |  |
| **Q177** | [Class Student: Average and Grade](09-Class-as-the-Basis-of-Computation/Q_177.java) |  |
| **Q178** | [Class BankAccount: Two Objects with Deposit and Withdraw](09-Class-as-the-Basis-of-Computation/Q_178.java) |  |
| **Q179** | [Class Point: Distance from the Origin](09-Class-as-the-Basis-of-Computation/Q_179.java) |  |
| **Q180** | [Class Temperature with Conversion Methods](09-Class-as-the-Basis-of-Computation/Q_180.java) |  |
| **Q181** | [Class Book as a Composite Data Type: References and Objects](09-Class-as-the-Basis-of-Computation/Q_181.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-10"></a>

### 🧩 Chapter 10 · User-Defined Methods

📘 **[Theory, MCQs and short questions](10-User-Defined-Methods/Theory.md)** · 💻 30 programs

| No. | Program | |
|:---:|---|:---:|
| **Q182** | [Overloading volume(): Sphere, Cylinder and Cuboid](10-User-Defined-Methods/Q_182.java) |  |
| **Q183** | [Overloading area(): Circle, Rectangle and Triangle](10-User-Defined-Methods/Q_183.java) |  |
| **Q184** | [Overloading series(): Three Different Series](10-User-Defined-Methods/Q_184.java) |  |
| **Q185** | [Overloading polygon(): Square, Rectangle and Triangle Patterns](10-User-Defined-Methods/Q_185.java) |  |
| **Q186** | [Overloading display() for Patterns](10-User-Defined-Methods/Q_186.java) |  |
| **Q187** | [Overloading sumSeries()](10-User-Defined-Methods/Q_187.java) |  |
| **Q188** | [Overloading largest()](10-User-Defined-Methods/Q_188.java) |  |
| **Q189** | [Overloading count(): Digits and Occurrences of a Digit](10-User-Defined-Methods/Q_189.java) |  |
| **Q190** | [Overloading perimeter(): Square, Rectangle and Triangle](10-User-Defined-Methods/Q_190.java) |  |
| **Q191** | [Prime Palindrome (PalPrime) Numbers in a Range](10-User-Defined-Methods/Q_191.java) |  |
| **Q192** | [Twin Primes in a Range using isPrime()](10-User-Defined-Methods/Q_192.java) |  |
| **Q193** | [Twisted Prime using isPrime() and reverse()](10-User-Defined-Methods/Q_193.java) |  |
| **Q194** | [Armstrong Numbers in a Range using isArmstrong()](10-User-Defined-Methods/Q_194.java) |  |
| **Q195** | [Perfect Number using a boolean Method](10-User-Defined-Methods/Q_195.java) |  |
| **Q196** | [HCF, LCM and Co-prime Check using Methods](10-User-Defined-Methods/Q_196.java) |  |
| **Q197** | [nCr using a factorial() Method](10-User-Defined-Methods/Q_197.java) |  |
| **Q198** | [Disarium Number using countDigits()](10-User-Defined-Methods/Q_198.java) |  |
| **Q199** | [Goldbach's Conjecture](10-User-Defined-Methods/Q_199.java) | 🌟 *Extra* |
| **Q200** | [Pure and Impure Methods](10-User-Defined-Methods/Q_200.java) |  |
| **Q201** | [Static and Non-Static Methods](10-User-Defined-Methods/Q_201.java) |  |
| **Q202** | [Call by Value: Swapping inside a Method](10-User-Defined-Methods/Q_202.java) |  |
| **Q203** | [Actual and Formal Parameters with Return Values](10-User-Defined-Methods/Q_203.java) |  |
| **Q204** | [Menu-Driven Number Checks using Methods](10-User-Defined-Methods/Q_204.java) |  |
| **Q205** | [Class Number with Data Member and Member Methods](10-User-Defined-Methods/Q_205.java) |  |
| **Q206** | [Class Series with Non-Static Methods](10-User-Defined-Methods/Q_206.java) |  |
| **Q207** | [Date Helper Methods: isLeap(), daysInMonth(), isValid()](10-User-Defined-Methods/Q_207.java) | 🌟 *Extra* |
| **Q208** | [Day Number of the Year](10-User-Defined-Methods/Q_208.java) | 🌟 *Extra* |
| **Q209** | [Day of the Week for any Date](10-User-Defined-Methods/Q_209.java) | 🌟 *Extra* |
| **Q210** | [Calendar of a Month](10-User-Defined-Methods/Q_210.java) | 🌟 *Extra* |
| **Q211** | [Age in Years, Months and Days](10-User-Defined-Methods/Q_211.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-11"></a>

### 🏗️ Chapter 11 · Constructors

📘 **[Theory, MCQs and short questions](11-Constructors/Theory.md)** · 💻 26 programs

| No. | Program | |
|:---:|---|:---:|
| **Q212** | [Non-Parameterised (Default) Constructor](11-Constructors/Q_212.java) |  |
| **Q213** | [Parameterised Constructor](11-Constructors/Q_213.java) |  |
| **Q214** | [Constructor Overloading: Rectangle with Three Constructors](11-Constructors/Q_214.java) |  |
| **Q215** | [The this Keyword in a Constructor](11-Constructors/Q_215.java) |  |
| **Q216** | [Constructor Overloading: Class Time](11-Constructors/Q_216.java) |  |
| **Q217** | [Class ElectricBill](11-Constructors/Q_217.java) |  |
| **Q218** | [Class ShowRoom](11-Constructors/Q_218.java) |  |
| **Q219** | [Class RailwayTicket](11-Constructors/Q_219.java) |  |
| **Q220** | [Class BookFair](11-Constructors/Q_220.java) |  |
| **Q221** | [Class ParkingLot](11-Constructors/Q_221.java) |  |
| **Q222** | [Class movieMagic](11-Constructors/Q_222.java) |  |
| **Q223** | [Class FruitJuice](11-Constructors/Q_223.java) |  |
| **Q224** | [Class Mobike](11-Constructors/Q_224.java) |  |
| **Q225** | [Class CabService](11-Constructors/Q_225.java) |  |
| **Q226** | [Class Employee: Annual Income Tax](11-Constructors/Q_226.java) |  |
| **Q227** | [Class Student: Stream Allocation](11-Constructors/Q_227.java) |  |
| **Q228** | [Class Library: Fine for Late Return](11-Constructors/Q_228.java) |  |
| **Q229** | [Class Hotel: Room Bill](11-Constructors/Q_229.java) |  |
| **Q230** | [Class Telephone: Bill from Meter Readings](11-Constructors/Q_230.java) |  |
| **Q231** | [Class Courier: Charges per 500 g](11-Constructors/Q_231.java) |  |
| **Q232** | [Class CloudStorage](11-Constructors/Q_232.java) |  |
| **Q233** | [Class Eshop: Discount on Online Purchase](11-Constructors/Q_233.java) |  |
| **Q234** | [Class BankDeposit: Maturity with Compound Interest](11-Constructors/Q_234.java) |  |
| **Q235** | [Class BusConveyance](11-Constructors/Q_235.java) |  |
| **Q236** | [Class CinemaTicket](11-Constructors/Q_236.java) |  |
| **Q237** | [Class Quiz: A Small Quiz Game](11-Constructors/Q_237.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-12"></a>

### 📚 Chapter 12 · Library Classes

📘 **[Theory, MCQs and short questions](12-Library-Classes/Theory.md)** · 💻 12 programs

| No. | Program | |
|:---:|---|:---:|
| **Q238** | [Type of a Character using Character Methods](12-Library-Classes/Q_238.java) |  |
| **Q239** | [Count Uppercase, Lowercase, Digits, Spaces and Special Characters](12-Library-Classes/Q_239.java) |  |
| **Q240** | [Change the Case of a Character](12-Library-Classes/Q_240.java) |  |
| **Q241** | [Adding Numbers Entered as Strings](12-Library-Classes/Q_241.java) |  |
| **Q242** | [Output of the Wrapper Class Methods](12-Library-Classes/Q_242.java) |  |
| **Q243** | [Autoboxing and Unboxing](12-Library-Classes/Q_243.java) |  |
| **Q244** | [Sum of the Digits Present in an Alphanumeric String](12-Library-Classes/Q_244.java) |  |
| **Q245** | [Build a Number from the Digits in a String](12-Library-Classes/Q_245.java) |  |
| **Q246** | [Remove Characters that are not Letters or Digits](12-Library-Classes/Q_246.java) |  |
| **Q247** | [Validate a 10-Digit Mobile Number](12-Library-Classes/Q_247.java) |  |
| **Q248** | [Percentage from Marks Entered as Strings](12-Library-Classes/Q_248.java) |  |
| **Q249** | [Password Strength Checker](12-Library-Classes/Q_249.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-13"></a>

### 🔒 Chapter 13 · Encapsulation

📘 **[Theory, MCQs and short questions](13-Encapsulation/Theory.md)** · 💻 5 programs

| No. | Program | |
|:---:|---|:---:|
| **Q250** | [Private Data with Public Getter and Setter Methods](13-Encapsulation/Q_250.java) |  |
| **Q251** | [Access Specifiers: private, default, protected and public](13-Encapsulation/Q_251.java) |  |
| **Q252** | [Kinds of Variables: Class, Instance, Local and Argument](13-Encapsulation/Q_252.java) |  |
| **Q253** | [Counting Objects with a Static (Class) Variable](13-Encapsulation/Q_253.java) |  |
| **Q254** | [BankAccount with a Private, Validated Balance](13-Encapsulation/Q_254.java) |  |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

<a id="chapter-14"></a>

### 🗃️ Chapter 14 · Arrays

📘 **[Theory, MCQs and short questions](14-Arrays/Theory.md)** · 💻 47 programs

| No. | Program | |
|:---:|---|:---:|
| **Q255** | [Linear Search](14-Arrays/Q_255.java) |  |
| **Q256** | [Binary Search](14-Arrays/Q_256.java) |  |
| **Q257** | [Bubble Sort in Ascending Order](14-Arrays/Q_257.java) |  |
| **Q258** | [Selection Sort in Ascending Order](14-Arrays/Q_258.java) |  |
| **Q259** | [Bubble Sort in Descending Order](14-Arrays/Q_259.java) |  |
| **Q260** | [Selection Sort in Descending Order](14-Arrays/Q_260.java) |  |
| **Q261** | [Largest, Smallest, Sum and Average of Array Elements](14-Arrays/Q_261.java) |  |
| **Q262** | [Sum and Count of Even and Odd Elements](14-Arrays/Q_262.java) |  |
| **Q263** | [Count of Positive, Negative and Zero Elements](14-Arrays/Q_263.java) |  |
| **Q264** | [Elements Greater than the Average](14-Arrays/Q_264.java) |  |
| **Q265** | [Reverse an Array in Place](14-Arrays/Q_265.java) |  |
| **Q266** | [Second Largest Element](14-Arrays/Q_266.java) |  |
| **Q267** | [Frequency of Each Element](14-Arrays/Q_267.java) |  |
| **Q268** | [Remove Duplicate Elements](14-Arrays/Q_268.java) |  |
| **Q269** | [Merge Two Arrays](14-Arrays/Q_269.java) |  |
| **Q270** | [Split an Array into Even and Odd Arrays](14-Arrays/Q_270.java) |  |
| **Q271** | [Swap the First Half with the Second Half](14-Arrays/Q_271.java) |  |
| **Q272** | [Rotate an Array Left and Right by One Position](14-Arrays/Q_272.java) |  |
| **Q273** | [Insert an Element at a Given Position](14-Arrays/Q_273.java) |  |
| **Q274** | [Delete an Element from a Given Position](14-Arrays/Q_274.java) |  |
| **Q275** | [Prime Elements of an Array](14-Arrays/Q_275.java) |  |
| **Q276** | [Topper from Parallel Arrays of Names and Marks](14-Arrays/Q_276.java) |  |
| **Q277** | [Telephone Directory: Search a Name in Parallel Arrays](14-Arrays/Q_277.java) |  |
| **Q278** | [Totals and Grades from Three Subject Arrays](14-Arrays/Q_278.java) |  |
| **Q279** | [Sort Students by Marks Keeping Names Aligned](14-Arrays/Q_279.java) |  |
| **Q280** | [Bubble Sort followed by Binary Search](14-Arrays/Q_280.java) |  |
| **Q281** | [First n Primes and First n Fibonacci Numbers in Arrays](14-Arrays/Q_281.java) |  |
| **Q282** | [Running Total (Cumulative Sum) Array](14-Arrays/Q_282.java) |  |
| **Q283** | [Count of Perfect Squares in an Array](14-Arrays/Q_283.java) |  |
| **Q284** | [Interchange the Largest and Smallest Elements](14-Arrays/Q_284.java) |  |
| **Q285** | [Star Bar Chart of Ratings](14-Arrays/Q_285.java) | 🌟 *Extra* |
| **Q286** | [Dice Roll Frequency Simulation](14-Arrays/Q_286.java) | 🌟 *Extra* |
| **Q287** | [Input and Display a Matrix](14-Arrays/Q_287.java) |  |
| **Q288** | [Row-wise and Column-wise Sums](14-Arrays/Q_288.java) |  |
| **Q289** | [Sum of the Left and Right Diagonals](14-Arrays/Q_289.java) |  |
| **Q290** | [Largest and Smallest Element of a Matrix with Positions](14-Arrays/Q_290.java) |  |
| **Q291** | [Transpose of a Matrix](14-Arrays/Q_291.java) |  |
| **Q292** | [Addition and Subtraction of Two Matrices](14-Arrays/Q_292.java) |  |
| **Q293** | [Symmetric Matrix Check](14-Arrays/Q_293.java) |  |
| **Q294** | [Boundary Elements and their Sum](14-Arrays/Q_294.java) |  |
| **Q295** | [Upper and Lower Triangular Parts of a Matrix](14-Arrays/Q_295.java) |  |
| **Q296** | [Even and Odd Elements of a Matrix](14-Arrays/Q_296.java) |  |
| **Q297** | [Row with the Largest Sum](14-Arrays/Q_297.java) |  |
| **Q298** | [Marks Matrix: Totals and Averages of Students](14-Arrays/Q_298.java) |  |
| **Q299** | [Matrix Multiplication](14-Arrays/Q_299.java) | 🌟 *Extra* |
| **Q300** | [Magic Square Check](14-Arrays/Q_300.java) | 🌟 *Extra* |
| **Q301** | [Tic-Tac-Toe Winner Checker](14-Arrays/Q_301.java) | 🌟 *Extra* |

<div align="right"><a href="#-chapter-overview">⬆ back to overview</a></div>

---

<div align="center">

Made for ICSE Class 10 revision · Java · JDK 21

</div>
