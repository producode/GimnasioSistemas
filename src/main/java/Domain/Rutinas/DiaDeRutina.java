package Domain.Rutinas;

import java.time.DayOfWeek;

public class DiaDeRutina {
    private DayOfWeek diaDeLaRutina;

    DiaDeRutina(DayOfWeek diaDeLaRutina){
        this.diaDeLaRutina = diaDeLaRutina;
    }

    public DayOfWeek getDiaDeLaRutina() {
        return diaDeLaRutina;
    }
}
