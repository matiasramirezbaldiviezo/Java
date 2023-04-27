
package Febrero_27;


public class Deporte {

    private String nombre;
    private int cantidadJugares;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadJugares() {
        return cantidadJugares;
    }

    public void setCantidadJugares(int cantidadJugares) {
        this.cantidadJugares = cantidadJugares;
    }
    
    public void mostrarDatos()
    {
    System.out.println("===============================");
    if (this instanceof Futbol )
        System.out.println("===============FUTBOL=============");
    else if(this instanceof Baloncesto)
        System.out.println("===============BALONCESTO=============");
    System.out.println("NOMBRE DEPORTE :"+this.getNombre());
    System.out.println("CANTIDAD JUGADORES :"+this.getCantidadJugares() );
    }
    //Definimos el metodo constructor
    
    public Deporte(String nombre,int j)
    {
    this.setNombre(nombre);
    this.setCantidadJugares(j);
    
    }
    public static void main(String[] args) 
	{
		Futbol f1 = new Futbol("FUTBOL", 11, 5);
		f1.mostrarDatos();
		Baloncesto b1 =  new Baloncesto("BALONCESTO", 5, 4, 2.3f);
		b1.mostrarDatos();
	}
}
    
    