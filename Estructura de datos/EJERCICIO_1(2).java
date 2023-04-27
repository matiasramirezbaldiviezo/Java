package OCTUBRE_08_Tarea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Matias
 */
public class EJERCICIO_1 {

    // Algoritmo de Euclides
    public static int mcd(int x, int y) {
        int a, b;

        a = x;
        b = y;
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;

            }
        }
        return (a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el numero normal");
        String str = lector.readLine();
        int n = Integer.parseInt(str.substring(0, str.indexOf('.')));
        int dn = Integer.parseInt(str.substring(str.indexOf('.') + 1));
        int res = n *100 + dn;
        int m = 36000;
        int Resultado = (m) / (mcd(res, m));
        System.out.println(Resultado);
           
    }

}