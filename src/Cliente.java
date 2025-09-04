public class Cliente {
    private String nome;
    private String documento;
    private String email;

    public Cliente(String nome, String documento, String email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + ", documento='" + documento + '\'' + '}';
    }
}