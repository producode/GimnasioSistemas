package Domain;

import java.time.Duration;

@Entity
@Table(name = "ejercicioRegistrado")
public class EjercicioHecho {

    @OneToOne
    @JoinColumn(name = "ejercicio_id")
    private Ejercicio ejercicioACumplir;

    EjercicioHecho(Ejercicio ejercicio){
        ejercicioACumplir = ejercicio;
    }

    public Ejercicio getEjercicioACumplir() {
        return ejercicioACumplir;
    }

    public void setEjercicioACumplir(Ejercicio ejercicio) {
        ejercicioACumplir = ejercicio;
    }

    public Duration tiempoQueConllevo(){
        return Duration.ZERO;
    }
}
