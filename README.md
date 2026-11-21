# PHI Automation

Selenium WebDriver automation project for testing the Prudential Health Insurance (PHI) application.

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

## 🔄 Automation Flow

**Agent Login → Agent Onboarding → Quote Generation → Customer Details → KYC → Proposal → Insurer Details → Nominee → Medical Questions → Summary → Payment → Thank You**

## 📌 Key Testing Areas

- Agent Login & Onboarding
- Quote Generation
- KYC Validation
- Proposal & Insurer Details
- Nominee Details
- Medical Questions
- Summary & Premium Validation
- Payment Flow
- End-to-End Regression Testing

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project in **IntelliJ IDEA**.

### 3. Install Maven dependencies

```bash
mvn clean install
```

### 4. Run automation tests

```bash
mvn test
```

You can also run the tests using **TestNG** from IntelliJ IDEA.

## 📂 Framework Structure

```text
PHI-Automation
│
├── src/main/java
│   ├── pages
│   └── utilities
│
├── src/test/java
│   └── tests
│
├── pom.xml
├── testng.xml
└── README.md
```

## 👨‍💻 Author

**Pravin Khot**
