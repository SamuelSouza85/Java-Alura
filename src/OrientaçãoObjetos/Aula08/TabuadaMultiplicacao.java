package OrientaçãoObjetos.Aula08;

import OrientaçãoObjetos.Aula08.Interface.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void mostrarTabuada(int numero) {
        int resultado;
        for (int i = 1; i < 11; i++) {
            resultado = numero *  i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
