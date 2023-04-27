/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MARZO_13;

/**
 *
 * @author Matias
 */
public class CribaEratostenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
            int n = 5000000;
            //definimos un vector de tamaño n, que se inicializará con ceros
            int[] criba = new int[n];
            double tiempoInicial = System.currentTimeMillis();
            //iniciamos el algoritmo para encontrar los valores de la criba
            for (int i = 2; i <= Math.sqrt(n); i++) {
                //preguntamos si el valor del sub indice consultado es cero
                if (criba[i] == 0) {
                    //debemos convertir en 1 todos los subindices que son múltiplos de i
                    for (int j = i * 2; j < n; j = j + i) {
                        criba[j] = 1;
                    }
                }
            }
            //mostramos los valores que de los subindices que tienen un valor cero, 
            //esos serán los números primos 
            int contador = 0;
            for (int i = 2; i < n; i++) {
                if (criba[i] == 0) {
                    contador++;
                }
            }
            //System.out.println(i);
            double tiempoFinal = System.currentTimeMillis();
            double tiempoEnSegundos = (tiempoFinal - tiempoInicial) / 1000;
            System.out.println("La cantidad de Primos es " + contador
                    + " encontrado en " + tiempoEnSegundos + " Seg.");
        }

    }


