# ☕ Java Fundamentals — Interns 2026

Welcome to the **Java Fundamentals Intern Training Repository**.

This repository is used as part of the 2026 intern training programme and provides practical examples, exercises, and activities for learning:

- Java programming fundamentals
- Problem solving using Java
- Basic software development practices
- Version control using Git
- Working with GitHub repositories and branches

The repository is intended to provide students with hands-on practice while learning how developers write, manage, and version source code.

---

## 🎯 Learning Objectives

By working through the examples and exercises in this repository, students should be able to:

### Java

- Understand the basic structure of a Java application
- Declare and use variables
- Work with Java primitive data types
- Use operators and expressions
- Accept input from users
- Implement conditional statements
- Implement loops
- Create and call methods
- Work with arrays
- Debug simple Java programs
- Apply basic programming logic to solve problems

### Git and GitHub

- Understand the purpose of version control
- Clone a Git repository
- Commit changes
- Push changes to GitHub
- Pull changes from a remote repository
- Create and switch between branches
- Merge changes between branches

---

## 📂 Repository Structure

The repository currently contains the following main training directory:

```text
java-fundamentals-interns-2026/
│
├── Java-Training-Sep-2026/
│   └── Java training examples and exercises
│
└── README.md
```

Additional examples and exercises may be added as the training progresses.

---

## 🛠 Prerequisites

Before starting, make sure you have the following installed on your computer:

### Java Development Kit (JDK)

A recent version of the JDK is recommended.

Verify that Java is installed:

```bash
java --version
```

Verify that the Java compiler is installed:

```bash
javac --version
```

### Git

Verify your Git installation:

```bash
git --version
```

### Development Environment

You can use any Java-compatible IDE or code editor, for example:

- IntelliJ IDEA
- Visual Studio Code
- Eclipse
- NetBeans

---

# ☕ Working with Java

A basic Java application has a structure similar to:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, Java!");

    }
}


If the file is called:

```text
HelloWorld.java
```

it can be compiled from the terminal using:

```bash
javac HelloWorld.java
```

Then run it using:

```bash
java HelloWorld
```

Expected output:

```text
Hello, Java!
```

---

# 📚 Java Topics

During the training, students may work with the following Java concepts.

## Variables and Data Types

Examples include:

```java
int age = 25;

double salary = 15000.50;

char grade = 'A';

boolean passed = true;

String name = "Kabelo";
```

---

## Conditional Statements

Example:

```java
if (mark >= 50) {

    System.out.println("Pass");

} else {

    System.out.println("Fail");

}
```

---

## Loops

Example:

```java
for (int i = 1; i <= 5; i++) {

    System.out.println(i);

}
```

---

## Methods

Example:

```java
public static int calculateTotal(int num1, int num2) {

    return num1 + num2;

}
```

Calling the method:

```java
int total = calculateTotal(10, 20);

System.out.println(total);
```

---

## Arrays

Example:

```java
double[] sales = {
    5000.00,
    20000.00,
    5000.00,
    5500.00,
    6750.00
};
```

Accessing an array element:

```java
System.out.println(sales[0]);
```

Looping through an array:

```java
for (int i = 0; i < sales.length; i++) {

    System.out.println(sales[i]);

}
```

---

# 🌿 Git Fundamentals

Git will be used throughout the training to manage changes to source code.

The typical Git workflow is:

```text
Modify Code
     │
     ▼
git status
     │
     ▼
git add
     │
     ▼
git commit
     │
     ▼
git push
```

---

# 📌 Common Git Commands

## Check Repository Status

```bash
git status
```

This shows files that have been:

- modified
- added
- deleted
- staged

---

## View Branches

```bash
git branch
```

The branch containing `*` is your current branch.

Example:

```text
* main
  chapter-1
  chapter-2
```

---

## Create a Branch

Students should generally make changes on a separate branch instead of directly on `main`.

```bash
git switch -c my-branch
```

For example:

```bash
git switch -c arrays-exercise
```

Older Git installations may use:

```bash
git checkout -b arrays-exercise
```

---

## Switch Branches

```bash
git switch main
```

or:

```bash
git switch arrays-exercise
```

---

# 💾 Saving Changes with Git

After modifying your Java code:

## Step 1 — Check Your Changes

```bash
git status
```

---

## Step 2 — Stage Your Changes

Stage a specific file:

```bash
git add FileName.java
```

Or stage all changed files:

```bash
git add .
```

---

## Step 3 — Commit Your Changes

```bash
git commit -m "Complete arrays exercise"
```

Commit messages should briefly explain what changed.

### Good commit messages

```text
Add arrays exercise

Fix calculation in sales program

Add retirement savings method

Complete debugging exercise
```

### Avoid vague messages such as

```text
changes

update

work

stuff
```

---

## Step 4 — Push Your Branch

The first time you push a new branch:

```bash
git push -u origin arrays-exercise
```

Afterwards, you can normally use:

```bash
git push
```

---

# 🔄 Getting the Latest Changes

Before starting new work, update your local repository.

Switch to `main`:

```bash
git switch main
```

Then pull the latest changes:

```bash
git pull origin main
```

---

# 🌳 Recommended Student Git Workflow

For exercises, students should follow a workflow similar to:

