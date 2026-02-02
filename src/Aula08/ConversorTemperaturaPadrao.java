package Aula08;

import Aula08.Interface.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Convertendo " + celsius + "C em Fahrenheit dá "+ fahrenheit+"F");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("Convertendo " + fahrenheit + "F em Celsius dá "+ celsius+"C");
    }
}
