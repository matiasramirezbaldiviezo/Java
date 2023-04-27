package Febrero_27;

public class PrincipalHerenciaConConstructores 
{
	public static void main(String[] args) 
	{
		Futbol f1 = new Futbol("FUTBOL", 11, 5);
		f1.mostrarDatos();
		Baloncesto b1 =  new Baloncesto("BALONCESTO", 5, 4, 2.3f);
		b1.mostrarDatos();
	}
}
