package Aula08;

import Aula08.Interface.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void coverterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.29;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
