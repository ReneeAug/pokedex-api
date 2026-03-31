#  Pokedex API - Spring Boot

Esta é uma API RESTful desenvolvida para gerenciar uma Pokedex, permitindo o cadastro, leitura, atualização e exclusão (CRUD) de Pokémons. Projeto focado em demonstrar conhecimentos de **Backend com Java e Docker**.

##  Tecnologias Utilizadas
* **Java 21**
* **Spring Boot 3.x**
* **Spring Data JPA** (Persistência de dados)
* **PostgreSQL** (Banco de dados)
* **Docker & Docker Compose** (Containerização)
* **Lombok** (Produtividade)

##  Estrutura do Projeto (MVC)
O projeto segue o padrão de camadas para melhor organização:
* `model`: Representação da entidade Pokemon no banco de dados.
* `repository`: Interface de comunicação com o PostgreSQL.
* `controller`: Endpoints da API para comunicação com o usuário.

##  Como Executar o Projeto

1. Certifique-se de ter o **Docker** e o **Java 21** instalados.
2. Clone o repositório.
3. Na raiz do projeto, suba o banco de dados com:
   ```bash
   docker-compose up -d
