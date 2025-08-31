# Selenium 4.35.0 Learning & Implementation 🚀

This repository documents my **hands-on learning journey with Selenium 4.x Web Automation**.
I’ll be implementing each concept from

---

## 📘 Topics Covered

### 🟢 Getting Started with Selenium

* Setting up **Java, Maven, IntelliJ/Eclipse**
* Running the first Selenium script
* WebDriver architecture & browser drivers

### 🟡 Locators & Web Elements

* `findElement` vs `findElements`
* XPath (Absolute, Relative, Functions, Axes)
* CSS Selectors
* Handling forms, text fields, checkboxes, radio buttons

### ⏳ Selenium Waits

* Implicit Wait
* Explicit Wait (ExpectedConditions)
* Fluent Wait

### 🖱 Advanced User Interactions

* Actions class (keyboard & mouse events)
* Handling **Alerts, Windows, and iFrames**
* File Upload & Download automation

### 📊 Working with Web Data

* Web Tables (Static & Dynamic)
* Handling **SVG & Shadow DOM**

### 🏗 Test Automation Frameworks

* TestNG integration
* Allure Reporting
* Page Object Model (POM) & Page Factory

### 📑 Data-Driven Testing

* Apache POI (Excel integration)
* Property Reader utility

### 🌐 Selenium Grid & Parallel Execution

* Grid setup & usage
* Running tests on **Docker & BrowserStack**

### ⚡ Miscellaneous

* JavaScript Executor
* Handling Dynamic Elements
* Logging with Log4j
* Jenkins CI/CD basics

---

## 🛠 Tech Stack

* **Java 11+**
* **Maven**
* **Selenium 4.x**
* **TestNG**
* **Allure Reports**
* **Apache POI**
* **Log4j**
* **Jenkins (CI/CD)**

---

## 📂 Repository Structure

```
LearningSeleniumATB13x/
│── src/
│   ├── main/java/       # Utilities & Framework Code
│   └── test/java/       # Test Cases
│       └── com/thetestingacademy/
│
│── pom.xml              # Maven dependencies
│── testng_Selenium01.xml# TestNG suite config
│── README.md            # This file
│── .gitignore
```

---

## ▶️ How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Mayankpaliwal09/LearingSeleniumATB13x.git
cd LearningSeleniumATB13x
```

### 2️⃣ Install dependencies

```bash
mvn clean install
```

### 3️⃣ Run TestNG tests

Run all tests:

```bash
mvn test
```

Run a specific suite (`testng_Selenium01.xml`):

```bash
mvn clean test -DsuiteXmlFile=testng_Selenium01.xml
```

### 4️⃣ Generate Allure Report

```bash
allure serve target/allure-results
```

---

## 📌 Progress Tracker

* [x] Run first Selenium script
* [x] Implement all Locators
* [x] Add Waits (Implicit / Explicit / Fluent)
* [ ] Automate VWO login (Valid/Invalid)
* [ ] Handle Alerts, Windows, iFrames
* [ ] Build POM Framework
* [ ] Add Apache POI for Data-Driven Testing
* [ ] Setup Selenium Grid & Docker
* [ ] Integrate with Jenkins

---

## ✨ Author
👤 **Mayank Paliwal**



