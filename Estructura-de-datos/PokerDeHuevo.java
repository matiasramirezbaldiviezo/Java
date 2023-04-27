package OCTUBRE_15_ACTIVIDAD;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PokerDeHuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] v = new int[5];
        int[] ocurrencias = new int[6];
        int verificar = 0;
        for (int i = 0; i < v.length; i++) {

            v[i] = 4;

        }

        while (v[0] != 0 & v[1] != 0 & v[2] != 0 & v[3] != 0 & v[4] != 0) {
            verificar = 0;
            for (int i = 0; i < v.length; i++) {

                v[i] = entrada.nextInt();

            }
            //lenamos el vector con los valores 

            for (int i = 0; i < v.length + 1; i++) {
                int a, b;

                if (i == 4) {
                    a = v[i];
                    b = v[i - 4];
                    if (a == b) {
                        ocurrencias[a]++;
                    }
                } else if (i == 5) {
                    a = v[0];
                    b = v[i - 4];
                    if (a == b) {
                        ocurrencias[a]++;

                    }

                } else {

                    if (v[i] == v[i + 1]) {
                        a = v[i];
                        b = v[i + 1];
                        if (a == b) {
                            ocurrencias[a]++;
                        }
                    }

                }
            }
            for (int i = 0; i < ocurrencias.length; i++) {

                if (ocurrencias[i] == 3) {
                    verificar = 1;

                } else if (v[0] == 0 & v[1] == 0 & v[2] == 0 & v[3] == 0 & v[4] == 0) {
                    verificar = 2;

                }
            }

            if (verificar == 2) {

            } else if (verificar == 1) {
                System.out.println("Poquer de huevo");
            } else {
                System.out.println("No");
            }

        }

    }
}
