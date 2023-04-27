package MARZO_06;

import java.util.Random;

public class Cubilete 
{
	int[] dados = new int[5];
	// en la posición 0 del vector de ocurrencias almaceno la cantidad de 1s
	// en la posición 1 del vector de ocurrencias almaceno la cantidad de 2s
	// ...
	// en la posición 5 del vector de ocurrencias almaceno la cantidad de 6s
	int[] ocurrencias = new int[6];
	//Defino el método constructor para inicializar mi vector con los valores de los datos
	public Cubilete()
	{
		Random aleatorio = new Random();
		for(int i=0 ; i<this.dados.length ; i++)
		{
			//genero valores aleatorios entre 1 y 6
			int valor = aleatorio.nextInt(6)+1;
			this.dados[i] = valor;
			/*
			if(valor == 1)
				this.ocurrencias[0]++;
			else if(valor == 2)
				this.ocurrencias[1]++;
			else if(valor == 3)
				this.ocurrencias[2]++;
			else if(valor == 4)
				this.ocurrencias[3]++;
			else if(valor == 5)
				this.ocurrencias[4]++;
			else
				this.ocurrencias[5]++;
			*/
			this.ocurrencias[valor-1]++;
		}
	}
	public boolean esGrande()
	{
		boolean respuesta = false;
		/*
		if(this.dados[0]==this.dados[1]&this.dados[1]==this.dados[2]&
		   this.dados[2]==this.dados[3]&this.dados[3]==this.dados[5]&
		   this.dados[4]==this.dados[5])
		   */
		for(int i=0; i<this.ocurrencias.length ; i++)
		{
			if(this.ocurrencias[i]==5)
			{
				respuesta = true;
				break;//interrumpo la ejecución del for
			}
		}
		return respuesta;
	}
	public boolean esPoker()
	{
		boolean respuesta = false;
		for(int i : this.ocurrencias)
		{
			if(i==4)
			{
				respuesta = true;
				break;//interrumpo la ejecución del for
			}
		}
		return respuesta;
	}
	public boolean esFull()
	{
		boolean respuesta = false;
		for(int i : this.ocurrencias)
		{
			if(i==3)
			{
				for(int j : this.ocurrencias)
				{
					if (j==2)
					{
						respuesta = true;
						break;//interrumpo la ejecución del for
					}
				}
			}
		}
		return respuesta;
	}
	public boolean esEscalera()
	{
		//los valores validos para la escalera son 12345 13456 23456
		boolean respuesta = false;
		if(this.ocurrencias[0]<=1&this.ocurrencias[1]<=1&this.ocurrencias[2]==1&
		   this.ocurrencias[3]==1&this.ocurrencias[4]==1&this.ocurrencias[5]<=1)
			respuesta = true;
		return respuesta;
	}
	
	public void mostrarCubilite()
	{
		int contador = 1;
		for(int i : this.dados)
		{
			System.out.println("Dado "+contador+" = "+i);
			contador++;
		}
		contador = 1;
		for(int i : this.ocurrencias)
		{
			System.out.println("Cantidad de "+contador+"s = "+i);
			contador++;
		}
	}
	
	public static void main(String[] args) 
	{
		Cubilete miCubilete = new Cubilete();
		//miCubilete.mostrarCubilite();
		int intentos = 1;
		//while(miCubilete.esGrande()==false)
		while(!miCubilete.esGrande())
		{
			//al invocar al método constructor inicializo nuevamente los datos
			miCubilete = new Cubilete();
			intentos++;
		}
		System.out.println("OBTUVO UNA GRANDE EN "+intentos+" INTENTOS");
		miCubilete.mostrarCubilite();
		intentos = 0;
		while(!miCubilete.esPoker())
		{
			//al invocar al método constructor inicializo nuevamente los datos
			miCubilete = new Cubilete();
			intentos++;
		}
		System.out.println("OBTUVO UN POKER EN "+intentos+" INTENTOS");
		miCubilete.mostrarCubilite();
		intentos = 0;
		while(!miCubilete.esFull())
		{
			//al invocar al método constructor inicializo nuevamente los datos
			miCubilete = new Cubilete();
			intentos++;
		}
		System.out.println("OBTUVO UN FULL EN "+intentos+" INTENTOS");
		miCubilete.mostrarCubilite();
		intentos = 0;
		while(!miCubilete.esEscalera())
		{
			//al invocar al método constructor inicializo nuevamente los datos
			miCubilete = new Cubilete();
			intentos++;
		}
		System.out.println("OBTUVO UNA ESCALERA EN "+intentos+" INTENTOS");
		miCubilete.mostrarCubilite();
	}

}
