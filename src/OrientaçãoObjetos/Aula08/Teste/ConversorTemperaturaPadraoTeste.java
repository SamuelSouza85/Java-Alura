package OrientaçãoObjetos.Aula08.Teste;

import OrientaçãoObjetos.Aula08.ConversorTemperaturaPadrao;

public class ConversorTemperaturaPadraoTeste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.fahrenheitParaCelsius(98);
        conversor.celsiusParaFahrenheit(37);
    }
}
