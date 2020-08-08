package Domain.Motivaciones;

import Domain.Persona;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BajarDePeso")
public class BajarDePeso extends Motivacion {
    @Column
    private double variacionPesoIdeal = 3.0;

    @Column
    private double pesoIdeal;

    BajarDePeso(Double pesoIdeal){
        this.pesoIdeal = pesoIdeal;
    }

    @Override
    public void cambiarMotivacion(Persona persona){
        if(debeCambiarLaMotivacion(persona)){
            MantenerFigura mantenerFigura = new MantenerFigura(pesoIdeal);
            persona.setMotivacion(mantenerFigura);
        }
    }

    @Override
    protected boolean debeCambiarLaMotivacion(Persona personaAMedir) {
        if(personaAMedir.getPeso() <= pesoIdeal + variacionPesoIdeal || personaAMedir.getPeso() >= pesoIdeal - variacionPesoIdeal){
            return true;
        }
        return false;
    }
}
