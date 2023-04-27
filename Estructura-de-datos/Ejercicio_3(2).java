
package Ejercico1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio_3 {

    public static void decodificar(String cadena , int desplazamiento) {
        
         //recorremos la cadena y mostraremos su valor ASCII
        for (int i = 0; i < cadena.length(); i++) {
            int valor = cadena.charAt(i);

            System.out.println(cadena.charAt(i) + " Valor ASCII->" + valor);

        }
        
        for (int i = 0; i < cadena.length(); i++) {
            int valor = cadena.charAt(i);
            
            //se imprimira la cadena afectando solo las Mayusculas osea los valores ASCII
            if (valor >= 65 & valor <= 90) {

                char aux;
                //hago una conversion al tipo de variables char para poder mostralos
                //se resta el valor del desplazamiento para decodificar el texto
                if (valor + 1 > 90) {
                    aux = (char) (cadena.charAt(i) - desplazamiento - 26);
                } else {
                    aux = (char) (cadena.charAt(i) - desplazamiento);
                }
                System.out.print(aux);

            } else {
                System.out.print(cadena.charAt(i));
            }
        }

    

   
}

   
    public static void main(String[] args) throws IOException {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INGRESE LA CADENA QUE DESEE DECODIFICAR ->");   
        String cadena = entrada.readLine();
        
        System.out.println("INGRESE EL DESPLAZAMIENTO A LA IZQUIERDA->");   
        int desplazamiento = Integer.parseInt(entrada.readLine());
        decodificar(cadena,desplazamiento);
    }
    
}
