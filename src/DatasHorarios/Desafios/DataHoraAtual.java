package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraAtual {
    public static void main(String[] args) {
        System.out.println("Relatório Semanal");

        LocalDate dataRelatorio = LocalDate.now();
        LocalTime tempoRelatorio = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoTempo = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: "+dataRelatorio.format(formatoData));
        System.out.println("Hora formatada: "+tempoRelatorio.format(formatoTempo));


    }
}
