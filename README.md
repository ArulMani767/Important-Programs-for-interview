# Important Programs for Interview

This repository contains a collection of Java programs focused on interview preparation and coding practice. The source code is organized under `src/main/java/com/interview` and includes exercises covering arrays, strings, sorting, patterns, prime numbers, and other core Java concepts.

## Project structure

```text
JavaImportantPrograms/
├── .classpath                     # Eclipse classpath configuration
├── .project                       # Eclipse project configuration
├── .settings/                     # Eclipse settings
├── .vscode/                       # VS Code workspace settings
├── pom.xml                        # Maven project configuration
├── README.md
├── src/
│   ├── .gitignore
│   └── main/java/
│       ├── com/interview/         # Maven package path (currently no Java files)
│       └── interview/
│           ├── *.java             # Core interview practice programs
│           └── collectionprograms/ # Collection and salary exercises
└── target/                        # Generated Maven build output
```

## Project structure guide

| Path | Contents |
|---|---|
| `src/main/java/interview/` | Core Java interview practice programs |
| `src/main/java/interview/collectionprograms/` | Collection-based salary and list/map exercises |
| `pom.xml` | Maven configuration, Java 21 compiler settings, and test dependencies |
| `target/` | Generated compiled classes and other Maven build output |
| `.classpath`, `.project`, `.settings/`, `.vscode/` | IDE project and workspace configuration |
## Prerequisites

- **Java 21 or higher** - [Download JDK](https://docs.aws.amazon.com/corretto/)
- **Maven 3.9+** - [Download Maven](https://maven.apache.org/download.cgi)
- **Git** - [Download Git](https://git-scm.com/downloads)

## IDE Setup

### Eclipse

1. Go to **File → Import → Git → Projects from Git (with smart import)** → Next
2. Select **Clone URI** → Next
3. In the **URI field**, paste:

[https://github.com/ArulMani767/Important-Programs-for-interview.git](https://github.com/ArulMani767/Important-Programs-for-interview.git)

> ⚠️ After pasting, the following fields must auto-fill like this — do not edit them manually:
> 
> - **URI:** `https://github.com/ArulMani767/Important-Programs-for-interview.git`
> - **Host:** `github.com`
> - **Repository path:** `/ArulMani767/Important-Programs-for-interview.git`
> 
> If the Repository path looks duplicated or incorrect, click **Back**, clear the URI field (`Ctrl+A` → `Delete`), and paste the URL again.

4. Enter your GitHub **username** and **Personal Access Token** as the password → Next
5. Select branch **main** → Next
6. Choose a local directory → Next
7. Eclipse detects the project type automatically → **Finish**

---

### IntelliJ IDEA

1. Go to **File → New → Project from Version Control**
2. In the **URL field**, paste:

[https://github.com/ArulMani767/Important-Programs-for-interview.git](https://github.com/ArulMani767/Important-Programs-for-interview.git)

> ⚠️ Paste only in the URL field. The directory field will auto-fill — do not modify it unless you want a custom save location.

3. Click **Clone**
4. Click **Open as Maven Project** when prompted → Done

---

### VS Code

1. Open Command Palette (`Ctrl+Shift+P`) → type **Git: Clone**
2. Paste:

[https://github.com/ArulMani767/Important-Programs-for-interview.git](https://github.com/ArulMani767/Important-Programs-for-interview.git)

3. Press **Enter** → choose a local folder to clone into
4. Click **Open** when prompted
5. Install **Extension Pack for Java** if not already installed
6. VS Code auto-detects Maven and sets up the project → Done

---

### JetBrains (WebStorm / PyCharm / Other)

1. Go to **File → New → Project from Version Control**
2. In the **URL field**, paste:

[https://github.com/ArulMani767/Important-Programs-for-interview.git](https://github.com/ArulMani767/Important-Programs-for-interview.git)

> ⚠️ Paste only in the URL field — do not click into other fields before pasting.

3. Click **Clone** → Done

---

## Setup instructions

1. Clone or open the project folder.
2. Build the project with Maven:

```bash
mvn clean install
```

3. Compile or run programs from your IDE.

## Framework Components

### Java 21 and Maven
- Java 21 is configured as the source and target version in `pom.xml`.
- Maven manages the build and compiler configuration.
- JUnit 4.13.2 is declared with test scope; no application framework is used.

### Source packages
- `interview/` contains standalone programs for arrays, strings, collections, sorting, searching, recursion, number problems, and patterns.
- `interview/collectionprograms/` contains collection-based salary and list/map exercises.
## Build Commands

### Using Maven
```bash
# Clean and compile all files
mvn clean compile

# Run unit tests
mvn test
```

## Common Build Issues & Solutions

| Problem | Solution |
|---------|----------|
| `mvn: command not found` | Install Maven 3.9+, add to system PATH |
| Compilation failed | Run `mvn clean compile` |
| Import errors in IDE | Run `mvn clean install` |
| Java version error | Install JDK 21 or higher |

---

## Key Features

✅ **Standalone Java interview exercises**
- Array and collection operations, including list and map examples
- String processing, such as anagrams, palindromes, character counts, and reversals
- Sorting, searching, array rotations, and other algorithm exercises
- Number series and checks, including prime, Fibonacci, factorial, and Armstrong examples
- Console and stream-based pattern printing

✅ **Java 21 and Maven build**
- Maven compiler configuration targets Java 21
- JUnit 4.13.2 is available for test-scope use
- Programs are organized as individual Java classes under `src/main/java/interview/`
---

## Notes

- This repository is focused on core Java interview problems rather than framework-based automation.
- New programs can be added under `src/main/java/com/interview/`.

## Learn More

- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Maven Guide](https://maven.apache.org/guides/)


