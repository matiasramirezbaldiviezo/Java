package MARZO_13;

import java.util.Scanner;

public class EjemploMenu 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		boolean bandera = true;
		do
		{
			System.out.println("======================================");
			System.out.println("1. Suma A y B");
			System.out.println("2. Multiplicación A y B");
			System.out.println("3. Salir");
			System.out.print("Ingrese la opción - >");
			int opcion = entrada.nextInt();
			//implementamos la escructura para switch
			switch(opcion)
			{
			case 1: System.out.println("Resultado = ");
					break;
			case 2: System.out.println("Resultado = ");
					break;
			case 3: System.out.println("GRACIAS POR USAR EL PROGRAMA!!!");
					bandera = false;
					break;
		    default: System.out.println("A ingresado una opción inválida, intente nuevamente");
			}
		}while(bandera);
	}

}


