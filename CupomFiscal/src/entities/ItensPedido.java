package entities;

public class ItensPedido {
    private Integer quantidade;
    private Double valor;

    private Produto produto;

    public ItensPedido() {
    }

    public ItensPedido(Integer quantidade, Double valor, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return valor * quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome();
    }
}