```text
             GitHub Repository
                    │
                    ▼
              Clone Repository
                    │
                    ▼
                  main
                    │
                    ▼
          Create Exercise Branch
                    │
                    ▼
             Modify Java Code
                    │
                    ▼
               git status
                    │
                    ▼
                git add .
                    │
                    ▼
               git commit
                    │
                    ▼
                git push
                    │
                    ▼
              Pull Request
                    │
                    ▼
                  main
```

Example:

```bash
git switch main
```

```bash
git pull origin main
```

```bash
git switch -c methods-exercise
```

Complete the exercise and then:

```bash
git status
```

```bash
git add .
```

```bash
git commit -m "Complete methods exercise"
```

```bash
git push -u origin methods-exercise
```

A Pull Request can then be created on GitHub if required by the instructor.

---

# 🔃 Working with Existing Branches

If a branch already exists:

```bash
git branch
```

Switch to it using:

```bash
git switch branch-name
```

For example:

```bash
git switch chapter-1
```

If the branch only exists on GitHub:

```bash
git fetch
```

Then:

```bash
git switch chapter-1
```

---

# 🧭 Useful Git Commands

| Command | Purpose |
|---|---|
| `git clone <url>` | Download a repository |
| `git status` | View changed files |
| `git branch` | Display local branches |
| `git branch -a` | Display local and remote branches |
| `git switch <branch>` | Switch branches |
| `git switch -c <branch>` | Create and switch to a new branch |
| `git add <file>` | Stage a file |
| `git add .` | Stage all changes |
| `git commit -m "message"` | Create a commit |
| `git log` | Display commit history |
| `git pull` | Retrieve and integrate remote changes |
| `git push` | Upload commits |
| `git fetch` | Retrieve remote branch information |
| `git diff` | View unstaged changes |
| `git merge <branch>` | Merge another branch into the current branch |

---

# ✅ Before Committing Your Code

Students should check the following before creating a commit:

- [ ] The program compiles successfully
- [ ] The program runs without unexpected errors
- [ ] Variable names are meaningful
- [ ] Code indentation is consistent
- [ ] Duplicate or unnecessary code has been removed
- [ ] Debugging `System.out.println()` statements have been removed where appropriate
- [ ] Only relevant files are included in the commit
- [ ] The correct Git branch is being used
- [ ] The commit message clearly describes the change

---

# 🧪 Debugging

Students are encouraged to practice debugging instead of immediately rewriting code when something goes wrong.

Consider checking:

```text
1. Is the correct variable being used?
2. Is the correct operator being used?
3. Are loop boundaries correct?
4. Are array indexes valid?
5. Are method arguments passed in the correct order?
6. Does the method return the expected value?
7. Are conditions checking the correct values?
8. Is integer division affecting the result?
```

Useful debugging techniques include:

- Printing variable values
- Using breakpoints
- Stepping through code
- Inspecting variables
- Reading exception messages
- Comparing expected and actual results

---

# ⚠️ Common Java Errors

Students may encounter errors such as:

### Compilation errors

```text
';' expected
```

```text
cannot find symbol
```

```text
incompatible types
```

These prevent the program from compiling.

### Runtime errors

Examples include:

```text
ArrayIndexOutOfBoundsException
```

```text
NullPointerException
```

```text
NumberFormatException
```

The program compiles but encounters a problem while running.

### Logic errors

The application runs successfully but produces the wrong result.

Example:

```java
double average = total / 2;
```

when the program should have used:

```java
double average = total / numberOfItems;
```

Finding these types of problems is an important part of learning programming and debugging.

---

# 👨‍💻 Coding Guidelines

Students should aim to write readable code.

Use descriptive variable names:

```java
double totalSales;
```

instead of:

```java
double x;
```

Use descriptive method names:

```java
calculateAverage();
```

instead of:

```java
calc();
```

Follow Java naming conventions:

```text
Class names       → PascalCase
Method names      → camelCase
Variable names    → camelCase
Constants         → UPPER_CASE
```

Example:

```java
public class SalesCalculator {

    private static final double TAX_RATE = 0.15;

    public static double calculateTotal(double salesAmount) {

        return salesAmount + (salesAmount * TAX_RATE);

    }
}
```

---

# 🎓 Student Expectations

Students are encouraged to:

1. Attempt exercises independently before asking for a solution.
2. Read compiler and runtime error messages carefully.
3. Use debugging tools to investigate problems.
4. Make small, meaningful Git commits.
5. Avoid committing generated or unnecessary files.
6. Keep their local repository updated.
7. Use branches when working on exercises.
8. Ask questions when they do not understand **why** something works.

The objective is not only to make the program work, but also to understand the reasoning behind the solution.

---

# 🔗 Repository

**Java Fundamentals Interns 2026**

https://github.com/kabelo-ilab/java-fundamentals-interns-2026

---

## 📖 Additional Resources

### Java

- [Java Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)

### Git

- [Git Documentation](https://git-scm.com/doc)
- [GitHub Git Guide](https://github.com/git-guides)
- [GitHub Skills](https://skills.github.com/)

---

## 🏁 Final Note

Programming is learned through practice.

Do not be afraid of errors — compiler errors, exceptions, failed tests, and debugging are normal parts of software development.

> **Write code → Run it → Debug it → Improve it → Commit it → Repeat.**

Happy coding! ☕🚀
