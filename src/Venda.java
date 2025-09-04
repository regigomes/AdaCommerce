
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<ItemVenda> itens;
    private LocalDate dataCriacao;
    private StatusVenda status;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.dataCriacao = LocalDate.now();
        this.status = StatusVenda.ABERTO;
    }

    public void adicionarItem(ItemVenda item) {
        if (this.status == StatusVenda.ABERTO) {
            this.itens.add(item);
            System.out.println("Item adicionado: " + item.getProduto().getNome());
        } else {
            System.out.println("Não é possível adicionar itens a uma venda que não está aberta.");
        }
    }

    public void removerItem(Produto produto) {
        if (this.status == StatusVenda.ABERTO) {
            this.itens.removeIf(item -> item.getProduto().equals(produto));
            System.out.println("Item removido: " + produto.getNome());
        } else {
            System.out.println("Não é possível remover itens a uma venda que não está aberta.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : this.itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public Cliente getCliente() { return cliente; }
    public StatusVenda getStatus() { return status; }
    public void setStatus(StatusVenda status) { this.status = status; }
    public List<ItemVenda> getItens() { return itens; }
}