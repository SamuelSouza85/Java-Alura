package OrientaçãoObjetos.Aula07.Teste;


import OrientaçãoObjetos.Aula07.SubClasses.ModeloCarro;

public class CarroTeste {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();

        carro.definirModelo("Sedan");
        carro.definirPrecos(3000, 2800, 3200);
        carro.imprime();
    }
}
