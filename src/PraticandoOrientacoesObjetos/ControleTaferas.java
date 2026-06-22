package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Taferas;

import java.util.ArrayList;
import java.util.List;

public class ControleTaferas {
    public static void main(String[] args) {
        Taferas taferas1 = new Taferas();
        taferas1.descricao = "Estudar Java";
        taferas1.status = true;

        Taferas taferas2 = new Taferas();
        taferas2.descricao = "Estudar para Prova";
        taferas2.status = false;

        List<Taferas> list = new ArrayList<>();
        list.add(taferas1);
        list.add(taferas2);

        for (Taferas t: list){
            t.verificarTarefas();
        }

    }
}
