package BES;

public class Banco {

    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("cliente01", new ContaCorrente(123, 123));

        System.out.println("--------------------------------------------------");
        System.out.println("-=Conta 01=-");
        cliente01.operar();
        System.out.println("--------------------------------------------------");
        System.out.println("    ");
        System.out.println("--------------------------------------------------");

        Cliente cliente02 = new Cliente("cliente02", new ContaCorrente(123, 123));

        System.out.println("-=Conta 02=-");
        cliente02.operar();
        System.out.println("--------------------------------------------------");
        System.out.println("    ");
        System.out.println("--------------------------------------------------");

        Cliente cliente03 = new Cliente("cliente03", new ContaCorrente(123, 123));

        System.out.println("-=Conta 03=-");
        cliente03.operar();
        System.out.println("--------------------------------------------------");
        System.out.println("    ");
        System.out.println("--------------------------------------------------");
    }
}