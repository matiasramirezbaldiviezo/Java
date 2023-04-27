
package Febrero_6;

import java.util.Scanner;

public class Ejercicio_3 
{
	public static boolean esPalindrome(String palabra)
	{
		String nuevaPalabra = "";
		for(int i=palabra.length()-1; i>=0; i--)
		{
			nuevaPalabra = nuevaPalabra+palabra.charAt(i);
		}
		//System.out.println("La palabra invertida es "+nuevaPalabra);
		//La forma correcta para comparar un String es a traves del metodo equals
		if(palabra.equals(nuevaPalabra))
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la palabra que se quiere evaluar->");
		String palabra = entrada.next();
		if(esPalindrome(palabra)==true)
			System.out.println("Es Palindrome");
		else
			System.out.println("No es Palindrome");
	}

}

