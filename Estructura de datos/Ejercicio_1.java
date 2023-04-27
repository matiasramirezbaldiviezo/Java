package Examen_Final_Estructura_de_datos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Matias
 */

public class Ejercicio_1 {

    private static void procesarSolucion(Vector a) {
        System.out.println(a);
    }

    public static boolean esSolucion(int posicionActual) {
        // cuando se llego al final del vector
        // no se puede seguir iterando
        return (posicionActual == 0);
    }

    private static void permutar(Vector auxiliar, Vector original) {
        int N = original.size();
        if (esSolucion(N)) {
            procesarSolucion(auxiliar);
        } else {
            for (int i = 0; i < N; i++) {
                String proximo = (String) original.remove(i);
                auxiliar.add(proximo);
                permutar(auxiliar, original);
                original.add(i, proximo);
                auxiliar.remove(proximo);
            }
        }
    }

    public static char[] ordenar(char[] palabra) {
        Arrays.sort(palabra);

        return (palabra);
    }

    public static void imprimir(char[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
        }

    }

    public static String[] convertir_a_String(char[] palabra) {

        String[] retorno = new String[palabra.length];

        for (int i = 0; i < palabra.length; i++) {
            retorno[i] = String.valueOf(palabra[i]);
        }
        return (retorno);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n = 0;
        n = sc1.nextInt();
        while (n != 0) {
            Vector v = new Vector();
            String palabra = sc.nextLine();
            char[] a = new char[palabra.length()];

            for (int i = 0; i < palabra.length(); i++) {
                a[i] = palabra.charAt(i);
            }
            char[] caracter = ordenar(a);
            String[] x = convertir_a_String(caracter);
            for (int i = 0; i < a.length; i++) {
                String s = x[i];
                v.add(s);
            }
            permutar(new Vector(), v);
            n--;
        }
    }
}
