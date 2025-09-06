
public class AdaCommerceApplication {

    public static void main(String[] args) {

        GenericRepository<Cliente> clienteRepository = new InMemoryRepository<>();
        GenericRepository<Produto> produtoRepository = new InMemoryRepository<>();
        NotificationService notificationService = new NotificationService();

        System.out.println("=== Bem-vindo ao Ada Commerce sua plataforma de e-commerce ===");

        System.out.println("\n--- Cadastrando Clientes e Produtos ---");
        Cliente cliente1 = new Cliente("Regiane Gomes", "111.222.333-44", "regianegomes@gmail.com");
        Produto produto1 = new Produto("Notebook Gamer", 5000.00);
        Produto produto2 = new Produto("Mouse sem fio", 150.00);

        clienteRepository.cadastrar(cliente1);
        produtoRepository.cadastrar(produto1);
        produtoRepository.cadastrar(produto2);

        System.out.println("\nClientes cadastrados:");
        clienteRepository.listarTodos().forEach(System.out::println);
        System.out.println("Produtos cadastrados:");
        produtoRepository.listarTodos().forEach(System.out::println);


        System.out.println("\n--- Iniciando uma nova Venda ---");
        Venda venda = new Venda(cliente1);
        System.out.println("Status inicial da venda: " + venda.getStatus());

        ItemVenda item1 = new ItemVenda(produto1, 1, 4900.00);
        ItemVenda item2 = new ItemVenda(produto2, 2, 140.00);
        venda.adicionarItem(item1);
        venda.adicionarItem(item2);

        System.out.println("\nTotal parcial da Venda: R$" + venda.calcularTotal());


        System.out.println("\n--- Finalizando o Pedido ---");
        if (!venda.getItens().isEmpty() && venda.calcularTotal() > 0) {
            venda.setStatus(StatusVenda.AGUARDANDO_PAGAMENTO);
            System.out.println("Status da Venda alterado para: " + venda.getStatus());
            notificationService.enviarEmail(venda.getCliente(), "Seu pedido foi realizado e está aguardando pagamento.");
        }


        System.out.println("\n--- Processando Pagamento ---");
        if (venda.getStatus() == StatusVenda.AGUARDANDO_PAGAMENTO) {
            venda.setStatus(StatusVenda.PAGO);
            System.out.println("Status da Venda alterado para: " + venda.getStatus());
            notificationService.enviarEmail(venda.getCliente(), "Seu pagamento foi confirmado!");
        }

        System.out.println("\n--- Enviando o Pedido para Entrega ---");
        if (venda.getStatus() == StatusVenda.PAGO) {
            venda.setStatus(StatusVenda.FINALIZADO);
            System.out.println("Status da Venda alterado para: " + venda.getStatus());
            notificationService.enviarEmail(venda.getCliente(), "Seu pedido foi enviado e será entregue em breve!");
        }

        System.out.println("\n=== Ciclo da venda concluído com sucesso! ===");
    }
}