 Pokedex API - Spring Boot & Docker
Esta é uma API REST desenvolvida para gerenciar uma Pokedex, permitindo o ciclo completo de cadastro, leitura e exclusão (CRUD) de Pokémons. O projeto foca em boas práticas de desenvolvimento Backend com Java e containerização.

 Tecnologias Utilizadas
Java 21: Versão mais recente para aproveitar as melhorias de performance.

Spring Boot 3.2.4: Framework principal para agilizar o desenvolvimento web.

Spring Data JPA: Para uma persistência de dados eficiente e limpa.

PostgreSQL: Banco de dados relacional robusto.

Docker & Docker Compose: Para subir o banco de dados de forma isolada e rápida.

Lombok: Para reduzir o código repetitivo e focar na lógica.

 Estrutura do Projeto (MVC)
O código está organizado em camadas para facilitar a manutenção:

Model: Representa a entidade Pokemon no banco.

Repository: Comunicação direta com o banco de dados.

Service: Camada de lógica de negócio (onde o processamento acontece).

Controller: Onde ficam os endpoints da API para o usuário.

 Como Executar
Certifique-se de ter o Docker e o Java 21 instalados.

Clone o repositório.

Suba o banco de dados:

Bash
docker-compose up -d
Execute a aplicação pelo IntelliJ ou terminal.