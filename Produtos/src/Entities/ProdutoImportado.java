package Entities;

public class ProdutoImportado extends Produto {
    private double taxaImposto;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, double taxaImposto) {
        super(nome, preco);
        this.taxaImposto = taxaImposto;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public Double ValorTotal(){
        return  getPreco()*taxaImposto;
    }

    @Override
    public String EtiquetaPreco(){
        return getNome() + " $" + String.format("%.2f", ValorTotal())+ ", (Taxa de importação: "+ String.format("%.2f", taxaImposto)+ ")";
    }
}
