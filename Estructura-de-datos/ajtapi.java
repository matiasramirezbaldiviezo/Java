package octubre_15_ACTIVIDAD;
import java.util.Scanner;


/**
 *
 * @author Matias
 */
public class ajtapi 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        Scanner entra = new Scanner(System.in);
        String programador [][] = new String [n][2];
        for(int i = 0; i < programador.length ;i++ )
        {
            for(int j = 0 ; j < 2 ; j++)
            {
            programador[i][j] = entra.next();
            }
        }
        int prueba = 0;
	for (int i = 0; i < (1<<n); i++)
	{
            int[] A = new int[27];
            int m = 1; 
            for (int j = 0; j < n; j++)
            {
                int aux = 0;
		if((i & m)>0)
                    aux=1;
                String palabra = programador[j][aux];
                                                    
		for (int u = 0; u<palabra.length(); u++)
                {
                    int valorASCII = palabra.charAt(u);
                    A[valorASCII-65]++;
		}                                    
            m = m << 1;
            }
            if(A[0]>0&A[4]>0&A[8]>0&A[14]>0&A[20]>0)
            {System.out.println("EXISTE");
            prueba++;
            break;
            }
        }
        if(prueba==0)
            System.out.println("NO EXISTE");
		
    }
}
