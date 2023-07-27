<h1 align="center">GameCollection</h1>

<div align="center">
Organize sua coleção de games de um jeito prático e divertido com este sistema de gerenciamento! 

O projeto foi desenvolvido no Framework Spring, utilizando a arquitetura API Rest e a comunicação com o banco de dados.

<b>Diferencial:</b> Reposicionar os jogos na coleção, atualizando as informações diretamente no banco de dados.

Agora, organizar sua coleção nunca foi tão fácil e eficiente!
</div> 

<h2> 🛠 Tecnologias: </h2>

As seguintes tecnologias foram usadas na construção do projeto:

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-ED8B00?style=flat&logo=postman&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=flat&logo=postgresql&logoColor=white)
<!-- ![Render](https://img.shields.io/badge/Render-1CE783?style=flat&logo=render&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-6DB33F?style=flat&logo=swagger&logoColor=white) -->

### 💬 Assuntos abordados:
- Sistemas web e recursos
- Cliente/servidor, HTTP, JSON
- Padrão Rest para API web
- Estruturação de projeto Spring Rest
- Entidades e Mapeamento Objeto-Relacional (ORM)
- Database Seeding
- Padrão camadas
- Controller, Service, Repository
- Modelo de domínio
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, Embedded id
- Consultas SQL no Spring Data JPA
- Projections

## Modelo de domínio

<img alt="Imagem da Modelo de domínio" src="ModeloDeDominio.png" />

## Diagrama de Classes do Projeto:

```mermaid
classDiagram
class Game {
  - id : Long
  - title : String
  - year : Integer
  - genre : String
  - platforms : String
  - score : Double
  - imgUrl : String
  - shortDescription : String
  - longDescription : String
  + findAll()
  + findById(Long id)
  + findByList(Long listId)
}

class GameList {
  - id : Long
  - name : String
  + findAll()
  + move(Long listId, int sourceIndex, int destinationIndex)
}

class Belonging {
  - id : BelongingPK
  - position : Integer
}

class BelongingPK {
  - game : Game
  - list : GameList
}
Game -- Belonging : n-to-n
GameList -- Belonging : n-to-n
```
O Projeto é composto por 3 Recursos (*Conjunto de Classes e Interfaces responsáveis por mapear um tipo de Objeto e persistir no Banco de dados Relacional*) e uma Classe auxiliar:

| Classe | Descrição |
| --- | --- |
| Game | Recurso responsável por definir o Objeto Game (jogos da nossa coleção) |
| GameList | Recurso responsável por definir o Objeto GameList (coleção) |
| Belonging | Classe de associação entre Game  e GameList. Recurso responsável por indicar a posição do Game dentro do GameList. |
| Belonging PK | Classe auxiliar, que será utilizada como chave primaria múltipla,  composto por 2 atributos ‘game_id’ e ‘list_id’ |

Cada Recurso gera uma tabela no Banco de dados da aplicação, exceto a Classe auxiliar.

## Modelo de Relacional

<img alt="Imagem da Modelo de domínio" src="ModeloRelacional.png" />

## Padrão Camadas

<img alt="Imagem do Padrão Camadas" src="PadraoCamadas.png" />


## EndPoints:

Abaixo consta os recursos da API:

<img alt="Imagem do Padrão Camadas" src="EndPoints_CollectionGames.png" />

## Dependências utilizadas no projeto:

| Dependência | Descrição |
| --- | --- |
| Spring Web | Essa dependência fornece todas as bibliotecas necessárias para criar um projeto WEB e trabalhar com o protocolo HTTP/HTTPS. |
| Spring Data JPA | Java Persistence API (JPA) é uma Biblioteca que armazena e recupera Objetos, que foram persistidos (armazenados) em um Bancos de Dados. |
| PostgreSQL Driver | Responsável pela conexão entre nossa aplicação e o Banco de Dados PostgreSQL |
| H2 Database | Responsável pela conexão entre nossa aplicação e o Banco de Dados H2 |

<h2> Autor: </h2>

<img alt="Giselle Souza" title="Giselle Souza" src="https://github.com/gisellesouzaa.png" height="100" width="100"/>

Feito com ❤️ por Giselle Souza. 👋
<br>
<a href="https://www.linkedin.com/in/giselle-de-souza-gabriel/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-05122A?style=for-the-flat&logo=linkedin&logoColor=white" target="_blank"></a>
