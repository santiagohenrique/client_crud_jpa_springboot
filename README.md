# CRUD DE CLIENTE

## Descrição
- O projeto "CRUD DE CLIENTE" se concentra na criação de uma aplicação backend simples usando Spring Boot, fornecendo APIs RESTful para gerenciamento de informações do cliente.

## Características
- CRUD (criação, leitura, atualização e deleção de dados do cliente)
- Adota um mecanismo de exclusão
- Retorna respostas HTTP apropriadas em cada operação, como 200 OK para operações bem-sucedidas, 404 Not Found para recursos não encontrados e 201 Created para criação bem-sucedida de novos registros.
- Integração com a ferramenta Postman para facilitar testes manuais, validação de endpoints e garantir a correta funcionalidade do CRUD de clientes.

## Tecnologias Utilizadas
- Spring Boot: O projeto aproveita a estrutura Spring Boot para construir aplicativos de back-end.
- Spring Data JPA: A integração com repositórios JPA simplifica as operações de banco de dados.
- Spring Web: O projeto usa Spring Web para serviços web RESTful.
- API de persistência Java (JPA): fornece uma estrutura de mapeamento objeto-relacional para gerenciar entidades de banco de dados relacional.
- H2: Banco de dados usado para armazenar as informações do cliente.
- Postman: O projeto inclui Postman para testar e validar as APIs RESTful. Postman simplifica o processo de envio de solicitações aos endpoints de back-end e inspeção das respostas, garantindo uma comunicação tranquila entre os componentes de front-end e back-end.

## Como executar o programa
- Clone ou baixe este projeto para sua máquina local.
- Importe o projeto para seu IDE Java preferido (por exemplo, IntelliJ, Eclipse)..
- Execute o aplicativo compilado.
- Siga as demais instruções na tela para inserir os dados.

## Endpoints
- GET /clients: recupera uma lista paginada de clientes.
- GET /clients/{id}: recupera detalhes de um cliente específico por ID.
- POST /clients: Crie um novo cliente.
- PUT /clients/{id}: atualiza um cliente existente.
- DELETE /clients/{id}: Exclui um cliente por ID.
