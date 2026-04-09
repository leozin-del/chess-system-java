<div align="center">

```
██████╗  █████╗ ██████╗ ██████╗ ███████╗██████╗ ███████╗██╗  ██╗ ██████╗ ██████╗ 
██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██╔════╝██║  ██║██╔═══██╗██╔══██╗
██████╔╝███████║██████╔╝██████╔╝█████╗  ██████╔╝███████╗███████║██║   ██║██████╔╝
██╔══██╗██╔══██║██╔══██╗██╔══██╗██╔══╝  ██╔══██╗╚════██║██╔══██║██║   ██║██╔═══╝ 
██████╔╝██║  ██║██║  ██║██████╔╝███████╗██║  ██║███████║██║  ██║╚██████╔╝██║     
╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     
```

# ✂️ BarberShop — Sistema de Agendamento

**Gestão completa de agendamentos para barbearias modernas**

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

</div>

---

## 📖 Sobre o Projeto

O **BarberShop** é uma API REST robusta desenvolvida com **Spring Boot** para gerenciar agendamentos de barbearias de forma eficiente. O sistema permite que clientes realizem agendamentos online, enquanto barbeiros e administradores têm controle total sobre a agenda, serviços e clientes.

> 💡 Desenvolvido com foco em **clean architecture**, **boas práticas REST** e **segurança robusta**.

---

## 🚀 Funcionalidades

| Módulo | Funcionalidades |
|--------|----------------|
| 👤 **Clientes** | Cadastro, autenticação, histórico de cortes |
| ✂️ **Barbeiros** | Perfil profissional, agenda personalizada, especialidades |
| 📅 **Agendamentos** | Criação, cancelamento, reagendamento em tempo real |
| 💈 **Serviços** | Catálogo de serviços com preços e duração |
| 🔐 **Autenticação** | JWT com controle de perfis (ADMIN, BARBEIRO, CLIENTE) |
| 📊 **Relatórios** | Dashboard com métricas e faturamento |
| 🔔 **Notificações** | Lembretes automáticos de agendamento |

---

## 🏗️ Arquitetura

```
barbershop/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/barbershop/
│   │   │   ├── 📁 config/          # Configurações (Security, Swagger, etc.)
│   │   │   ├── 📁 controller/      # Camada de apresentação (REST)
│   │   │   ├── 📁 service/         # Regras de negócio
│   │   │   ├── 📁 repository/      # Acesso a dados (JPA)
│   │   │   ├── 📁 model/           # Entidades JPA
│   │   │   ├── 📁 dto/             # Data Transfer Objects
│   │   │   ├── 📁 exception/       # Tratamento global de erros
│   │   │   └── 📁 security/        # JWT, filtros e autenticação
│   │   └── 📁 resources/
│   │       ├── application.yml
│   │       └── db/migration/       # Migrations Flyway
│   └── 📁 test/                    # Testes unitários e integração
├── 🐳 docker-compose.yml
├── 📄 pom.xml
└── 📄 README.md
```

---

## ⚙️ Tecnologias Utilizadas

### Back-end
- **Java 17** — LTS com suporte a records e sealed classes
- **Spring Boot 3.x** — Framework principal
- **Spring Security + JWT** — Autenticação e autorização
- **Spring Data JPA + Hibernate** — ORM e acesso ao banco
- **Flyway** — Versionamento e migrations do banco de dados
- **MapStruct** — Mapeamento de DTOs

### Banco de Dados
- **PostgreSQL** — Banco de dados principal
- **Redis** *(opcional)* — Cache de sessões e dados frequentes

### Documentação & Testes
- **Swagger / OpenAPI 3** — Documentação interativa da API
- **JUnit 5 + Mockito** — Testes unitários
- **Testcontainers** — Testes de integração com banco real

### DevOps
- **Docker + Docker Compose** — Containerização
- **GitHub Actions** — CI/CD pipeline

---

## 🔗 Endpoints da API

### 🔐 Autenticação
```http
POST   /api/v1/auth/register     → Cadastro de novo usuário
POST   /api/v1/auth/login        → Login e geração do token JWT
POST   /api/v1/auth/refresh      → Renovar token
```

### 📅 Agendamentos
```http
GET    /api/v1/agendamentos           → Listar agendamentos (com filtros)
POST   /api/v1/agendamentos           → Criar novo agendamento
GET    /api/v1/agendamentos/{id}      → Buscar agendamento por ID
PUT    /api/v1/agendamentos/{id}      → Atualizar agendamento
DELETE /api/v1/agendamentos/{id}      → Cancelar agendamento
GET    /api/v1/agendamentos/disponiveis → Horários disponíveis
```

