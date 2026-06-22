# Important Programs for Interview

Essential Java programs for interview preparation.

## Project Structure

This project now uses **Maven** for build management and dependency resolution.

```
src/
├── main/
│   └── java/
│       └── com/interview/  ← All Java source files here
└── test/
    └── java/
```

## Prerequisites

- **Java 21 or higher** - [Download JDK](https://docs.aws.amazon.com/corretto/)
- **Maven 3.6+** - [Download Maven](https://maven.apache.org/download.cgi)

## Setup Instructions

### 1. Install Java (if not already installed)
```bash
# Verify Java installation
java -version
```

### 2. Install Maven
```bash
# Download from: https://maven.apache.org/download.cgi
# Extract to a location (e.g., C:\Maven)
# Add to PATH environment variable: C:\Maven\bin

# Verify installation
mvn --version
```

### 3. Build the Project


# Or using Maven directly
mvn clean compile
```

## Features

- ✅ Framework-level Maven project structure
- ✅ Properly configured JDK 21 compatibility
- ✅ IDE support (.classpath, .project for Eclipse/VS Code)
- ✅ All build path errors resolved
- ✅ 60+ essential interview programs

## Available Maven Commands

```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Build a JAR
mvn package

# Clean build artifacts
mvn clean

# View project info
mvn help:describe
```

## Troubleshooting

### "Maven not found"
- Install Maven and add it to your PATH
- Restart VS Code after installation

### Build errors
- Ensure Java 21+ is installed: `java -version`
- Clear Maven cache: `mvn clean`
- Rebuild: `mvn compile`

## Eclipse/VS Code Integration

This project now has proper IDE configuration:
- ✅ `.classpath` - Classpath configuration
- ✅ `.project` - Project description  
- ✅ `.settings/` - IDE preferences
- ✅ `pom.xml` - Maven configuration

Import as existing Maven project in your IDE.

