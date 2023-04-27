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
public class OrdenamientoInsercion {

  public int[] generar(int tam, int a, int b) {
        Random azar = new Random();

        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = a + azar.nextInt(b - a);
        }
         Medida m = ordInsercion(v);
 
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
public static Medida ordInsercion(int a[]) {

        int i, j, aux;
        Medida m = new Medida();
        long tiempo1 = System.currentTimeMillis();

        for (i = 1; i < a.length; i++) {
            
            j = i;
            aux = a[i];
            
            while(j > 0 && a[j-1] > aux){
                m.comparaciones++;
                m.intercambios++;
                
                a[j] = a[j - 1];
                j--;
            }
            
            a[j] = aux;
            m.intercambios++;
            
        }
        
        long tiempo2 = System.currentTimeMillis();
        
        m.tiempo = tiempo2 - tiempo1;
        return m;

    }

    String vectorToString(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void intercambio(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