### ✂️ Barbeiros
```http
GET    /api/v1/barbeiros              → Listar barbeiros
GET    /api/v1/barbeiros/{id}         → Perfil do barbeiro
GET    /api/v1/barbeiros/{id}/agenda  → Agenda do barbeiro
```

### 💈 Serviços
```http
GET    /api/v1/servicos               → Catálogo de serviços
POST   /api/v1/servicos               → Criar serviço (ADMIN)
PUT    /api/v1/servicos/{id}          → Editar serviço (ADMIN)
DELETE /api/v1/servicos/{id}          → Remover serviço (ADMIN)
```

---

## 🐳 Como Executar

### Pré-requisitos
- [Java 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/)
- [Docker & Docker Compose](https://www.docker.com/)

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/barbershop.git
cd barbershop
```

### 2. Suba o banco de dados com Docker
```bash
docker-compose up -d
```

### 3. Configure as variáveis de ambiente
```bash
cp .env.example .env
# Edite o arquivo .env com suas configurações
```

```env
# .env
DB_HOST=localhost
DB_PORT=5432
DB_NAME=barbershop
DB_USER=postgres
DB_PASSWORD=sua_senha

JWT_SECRET=sua_chave_secreta_jwt
JWT_EXPIRATION=86400000
```

### 4. Execute a aplicação
```bash
mvn spring-boot:run
```

### 5. Acesse a documentação
```
🌐 API:      http://localhost:8080/api/v1
📚 Swagger:  http://localhost:8080/swagger-ui.html
```

---

## 🧪 Executando os Testes

```bash
# Todos os testes
mvn test

# Apenas testes unitários
mvn test -Dgroups=unit

# Apenas testes de integração
mvn test -Dgroups=integration

# Com relatório de cobertura
mvn verify jacoco:report
# Relatório em: target/site/jacoco/index.html
```

---

## 🔒 Segurança

O sistema implementa autenticação stateless via **JWT (JSON Web Token)**:

```
Cliente → POST /auth/login → Recebe JWT
Cliente → Requisição + Header: Authorization: Bearer {token}
Servidor → Valida JWT → Processa requisição
```

**Perfis de acesso:**
| Role | Permissões |
|------|-----------|
| `ROLE_ADMIN` | Acesso total ao sistema |
| `ROLE_BARBEIRO` | Gerencia própria agenda e atendimentos |
| `ROLE_CLIENTE` | Realiza e consulta seus agendamentos |

---

## 🗃️ Modelo de Dados

```
┌─────────────┐       ┌──────────────────┐       ┌─────────────┐
│   Usuario   │       │   Agendamento    │       │   Servico   │
├─────────────┤       ├──────────────────┤       ├─────────────┤
│ id          │──┐    │ id               │──┐    │ id          │
│ nome        │  │    │ cliente_id (FK)  │  └───>│ nome        │
│ email       │  └───>│ barbeiro_id (FK) │       │ descricao   │
│ senha       │       │ servico_id (FK)  │       │ preco       │
│ telefone    │       │ data_hora        │       │ duracao_min │
│ role        │       │ status           │       └─────────────┘
└─────────────┘       │ observacoes      │
                      └──────────────────┘
```

---

## 📊 Roadmap

- [x] CRUD de clientes e barbeiros
- [x] Sistema de agendamentos
- [x] Autenticação com JWT
- [x] Documentação com Swagger
- [ ] Notificações por e-mail
- [ ] Integração com WhatsApp (Twilio)
- [ ] Dashboard administrativo
- [ ] App mobile (React Native)
- [ ] Sistema de avaliações
- [ ] Pagamento online

---

## 🤝 Contribuindo

Contribuições são muito bem-vindas! Siga os passos abaixo:

```bash
# 1. Faça um fork do projeto
# 2. Crie sua branch de feature
git checkout -b feature/minha-feature

# 3. Commit suas mudanças
git commit -m 'feat: adiciona minha feature incrível'

# 4. Push para a branch
git push origin feature/minha-feature

# 5. Abra um Pull Request
```

> Siga o padrão [Conventional Commits](https://www.conventionalcommits.org/pt-br/) para as mensagens de commit.

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

Feito com ☕ e muito ❤️ usando **Spring Boot**

⭐ Se este projeto te ajudou, deixa uma estrela no repositório!

[![GitHub stars](https://img.shields.io/github/stars/seu-usuario/barbershop?style=social)](https://github.com/seu-usuario/barbershop)

</div>
