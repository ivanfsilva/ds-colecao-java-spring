<div align="center">

[![Português](https://img.shields.io/badge/Idioma-Portugu%C3%Aas-green.svg)](./README.md)
[![English](https://img.shields.io/badge/Language-English-blue.svg)](./README.en.md)
[![Español](https://img.shields.io/badge/Idioma-Espa%C3%B1ol-yellow.svg)](./README.es.md)

[![release](https://img.shields.io/badge/release-v1.0.0-brightgreen.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring/releases)
[![status](https://img.shields.io/badge/status-in_progress-blue.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring)
[![license](https://img.shields.io/badge/license-MIT-green.svg)](./LICENSE)

[![Back to Repository Main](https://img.shields.io/badge/⬅️_Back_to_Repository_Main-PT--BR-green.svg)](./)

</div>

# 🍃 Challenges & Deliverables — Java Spring Collection (DevSuperior)

---

This repository brings together solutions for challenges, practical activities, and evaluative projects developed throughout the **Java Spring Collection** on the ⚡**DevSuperior** platform, taught by Prof. Dr. Nélio Alves.

The main purpose of this space is to document and structure the learning journey across the Spring ecosystem, building a solid and comprehensive foundation for developing modern, resilient, production-ready backend applications.

### 🎯 Training Scope

The journey encompasses fundamental concepts and the most sought-after advanced topics in backend software engineering:

- **Java Spring Professional:** Establishing a strong foundation in Spring Boot, covering dependency injection, inversion of control, layered architecture, ORM with Spring Data JPA, exception handling, data validation with Bean Validation, RESTful APIs, and authentication/access control (Spring Security & OAuth2/JWT).

- **Java Spring Expert:** Focus on code excellence and quality assurance with Test-Driven Development (**TDD**), unit and integration testing using **JUnit 5**, **Mockito**, **MockMvc**, and **RestAssured**, along with code coverage analysis using **JaCoCo**.

- **Java Spring Reference:** Expanding the backend toolkit for complex domain modeling, cloud integration (**AWS S3**), email delivery, interactive API documentation with **OpenAPI/Swagger**, HATEOAS, NoSQL databases (**MongoDB** and **Cassandra**), reactive programming with **Spring WebFlux**, and batch processing with **Spring Batch**.

- **Java Spring Advanced Topics:** Enterprise architecture featuring distributed caching (**Redis**), advanced authentication with **OAuth2** and **OIDC**, asynchronous messaging, cloud deployment (**AWS**), AI integration in software development, and AI-driven system construction.

---

## 🛠️ Technologies and Tools

- **Language & Framework:** Java LTS (17+), Spring Boot (3.x / 4.x), Spring MVC, Spring Security
- **Build & Dependencies:** Apache Maven
- **Persistence & Databases:** Jakarta Persistence (JPA), Spring Data JPA, H2 Database, PostgreSQL, MySQL
- **Validation & Testing:** Jakarta Bean Validation, JUnit 5, Mockito, RestAssured, JaCoCo
- **Quality & Productivity:** SonarQube for IDE, Project Lombok, Postman

<br>

<div align="center">
  <!-- Language, Framework & Build -->
  <img src="https://img.shields.io/badge/Java_LTS_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java LTS 17+" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" alt="Spring Security" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Apache Maven" />
  <br>
  <!-- Persistence & Databases -->
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA" />
  <img src="https://img.shields.io/badge/H2_Database-003B5C?style=for-the-badge&logo=database&logoColor=white" alt="H2 Database" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <br>
  <!-- Testing & Quality -->
  <img src="https://img.shields.io/badge/JUnit_5-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit 5" />
  <img src="https://img.shields.io/badge/Mockito-C50000?style=for-the-badge&logo=testing-library&logoColor=white" alt="Mockito" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman" />
  <img src="https://img.shields.io/badge/SonarQube-4E9BCD?style=for-the-badge&logo=sonarqube&logoColor=white" alt="SonarQube" />
</div>

---

## 📁 Track Structure & Challenges

### 01. Java Spring Professional

| Challenge                               | Subfolder / Link                                                                                                          | Key Applied Concepts                                                                   |      Status      |
| :-------------------------------------- | :------------------------------------------------------------------------------------------------------------------------ | :------------------------------------------------------------------------------------- | :--------------: |
| **Components and Dependency Injection** | [`01-desafio-componentes-injecao-dependencia`](./01-java-spring-professional/01-desafio-componentes-injecao-dependencia/) | Dependency injection, Spring components (`@Component`, `@Service`), decoupled services | `⏳ In Progress` |
| **Domain Model and ORM**                | [`02-desafio-modelo-dominio-orm`](./01-java-spring-professional/02-desafio-modelo-dominio-orm/)                           | Object-Relational Mapping (ORM), JPA entities, relationships (1:N, N:N)                |  `⏳ To Start`   |
| **Client CRUD**                         | [`03-desafio-crud-clientes`](./01-java-spring-professional/03-desafio-crud-clientes/)                                     | REST API, DTOs, Controllers, Services, exception handling, complete CRUD               |  `⏳ To Start`   |
| **Sales Query**                         | [`04-desafio-consulta-vendas`](./01-java-spring-professional/04-desafio-consulta-vendas/)                                 | Custom queries with Spring Data JPA, JPQL, projection DTOs, reporting                  |  `⏳ To Start`   |
| **Structured Spring Boot Project**      | [`05-desafio-projeto-spring-boot-estruturado`](./01-java-spring-professional/05-desafio-projeto-spring-boot-estruturado/) | Layered architecture, package organization, best practices, and validations            |  `⏳ To Start`   |

---

### 02. Java Spring Expert

| Challenge                          | Subfolder / Link                                                                                      | Key Applied Concepts                                                           |    Status     |
| :--------------------------------- | :---------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------- | :-----------: |
| **TDD Event City**                 | [`01-desafio-tdd-event-city`](./02-java-spring-expert/01-desafio-tdd-event-city/)                     | Test-Driven Development (TDD), JUnit, Mockito, business rule validation        | `⏳ To Start` |
| **TDD Event City (Auth/Security)** | [`02-desafio-tdd-event-city-seguranca`](./02-java-spring-expert/02-desafio-tdd-event-city-seguranca/) | TDD applied to endpoints protected by Spring Security, access profiles (Roles) | `⏳ To Start` |
| **Movieflix**                      | [`03-desafio-movieflix`](./02-java-spring-expert/03-desafio-movieflix/)                               | Advanced REST API, OAuth2 / JWT authentication, granular access control        | `⏳ To Start` |
| **DSMovie JaCoCo**                 | [`04-desafio-dsmovie-jacoco`](./02-java-spring-expert/04-desafio-dsmovie-jacoco/)                     | Unit and integration testing with code coverage analysis using JaCoCo          | `⏳ To Start` |
| **DSMovie RestAssured**            | [`05-desafio-dsmovie-restassured`](./02-java-spring-expert/05-desafio-dsmovie-restassured/)           | E2E and integration API testing using the RestAssured library                  | `⏳ To Start` |

---

## 🚀 How to Run the Challenges

1. Clone the repository:

```bash
git clone https://github.com/ivanfsilva/ds-colecao-java-spring.git
```

2. Navigate to the desired module and subfolder.
3. Open the specific challenge folder in **IntelliJ IDEA** (or your preferred IDE).
4. Check the specific `README.md` file inside the challenge folder for detailed execution instructions, class diagrams, and problem specifications.

---

## 👤 Author

Developed by **Ivan Ferreira**.

Copyright © 2026 Ivan Ferreira. All rights reserved.

---

## ☕ About

Repository for challenges and deliverables from the **Java Spring Collection** on the ⚡**DevSuperior** platform, taught by Prof. Dr. Nélio Alves.
