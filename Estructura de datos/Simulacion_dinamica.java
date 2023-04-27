
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author matix-Matias
 */
public class Simulacion_dinamica {
    
    static int calcular_demanda(){
        int demanda=0;
        Double demanda_aleatorio=Math.random();
        if(demanda_aleatorio<0.05 )
            demanda=1;
        else if(demanda_aleatorio>=0.05 && demanda_aleatorio<0.30)
            demanda=2;
        else if(demanda_aleatorio>=0.30 && demanda_aleatorio<0.65)
            demanda=3;
        else if(demanda_aleatorio>=0.65 && demanda_aleatorio<0.85)
            demanda=4;
        else
            demanda=5;
                    
        
        
    return demanda;
    }

    static int calcular_dias_esperas(){
        int dias=0;
        Double dias_aleatorio=Math.random();
        if(dias_aleatorio>=0.0 && dias_aleatorio<0.20 )
            dias=2;
        else if(dias_aleatorio>=0.20 && dias_aleatorio<0.70)
            dias=3;
        else if(dias_aleatorio>=0.70 && dias_aleatorio<0.90)
            dias=4;
        else
            dias=5;
        
    return dias;
    }
    
      



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //Variables controlables
        int almacen_inicio = 15;
        int almacen_final = almacen_inicio;
        Boolean cuando_pedir = false;
        int simulaciones = sc.nextInt();
        int limite=sc.nextInt();
        int cuanto_pedir=10;

        //Variables no controlables
        int faltantes = 0;
        int dia_llegada = 0;


       

        //Definimos cantidad de simulaciones
       
        int demanda[] = new int[simulaciones];
        for (int i = 0; i < simulaciones; i++) {
            demanda[i] =calcular_demanda() ;
            
        }
        

        System.out.println("Semana         Inventario Inicial            Demanda          Inventario Final              Ventas Perdidas               Dia Llegada  ");

        for (int i = 0; i < simulaciones; i++) {
            //Preguntamos si hay pedido pendiendte
            if (cuando_pedir == false) {
                if (i == 0) {
                    almacen_final = almacen_inicio - demanda[i];
                    System.out.println((i + 1) + "                     " + almacen_inicio + "                         " + demanda[i] + "                     " + almacen_final + "                              " + faltantes + "                        "+"0");
                    almacen_inicio=almacen_final;
                } else if ((almacen_final - demanda[i]) > limite) {
                    almacen_inicio = almacen_final;
                    almacen_final = almacen_final - demanda[i];
                    System.out.println((i + 1) + "                     " + almacen_inicio + "                         " + demanda[i] + "                     " + almacen_final + "                              " + faltantes + "                        "+"0");
                     almacen_inicio = almacen_final;
                   
                } else if ((almacen_inicio - demanda[i]) <= limite) {
                    dia_llegada=0;
                    cuando_pedir = true;
                    int tiempo_llegar =calcular_dias_esperas();
                    dia_llegada = i + tiempo_llegar;
                    
                     almacen_inicio = almacen_final;
                     almacen_final=almacen_inicio-demanda[i];
                     
                    faltantes = demanda[i];
                    System.out.println((i + 1) + "                       " + almacen_inicio + "                         " + demanda[i] + "                     " + almacen_final + "                              " + faltantes + "                        "+(dia_llegada+1));
                     almacen_inicio = almacen_final;
                    faltantes = 0;
                    
                    
                    

                }

            } else {
                faltantes = demanda[i];
                if (dia_llegada + 1 == (i + 1)) {
                    almacen_inicio = almacen_final + cuanto_pedir;
                    almacen_final = almacen_inicio - demanda[i];
                    cuando_pedir = false;
                    faltantes = 0;

                }

                    System.out.println((i + 1) + "                       " + almacen_inicio + "                         " + demanda[i] + "                     " + almacen_final + "                              " + faltantes + "                        "+"0");
                faltantes = 0;

            }

        }

    }
   

}

