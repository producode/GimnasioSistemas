package Domain;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import Domain.Motivaciones.Motivacion;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    private int DNI;

    @Column
    private String nombre;

    @Column
    private String sexo;

    @Column
    private int edad;

    @Column
    private double peso;

    @Column
    private double altura;

    @OneToOne
    @JoinColumn(name = "motivacion_id")
    private Motivacion motivacion;

    @OneToOne
    @JoinColumn(name = "rutina_id")
    private HistorialRutinas rutinas;

    Persona(String nombre, String sexo, int edad, double peso, double altura, Motivacion motivacion){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.motivacion = motivacion;
        this.rutinas = new HistorialRutinas();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Motivacion getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(Motivacion motivacion) {
        this.motivacion = motivacion;
    }
}
