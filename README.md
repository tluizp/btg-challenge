# btg-challenge

Projeto utilizando as seguintes tecnologias:

- ActiveMQ
- Spring Boot
- MongoDB
- Docker e Docker-Compose


- Foi utilizado o ActiveMQ, ao invés do RabbitMQ, pois estava tendo problemas com as imagens do docker que possuem o seguinte nome na imagem -> "management". 
  Resultando no seguinte erro, ao dar start na imagem: 
  https://github.com/docker-library/rabbitmq/issues/61

- MongoDB e Mongo-Express, estão sendo iniciados pelo docker-compose
- ActiveMQ, também faz uso de imagem do docker
- Ambos estão no docker-compose.yml junto com o projeto no git

- Testes unitários não implementados
