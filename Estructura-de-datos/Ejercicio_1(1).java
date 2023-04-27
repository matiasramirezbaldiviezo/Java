package Competencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio_1 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        n++;
        int valorascii;
        if (n > 0 & n <= 1000000) {
            while (n != 0) {
                i = 0;
                n--;
                String oracion = sc.nextLine();
                for (i = 0; i < oracion.length(); i++) {

                    if (oracion.charAt(i) == 113 && oracion.charAt(i + 1) == 117 ) {
                            i = oracion.length();
                    } else if (oracion.charAt(i) == 103 && oracion.charAt(i + 1) == 117 && oracion.charAt(i + 2) == 105) {
                        i = oracion.length();

                    } else if (oracion.charAt(i) == 103 && oracion.charAt(i + 1) == 117 && oracion.charAt(i + 2) == 101) {

                        i = oracion.length();

                    } else {
                        valorascii = oracion.charAt(i);

                        if (valorascii == 97 || valorascii == 101 || valorascii == 105 || valorascii == 111 || valorascii == 117) //nuevap[]=oracion.charAt(i);
                        {

                            System.out.print(oracion.charAt(i) + "p" + oracion.charAt(i));
                        } else {
                            System.out.print(oracion.charAt(i));
                        }

                    }

                }

            }

        }

    }

}
