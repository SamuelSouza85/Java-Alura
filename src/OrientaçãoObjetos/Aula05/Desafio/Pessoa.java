package OrientaçãoObjetos.Aula05.Desafio;

public class Pessoa {
    public String nome;
    public String genero;

    public void imprime(){
        if (genero.equalsIgnoreCase("homem")){
            System.out.println("O " + nome + " quer dizer olá, mundo");
        }else if (genero.equalsIgnoreCase("mulher")){
            System.out.println("A " + nome + " quer dizer olá mundo");
        }else{
            System.out.println("Digite apenas homem ou mulher para sabermos como você se indentifica");
        }
    }
}
