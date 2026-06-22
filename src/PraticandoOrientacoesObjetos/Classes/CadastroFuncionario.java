package PraticandoOrientacoesObjetos.Classes;

public class CadastroFuncionario {
    public String nome;
    public  String cargo;
    public int nivelAcesso;

    public void atualizarCadastro(String novoCargo, int novoNivel){

        System.out.println("--- Antes da atualização ---");
        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Cargo: %s %n", cargo);
        System.out.printf("Nível de acesso: %d %n", nivelAcesso);

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println("--- Depois da atualização ---");
        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Cargo: %s %n", cargo);
        System.out.printf("Nível de acesso: %d %n", nivelAcesso);
    }
}
