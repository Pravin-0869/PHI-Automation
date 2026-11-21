# PHI Automation

Automation testing project for the Prudential Health Insurance (PHI) application.

## Tech Stack

- Playwright
- TypeScript
- Node.js
- Git
- GitHub
- VS Code

## Project Purpose

This project is created to automate functional and regression testing of the PHI application.

## Testing Areas

- Agent Login
- Agent Onboarding
- Quote Generation
- Customer Details
- KYC
- Proposal
- Insurer Details
- Nominee Details
- Medical Questions
- Summary
- Payment
- Thank You Page

## Automation Framework

The project follows the Page Object Model (POM) approach.

### Main Components

- Tests
- Page Objects
- Test Data
- Utilities
- Configuration
- Reports

## Installation

Clone the repository:

git clone <your-repository-url>

Go to the project folder:

cd PHI-Automation

Install dependencies:

npm install

Install Playwright browsers:

npx playwright install

## Run Tests

Run all tests:

npx playwright test

Run tests with browser visible:

npx playwright test --headed

Run a specific test:

npx playwright test tests/login.spec.ts

## Test Report

After execution, generate/view the Playwright report:

npx playwright show-report

## Project Structure

PHI-Automation/
│
├── tests/
│   └── *.spec.ts
│
├── pages/
│   └── *.page.ts
│
├── test-data/
│
├── utils/
│
├── playwright.config.ts
├── package.json
└── README.md

## Author

Pravin Khot
