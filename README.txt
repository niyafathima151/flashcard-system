Team ID: IT-48

Project Title: Simple Flashcard System

Team Members (Name + Roll No):

1. Niyafathima VT – 2025BCS0151
2. Neha P – 2025BCS0163

Problem Description:
The Simple Flashcard System is a console-based Java application designed to help users create and manage flashcards for learning purposes. Users can add questions and answers, review them, search for specific flashcards, and track how many times a card has been reviewed. The system provides a simple and interactive menu-driven interface. This project demonstrates efficient data handling using arrays and object-oriented programming principles.

Java Concepts Used:

* Classes & Objects: Used to create Card, Flashcard, and Service classes.
* Encapsulation: Data members are kept private and accessed using getter methods.
* Inheritance / Interface: Flashcard extends Card and implements Reviewable interface.
* Arrays: Used to store flashcards in memory.
* Strings: Used for handling questions, answers, and searching.
* Exception Handling: Custom exception (DomainException) is used for validation.
* Packages: Code is organized into app, model, and service packages.

How to Compile:
javac -d out src/app/Main.java src/model/*.java src/service/*.java

How to Run:
java -cp out app.Main

Contribution of Each Member:

* Niyafathima VT: Designed model classes and implemented FlashcardService logic.
* Neha P: Developed Main class, user interface, and input handling.
