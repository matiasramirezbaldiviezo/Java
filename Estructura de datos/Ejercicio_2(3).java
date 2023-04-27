package Febrero_6;

import java.util.Random;

public class Ejercicio_2 
{
	public static int encontrarValorModal(int[] v)
	{
		int respuesta = 0;
		int comparacion = 0;
		int[] ocurrencias = new int[10];//debe ser creado con el tama�o del rango de los numeros a ser generados
		for(int i=0 ; i<v.length; i++)
		{
			ocurrencias[v[i]]++;//incremento en uno la ocurrencia del n�mero 
		}
		for(int i=0; i<ocurrencias.length ; i++)
		{
			if(comparacion<ocurrencias[i])
			{
				comparacion=ocurrencias[i];
				respuesta = i;
			}
		}
		System.out.println("Cantidad de ocurrencias:"+comparacion);
		return respuesta;
	}
	public static void main(String[] args) 
	{
		int[] vector = new int[20];
		
		Random aleatorio = new Random();
		//int numero =(int) (Math.random()*50+1);
		for(int i=0 ; i<vector.length; i++)
		{
			int numero = aleatorio.nextInt(10);//Se generan n�meros aleatorios entre 0 y 49
			vector[i] = numero;
			System.out.println("Vector["+i+"]="+numero);
		}
		System.out.println("EL VALOR MODAL ES:"+encontrarValorModal(vector));
	}
}

