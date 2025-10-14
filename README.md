A Library Management API é um sistema backend RESTful desenvolvido com Spring Boot, destinado a gerenciar livros e suas informações de publicação em uma biblioteca.
O projeto fornece operações completas de CRUD (Criar, Ler, Atualizar, Deletar) para gerenciar registros de livros, com validação e tratamento de exceções para garantir a integridade dos dados e uma experiência consistente para o frontend.

Funcionalidades

Gerenciamento de livros com título, quantidade de páginas e informações de publicação (autor, editora e data de publicação).

Validação de entrada usando Bean Validation (Jakarta Validation).

Tratamento global de exceções com ControllerExceptionHandler e respostas de erro estruturadas.

Banco de dados em memória H2 para testes e desenvolvimento rápido.

Desenvolvido com Spring Boot, Spring Data JPA e Spring Validation.

Tecnologias Utilizadas

Java 17+

Spring Boot 3

Spring Web

Spring Data JPA

H2 Database

Spring Boot DevTools

Jakarta Validation

Endpoints
Método	Endpoint	Descrição
GET	/livros	Retorna todos os livros
GET	/livros/{id}	Retorna um livro pelo ID
POST	/livros	Cria um novo livro
PUT	/livros/{id}	Atualiza um livro existente
DELETE	/livros/{id}	Deleta um livro pelo ID
Exemplo de JSON (POST / PUT)
{
  "titulo": "O Hobbit",
  "qtdPaginas": 310,
  "publicacao": {
    "autor": "J.R.R. Tolkien",
    "dataPublicacao": "1937-09-21",
    "editora": "HarperCollins"
  }
}

Como Rodar o Projeto

Clone o repositório:

git clone https://github.com/seuusuario/library-management-api.git


Abra o projeto no Eclipse ou IntelliJ IDEA.

Execute a classe principal LibraryManagementApiApplication.java.

Acesse a API em: http://localhost:8080/livros.

Observações

Todos os campos obrigatórios possuem validações e, caso haja erro, a API retorna respostas estruturadas de erro para facilitar a comunicação com o frontend.

O banco H2 é inicializado automaticamente e pode ser acessado pelo console em: http://localhost:8080/h2-console.
