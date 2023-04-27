package MARZO_06;

import java.util.Random;

public class Baraja 
{
	Carta[] maso = new Carta[52];
	
	static class Carta
	{
		int valor;
		int palo;//el valor 0 es Trebol, el 1 es Espada, el 2 es Corazón y el 3 Diamante
	}
	
	//definimos el método constructor que va a generar la baraja de manera aleatoria
	public Baraja()
	{
		Random aleatorio = new Random();
		for(int i = 0; i<this.maso.length ; i++)
		{
			//genero valores aleatorios entre 1 y 13
			int valorAleatorio = aleatorio.nextInt(13)+1;
			int paloAleatorio = aleatorio.nextInt(4);
			while(verificaDuplicidad(valorAleatorio,paloAleatorio))
			{
				valorAleatorio = aleatorio.nextInt(13)+1;
				paloAleatorio = aleatorio.nextInt(4);
			}
			Carta nuevaCarta = new Carta();
			nuevaCarta.valor = valorAleatorio;
			nuevaCarta.palo = paloAleatorio;
			this.maso[i] = nuevaCarta;
		}	
	}
	//implementamos un código que verifica la generación duplicada de las cartas
	public boolean verificaDuplicidad(int v, int p)
	{
		boolean respuesta = false;
		for(int i = 0; i<this.maso.length; i++)
		{
			//Pregunto si la posicion sub i existe(es distinto de null)
			if(this.maso[i] == null)
				break;
			if(this.maso[i].valor==v&this.maso[i].palo==p)
			{
				respuesta = true;
				break;
			}
		}
		return respuesta;
	}
	
	public void mostrarMasoOtraOpcion()
	{
		for(int c = 0; c < this.maso.length ; c++)
		{
			if(this.maso[c].valor>1&this.maso[c].valor<11)
				System.out.print("Carta "+(c+1)+" = "+this.maso[c].valor);
			else if(this.maso[c].valor==1)
				System.out.print("Carta "+(c+1)+" = A");
			else if(this.maso[c].valor==11)
				System.out.print("Carta "+(c+1)+" = J");
			else if(this.maso[c].valor==12)
				System.out.print("Carta "+(c+1)+" = Q");
			else
				System.out.print("Carta "+(c+1)+" = K");
			if(this.maso[c].palo==0)
				System.out.println(" Trebol");
			else if(this.maso[c].palo==1)
				System.out.println(" Espada");
			else if(this.maso[c].palo==2)
				System.out.println(" Corazón");
			else 
				System.out.println(" Diamante");
		}
	}
	
	public void mostrarMaso()
	{
		int contador=1;
		for(Carta c : this.maso)
		{	    	
			if(c.valor>1&c.valor<11)
				System.out.print("Carta "+contador+" = "+c.valor);
			else if(c.valor==1)
				System.out.print("Carta "+contador+" = A");
			else if(c.valor==11)
				System.out.print("Carta "+contador+" = J");
			else if(c.valor==12)
				System.out.print("Carta "+contador+" = Q");
			else
				System.out.print("Carta "+contador+" = K");
			if(c.palo==0)
				System.out.println(" Trebol");
			else if(c.palo==1)
				System.out.println(" Espada");
			else if(c.palo==2)
				System.out.println(" Corazón");
			else 
				System.out.println(" Diamante");
			contador++;
		}
	}
	public static void main(String[] args) 
	{
		Baraja miBaraja = new Baraja();
		miBaraja.mostrarMaso();
		System.out.println("=====================================");
		miBaraja.mostrarMasoOtraOpcion();

	}

}
