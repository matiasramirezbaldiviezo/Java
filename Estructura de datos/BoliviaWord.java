/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCTUBRE_08_Tarea;
import java.util.Scanner;

public class BoliviaWord {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        int cont = 0;
        do {
            String palabra = entrada.next();
            int[] ocurrencias = new int[27];//
            //
            //
            for (int i = 0; i < palabra.length(); i++) {
                int valorASCII = palabra.charAt(i);
                //System.out.println("Caracter -> " + palabra.charAt(i) + " valor ASCII -> " + valorASCII);
                ocurrencias[valorASCII - 65]++;
            }
            cont++;
            /*
            for (int i = 0; i < ocurrencias.length; i++) {
                System.out.println("Ocurrencias [" + i + "]=" + ocurrencias[i]);
            }
             */
            if (ocurrencias[1] > 0 & ocurrencias[14] > 0 & ocurrencias[11] > 0 & ocurrencias[8] > 0 & ocurrencias[21] > 0 & ocurrencias[8] > 0 & ocurrencias[0] > 0) {
                System.out.println("ES POSIBLE");
            } else {
                System.out.println("NO ES POSIBLE");
            }
        } while (cont < casos);

    }

}