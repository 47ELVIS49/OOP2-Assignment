# Java Login Application – BSD 214 Assignment 1

## Description

This is a simple Java program created for the BSD 214 Object-Oriented Programming 2 assignment.

The program simulates a login system that:
- Accepts a **username** and **password**
- Hides the password input using `*`
- Allows the user only **3 login attempts**
- Displays a success or failure message depending on the input

## How It Works
- The correct credentials are:
  - **Username**: `Elvis`
  - **Password**: `@fibonacci_2025.`
- If the user enters incorrect details 3 times, access is denied.
- Password characters are hidden when typed

## Technologies Used
- Java
- Console input handling (`System.console()`)


## How to Run
1. Open a terminal window.
2. Navigate to the directory containing the `LoginApp.java` file.
3. Compile the code:

   ```bash
   javac LoginApp.java
