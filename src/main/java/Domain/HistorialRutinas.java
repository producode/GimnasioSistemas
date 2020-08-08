package Domain;

import Domain.Rutinas.Rutina;

import java.util.ArrayList;



@Entity
@Table(name = "rutinas")
public class HistorialRutinas {


    private ArrayList<Rutina> rutinasTerminadas = new ArrayList<Rutina>();
    private ArrayList<Rutina> rutinasSinTerminar = new ArrayList<Rutina>();
    private Rutina rutinaActual;


}
