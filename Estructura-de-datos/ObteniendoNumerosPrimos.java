package MARZO_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObteniendoNumerosPrimos {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el valor maximo de los Primos a calcular ->");
        int rangoMaximo = Integer.parseInt(entrada.readLine());
        int contadorPrimos=0;
        double tiempoInicial=System.currentTimeMillis();

        for (int i = 2; i <= rangoMaximo; i++) {
            int contador = 1;
            for (int j = 2; j <=Math.sqrt(i); j++) {

                //pregunto si el numero i es divisible entre j
                if (i % j == 0) {
                    i++;
                    break;
                }

            }
            if (contador == 1) {
                
                contadorPrimos++;
                //System.out.println("Primo " + i);
            }

        }
double tiempofinal =System.currentTimeMillis();
double tiempoensegundos=(tiempofinal-tiempoInicial/1000);
System.out.println("La cantidad de Primos es " +contadorPrimos+
                    "encontrado en "+ tiempoensegundos+" Seg.");
    }

}
