<div align="center">

[![Português](https://img.shields.io/badge/Idioma-Portugu%C3%Aas-green.svg)](./README.md)
[![English](https://img.shields.io/badge/Language-English-blue.svg)](./README.en.md)
[![Español](https://img.shields.io/badge/Idioma-Espa%C3%B1ol-yellow.svg)](./README.es.md)

[![release](https://img.shields.io/badge/release-v1.0.0-brightgreen.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring/releases)
[![status](https://img.shields.io/badge/status-em_andamento-blue.svg)](https://github.com/ivanfsilva/ds-colecao-java-spring)
[![license](https://img.shields.io/badge/license-MIT-green.svg)](./LICENSE)

</div>

# 🍃 Desafios & Entregas — Coleção Java Spring (DevSuperior)

---

Este repositório reúne as soluções dos desafios, atividades práticas e projetos avaliativos desenvolvidos ao longo da **Coleção Java Spring** da plataforma ⚡**DevSuperior**, ministrada pelo Prof. Dr. Nélio Alves.

O objetivo principal deste espaço é registrar e estruturar a jornada de evolução no ecossistema Spring, construindo uma base sólida e abrangente para o desenvolvimento de aplicações backend modernas, resilientes e prontas para produção.

### 🎯 Abrangência do Treinamento

A jornada abrange os fundamentos essenciais e os tópicos mais avançados do mercado de engenharia de software backend:

- **Java Spring Professional:** Construção da base fundamental em Spring Boot, cobrindo injeção de dependência, inversão de controle, arquitetura em camadas, ORM com Spring Data JPA, tratamento de exceções, validação de dados com Bean Validation, APIs RESTful e autenticação/controle de acesso (Spring Security & OAuth2/JWT).

- **Java Spring Expert:** Foco na excelência de código e garantia de qualidade com Desenvolvimento Guiado por Testes (**TDD**), testes unitários e de integração utilizando **JUnit 5**, **Mockito**, **MockMvc** e **RestAssured**, além de análise de cobertura com **JaCoCo**.

- **Java Spring Reference:** Extensão da caixa de ferramentas backend para modelagem de dominios complexos, integração com serviços em nuvem (**AWS S3**), envio de e-mails, documentação interativa com **OpenAPI/Swagger**, HATEOAS, bancos NoSQL (**MongoDB** e **Cassandra**), programação reativa com **Spring WebFlux** e processamento em lote com **Spring Batch**.

- **Java Spring Tópicos Avançados:** Arquitetura corporativa com sistemas de caching distribuído (**Redis**), autenticação avançada com **OAuth2** e **OIDC**, mensageria assíncrona, deploy em ambiente de nuvem (**AWS**), além do uso de IA e engenharia de software moderna.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem & Framework:** Java LTS (17+), Spring Boot (3.x / 4.x), Spring MVC, Spring Security
- **Build & Dependências:** Apache Maven
- **Persistência & Banco de Dados:** Jakarta Persistence (JPA), Spring Data JPA, H2 Database, PostgreSQL, MySQL
- **Validação & Testes:** Jakarta Bean Validation, JUnit 5, Mockito, RestAssured, JaCoCo
- **Qualidade & Produtividade:** SonarQube for IDE, Project Lombok, Postman

<br>

<div align="center">
  <!-- Linguagem, Framework & Build -->
  <img src="https://img.shields.io/badge/Java_LTS_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java LTS 17+" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white" alt="Spring Security" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Apache Maven" />
  <br>
  <!-- Persistência & Banco de Dados -->
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA" />
  <img src="https://img.shields.io/badge/H2_Database-003B5C?style=for-the-badge&logo=database&logoColor=white" alt="H2 Database" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <br>
  <!-- Testes & Qualidade -->
  <img src="https://img.shields.io/badge/JUnit_5-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit 5" />
  <img src="https://img.shields.io/badge/Mockito-C50000?style=for-the-badge&logo=testing-library&logoColor=white" alt="Mockito" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman" />
  <img src="https://img.shields.io/badge/SonarQube-4E9BCD?style=for-the-badge&logo=sonarqube&logoColor=white" alt="SonarQube" />
</div>

---

## 📁 Estrutura de Treinamentos & Desafios

### 01. Java Spring Professional

| Desafio                                  | Subpasta / Link                                                                                                           | Principais Conceitos Aplicados                                                               |      Status       |
| :--------------------------------------- | :------------------------------------------------------------------------------------------------------------------------ | :------------------------------------------------------------------------------------------- | :---------------: |
| **Componentes e Injeção de Dependência** | [`01-desafio-componentes-injecao-dependencia`](./01-java-spring-professional/01-desafio-componentes-injecao-dependencia/) | Injeção de dependência, componentes Spring (`@Component`, `@Service`), serviços desacoplados | `⏳ Em Andamento` |
| **Modelo de Domínio e ORM**              | [`02-desafio-modelo-dominio-orm`](./01-java-spring-professional/02-desafio-modelo-dominio-orm/)                           | Mapeamento Objeto-Relacional (ORM), entidades JPA, relacionamentos (1:N, N:N)                |  `⏳ A Iniciar`   |
| **CRUD de Clientes**                     | [`03-desafio-crud-clientes`](./01-java-spring-professional/03-desafio-crud-clientes/)                                     | API REST, DTOs, Controllers, Services, tratamento de exceções, CRUD completo                 |  `⏳ A Iniciar`   |
| **Consulta Vendas**                      | [`04-desafio-consulta-vendas`](./01-java-spring-professional/04-desafio-consulta-vendas/)                                 | Consultas personalizadas com Spring Data JPA, JPQL, DTOs de projeção, relatórios             |  `⏳ A Iniciar`   |
| **Projeto Spring Boot Estruturado**      | [`05-desafio-projeto-spring-boot-estruturado`](./01-java-spring-professional/05-desafio-projeto-spring-boot-estruturado/) | Arquitetura em camadas, organização de pacotes, boas práticas e validações                   |  `⏳ A Iniciar`   |

---

### 02. Java Spring Expert

| Desafio                                     | Subpasta / Link                                                                                       | Principais Conceitos Aplicados                                                          |     Status     |
| :------------------------------------------ | :---------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :------------: |
| **TDD Event City**                          | [`01-desafio-tdd-event-city`](./02-java-spring-expert/01-desafio-tdd-event-city/)                     | Desenvolvimento Guiado por Testes (TDD), JUnit, Mockito, validação de regras de negócio | `⏳ A Iniciar` |
| **TDD Event City (Autenticação/Segurança)** | [`02-desafio-tdd-event-city-seguranca`](./02-java-spring-expert/02-desafio-tdd-event-city-seguranca/) | TDD aplicado a endpoints protegidos com Spring Security, perfis de acesso (Roles)       | `⏳ A Iniciar` |
| **Movieflix**                               | [`03-desafio-movieflix`](./02-java-spring-expert/03-desafio-movieflix/)                               | API REST avançada, autenticação OAuth2 / JWT, controle de acesso refinado               | `⏳ A Iniciar` |
| **DSMovie JaCoCo**                          | [`04-desafio-dsmovie-jacoco`](./02-java-spring-expert/04-desafio-dsmovie-jacoco/)                     | Testes unitários e de integração com medição e garantia de cobertura via JaCoCo         | `⏳ A Iniciar` |
| **DSMovie RestAssured**                     | [`05-desafio-dsmovie-restassured`](./02-java-spring-expert/05-desafio-dsmovie-restassured/)           | Testes de API E2E/Integração utilizando a biblioteca RestAssured                        | `⏳ A Iniciar` |

---

## 🚀 Como Executar os Desafios

1. Clone o repositório:

```bash
git clone https://github.com/ivanfsilva/ds-colecao-java-spring.git
```

2. Navegue até o módulo e subpasta do desafio desejado.
3. Abra a pasta do desafio específico no **IntelliJ IDEA** (ou na sua IDE de preferência).
4. Consulte o arquivo `README.md` específico dentro da pasta do desafio para instruções detalhadas de execução, diagrama de classes e especificação do problema.

---

## 👤 Autor

Desenvolvido por **Ivan Ferreira**.

Copyright © 2026 Ivan Ferreira. Todos os direitos reservados.

---

## ☕ Sobre

Repositório de desafios e entregas da **Coleção Java Spring** da plataforma ⚡**DevSuperior**, ministrada pelo Prof. Dr. Nélio Alves.
