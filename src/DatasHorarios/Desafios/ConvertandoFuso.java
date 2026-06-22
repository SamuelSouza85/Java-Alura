package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertandoFuso {
    public static void main(String[] args) {
        ZonedDateTime tempoSistema = ZonedDateTime.now();
        ZonedDateTime tempoSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual no sistema: " + tempoSistema.format(formatter));
        System.out.println("Horário atual em Sydney: " + tempoSydney.format(formatter));
    }
}
