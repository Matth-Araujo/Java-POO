package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date datnasc;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente() {
    }

    public Cliente(String nome, Date datnasc, String email) {
        this.nome = nome;
        this.datnasc = datnasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatnasc() {
        return datnasc;
    }

    public void setDatnasc(Date datnasc) {
        this.datnasc = datnasc;
    }

    @Override
    public String toString() {
        return nome + " (" + sdf.format(datnasc) + ") - " + email;
    }
}
