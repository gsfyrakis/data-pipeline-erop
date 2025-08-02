# Governance EROP Translator to Drools

This application translates EROP (Event-Right-Obligation-Prohibition) rules using ANTLR parsing and custom translation logic to Drools.

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Antlr 4.4

## Project Structure
```

GovernanceEROP/
-├── src/                    # Source code
-├── lib/                    # Antlr
-├── erop-contracts/         # Input contract files
-├── pom.xml                # Maven configuration
-├── ai-erop.txt            # Sample input file
-└── erop-output.txt        # Sample output file
```
## Building the Application

1. Navigate to the project directory:
   ```bash
   cd GovernanceEROP
   ```

2. Compile the project using Maven:
   ```bash
   mvn clean compile
   ```

3. Package the application (optional):
   ```bash
   mvn package
   ```

## Running the Application

The application requires two command-line arguments:
- `input_file_path`: Path to the input file containing EROP contract data
- `output_file_path`: Path where the translated output will be written

### Method 1: Using Maven exec plugin

```bash
mvn exec:java -Dexec.mainClass="com.translator.driver.Main" -Dexec.args="<input_file_path> <output_file_path>"
```
Example:
```
mvn exec:java -Dexec.mainClass="com.translator.driver.Main" -Dexec.args="ai-erop.txt erop-output.txt"
```


