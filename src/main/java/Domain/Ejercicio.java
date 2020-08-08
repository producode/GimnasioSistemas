package Domain;

public abstract class Ejercicio extends domain.Persistente {
    private String nombre;

    Ejercicio(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String musculosEjercitados(){
        return "ninguno";
    }

    public int numeroAerobico(){
        return 0;
    }

    public double tiempoEstimado(){
        return 0.0;
    }
}
