package OrientaçãoObjetos.Aula07;

public class ContaBancaria {

    protected double saldo;


    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado. Saldo atual de R$" + saldo);
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("O saldo agora é de R$" + saldo);
        }else {
            System.out.println("O saldo é insufisiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + saldo);
    }
}
