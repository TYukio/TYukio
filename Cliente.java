package BES;


import java.util.Random;

public class Cliente {
    private String Nome;
    private ContaCorrente contaCorrente;

    private Random rand = new Random();
    private String[] descs = {"Mercado Livre", "Aliexpress", "Serviços", "Gás", "Água", "E-commerce", "Investimento", "Criptomoeda"};

    public Cliente(String nome, ContaCorrente contaCorrente) {
        Nome = nome;
        this.contaCorrente = contaCorrente;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void operar(){
        rand.nextFloat();
        for (int i = 0; i < 3; i++){
            this.contaCorrente.depositar(Math.round(rand.nextFloat() * 100.f),descs[rand.nextInt(7)]);
            this.contaCorrente.retirar(Math.round(rand.nextFloat() * 100.f),descs[rand.nextInt(7)]);
            this.contaCorrente.extrato();
            System.out.println("Saldo: " + this.contaCorrente.retornar());
        }
    }
}
