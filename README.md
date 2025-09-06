# Ada Commerce 

Este é um projeto criado no curso de Backend - Java, e simula um sistema de e-commerce básico, implementado com os princípios de Programação Orientada a Objetos (POO) em Java.
O objetivo principal é demonstrar um fluxo de compra e venda simplificado, utilizando uma base de dados em memória e aplicando conceitos como **Generic** e **Interfaces**.

## Tecnologias Utilizadas
- Java 17+
- Maven ou Gradle
- Orientação a Objetos
- Estruturas de Dados em memória (ArrayList)

## Funcionalidades
O sistema oferece as seguintes funcionalidades principais:

1.  **Gerenciamento de Clientes:**
    -   Cadastro de novos clientes com documento de identificação obrigatório.
    -   Listagem e atualização de clientes existentes.
    -   Clientes não são excluídos para manter o histórico.

2.  **Gerenciamento de Produtos:**
    -   Cadastro de novos produtos com nome e preço.
    -   Listagem e atualização de produtos existentes.
    -   Produtos não são excluídos para manter o histórico.

3.  **Fluxo de Venda (Pedido):**
    -   Criação de um novo pedido associado a um cliente.
    -   Adição, remoção e alteração da quantidade de itens (produtos) em um pedido.
    -   O preço do item no pedido pode ser diferente do preço do produto original.
    -   Fluxo de status do pedido:
        -   **ABERTO:** Pode receber, remover ou alterar itens.
        -   **AGUARDANDO PAGAMENTO:** O pedido é finalizado, tem pelo menos um item e valor > 0.
        -   **PAGO:** O pagamento foi processado com sucesso.
        -   **FINALIZADO:** O pedido foi entregue ao cliente.

## Estrutura do Projeto
-   **`src/main/java/ada/commerce/model`:** Contém as classes de modelo (Cliente, Produto, Pedido, ItemPedido) que representam as entidades do negócio.
-   **`src/main/java/ada/commerce/repository`:** A classe `RepositorioEmMemoria<T>` utiliza o conceito de **Generic** para armazenar e gerenciar diferentes tipos de dados em memória, como Clientes, Produtos e Pedidos.
-   **`src/main/java/ada/commerce/service`:** A classe `AdaCommerceService` encapsula a lógica de negócio, orquestrando as operações de CRUD e o fluxo de vida do pedido.
-   **`src/main/java/ada/commerce/main`:** A classe `Main` contém o ponto de entrada do programa, demonstrando o uso das funcionalidades.

## Como Executar o Projeto
1.  Clone este repositório para sua máquina local.
    `git clone https://github.com/seu-usuario/adacommerce.git`
2.  Abra o projeto em sua IDE de preferência.
3.  Execute a classe `AdaCommerceApplication` para ver o fluxo de exemplo em ação.
# adaecommerce
# AdaCommerce
