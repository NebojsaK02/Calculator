# Simple Calculator Project

This project is a basic calculator application built with **Java** and **Spring Boot**.  
It includes **unit**, **integration**, and **end-to-end (E2E)** tests using **JUnit 5** and **Selenium**.

---

## Features

- Basic operations: Add, Subtract, Multiply, Divide  
- REST API endpoint for calculations (`/api/calculate`)  
- Simple HTML frontend with JavaScript `fetch()` integration  
- Full E2E test using Selenium WebDriver  

--- 
## How to Run
### 1. Clone the repository
`bash`<br>
`git clone https://github.com/NebojsaK02/Calculator.git`<br>
`cd Calculator`

### **2. Build the project**
Make sure you have Java 17+ and Maven installed.<br>
`mvn clean install`

### **3. Run the backend**
Start the Spring Boot application:  
`mvn spring-boot:run`  
The app will be available at: http://localhost:8080/index.html

---
## **Known Issue**
Chrome 128 Compatibility Problem  
If you see an error like:  
`This version of ChromeDriver only supports Chrome version 114`  
That means WebDriverManager cannot yet automatically download a compatible driver for your Chrome version (128).

**Fix Options**
### 1. Manually download ChromeDriver for your Chrome version (128.x)
→ https://chromedriver.chromium.org/downloads

Then add in your test:<br>
`System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");`

### 2. Wait until WebDriverManager supports Chrome 128 (the issue is temporary).

