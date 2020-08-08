package Domain;

import java.util.ArrayList;

@Entity
@Table(name = "ejercicios")
public class superEjercicios extends Ejercicio {


    private ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();

    superEjercicios(String nombre, ArrayList<Ejercicio> ejercicios){
        super(nombre);
        this.ejercicios = ejercicios;
    }

    superEjercicios(String nombre) {
        super(nombre);
    }

    @Override
    public String musculosEjercitados(){
        return this.ejercicios.stream().distinct().toString();
    }

    @Override
    public int numeroAerobico(){
        return ejercicios.stream().mapToInt(value -> value.numeroAerobico()).max().getAsInt();
    }

    @Override
    public double tiempoEstimado(){
        return ejercicios.stream().mapToDouble(value -> value.tiempoEstimado()).sum();
    }
}
