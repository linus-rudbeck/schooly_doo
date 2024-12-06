# Schooly-Doo

## Overview

The **Schooly-Doo** project is a command-line application for managing user logins in a school-like system. It serves as an introduction to object-oriented programming concepts in Java, focusing on user authentication, data storage, and interaction through a simple interface. The application simulates a login system where users, including administrators, can log in with predefined credentials.

The project emphasizes the use of inheritance, encapsulation, and service-oriented design.

## Features

1. **User Authentication:**
    - Allows users to log in using a username and password.
    - Validates credentials for an admin user.

2. **Data Management:**
    - Stores user information in a basic data source.
    - Provides functionality to add and retrieve users.

3. **Command-Line Interaction:**
    - Prompts for user input to simulate login functionality.
    - Simple output for login success or failure.

## Project Structure

- **Main Application:**
    - `Main.java`: The entry point for the program. Initializes and starts the application.
    - `SchoolyDooApp.java`: Encapsulates the main application logic, including the login process.

- **User Management:**
    - `User.java`: An abstract base class representing a generic user.
    - `Admin.java`: Extends `User` to represent an administrator.

- **Services and Data:**
    - `DataSource.java`: A simple in-memory data source for storing and retrieving user objects.
    - `LoginService.java`: Handles authentication by validating username and password.

- **Testing:**
    - `DataSourceTests.java`: Validates the functionality of adding and retrieving users.
    - `LoginServiceTests.java`: Tests for correct and incorrect login attempts.

This project is a foundational exercise in building simple authentication systems while applying key object-oriented principles. It provides a hands-on approach to working with classes, interfaces, and testing in Java.
