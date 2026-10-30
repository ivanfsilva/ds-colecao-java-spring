<div align="center">

[![Português](https://img.shields.io/badge/Idioma-Portugu%C3%Aas-green.svg)](./README.md)
[![English](https://img.shields.io/badge/Language-English-blue.svg)](./README.en.md)
[![Español](https://img.shields.io/badge/Idioma-Espa%C3%B1ol-yellow.svg)](./README.es.md)

[![release](https://img.shields.io/badge/release-v1.0.0-brightgreen.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring/releases)
[![status](https://img.shields.io/badge/status-en_progreso-blue.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring)
[![license](https://img.shields.io/badge/license-MIT-green.svg)](./LICENSE)

[![Volver al Repositorio Principal](https://img.shields.io/badge/⬅️_Volver_al_Repositorio_Principal-PT--BR-green.svg)](./)

</div>

# 🍃 Desafíos y Entregas — Colección Java Spring (DevSuperior)

---

Este repositorio reúne las soluciones de los desafíos, actividades prácticas y proyectos de evaluación desarrollados a lo largo de la **Colección Java Spring** en la plataforma ⚡**DevSuperior**, impartida por el Prof. Dr. Nélio Alves.

El propósito principal de este espacio es registrar y estructurar el proceso de aprendizaje en el ecosistema Spring, construyendo una base sólida e integral para el desarrollo de aplicaciones backend modernas, resilientes y listas para producción.

### 🎯 Alcance de la Formación

La formación abarca desde los fundamentos esenciales hasta los temas avanzados más demandados en la ingeniería de software backend:

- **Java Spring Professional:** Construcción de una base sólida en Spring Boot, cubriendo inyección de dependencias, inversión de control, arquitectura en capas, ORM con Spring Data JPA, manejo de excepciones, validación de datos con Bean Validation, APIs RESTful y autenticación/control de acceso (Spring Security y OAuth2/JWT).

- **Java Spring Expert:** Enfoque en la excelencia del código y aseguramiento de calidad con Desarrollo Guiado por Pruebas (**TDD**), pruebas unitarias y de integración utilizando **JUnit 5**, **Mockito**, **MockMvc** y **RestAssured**, además del análisis de cobertura de código con **JaCoCo**.

- **Java Spring Reference:** Ampliación de la caja de herramientas backend para modelado de dominios complejos, integración con la nube (**AWS S3**), envío de correos electrónicos, documentación interactiva con **OpenAPI/Swagger**, HATEOAS, bases de datos NoSQL (**MongoDB** y **Cassandra**), programación reactiva con **Spring WebFlux** y procesamiento en lote con **Spring Batch**.

- **Java Spring Temas Avanzados:** Arquitectura empresarial con caché distribuido (**Redis**), autenticación avanzada con **OAuth2** y **OIDC**, mensajería asíncrona, despliegue en la nube (**AWS**), integración de IA en el desarrollo y construcción de sistemas impulsados por Inteligencia Artificial.

---

## 🛠️ Tecnologías y Herramientas

- **Lenguaje y Framework:** Java LTS (17+), Spring Boot (3.x / 4.x), Spring MVC, Spring Security
- **Construcción y Dependencias:** Apache Maven
- **Persistencia y Bases de Datos:** Jakarta Persistence (JPA), Spring Data JPA, H2 Database, PostgreSQL, MySQL
- **Validación y Pruebas:** Jakarta Bean Validation, JUnit 5, Mockito, RestAssured, JaCoCo
- **Calidad y Productividad:** SonarQube for IDE, Project Lombok, Postman

<br>

<div align="center">
  <!-- Lenguaje, Framework & Construcción -->
  <img src="https://img.shields.io/badge/Java_LTS_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java LTS 17+" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" alt="Spring Security" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Apache Maven" />
  <br>
  <!-- Persistencia & Bases de Datos -->
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA" />
  <img src="https://img.shields.io/badge/H2_Database-003B5C?style=for-the-badge&logo=database&logoColor=white" alt="H2 Database" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <br>
  <!-- Pruebas & Calidad -->
  <img src="https://img.shields.io/badge/JUnit_5-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit 5" />
  <img src="https://img.shields.io/badge/Mockito-C50000?style=for-the-badge&logo=testing-library&logoColor=white" alt="Mockito" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman" />
  <img src="https://img.shields.io/badge/SonarQube-4E9BCD?style=for-the-badge&logo=sonarqube&logoColor=white" alt="SonarQube" />
</div>

---

## 📁 Estructura de Módulos y Desafíos

### 01. Java Spring Professional

| Desafío                                     | Subcarpeta / Enlace                                                                                                       | Principales Conceptos Aplicados                                                                  |      Estado      |
| :------------------------------------------ | :------------------------------------------------------------------------------------------------------------------------ | :----------------------------------------------------------------------------------------------- | :--------------: |
| **Componentes e Inyección de Dependencias** | [`01-desafio-componentes-injecao-dependencia`](./01-java-spring-professional/01-desafio-componentes-injecao-dependencia/) | Inyección de dependencias, componentes Spring (`@Component`, `@Service`), servicios desacoplados | `⏳ En Progreso` |
| **Modelo de Dominio y ORM**                 | [`02-desafio-modelo-dominio-orm`](./01-java-spring-professional/02-desafio-modelo-dominio-orm/)                           | Mapeo Objeto-Relacional (ORM), entidades JPA, relaciones (1:N, N:N)                              | `⏳ Por Iniciar` |
| **CRUD de Clientes**                        | [`03-desafio-crud-clientes`](./01-java-spring-professional/03-desafio-crud-clientes/)                                     | API REST, DTOs, Controllers, Services, manejo de excepciones, CRUD completo                      | `⏳ Por Iniciar` |
| **Consulta de Ventas**                      | [`04-desafio-consulta-vendas`](./01-java-spring-professional/04-desafio-consulta-vendas/)                                 | Consultas personalizadas con Spring Data JPA, JPQL, DTOs de proyección, reportes                 | `⏳ Por Iniciar` |
| **Proyecto Spring Boot Estructurado**       | [`05-desafio-projeto-spring-boot-estruturado`](./01-java-spring-professional/05-desafio-projeto-spring-boot-estruturado/) | Arquitectura en capas, organización de paquetes, buenas prácticas y validaciones                 | `⏳ Por Iniciar` |

---

### 02. Java Spring Expert

| Desafío                                      | Subcarpeta / Enlace                                                                                   | Principales Conceptos Aplicados                                                      |      Estado      |
| :------------------------------------------- | :---------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- | :--------------: |
| **TDD Event City**                           | [`01-desafio-tdd-event-city`](./02-java-spring-expert/01-desafio-tdd-event-city/)                     | Desarrollo Guiado por Pruebas (TDD), JUnit, Mockito, validación de reglas de negocio | `⏳ Por Iniciar` |
| **TDD Event City (Autenticación/Seguridad)** | [`02-desafio-tdd-event-city-seguranca`](./02-java-spring-expert/02-desafio-tdd-event-city-seguranca/) | TDD aplicado a endpoints protegidos con Spring Security, perfiles de acceso (Roles)  | `⏳ Por Iniciar` |
| **Movieflix**                                | [`03-desafio-movieflix`](./02-java-spring-expert/03-desafio-movieflix/)                               | API REST avanzada, autenticación OAuth2 / JWT, control de acceso detallado           | `⏳ Por Iniciar` |
| **DSMovie JaCoCo**                           | [`04-desafio-dsmovie-jacoco`](./02-java-spring-expert/04-desafio-dsmovie-jacoco/)                     | Pruebas unitarias y de integración con análisis de cobertura mediante JaCoCo         | `⏳ Por Iniciar` |
| **DSMovie RestAssured**                      | [`05-desafio-dsmovie-restassured`](./02-java-spring-expert/05-desafio-dsmovie-restassured/)           | Pruebas de API E2E e integración utilizando la biblioteca RestAssured                | `⏳ Por Iniciar` |

---

## 🚀 Cómo Ejecutar los Desafíos

1. Clona el repositorio:

```bash
git clone https://github.com/ivanfsilva/ds-colecao-java-spring.git
```

2. Navega hasta el módulo y subcarpeta del desafío deseado.
3. Abre la carpeta del desafío específico en **IntelliJ IDEA** (o en tu IDE preferido).
4. Consulta el archivo `README.md` específico dentro de la carpeta del desafío para obtener instrucciones detalladas de ejecución, diagrama de clases y especificación del problema.

---

## 👤 Autor

Desarrollado por **Ivan Ferreira**.

Copyright © 2026 Ivan Ferreira. Todos los derechos reservados.

---

## ☕ Acerca de

Repositorio de desafíos y entregas de la **Colección Java Spring** en la plataforma ⚡**DevSuperior**, impartida por el Prof. Dr. Nélio Alves.
