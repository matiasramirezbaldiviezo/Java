package Febrero_6;

import java.util.Scanner;

public class ejecicio_1 
{
	public static void main(String[] args) 
	{
		// mcm = (A*B)/MCD (MCD=M�ximo Com�n Divisor)
		
		Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el n�mero A->");
        int A = entrada.nextInt();
        System.out.print("Introduzca el n�mero B->");
        int B = entrada.nextInt();
        int MCD = 1;
        int minimo;
        if(A>B)
        	minimo=B;
        else
        	minimo=A;
        for(int i=2; i<=minimo; i++)
        {
        	if((A%i==0)&(B%i==0))
        	{
        		MCD = i;
        	}
        }
        int mcm = A * B / MCD;
        System.out.println("El mcm de "+A+" y "+B+" es "+mcm);
	}
}
