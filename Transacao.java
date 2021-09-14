package BES;

import java.time.LocalDate;

public class Transacao {
    private LocalDate Data;
    private String Descricao;
    private float Valor;

    public Transacao(float valor, String descricao) {
        Valor = valor;
        Data = LocalDate.now();
        Descricao = descricao;
    }

    public float getValor() {
        return Valor;
    }
    public void setValor(float valor) {
        Valor = valor;
    }
    public LocalDate getData() {
        return Data;
    }
    public void setData(LocalDate data) {
        Data = data;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void impressao(){
        if (this.getValor() > 0.0f) {
            System.out.println("Depósito de R$" + this.getValor() + " - " + this.getDescricao());
        }else{
            System.out.println("Retirada de R$" + -this.getValor() + " - " + this.getDescricao());
        }
    }
}
