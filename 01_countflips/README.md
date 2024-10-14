# Flip Count in Adjacent Character Pairs

This Java project counts the number of **flips** required in adjacent character pairs of a given string. A flip is counted whenever two adjacent characters in a string differ.

---

## Table of Contents
- [Flip Count in Adjacent Character Pairs](#flip-count-in-adjacent-character-pairs)
  - [Table of Contents](#table-of-contents)
  - [Prerequisites](#prerequisites)
  - [How It Works](#how-it-works)
  - [Installation and Setup](#installation-and-setup)
  - [Usage](#usage)
  - [Example Input/Output](#example-inputoutput)
    - [**Example 1:**](#example-1)
    - [**Example 2:**](#example-2)
    - [**Example 3:**](#example-3)
  - [Makefile](#makefile)
    - [**Makefile Code:**](#makefile-code)

---

## Prerequisites
Make sure you have the following installed:
- **Java Development Kit (JDK)** (version 8 or higher)
- A code editor (like VSCode, IntelliJ, or Eclipse) or a terminal to run Java code.

---

## How It Works
1. The program prompts the user to enter a string.
2. It processes the input by comparing adjacent characters.
3. If two adjacent characters are **different**, it increments a flip counter.
4. Finally, the total count of flips is displayed.

---

## Installation and Setup
1. Clone the repository or download the code files.

    ```bash
    git clone <repository-url>
    ```

2. Open the project in your preferred code editor or navigate to the project folder in a terminal.

3. Compile the Java code using the following command:

    ```bash
    javac CountFlips.java
    ```

4. Run the compiled code:

    ```bash
    java CountFlips
    ```

---

## Usage
1. After running the code, you will be prompted to **enter a string**.
2. Type the string and press **Enter**.
3. The program will display the **flip count**.

---

## Example Input/Output

### **Example 1:**
**Input:**
Enter the string: 010101

makefile
Copy code

**Output:**
Flip counts: 3

markdown
Copy code

### **Example 2:**
**Input:**
Enter the string: 11110000

makefile
Copy code

**Output:**
Flip counts: 2

markdown
Copy code

### **Example 3:**
**Input:**
Enter the string: 101001

makefile
Copy code

**Output:**
Flip counts: 3

yaml
Copy code

---

## Makefile

You can automate the compilation and execution of the program using the following **Makefile**.

### **Makefile Code:**

```makefile
all: compile run

compile:
	javac CountFlips.java

run:
	java CountFlips