package Domain.Motivaciones;

import Domain.Persona;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Motivacion extends domain.Persistente {

    @Column
    private double horasMinimo;

    @Column
    private double horasMaximo;

    @Column
    private int aerobicosMinimo;

    @Column
    private int aerobicosMaximo;

    @Column
    private int fuerzaMuscular;

    public double getHorasMaximo() {
        return horasMaximo;
    }

    public double getHorasMinimo() {
        return horasMinimo;
    }

    public int getAerobicosMaximo() {
        return aerobicosMaximo;
    }

    public int getAerobicosMinimo() {
        return aerobicosMinimo;
    }

    public int getFuerzaMuscular() {
        return fuerzaMuscular;
    }

    public void setAerobicosMaximo(int aerobicosMaximo) {
        this.aerobicosMaximo = aerobicosMaximo;
    }

    public void setAerobicosMinimo(int aerobicosMinimo) {
        this.aerobicosMinimo = aerobicosMinimo;
    }

    public void setHorasMaximo(double horasMaximo) {
        this.horasMaximo = horasMaximo;
    }

    public void setHorasMinimo(double horasMinimo) {
        this.horasMinimo = horasMinimo;
    }

    public void setFuerzaMuscular(int fuerzaMuscular) {
        this.fuerzaMuscular = fuerzaMuscular;
    }

    public void cambiarMotivacion(Persona persona){

    }

    protected boolean debeCambiarLaMotivacion(Persona personaAMedir){
        return false;
    }
}
