# Tarnia User Guide

Tarnia is a simple command-line task manager that helps you keep track of tasks such as **todos**, **deadlines**, and **events**.

---

## Running the Program
1. Ensure you have **Java 17** installed.  
   You can check with:  
   `java -version`  

2. Run the JAR file:  
   `java -jar tarnia.jar`  

---

## Features

- **Todo** – add a basic task with just a description.  
- **Deadline** – add a task with a description and a due date.  
- **Event** – add a task with a description and date/time.  
- **List** all tasks with their completion status.  
- **Mark** and **unmark** tasks as done.  
- **Delete** tasks.  
- **Find** tasks by keyword.  
- Tasks are **saved automatically** between sessions.

---

## Commands

**Add a Todo**  
`todo <description>`  
Example: `todo read book`  

**Add a Deadline**  
`deadline <description> /by <yyyy-mm-dd>`  
Example: `deadline return book /by 2025-10-15`  

**Add an Event**  
`event <description> /at <yyyy-mm-dd HH:mm>`  
Example: `event project meeting /at 2025-10-01 14:00`  

**List Tasks**  
`list`  

**Mark a Task**  
`mark <task number>`  

**Unmark a Task**  
`unmark <task number>`  

**Delete a Task**  
`delete <task number>`  

**Find by Keyword**  
`find <keyword>`  

**Exit**  
`bye`  


## Exa
