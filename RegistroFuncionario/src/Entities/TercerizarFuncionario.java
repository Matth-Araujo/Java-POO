package Entities;

public class TercerizarFuncionario extends Funcionario{
    private Double custoAdicional;

    public TercerizarFuncionario(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public TercerizarFuncionario(String nome, Double horas, Double valorPorHoras, Double custoAdicional) {
        super(nome, horas, valorPorHoras);
        this.custoAdicional = custoAdicional;
    }
@Override
    public double pagamento(){
        return super.pagamento() + custoAdicional*1.1;
    }
}
