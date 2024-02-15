Spring Boot Quiz App
This project is a simple quiz application developed using Spring Boot framework. It allows users to manage questions, add new questions, retrieve questions by category, and delete questions.

Features: 
-Retrieve all questions
-Retrieve questions by category
-Add new questions
-Delete questions by ID
-Technologies Used
-Java
-Spring Boot
-Spring Data JPA
-MySQL (or your preferred database)


Access the application through the provided endpoints:
GET /questions: Retrieve all questions
GET /questions/{category}: Retrieve questions by category
POST /questions: Add a new question
DELETE /questions/{id}: Delete a question by ID

Configuration: Database configuration can be found in application.properties file. You can modify the database connection details according to your setup.
