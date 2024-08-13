package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario, Integer id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void Incrementosalario(Double taxa){
        salario += salario * taxa / 100;
    }


    @Override
    public String toString(){
        return id + ", "+ nome +", "+ String.format("%.2f",salario);
    }


}
