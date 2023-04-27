package OCTUBRE_08;

import java.util.Scanner;
/*
10 50
100 1000
10 200
11 11
 */


public class FactoresPrimos 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int[] criba = new int[10001];
		//calculamos todos los factores primos para el rango 2 100000
		for(int i=2 ; i<Math.sqrt(criba.length); i++)
		{
			if(criba[i]==0)
				for(int j=i*2 ;j<criba.length; j=j+i)
					criba[j]++;
		}
			
		//hacemos la lectura indefinida de datos
		while(entrada.hasNext())
		{
			int A = entrada.nextInt();
			int B = entrada.nextInt();
			int max = 0;
			int pos = 0;
			for(int i=A ; i<=B; i++)
			{
				//System.out.println(i+" tiene "+criba[i]+" factores");
				if(max<=criba[i])
				{
					max = criba[i];
					pos = i;
				}
			}
			if(max==0)
				max++;
			System.out.println(pos+" tiene "+max+" factores");
		}
	}

}
