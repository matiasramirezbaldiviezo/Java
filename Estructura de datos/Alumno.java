package Febrero_10;
//Tenemos la definici�n de la clase
public class Alumno 
{
	//En esta parte se declaran las variables de Instancia, o variable Miembro o variables Atributo
	public String nombreCompleto;
	//Si no se coloca un modificador el valor por defecto es public
	int edad;
	float estatura;
	//static float estatura;
	static String universidad = "U.C.B.";
	
	//m�todo propio
	public void mostrarDatos()
	{
		System.out.println("==========================");
		System.out.println("NOMBRE COMPLETO: "+this.nombreCompleto);
		System.out.println("EDAD: "+this.edad);
		System.out.println("ESTATURA: "+this.estatura);
		System.out.println("UNIVERSIDAD: "+this.universidad);
	}
	
//el m�todo main o prioncipal es el primer m�todo que se ejecuta para hacer correr un programa
	public static void main(String[] args) 
	{
		//Definimos 2 objetos: alumno1 y alumno2
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		alumno1.universidad = "CATO";
		alumno1.nombreCompleto = "Gabriela Duran";
		alumno1.edad = 19;
		alumno1.estatura = 1.75f;
		alumno2.nombreCompleto = "Fernando Higueras";
		alumno2.edad = 20;
		alumno2.estatura = 1.78f;
		alumno1.mostrarDatos();
		alumno2.mostrarDatos();
		alumno2.universidad = "DE LA CATO";
		alumno1.mostrarDatos();
		alumno2.mostrarDatos();
	}

}
