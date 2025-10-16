# 📚 Library Management API

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.java.com/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green)](https://spring.io/projects/spring-boot)  
[![H2 Database](https://img.shields.io/badge/H2-Database-orange)](https://www.h2database.com/)  

---

Sistema backend **RESTful** desenvolvido com **Spring Boot** para gerenciar livros e suas informações de publicação em uma biblioteca.  
Fornece operações completas de **CRUD** com validação de dados e tratamento de exceções, garantindo consistência para o frontend.

---

## ✨ Funcionalidades

- CRUD completo para livros e suas informações de publicação.  
- Validação de campos obrigatórios usando **Jakarta Validation**.  
- Tratamento global de erros com respostas estruturadas (`ControllerExceptionHandler`).  
- Banco de dados em memória **H2** para testes rápidos.

---

## 🛠 Tecnologias

- Java 17+  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Spring Boot DevTools  
- Jakarta Validation  

---

## 🔗 Endpoints

| Método | Endpoint       | Descrição                        |
|--------|----------------|----------------------------------|
| GET    | /livros        | Listar todos os livros           |
| GET    | /livros/{id}   | Obter um livro pelo ID           |
| POST   | /livros        | Criar um novo livro              |
| PUT    | /livros/{id}   | Atualizar um livro existente     |
| DELETE | /livros/{id}   | Deletar um livro pelo ID         |

---

## 📝 Exemplo de JSON (POST / PUT)

```json
{
  "titulo": "O Hobbit",
  "qtdPaginas": 310,
  "publicacao": {
    "autor": "J.R.R. Tolkien",
    "dataPublicacao": "1937-09-21",
    "editora": "HarperCollins"
  }
}
