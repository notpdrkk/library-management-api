📚 Library Management API

Sistema backend RESTful desenvolvido com Spring Boot para gerenciar livros e suas informações de publicação em uma biblioteca.
Fornece operações completas de CRUD com validação de dados e tratamento de exceções, garantindo consistência para o frontend.

✨ Funcionalidades

CRUD completo para livros e suas informações de publicação.

Validação de campos obrigatórios usando Jakarta Validation.

Tratamento global de erros com respostas estruturadas (ControllerExceptionHandler).

Banco de dados em memória H2 para testes rápidos.

🛠 Tecnologias

Java 17+

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database

Spring Boot DevTools

Jakarta Validation

🔗 Endpoints
Método	Endpoint	Descrição
GET	/livros	Listar todos os livros
GET	/livros/{id}	Obter um livro pelo ID
POST	/livros	Criar um novo livro
PUT	/livros/{id}	Atualizar um livro existente
DELETE	/livros/{id}	Deletar um livro pelo ID

📝 Exemplo de JSON (POST / PUT)
`{
  "titulo": "O Hobbit",
  "qtdPaginas": 310,
  "publicacao": {
    "autor": "J.R.R. Tolkien",
    "dataPublicacao": "1937-09-21",
    "editora": "HarperCollins"
  }
}`

🚀 Como Rodar

Clone o repositório:

git clone https://github.com/seuusuario/library-management-api.git


Abra o projeto no Eclipse ou IntelliJ IDEA.

Execute a classe principal:

LibraryManagementApiApplication.java


Acesse a API em: http://localhost:8080/livros.

O console do H2 está disponível em: http://localhost:8080/h2-console.

⚠ Observações

Todos os campos obrigatórios possuem validações; erros retornam respostas estruturadas para facilitar o frontend.

Banco H2 é inicializado automaticamente em memória, ideal para desenvolvimento e testes rápidos
