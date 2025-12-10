# Browser Navigation System – Java

This project simulates a simple browser navigation system using core Java.  
It demonstrates how real browsers handle Back and Forward navigation using two stacks.

---

## 📌 Features
- Visit a new URL  
- Navigate Back  
- Navigate Forward  
- Automatically clears forward history on new page visits  
- Console-based UI  
- 100% Java (no external libraries)

---

## 🧠 How It Works
The system uses two stacks:

- **backStack** → stores previously visited pages  
- **forwardStack** → stores pages available for forward navigation  

Navigation logic:
- Visiting a page pushes current page to `backStack` and clears `forwardStack`.
- Going Back pops from `backStack` and pushes current page to `forwardStack`.
- Going Forward does the reverse.

---

## 🛠️ How to Run

### Compile:
```
javac BrowserNavigation.java
```

### Run:
```
java BrowserNavigation
```

---

## 📂 Project Structure
```
BrowserNavigation/
│── BrowserNavigation.java
│── README.md
```

---

## 🎯 Purpose
A perfect beginner-friendly project for:
- Java practice  
- Understanding stack operations  
- DSA learning  
- College assignments  
- GitHub portfolio  

