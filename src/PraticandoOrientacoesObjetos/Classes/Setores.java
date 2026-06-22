package PraticandoOrientacoesObjetos.Classes;

public class Setores {
    public String local;
    public double temperatura;


    public void exibir(){
        System.out.printf("Sensor no local: %s %n", local);
        System.out.printf("Temperatura: %.2f °C %n", temperatura);

        if (temperatura > 37.5){
            System.out.println("Alerta: Temperatura acima do Limite");
        }else{
            System.out.println("Temperatura normal");
        }

    }
}
