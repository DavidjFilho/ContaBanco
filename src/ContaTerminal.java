import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dgite sua agência: ");
        String agencia = sc.nextLine();
        System.out.println("Dgite número da conta: ");
        int numeroConta = Integer.parseInt(sc.nextLine());
        System.out.println("Dgite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Dgite seu saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());

        new Cliente(nomeCliente, agencia, numeroConta, saldo);
    }
}