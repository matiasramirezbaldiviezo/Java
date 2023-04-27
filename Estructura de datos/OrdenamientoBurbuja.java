/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.TareaProgramacion;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class OrdenamientoBurbuja {

  public int[] generar(int tam, int a, int b) {
        Random azar = new Random();

        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = a + azar.nextInt(b - a);
        }
         Medida m = ordBurbuja(v);
 
        System.out.println("Tiempo " + m.tiempo);
        System.out.println("Comparaciones " + m.comparaciones);
        System.out.println("Intercambios " + m.intercambios);
        return v;
    }

    private void intercambiar(int a[], int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
public static Medida ordBurbuja(int a[]) {

        Medida m = new Medida();
        long tiempo1 = System.currentTimeMillis();
           System.out.println("desordenado: "); 
        for(int i=0; i<a.length; i++) 
           System.out.print( a[i]+" " );
        int aux;
        for(int i=1; i<=a.length; i++) { 
            for(int j=0; j<a.length-i; j++) { 
                if( a[j] > a[j+1] ) { 
                m.comparaciones++;
                    aux   = a[j]; 
                    a[j]  = a[j+1];
                m.intercambios++;    
                    a[j+1]= aux; 
}
            }
        
            
        }
      System.out.println("\nordenado: "); 
        for(int i=0; i<a.length; i++) 
            System.out.print( a[i]+" " );  
      long tiempo2 = System.currentTimeMillis();
        
        m.tiempo = tiempo2 - tiempo1;
        return m;
}   

    public String vectorToString(int a[]){
        String s = "";
        
        for(int i=0; i< a.length; i++){
            s = s + a[i];
            
            if(i< a.length -1){
                s = s +", ";
            }
        }
        return s + "\n";
    }  

    void intercambio(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
