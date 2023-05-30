# Simple ATM System using Core Java

This is a simple ATM (Automated Teller Machine) system implemented using core Java. It provides basic functionality for managing customer accounts, such as checking balance, making withdrawals, and depositing funds.

## Features:
  1. **Login:** Customers can log in using their customer number and PIN number.
  2. **Account Selection:** Customers can choose to access their checking or saving account.
  3. **Checking Account:**
    a. View balance
    b. Withdraw funds
    c. Deposit funds
  4. **Saving Account:**
     a. View balance
     b. Withdraw funds
     c. Deposit funds
  8. **Exit:** Customers can exit the ATM system when they are done.

## Getting Started

### To run this ATM system on your local machine, follow these steps:
1. **Clone the repository:** `git clone https://github.com/OmkarBathe1410/Simple_ATM_Using_CoreJava.git`
2. **Navigate to the project directory:** `cd Simple_ATM_Using_CoreJava`
3. **Compile the Java files:** `javac corejava/project/atm/*.java`
4. **Run the ATM system:** `java corejava.project.atm.ATM`

## Usage
When prompted, enter your customer number and PIN number to log in.
Select the account you want to access (checking or saving).
Choose from the available options for the selected account:
  1. **View balance:** Displays the current balance of the account.
  2. **Withdraw funds:** Allows you to withdraw funds from the account.
  3. **Deposit funds:** Allows you to deposit funds into the account.
  4. **Exit:** Terminates the ATM system.
### After performing an action, you will be redirected to the account selection screen. You can choose another account or exit the system.

## Note
The system currently supports a few predefined customer numbers and PIN numbers, which are stored in a HashMap.
You can modify this data in the getLogin() method of the OptionMenu class to include your own customer data.
