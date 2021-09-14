package BES;

import java.util.ArrayList;

public class ContaCorrente {
    private int agencia;
    private int numero;
    private ArrayList<Transacao>trans;
    private Cliente cliente;

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<Transacao> getTrans() {
        return trans;
    }
    public void setTrans(ArrayList<Transacao> trans) {
        this.trans = trans;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaCorrente(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.trans = new ArrayList<Transacao>();
    }

    public void depositar(float valor, String desc){
        if (valor > 0.0){
            trans.add(new Transacao(valor, desc));
        }
    }
    public void retirar(float valor, String desc){
        if(valor > 0.0 && retornar() >= valor){
            trans.add(new Transacao(-valor, desc));
        }else{
            System.out.println("Operacao Invalida");
        }
    }
    public float retornar(){
        float soma = 0.0f;
        for (Transacao i : trans) {
            soma += i.getValor();
        }
        return soma;
    }
    public void extrato(){
        for (Transacao i : trans){
            if (i.getValor() > 0.0f) {
                System.out.println("Depósito de R$" + i.getValor() + " - " + i.getDescricao());
            }else{
                System.out.println("Retirada de R$" + -i.getValor() + " - " + i.getDescricao());
            }

        }
    }
}