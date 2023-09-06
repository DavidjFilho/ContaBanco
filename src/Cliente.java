public class Cliente {
    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public Cliente(String nomeCliente, String agencia, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.imprimir();
    }

    public void imprimir() {
        this.debitar(0);
        System.out.println("Olá " + this.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + " , conta " + this.numeroConta + " e seu saldo " + this.saldo + " já está para saque!! ");
    }

    public void debitar(double valor) {
        if (valor == 0) {
            valor = 1;
            System.out.println("Foi debitado 1,00 do seu saldo pela consulta! ");
        }
        this.saldo -= valor;
    }
}
