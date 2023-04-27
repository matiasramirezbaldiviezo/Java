package MARZO_17;

import java.util.Random;

public class JuegoFutbol 
{
	String equipoA;
	String equipoB;
	int anotacionesEquipoA;
	int anotacionesEquipoB;
	
	public void mostrarResultado()
	{
		System.out.println("====================================");
		System.out.println(this.equipoA+" Vs. "+this.equipoB);
		System.out.println(this.anotacionesEquipoA+" Vs. "+this.anotacionesEquipoB);
		System.out.println("====================================");
	}
	
	public void anotar(int ocasionesDeGol)
	{
		Random aleatorio = new Random();
		for(int i = 0; i<ocasionesDeGol ; i++)
		{
			int resultadoEquipoA = aleatorio.nextInt(25);
			int resultadoEquipoB = aleatorio.nextInt(25);
			//hay una probabilidad de 3/25 de convertir un gol
			if(resultadoEquipoA<=2)
				this.anotacionesEquipoA++;
			if(resultadoEquipoB<=2)
				this.anotacionesEquipoB++;
		}
	}

	public static void main(String[] args) 
	{
		JuegoFutbol juego = new JuegoFutbol();
		juego.equipoA = "Boca Junior";
		juego.equipoB = "River Plate";
		juego.anotar(20);
		juego.mostrarResultado();
	}

}
