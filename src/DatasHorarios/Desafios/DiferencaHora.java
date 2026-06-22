package DatasHorarios.Desafios;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHora {
    public static void main(String[] args) {

        LocalTime inicio = LocalTime.of(14, 30, 7);
        LocalTime fim = LocalTime.of(16, 45, 7);

        Duration diferenca = Duration.between(inicio, fim);

        System.out.println("Diferença de tempo: " + diferenca.toHoursPart()+"h"+ diferenca.toMinutesPart()+"min"+diferenca.toSecondsPart()+"s");
    }
}
