# 💰 Financial Ledger Application

## 📌 Overview

This is a simple command-line financial ledger application that allows users to track deposits and payments. The application stores transactions in a CSV file and provides multiple ways to view and filter financial records.

The program runs continuously until the user chooses to exit.

---

## 🚀 Features

### 🏠 Home Screen

The home screen serves as the main navigation menu and provides the following options:

* **D) Add Deposit**
  Prompts the user to enter deposit details and saves the transaction to a CSV file.

* **P) Make Payment (Debit)**
  Prompts the user to enter payment details and records it as a negative transaction in the CSV file.

* **L) Ledger**
  Navigates to the ledger screen to view transaction history.

* **X) Exit**
  Closes the application.

---

### 📖 Ledger Screen

Displays transaction history with the **newest entries shown first**.

Options include:

* **A) All**
  Displays all transactions.

* **D) Deposits**
  Displays only deposit (positive) transactions.

* **P) Payments**
  Displays only payment (negative) transactions.

* **R) Reports**
  Opens the reports menu for predefined or custom searches.

* **H) Home**
  Returns to the home screen.

---

### 📊 Reports Screen

Provides predefined financial reports and search functionality:

* **1) Month To Date**
  Shows transactions from the beginning of the current month to today.

* **2) Previous Month**
  Displays all transactions from the previous month.

* **3) Year To Date**
  Shows transactions from the beginning of the current year to today.

* **4) Previous Year**
  Displays transactions from the previous year.

* **5) Search by Vendor**
  Prompts the user to enter a vendor name and displays all matching transactions.

* **0) Back**
  Returns to the Ledger screen.

---

## 🗂️ Data Storage

* All transactions are stored in a **CSV file**.
* Each entry typically includes:

    * Date
    * Time
    * Description / Vendor
    * Amount

---

## ⚙️ Application Behavior

* The application runs in a loop until the user selects **Exit**.
* All financial entries are saved immediately to ensure data persistence.
* Ledger displays entries in reverse chronological order (newest first).

---

## 🛠️ Technologies Used

* Java
* File I/O (CSV handling)
* Console-based user interface

---

## 📌 Future Improvements (Optional Ideas)

* Add GUI interface
* Export reports to PDF
* Add categories for transactions
* Implement user authentication

---

## ▶️ How to Run

1. Compile the Java files:

   ```bash
   javac Main.java
   ```

2. Run the application:

   ```bash
   java Main
   ```

---

## 📄 License

This project is for educational purposes.
