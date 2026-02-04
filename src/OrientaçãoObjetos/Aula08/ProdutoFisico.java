package OrientaçãoObjetos.Aula08;

import OrientaçãoObjetos.Aula08.Interface.Calculavel;

public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {

        return preco * 0.7;
    }
}
