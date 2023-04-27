
package Competencia;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio_2 {

    
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        int n =entrada.nextInt();
        int []v=new int[n];
        int sumatotal=entrada.nextInt();
        int[] ocurrencias = new int[n];
        for (int i= 0 ;i<v.length;i++){
        v[i]=entrada.nextInt();
            System.out.print(v[i]+ " ");
        }
        
        
            
            

    }
    
}
