package entities;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valorPorhora;
    private Integer horas;

    public ContratoHora() {
    }
    public ContratoHora(Double valorPorhora, Integer horas, Date data) {
        this.valorPorhora = valorPorhora;
        this.horas = horas;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(Double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double valorTotal(){
        return valorPorhora * horas;
    }
}
