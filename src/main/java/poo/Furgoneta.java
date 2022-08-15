package poo;
                                       // SOLO SE PUEDE HEREDAR DE UNA CLASE, JAVA NO TIENE HERENCIA MULTIPLE.
public class Furgoneta extends Coche { /*EXTENDS = HEREDA DE LA CLASE COCHE, COCHE AHORA ES UNA SUPERCLASE MIENTRAS QUE FURGONETA ES UNA SUBCLASE*/
    private int capacidadCarga;
    private int plazasExtra;
    
    //CONSTRUCTOR
    public Furgoneta(int capacidadCarga, int plazasExtra){
        super(); //llama al constructor de la clase padre (Coche).
        this.capacidadCarga= capacidadCarga;
        this.plazasExtra = plazasExtra;
    }
    
    /************* METODOS GETTER *************/
    public String dimeDatosFurgoneta(){
    return "La capacidad de carga es: "+capacidadCarga+" y las plazas son: "+plazasExtra;
    }
    
}
