package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador level;
    private Double salariobase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador level, Double salariobase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salariobase = salariobase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(Double salariobase) {
        this.salariobase = salariobase;
    }

    public NivelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(NivelTrabalhador level) {
        this.level = level;
    }

    public void addContrato(ContratoHora contrato){
        contratos.add(contrato);
    }
    public void addRemover(ContratoHora contrato){
        contratos.remove(contrato);
    }

    public Double renda(int ano,int mes){
        double soma = salariobase;

        Calendar cal = Calendar.getInstance();

        for (ContratoHora x : contratos){

            cal.setTime(x.getData());

            int x_ano = cal.get(Calendar.YEAR);
            int x_mes = 1 + cal.get(Calendar.MONTH);  // mais 1 pq o mes do calendar comeca com 0
            if (x_mes == mes && x_ano == ano){
                soma += x.valorTotal();
            }
        }
        return soma;
    }



}
