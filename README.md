## POC de Service Registration and Discovery com Eureka e Spring Boot 3

### Introdução

Este projeto demonstra como implementar o mecanismo de Service Registration and Discovery utilizando o Eureka Server e o Eureka Client do Netflix, em conjunto com o Spring Boot 3 e Java 17. O objetivo principal é apresentar um exemplo prático de como registrar e descobrir serviços em uma arquitetura de microsserviços, utilizando as ferramentas mencionadas.

### Estrutura do Projeto

O projeto é composto por dois módulos principais:

* **Eureka Server:** Responsável por armazenar informações sobre os serviços registrados, permitindo que os clientes os descubram de forma dinâmica.
* **Eureka Client:** Implementado em um microsserviço de exemplo, registra-se no Eureka Server e utiliza-o para localizar outros serviços.

### Tecnologias Utilizadas

* Spring Boot 3
* Java 17
* Spring Cloud Netflix Eureka Server
* Spring Cloud Netflix Eureka Client

### Como Executar

Para executar o exemplo, siga estas etapas:

1. **Clonar o repositório:**

```bash
git clone https://github.com/robgolrj/Service-Discovery.git
```

2. **Navegue até o diretório do proje:**

```bash
cd Service-Discovery
```
3. **Inicie o servidor Eureka:**

```bash
cd eureka
mvn spring-boot:run
```
4. **Em outro terminal inicie o servidor cliente:**

```bash
cd client
mvn spring-boot:run
```

### Verificando o Funcionamento

* **Acessar o Eureka Dashboard:**

Abra um navegador web e acesse a URL `http://localhost:8761/`. O Eureka Dashboard exibirá informações sobre os serviços registrados, incluindo o Eureka Client.

* **Testar a Comunicação entre os Serviços:**

O Eureka Client tenta se comunicar com o Eureka Server para obter informações sobre outros serviços. Você pode verificar as logs do Eureka Client para observar as interações com o Eureka Server.

### Observações

* Este é um exemplo simplificado e não aborda todas as funcionalidades do Eureka Server e do Eureka Client.
* Para uma implementação completa em produção, consulte a documentação oficial do Spring Cloud Netflix Eureka.

### Próximos Passos

* Explore as funcionalidades mais avançadas do Eureka Server, como balanceamento de carga e failover.
* Implemente o Eureka Client em outros microsserviços para demonstrar a comunicação entre diferentes serviços.
* Integre o Eureka com outras ferramentas de monitoramento e observabilidade para ter uma visão completa da sua arquitetura de microsserviços.
