package OrientaçãoObjetos.Aula08.Teste;

import OrientaçãoObjetos.Aula08.CalculadoraSalaRetangular;

public class CalculadoraSalaRetangularTeste {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular();

        calcular.setAltura(6);
        calcular.setLargura(5);

        calcular.calcularArea();
        calcular.calcularPerimetro();
    }
}
