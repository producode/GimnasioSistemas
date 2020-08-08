package Domain.Rutinas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Rutina {
    private LocalDate fechaInicial;
    private LocalDate fechaFinalizacion;
    private ArrayList<DiaDeEjercicio> DiasRegistrados = new ArrayList<DiaDeEjercicio>();
    private RutinaIdeal rutinaASeguir;
}
