

package Practica_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Matias y  Rodrigo
 */
public class ejercicio_3 {

    
    
    public static void main(String[] args) throws IOException {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String palabra="0";
         int aux=0;
         int letra=0;
         int posicion=0;
         int verificador=0;
         do{
             
         palabra = br.readLine();
         for(int i=0 ;i<palabra.length()-1 ;i++){
             posicion=palabra.charAt(i);
             verificador=palabra.charAt(i+1);
         if (i==0){
             letra = palabra.charAt(i);
             
         }
         else if(posicion==32)
         {
          if(verificador==letra)
              aux=1;
          else
              aux=0;
             
          }
         
         
         
         }
         
         if(aux==1){
         System.out.println("Y");
         
         }
         else
             System.out.println("N");
          
          
         }
         
         
         while(!palabra.equals("*"));
         
         

        
        
        
    }
    
}
