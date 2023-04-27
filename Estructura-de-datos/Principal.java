package Implementar_Polimorfismo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 7, b = 4;

        boolean bandera = true;
        do {
            System.out.println("======================================");
            System.out.println("1. Escoger el tipo de juego (A.Futbol   B.Basquetbol )");
            System.out.println("2. Anotacion para el equipo A.");
            System.out.println("3. Anotacion para el equipo B.");
            System.out.println("4. Resultado Parcial.");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción - >");
            int opcion = entrada.nextInt();
            String x;
            //implementamos la escructura para switch
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la opcion de deporte");
                    String entrada2 = entrada.nextLine();

                    if (entrada2 == "A") {
                        x = "f";
                    
                        System.out.println("Se escogio Futbol");
                    } else {
                        x = "b";
                        System.out.println("Se escogio Baloncesto");
                    }
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    Deporte p2 = new Deporte();
                    p2.e2.anotarcesto(1);
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA!!!");
                    bandera = false;
                    break;
                default:
                    System.out.println("A ingresado una opción inválida, intente nuevamente");
            }
        } while (bandera);

    }

}
