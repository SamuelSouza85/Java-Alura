package OrientaçãoObjetos.Aula07.SubClasses;

import OrientaçãoObjetos.Aula07.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + "foi cobrada. Saldo Atual: R$" + saldo);
    }
}
