# 📚 Projeto Ada Commerce 
**Ada Commerce**! Este é um projeto básico de e-commerce feito em **Java**, e é uma aplicação simples de e-commerce desenvolvida com foco em conceitos de Programação Orientada a Objetos (POO), Generics, Interfaces e Repositórios, esta aplicação foi criada para o curso de Backend-java da Adatech.

## Objetivo
Simular um sistema simples de e-commerce com as seguintes funcionalidades:
- Cadastro de clientes e produtos
- Criação de pedidos
- Adição e remoção de itens
- Pagamento e entrega

## ✔️ Funcionalidades
- Cadastro de Clientes e Produtos.
- Gerenciamento de Vendas com múltiplos itens.
- Cálculo do total da venda.
- Alteração do status da venda (Aberto → Aguardando Pagamento → Pago → Finalizado).
- Simulação de envio de notificações por e-mail.
- Implementação de repositório genérico com armazenamento em memória.

## ✔️ Tecnologias Utilizadas
- Java 17+
- POO (Classes, Objetos, Encapsulamento)
- Interfaces e Generics
- Coleções (List, ArrayList)

## ✔️ Conceitos Aplicados
- Encapsulamento: Uso de getters e setters.
- Polimorfismo e Interfaces: Implementação do GenericRepository.
- Generics: Repositório genérico para diferentes entidades.
- Enum: Controle de status da venda.
- Coleções: Manipulação de listas para armazenar dados.
  
## Regras de Negócio
- Todo cliente deve ter documento de identificação.
- Pedido inicia com status **"Aberto"**.
- Pedido deve ter **data de criação**.
- Pedido pode receber itens enquanto estiver **"Aberto"**.
- Valor de venda do item pode ser diferente do valor do produto.
- Pedido só pode ser finalizado se tiver **ao menos um item** e **valor maior que zero**.
- Após finalização, status muda para **"Aguardando pagamento"** e cliente é notificado.
- Pagamento só pode ocorrer se status for **"Aguardando pagamento"**.
- Após pagamento, status muda para **"Pago"** e cliente é notificado.
- Após pagamento, pedido pode ser entregue e status muda para **"Finalizado"**.

## Como Executar
- Clone o repositório: git clone https://github.com/regigomes/AdaCommerce.git
- Abra o projeto em uma IDE de sua preferencia.
- Compile e execute a classe AdaCommerceApplication.

## 👩‍💻Autora
Regiane Gomes




   
