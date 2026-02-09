package ListasColecoes.Aula03;

public class ContaBancaria {

    private int numeroConta;
    private int saldo;

    public ContaBancaria(int numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta + " | Saldo: R$" + saldo;
    }
}
