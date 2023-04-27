package OCTUBRE_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
45.00
180.00
240.00
35.00
2.50
11.34

*/

public class PizzaSimetrica 
{
	static int obtener_mcd(int a, int b) 
	{
	       if(b==0)
	           return a;
	       else
	           return obtener_mcd(b, a % b);
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do 
		{
			String R = entrada.readLine();
		    double r = Double.parseDouble(R);
		    int n = (int)(r*100);
			//System.out.println(obtener_mcd(n,36000));
		    int mcm = n*36000/obtener_mcd(n, 36000);
		    int res = (mcm/n);
		    System.out.println(res);
		}while(true);
	}
}
