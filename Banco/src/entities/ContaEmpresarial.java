package entities;

public class ContaEmpresarial extends Conta{
    private Double limiteEmpres;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmpres) {
        super(numero, titular, saldo);
        this.limiteEmpres = limiteEmpres;
    }

    public Double getLimiteEmpres() {
        return limiteEmpres;
    }

    public void setLimiteEmpres(Double limiteEmpres) {
        this.limiteEmpres = limiteEmpres;
    }

    public void emprestimo(double quantia){
        if (quantia <= limiteEmpres) {
            saldo += quantia - 10.0;
        }
    }
}
