# API de Gerenciamento de Alunos (Spring Boot)

Este projeto é uma **API REST simples desenvolvida em Java com Spring Boot** para gerenciamento de alunos.
A aplicação permite realizar operações básicas de **CRUD** (Create, Read, Update, Delete) utilizando requisições HTTP.

O objetivo do projeto é **praticar conceitos de desenvolvimento backend com Spring Boot**, incluindo criação de endpoints REST e manipulação de dados em memória.

---

# Tecnologias Utilizadas

* Java 21
* Spring Boot
* Maven
* API REST
* JSON
* Postman (para testes)

---

# Estrutura do Projeto

O projeto possui duas classes principais:

### `Aluno`

Classe que representa a entidade aluno.

Atributos:

* `ra` → identificador único do aluno
* `nome` → nome do aluno
* `email` → email do aluno

### `AlunoController`

Controller responsável por gerenciar as requisições da API.

Ele contém os endpoints para:

* listar alunos
* buscar aluno por RA
* cadastrar aluno
* atualizar aluno
* excluir aluno

---

# Regras de Validação

O sistema possui algumas regras implementadas manualmente no controller:

* O **nome do aluno não pode ser vazio**
* O **email deve conter o caractere `@`**
* O **RA deve ser único (não pode existir dois alunos com o mesmo RA)**

---

# Endpoints da API

## Listar todos os alunos

```
GET /alunos
```

Exemplo de resposta:

```json
[
  {
    "ra": 1,
    "nome": "Matheus",
    "email": "matheus@gmail.com"
  },
  {
    "ra": 2,
    "nome": "Breno",
    "email": "breno@gmail.com"
  }
]
```

---

## Buscar aluno por RA

```
GET /alunos/{ra}
```

Exemplo:

```
GET /alunos/1
```

---

## Cadastrar aluno

```
POST /alunos
```

Body (JSON):

```json
{
  "ra": 4,
  "nome": "Pedro",
  "email": "pedro@gmail.com"
}
```

---

## Atualizar aluno

```
PUT /alunos/{ra}
```

Body (JSON):

```json
{
  "ra": 1,
  "nome": "Matheus Atualizado",
  "email": "matheusnovo@gmail.com"
}
```

---

## Excluir aluno

```
DELETE /alunos/{ra}
```

Exemplo:

```
DELETE /alunos/1
```

---

# Como Executar o Projeto

1. Clonar o repositório:

```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abrir o projeto em uma IDE (IntelliJ ou VS Code)

3. Executar a classe principal:

```
AulaApplication.java
```

4. A aplicação iniciará em:

```
http://localhost:8080
```

---

# Testando a API

Os endpoints podem ser testados utilizando ferramentas como:

* Postman
* Insomnia
* Thunder Client (VS Code)

---

# Objetivo do Projeto

Este projeto foi desenvolvido como **exercício de prática em desenvolvimento backend**, com foco em:

* criação de APIs REST
* manipulação de dados em memória
* utilização do Spring Boot
* testes de endpoints HTTP

---

# Autor

Matheus Leone
