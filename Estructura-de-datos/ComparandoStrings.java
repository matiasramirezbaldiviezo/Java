package Febrero_10;

public class ComparandoStrings 
{

	public static void main(String[] args) 
	{
		String palabra1="Hola";
		String palabra2="Mundo";
		//la forma incorrecta de comparar Strings
		if(palabra1+palabra2=="HolaMundo")
			System.out.println("SON IGUALES");
		else
			System.out.println("SON DISTINTOS");
		//LA forma correcta de comparar Strings
		if((palabra1+palabra2).equals("HolaMundo"))
			System.out.println("SON IGUALES");
		else
			System.out.println("SON DISTINTOS");
	}

}
