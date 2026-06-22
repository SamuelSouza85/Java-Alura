package DatasHorarios.Desafios;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);
        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();
        System.out.println("Digite o horário real de saída (HH:mm):");
        LocalTime saida = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        LocalTime saidaEsperada = entrada.plusHours(cargaHoraria);

        Duration saldoHoras = Duration.between(saidaEsperada, saida);

        System.out.println("Horário de Entrada: " + entrada);
        System.out.println("Horário de saída previsto: " + saidaEsperada);
        System.out.println("Horário real da saída: " + saida);
        System.out.println("Saldo de horas: " + saldoHoras.toHoursPart()+ "h" + saldoHoras.toMinutesPart()+ "min");



    }
}
