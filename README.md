# SauceDemo Automation Project

This is a simple Selenium automation framework in Java using TestNG and the Page Object Model (POM) design pattern. It automates login and add-to-cart functionality on [SauceDemo](https://www.saucedemo.com/).

---

## 🚀 Features

- Automates login with valid credentials
- Adds a product to cart and verifies the item
- Built using Maven, Selenium WebDriver, and TestNG
- Structured using Page Object Model (POM)
- Generates TestNG HTML reports
- Automatically deploys reports to GitHub Pages

---

## 🧰 Tech Stack

- Java
- Selenium WebDriver
- Maven
- TestNG
- ChromeDriver
- GitHub Actions (CI/CD)

---

## 📂 Project Structure

```
saucedemo-automation/
├── pom.xml
├── testng.xml
├── /src
│   ├── /main/java/pages/
│   └── /test/java/tests/
├── .github/workflows/
│   └── deploy-report.yml
```

---

## 🛠️ Setup Instructions

1. Clone this repository or extract the ZIP file.
2. Navigate to the project root.
3. Install dependencies:

```bash
mvn clean install
```

4. Run the tests:

```bash
mvn test
```

---

## 📊 View Latest Report

[Click here to view latest Test Report](https://<your-username>.github.io/saucedemo-automation-java/)

> Replace `<your-username>` with your GitHub username after uploading to GitHub.

---

## 📄 License

This project is open source and free to use for educational/demo purposes.
