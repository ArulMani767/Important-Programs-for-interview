# Important Programs for Interview

Essential Java programs for interview preparation.

## Project Structure

This project uses **Maven** for build management and dependency resolution.

```
src/
├── main/
│   └── java/
│       └── com/interview/  ← All Java source files here
└── test/
    └── java/
```

---

## Prerequisites

- **Java 21 or higher** - [Download JDK](https://docs.aws.amazon.com/corretto/)
- **Maven 3.6+** - [Download Maven](https://maven.apache.org/download.cgi)
- **Git** - [Download Git](https://git-scm.com/downloads)

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/ArulMani767/Important-Programs-for-interview.git
```

Then open the cloned folder in your preferred IDE (see below).

---

## IDE Setup

### Eclipse

1. Go to **File → Import → Git → Projects from Git → Clone URI** → Next
2. In the **URI field**, paste:
   ```
   https://github.com/ArulMani767/Important-Programs-for-interview.git
   ```
   > ⚠️ After pasting, the following fields must auto-fill like this — do not edit them manually:
   > - **URI:** `https://github.com/ArulMani767/Important-Programs-for-interview.git`
   > - **Host:** `github.com`
   > - **Repository path:** `/ArulMani767/Important-Programs-for-interview.git`
   >
   > If the Repository path looks duplicated or incorrect, click **Back**, clear the URI field (`Ctrl+A` → `Delete`), and paste the URL again.
3. Enter your GitHub **username** and **Personal Access Token** as the password → Next
4. Select branch **main** → Next
5. Choose a local directory → **Finish**

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

## Build & Run

```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Build a JAR
mvn package

# Clean build artifacts
mvn clean
```

To run a program, navigate to `src/main/java/com/interview/`, open any `.java` file and use your IDE's **Run** button.

---

## Troubleshooting

### Repository path appears duplicated in Eclipse
- This happens when the URL is pasted into the wrong field or pasted twice
- Click **Back**, clear the URI field completely (`Ctrl+A` → `Delete`), and paste the URL once in the URI field only
- After pasting correctly, the fields should show:
  - **URI:** `https://github.com/ArulMani767/Important-Programs-for-interview.git`
  - **Host:** `github.com`
  - **Repository path:** `/ArulMani767/Important-Programs-for-interview.git`

### Authentication error when cloning inside IDE
- Use your GitHub **username** and a **Personal Access Token** as the password (not your GitHub account password)
- Generate token: **GitHub → Settings → Developer Settings → Personal Access Tokens → Tokens (Classic)**
- Required scope: ✅ `repo`

### Build errors after import
- Run `mvn clean compile` in the terminal inside the project folder

### Java version errors
- Ensure JDK 21+ is installed: `java -version`
- Point your IDE to JDK 21 in IDE/Project settings

### Maven not found
- Install Maven and add it to your system PATH
- Verify: `mvn --version`
- Restart your IDE after updating PATH

---

## Features

- ✅ Maven project structure (Java 21)
- ✅ JDK 21 compatibility configured in `pom.xml`
- ✅ Compatible with Eclipse, IntelliJ IDEA, VS Code, and all Maven-supported IDEs
- ✅ 60+ essential Java interview programs
