package Febrero_27;

public class Futbol extends Deporte
{
	//definimos variables Atributo
	private int cantidadCambios;

	public void setCantidadCambios(int cantidadCambios) {
		this.cantidadCambios = cantidadCambios;
	}

	public int getCantidadCambios() {
		return cantidadCambios;
	}
	//Es obligatorio implementar un constructor si la clase padre lo implementó
	public Futbol(String nombre, int j, int c) 
	{
		super(nombre, j);
		this.setCantidadCambios(c);
	}
	
	public void mostrarDatos()
	{
		super.mostrarDatos();//reutilizamos el código de la clase Padre
		System.out.println("CANTIDAD DE CAMBIOS: "+this.getCantidadCambios());
	}
}
