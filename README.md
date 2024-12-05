# Kafka Broadcast

## Descrição
Este projeto é uma aplicação Spring Boot que utiliza Apache Kafka para transmissão de mensagens. A aplicação é configurada para consumir e produzir mensagens em um tópico Kafka específico.

## Requisitos
- Java 11 ou superior
- Maven 3.6.0 ou superior
- Apache Kafka

## Configuração
As configurações da aplicação estão no arquivo `src/main/resources/application.yml`. Aqui estão algumas das principais configurações:
- Nome da aplicação: `kafka-broadcast`
- Servidor Kafka: `localhost:9092`
- Grupo de consumidores: `group-id-unique-to-each-consumer`
- Tópico Kafka: `broadcast`
- Porta do servidor: `8080`

## Executando a Aplicação
1. Certifique-se de que o servidor Kafka está em execução.
2. Navegue até o diretório do projeto: `cd kafka-broadcast`
3. Compile e execute a aplicação usando Maven: `mvn spring-boot:run`

## Estrutura do Projeto
- `src/main/java`: Contém o código-fonte Java.
- `src/main/resources`: Contém os arquivos de configuração, incluindo `application.yml`.

## Dependências
As dependências principais do projeto são gerenciadas pelo Maven e estão listadas no arquivo `pom.xml`. Algumas das dependências incluem:
- Spring Boot Starter Web
- Spring Boot Starter Kafka
- Apache Kafka Clients

## Configurações Adicionais
Você pode ajustar as configurações do Kafka e da aplicação no arquivo `application.yml` conforme necessário.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.