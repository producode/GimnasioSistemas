package Domain.Rutinas;

import java.time.LocalDate;

public class DiaDeEjercicio {
    private LocalDate fechaDelDia;

    DiaDeEjercicio(LocalDate fecha){
        fechaDelDia = fecha;
    }

    public LocalDate getFechaDelDia() {
        return fechaDelDia;
    }
}
