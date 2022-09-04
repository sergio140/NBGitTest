package poo;

public class PruebaTelefono {
    public static void main(String[] args) {
        Telefono ModeloBarato = new Telefono(2);
        Telefono ModeloMedio = new Telefono(4);

        ModeloBarato.Llamar("670879078");
        ModeloBarato.Llamar("670674590");
        System.out.println(ModeloBarato.UltimaLlamada());
        ModeloBarato.Llamar("670234590");
        ModeloBarato.Llamar("670069423");
        System.out.println(ModeloBarato.Llamada(1));
        //System.out.println(ModeloBarato.Llamada(2));
        ModeloMedio.Llamar("1allamada");//1
        ModeloMedio.Llamar("2allamada");//2
        System.out.println(ModeloMedio.UltimaLlamada());
        ModeloMedio.Llamar("3allamada");//3
        ModeloMedio.Llamar("4allamada");//2
        ModeloMedio.Llamar("5allamada");//1
        ModeloMedio.Llamar("6allamada");//4
        System.out.println(ModeloMedio.Llamada(1)+"->1");
        System.out.println(ModeloMedio.Llamada(2)+"->2");
        System.out.println(ModeloMedio.Llamada(3)+"->3");
        System.out.println(ModeloMedio.Llamada(4)+"->4");
    }
}
