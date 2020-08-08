package Domain;

@Entity
@Table(name = "individual")
public class Individual extends Ejercicio {

    @Column
    private String maquina;

    @Column
    private int repeticiones;

    @Column
    private int series;

    @Column
    private double peso;

    @Column
    private String video;

    @Column
    private String musculosEjercitados;

    @Column
    private int cantidadAerobicos;

    @Column
    private double tiempoEstimado;

    Individual(String nombre,String musculosEjercitados, int cantidadAerobicos, double tiempoEstimado, int repeticiones, int series, double peso, String maquina, String video) {
        super(nombre);
        this.maquina = maquina;
        this.repeticiones = repeticiones;
        this.series = series;
        this.peso = peso;
        this.video = video;
        this.musculosEjercitados = musculosEjercitados;
        this.cantidadAerobicos = cantidadAerobicos;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public String musculosEjercitados(){
        return this.musculosEjercitados;
    }

    @Override
    public int numeroAerobico(){
        return this.cantidadAerobicos;
    }

    @Override
    public double tiempoEstimado(){
        return this.tiempoEstimado;
    }

    Individual(String nombre) {
        super(nombre);
    }


    public double getPeso() {
        return peso;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public String getMaquina() {
        return maquina;
    }

    public String getVideo() {
        return video;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
}
