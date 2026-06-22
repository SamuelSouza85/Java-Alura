package PraticandoOrientacoesObjetos.Classes;

public class Taferas {
    public String descricao;
    public boolean status;

    public void verificarTarefas(){
        if (status){
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        }else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
