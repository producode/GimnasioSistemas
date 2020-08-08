package Domain.Motivaciones;

import Domain.Persona;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TonificarCuerpo")
public class TonificarCuerpo extends Motivacion {
    @Column
    private double variacionPesoInicial = 3.0;

    @Column
    private double porcentajeGrasaMuscular;

    @Column
    private double porcentajeGrasaMuscularDeseado = 30.9;

    @Column
    private double porcentajeGrasaMuscularMinimo = 22.9;

    @Column
    private double MasaMuscularDeseada = 24.5;

    @Column
    private double MasaMuscularMinima = 18.5;

    public double getVariacionPesoInicial() {
        return variacionPesoInicial;
    }

    public void setVariacionPesoInicial(double variacionPesoInicial) {
        this.variacionPesoInicial = variacionPesoInicial;
    }

    TonificarCuerpo(){}

    @Override
    public void cambiarMotivacion(Persona persona){
        if(debeCambiarLaMotivacion(persona)){
            MantenerFigura mantenerFigura = new MantenerFigura(persona.getPeso());
            persona.setMotivacion(mantenerFigura);
        }
    }

    @Override
    protected boolean debeCambiarLaMotivacion(Persona personaAMedir) {
        if(porcentajeGrasaMuscular  <= porcentajeGrasaMuscularDeseado && porcentajeGrasaMuscular >= porcentajeGrasaMuscularMinimo && getMasaMuscular(personaAMedir) <= this.MasaMuscularDeseada && getMasaMuscular(personaAMedir) >= this.MasaMuscularMinima){
            return true;
        }
        return false;
    }

    public double getMasaMuscular(Persona persona){
        return persona.getPeso()/persona.getAltura();
    }

    public double getPorcentajeGrasaMuscular() {
        return porcentajeGrasaMuscular;
    }

    public void setPorcentajeGrasaMuscular(double porcentajeGrasaMuscular) {
        this.porcentajeGrasaMuscular = porcentajeGrasaMuscular;
    }
}
