package MARZO_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModificandoStrings {

    public static void main(String[] args) throws IOException {

        //implementamos una claseBufeeredReader para la lectura de datos por teclado
       
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INGRESE LA CADENA ->");   
        String cadena = entrada.readLine();
        
        System.out.println("INGRESE EL DESPLAZAMIENTO ->");   
        int desplazamiento = Integer.parseInt(entrada.readLine());
        //recorremos la cadena y mostraremos su valor ASCII
        for (int i = 0; i < cadena.length(); i++) {
            int valor = cadena.charAt(i);

            System.out.println(cadena.charAt(i) + " Valor ASCII->" + valor);

        }

        
        for (int i = 0; i < cadena.length(); i++) {
            int valor = cadena.charAt(i);
            
            //se imprimira la cadena afectando solo las minusculas osea los valores ASCII
            if (valor >= 65 & valor <= 90) {

                char aux;
                //hago una conversion al tipo de variables char para poder mostralos
                if (valor + 1 > 90) {
                    aux = (char) (cadena.charAt(i) + desplazamiento - 26);
                } else {
                    aux = (char) (cadena.charAt(i) + desplazamiento);
                }
                System.out.print(aux);

            } else {
                System.out.print(cadena.charAt(i));
            }
        }

    }
}
