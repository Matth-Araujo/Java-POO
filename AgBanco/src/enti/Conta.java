package enti;

public class Conta {
    private int num;
    private String titular;
    private float saldo;

    public Conta(int num, String titular) {
        this.num = num;
        this.titular = titular;
    }

    public Conta(int num,String titular,float depositoinicial) {
        this.num = num;
        this.titular = titular;
        Deposito(depositoinicial);
    }

    public int getNum() {
        return num;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void Deposito(float deposito){
        saldo += deposito;
    }

    public void Sacar(float saque){
        saldo -= (float) (saque + 5.0);
    }

    public String toString(){
        return "Conta "
                + num +
                ", Titular: "
                + titular +
                ", Saldo: R$ "
                + String.format("%.2f",saldo);
    }

}
