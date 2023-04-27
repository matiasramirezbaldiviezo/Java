package Febrero_17;

public class Deporte {
    //Defino mis variables Atributo o de Instancia

    String nombre;
    int cantidadJugadores;
    boolean tiempoFijo;

    public void mostrarDatos() {
        System.out.println("================================");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("CANTIDAD JUGADORES: " + this.cantidadJugadores);
        if (this.tiempoFijo) {
            System.out.println("TIENE TIEMPO FIJO");
        } else {
            System.out.println("NO TIENE TIEMPO FIJO");
        }
    }

    public void modificarCantidadJugadores(int cantidad) {
        cantidad = 4;
        this.cantidadJugadores = cantidad;
    }

    public static void main(String[] args) {
        Deporte d1 = new Deporte();
        d1.nombre = "FUTBOL";
        d1.cantidadJugadores = 22;
        d1.tiempoFijo = true;
        Deporte d2 = new Deporte();
        d2.nombre = "TENIS";
        d2.cantidadJugadores = 2;
        d2.tiempoFijo = false;
        d1.mostrarDatos();
        d2.mostrarDatos();
        //defino una variable de tipo primitivo que es local (al m彋odo)
        int cantidad = 2;
        d2.modificarCantidadJugadores(cantidad);
        d2.mostrarDatos();
        System.out.println("La variable cantidad tiene el valor: " + cantidad);
    }

}
