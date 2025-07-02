# Learners-Management-System
SpringBoot Crud Operations for Learners Management System
## Features
✅ Add, retrieve, update, and delete learners.  
✅ Search learners by first name, last name, gender, or ID.  
✅ RESTful API design following best practices.  
✅ Integrated **Spring Data JPA** for database operations.  
✅ Swagger/OpenAPI for interactive API documentation.  
✅ Exception handling with clear error reporting.  
✅ MySQL integration with schema auto-creation and updates.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger/OpenAPI
- Maven
- Postman for API testing
- Git for version control

## API Endpoints
| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| POST | `/api/addLearner` | Add a new learner |
| GET | `/api/getAllLearners` | Retrieve all learners |
| GET | `/api/getLearnerByID/{learnerId}` | Retrieve learner by ID |
| GET | `/api/getLearnerByFirstName/{firstName}` | Retrieve learners by first name |
| GET | `/api/getLearnerByLastName/{lastName}` | Retrieve learners by last name |
| GET | `/api/getLearnerByGender/{gender}` | Retrieve learners by gender |
| PUT | `/api/updateByLearnerId/{learnerId}` | Update learner details |
| DELETE | `/api/deleteById/{learnerId}` | Delete learner by ID |

## Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/learnerdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update



## Running the Project

1️⃣ Clone the repository:
git clone https://github.com/yourusername/learners-management-system.git
2️⃣ Configure application.properties with your MySQL details.

3️⃣ Build and run:

mvn spring-boot:run

4️⃣ Access Swagger UI:
http://localhost:8082/swagger-ui.html

Contact
Chester Mabulela
📧 chestermabulela@gmail.com
