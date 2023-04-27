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
public class OrdenamientoIntercambio {
  public int[] generar(int tam, int a, int b) {
        Random azar = new Random();

        int v[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            v[i] = a + azar.nextInt(b - a);
        }
        return v;
    }

    void intercambiar(int a[], int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public void intercambio(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    this.intercambiar(a, i, j);
                }
            }
        }
    }
    
    public static String vectorToString(int a[]){
        String s = "";
        
        for(int i=0; i< a.length; i++){
            s = s + a[i];
            
            if(i< a.length -1){
                s = s +", ";
            }
        }
        return s + "\n";
    }  

}
