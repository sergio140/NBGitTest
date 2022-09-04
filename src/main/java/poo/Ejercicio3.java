package poo;

public class Ejercicio3 {
    public static void main(String[] args){
        float[] Notas={3,6,8,10,2,5,7,9,10};

        CCentroDeEstudios MiAula = new CCentroDeEstudios();
        System.out.println("Aprobados: "+MiAula.NumeroDeAprobados(Notas));
        System.out.println("Suspensos: "+MiAula.NumeroDeSuspensos(Notas)); 
        System.out.println("Media: "+MiAula.NotaMedia(Notas)); 
        System.out.println("Varianza: "+MiAula.Varianza(Notas)); 
    }
}


class CCentroDeEstudios implements Ejercicio3Interfaz {

    public short NumeroDeAprobados(float[] Notas) {
    short NumAprobados = 0;
    for (int i=0; i<Notas.length; i++)
    if (Notas[i]>=5.0f)
    NumAprobados++;
    return NumAprobados;
    }

    public short NumeroDeSuspensos(float[] Notas) {
    short NumSuspensos = 0;
    for (int i=0; i<Notas.length; i++)
    if (Notas[i]<5.0f)
    NumSuspensos++;
    return NumSuspensos;
    }

    public float NotaMedia(float[] Notas) {
    float Suma = 0;
    for (int i=0; i<Notas.length; i++)
    Suma = Suma + Notas[i];
    return Suma/(float)Notas.length;
    }

    public float Varianza(float[] Notas) {
    float Media = NotaMedia(Notas);
    float Suma = 0;
    for (int i=0; i<Notas.length; i++)
    Suma = Suma + Math.abs(Media-Notas[i]);
    return Suma/(float)Notas.length;
    }
}