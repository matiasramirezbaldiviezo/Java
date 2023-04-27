package Ejercico1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1 {

    public static void main(String[] args) throws IOException {
        //se pide numeros al usuario 
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int [] r = new int[1000];
        r[0] = Integer.parseInt(sc.readLine());
        r[1]= Integer.parseInt(sc.readLine());
        int i = 1;
       
        //se crea un bucle para poder hacer que la estructura se repita hasta encontra el mcd
        int a=r[0] ;
        int b=r[1] ;
        while (r[i]!=0){
            r[i+1]=r[i-1] % r[i] ;
            i++;
            
            
            
            
            
        }
        int resultado = r[i-1];
        
        //se imprime el resultado
        System.out.println("El maximo comun divisor es :" +resultado);
    }
       

}
