package poo;

public class ItfPrueba {

    public static void main(String args[]) {
        ItfNeutro neutro = new ItfNeutro();
        ItfNegativoImpresion negativo = new ItfNegativoImpresion();
        
        neutro.Imprimir();
        negativo.Imprimir();
        neutro.ImprimirBonito();
    }
}
class ItfPositivoImpresion implements ItfImpresion{
    @Override
    public void Imprimir() {
        System.out.println ("¡Que buen tiempo hace!"); 
    }
}

class ItfNegativoImpresion implements ItfImpresion{
    public void Imprimir(){
        System.out.println ("¡Odio los lunes!"); 
    }
}

class ItfNeutro implements ItfImpresion, ItfImpresion2{
    public void ImprimirBonito(){
        System.out.println ("---- Las olas del mar ----"); 
    }

    @Override
    public void Imprimir() {
        System.out.println ("Las olas del mar");
    }
}