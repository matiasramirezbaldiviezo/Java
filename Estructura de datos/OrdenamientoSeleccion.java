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
public class OrdenamientoSeleccion {

  public int[] generar(int tam, int a, int b) {
        Random azar = new Random();

        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = a + azar.nextInt(b - a);
        }
         Medida m = ordenarSeleccion(v);
 
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
 public  Medida ordenarSeleccion(int v[]) {
        
        Medida medida = new Medida();
        long inicio =  System.currentTimeMillis();
             

        int posMenor;

        for (int i = 0; i < v.length - 1; i++) {
            posMenor = i;

            for (int j = i + 1; j < v.length; j++) {
                
                if(v[j] < v[posMenor]){
                 medida.comparaciones++;
                    posMenor = j;
                }
            }
            
            if(i != posMenor){
                medida.intercambios++;
                this.intercambiar(v, i, posMenor);
            }            
        }
        
        long fin =  System.currentTimeMillis();
        
        medida.tiempo = fin - inicio;
        
        return medida;
    }

    String vectorToString(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void intercambio(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
