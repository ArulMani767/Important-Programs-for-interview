# Important Programs for Interview

Essential Java programs for interview preparation, including core Java concepts and **Selenium WebDriver** framework for browser automation.

## Project Structure

```
JavaImportantPrograms/
├── src/main/java/
│   ├── com/interview/              ← Core Java programs (80+ files)
│   │   ├── ArrayListSorting.java
│   │   ├── AnagramProgram.java
│   │   ├── PrimeNumber.java
│   │   └── ... (more programs)
│   │
│   └── org/openqa/selenium/mock/   ← Local Selenium-style demonstration classes
│       ├── WebDriver.java
│       ├── ChromeOptions.java
│       └── ChromeDriver.java
│
├── target/classes/                 ← Compiled .class files
├── pom.xml                         ← Maven configuration
└── README.md                       ← Documentation
```

---

## Prerequisites

- **Java 21 or higher** - [Download JDK](https://docs.aws.amazon.com/corretto/)
- **Maven 3.9+** - [Download Maven](https://maven.apache.org/download.cgi)
- **Git** - [Download Git](https://git-scm.com/downloads)

---

## Dependencies

The project uses the latest versions of key libraries:

| Dependency | Version | Purpose |
|---|---|---|
| **Selenium Java** | 4.45.0 | Browser automation framework |
| **JUnit** | 4.13.2 | Unit testing framework |

All dependencies are configured in `pom.xml` for automatic download.

---

## Setup Instructions

### 1. Clone/Open Project
```bash
cd C:\JavaImportantPrograms
```

### 2. Build Project with Maven
```bash
mvn clean install
```

### 3. View Compiled Classes
```bash
# .class files are generated in:
target/classes/com/interview/
target/classes/org/openqa/selenium/
```

---

## Framework Components

### Core Java Programs (`com/interview/`)
Collection of 80+ programs covering:
- Data Structures (Arrays, ArrayLists, LinkedLists)
- Algorithms (Sorting, Searching, Recursion)
- String Operations (Anagrams, Palindromes, Reversals)
- Pattern Matching
- Number Operations (Prime, Armstrong, Fibonacci)

## Build Commands

### Using Maven
```bash
# Clean and compile all files
mvn clean compile

# Run unit tests
mvn test

# Create package
mvn package
```

### Direct Compilation
```bash
cd src/main/java

## Project Structure Guide

| Directory | Contents |
|---|---|
| `src/main/java/com/interview/` | Core Java programs (80+ files) |
| `src/main/java/org/openqa/selenium/` | Selenium WebDriver framework |
| `src/test/java/` | Test files |
| `target/classes/` | Compiled .class files |
| `pom.xml` | Maven dependencies & configuration |

---

## IDE Setup

### Eclipse

1. Go to **File → Import → Git → Projects from Git (with smart import)** → Next
2. Select **Clone URI** → Next
3. In the **URI field**, paste:
```
https://github.com/ArulMani767/Important-Programs-for-interview.git
```

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
```
https://github.com/ArulMani767/Important-Programs-for-interview.git
```

> ⚠️ Paste only in the URL field. The directory field will auto-fill — do not modify it unless you want a custom save location.

3. Click **Clone**
4. Click **Open as Maven Project** when prompted → Done

---

### VS Code

1. Open Command Palette (`Ctrl+Shift+P`) → type **Git: Clone**
2. Paste:
```
https://github.com/ArulMani767/Important-Programs-for-interview.git
```
3. Press **Enter** → choose a local folder to clone into
4. Click **Open** when prompted
5. Install **Extension Pack for Java** if not already installed
6. VS Code auto-detects Maven and sets up the project → Done

---

### JetBrains (WebStorm / PyCharm / Other)

1. Go to **File → New → Project from Version Control**
2. In the **URL field**, paste:
```
https://github.com/ArulMani767/Important-Programs-for-interview.git
```

> ⚠️ Paste only in the URL field — do not click into other fields before pasting.

3. Click **Clone** → Done

---

## Common Build Issues & Solutions

| Problem | Solution |
|---------|----------|
| `mvn: command not found` | Install Maven 3.9+, add to system PATH |
| Compilation failed | Run `mvn clean compile` |
| Import errors in IDE | Run `mvn clean install` |
| Java version error | Install JDK 21 or higher |

---

## Key Features

✅ **80+ Core Java Programs**
- Data Structures (Arrays, Lists, Maps, Sets)
- Algorithms (Sorting, Searching, Recursion)
- String Operations (Palindromes, Anagrams, Reversals)
- Pattern Matching
- Number Operations (Prime, Fibonacci, Armstrong)

✅ **Maven Build System**
- Automatic dependency management
- Latest library versions
- Easy IDE integration

---

## Learn More

- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Maven Guide](https://maven.apache.org/guides/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
