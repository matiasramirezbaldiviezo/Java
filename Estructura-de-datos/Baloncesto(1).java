package Febrero_27;

public class Baloncesto extends Deporte
{
	//creo mi variable atributo
	private int cantidadDeTiempos;
	private float tiempoPromedioDuracion;

	public void setCantidadDeTiempos(int cantidadDeTiempos) 
	{
		this.cantidadDeTiempos = cantidadDeTiempos;
	}

	public int getCantidadDeTiempos() 
	{
		return cantidadDeTiempos;
	}
	public void setTiempoPromedioDuracion(float tiempoPromedioDuracion) {
		this.tiempoPromedioDuracion = tiempoPromedioDuracion;
	}

	public float getTiempoPromedioDuracion() {
		return tiempoPromedioDuracion;
	}
	
	public Baloncesto(String nombre, int j, int c, float t) 
	{
		super(nombre, j);
		this.setCantidadDeTiempos(c);
		this.setTiempoPromedioDuracion(t);
	}
	//se sobre rescribe el método para mostrar sus datos propios
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("CANTIDAD DE TIEMPOS: "+this.getCantidadDeTiempos());
		System.out.println("TIEMPO TOTAL PROMEDIO: "+this.getTiempoPromedioDuracion()+" Hrs.");
	}

	

}
