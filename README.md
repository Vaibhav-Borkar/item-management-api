# 📦 Item Management REST API – Java Spring Boot

A simple Java Spring Boot backend application that provides RESTful APIs for managing a collection of items.  
This project is developed as part of a **Freelance Java Developer Sample Task**.

---

## 🚀 Features

- Add new items  
- Fetch item details using item ID  
- Input validation  
- In-memory data storage (ArrayList)  
- RESTful API design  
- Clean layered architecture  

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot 4**
- **Spring Web**
- **Validation**
- **Maven**

---

## ▶ How to Run the Application

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Vaibhav-Borkar/item-management-api.git
cd item-management-api
```
### 2️⃣ Build and Run
```bash
mvn clean install
mvn spring-boot:run
```
### 3️⃣ Access Application
```bash
http://localhost:8080
```
### 🔗 API Endpoints
### ➕ Add New Item
```bash
POST http://localhost:8080/api/items
```
### Response Body 
```bash
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 10
}
```
### Response 
```bash
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 10
}
```

### 🔍 Get Item by ID
```bash
GET http://localhost:8080/api/items/1
```
### Response 
```bash
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 10
}
```
### ✅ Input Validation
```bash
name → required

description → required

price → must be positive

quantity → must be positive
```
##### If validation fails, API returns meaningful error messages.
### 🧠 Implementation Details
```bash
Data is stored in-memory using ArrayList

Auto-increment ID generation

Clean Controller → Service → Model layered architecture

RESTful design following best practices
```

### 👨‍💻 Author
```bash
Vaibhav Borkar
Java Backend Developer
📧 Email: vaibhavborkar8390@gmail.com
🔗 LinkedIn: https://linkedin.com/in/vaibhavborkarr
```





