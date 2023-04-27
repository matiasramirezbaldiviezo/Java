package Febrero_20;

public class PrincipalEncapsulado {

    public static void main(String[] args) {
        Automovil a1 = new Automovil();
        a1.setMarca("DUSTER");
        a1.setCilindrada(1998);
        a1.setModelo(2017);
        Automovil a2 = new Automovil();
        a2.setMarca("BMW");
        a2.setCilindrada(4003.99f);
        a2.setModelo(2021);
        a1.mostrarDatos();
        a2.mostrarDatos();
    }
}
