package Domain.Motivaciones;

import Domain.Persona;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MantenerFigura")
public class MantenerFigura extends Motivacion {
    @Column
    private double pesoInicial;

    @Column
    private double variacionPesoInicial = 3.0;

    public double getPesoInicial() {
        return pesoInicial;
    }

    public double getVariacionPesoInicial() {
        return variacionPesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public void setVariacionPesoInicial(double variacionPesoInicial) {
        this.variacionPesoInicial = variacionPesoInicial;
    }

    MantenerFigura(double pesoInicial){
        this.pesoInicial = pesoInicial;
    }

    @Override
    public void cambiarMotivacion(Persona persona){
        if(debeCambiarLaMotivacion(persona)){
            BajarDePeso bajarDePeso = new BajarDePeso(pesoInicial);
            persona.setMotivacion(bajarDePeso);
        }
    }

    @Override
    protected boolean debeCambiarLaMotivacion(Persona personaAMedir) {
        if(personaAMedir.getPeso() >= pesoInicial + variacionPesoInicial){
            return true;
        }
        return false;
    }
}
