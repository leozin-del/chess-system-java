# 💈 BarbeariaPro - Sistema de Gestão para Barbearias

## 🚀 Sobre o Projeto

O **BarbeariaPro** é um sistema backend desenvolvido com **Spring Boot**, com o objetivo de gerenciar uma barbearia de forma simples e eficiente.

A aplicação permite o controle de:

* 👤 Clientes
* ✂️ Barbeiros
* 📅 Agendamentos
* 💼 Serviços
* 🔐 Usuários (com papéis CLIENTE e BARBEIRO)

---

## 🛠️ Tecnologias Utilizadas

* ☕ Java 17+
* 🌱 Spring Boot
* 🗄️ Spring Data JPA / Hibernate
* 🐬 MySQL
* 🐳 Docker & Docker Compose
* 🔧 Maven

---

## 📦 Arquitetura

A aplicação segue o padrão de arquitetura:

* Controller → recebe requisições HTTP
* Service → regras de negócio
* Repository → acesso ao banco
* Entity → mapeamento das tabelas

---

## 🐳 Como Rodar com Docker

### 🔹 Pré-requisitos

* Docker instalado (Docker Desktop)

---

### 🔹 Passo a passo

```bash
# Clonar o repositório
git clone <URL_DO_REPOSITORIO>

# Entrar na pasta
cd barbeariapro


# Subir aplicação + banco
docker compose up --build
```

---

### 🔹 Acessar aplicação

```
http://localhost:8080
```

---

## 🧪 Testando a API

Como este projeto é um **backend**, você pode testar utilizando:

* Postman
* Insomnia

---

## 📊 Estrutura do Banco

O sistema cria automaticamente as tabelas:

* usuarios
* clientes
* barbeiros
* servicos
* agendamentos

---

## 🔐 Regras de Negócio

* Um usuário pode ser **CLIENTE ou BARBEIRO**
* Cada cliente/barbeiro está vinculado a um usuário
* Agendamentos conectam:

  * Cliente
  * Barbeiro
  * Serviço
* Status de agendamento:

  * AGENDADO
  * CANCELADO
  * CONCLUIDO

---

## ⚙️ Configuração

A aplicação utiliza:

```properties
spring.jpa.hibernate.ddl-auto=update
```

👉 Ou seja, o banco é criado automaticamente.

---

## 💡 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Aprendizado de Spring Boot
* Integração com banco de dados
* Uso de Docker em ambiente real
* Simulação de um sistema de gestão completo

---

## 🚀 Possíveis Melhorias Futuras

* 🔐 Autenticação com JWT
* 📊 Dashboard administrativo
* 🌐 Frontend (React ou Angular)
* 📅 Controle de horários disponíveis
* 💳 Integração com pagamentos

---

## 👨‍💻 Autor

Desenvolvido por você 🚀
(Coloque aqui seu nome depois)

---

## ⭐ Considerações

Este projeto demonstra habilidades em:

* Backend com Spring Boot
* Modelagem de banco de dados
* Containerização com Docker
* Organização de projeto profissional

---

💈 *BarbeariaPro - Simplificando a gestão da sua barbearia*
