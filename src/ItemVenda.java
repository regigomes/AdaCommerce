public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double precoVenda;

    public ItemVenda(Produto produto, int quantidade, double precoVenda) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getPrecoVenda() { return precoVenda; }
    public double getSubtotal() { return quantidade * precoVenda; }

    @Override
    public String toString() {
        return "Item: " + produto.getNome() + ", Qtd: " + quantidade + ", Preço Un.: " + precoVenda;
    }
}