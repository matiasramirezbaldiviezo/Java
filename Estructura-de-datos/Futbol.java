package Implementar_Polimorfismo;

import java.util.Random;

public class Futbol extends Deporte {

    String equipoA;
    String equipoB;
    int anotacionesEquipoA;
    int anotacionesEquipoB;

    public void mostrarResultado() {
        System.out.println("====================================");
        System.out.println("Real Madrid Vs Liverpool");
        System.out.println(this.anotacionesEquipoA + " Vs. " + this.anotacionesEquipoB);
        System.out.println("====================================");
    }

    public void anotargol(int n) {
        if(n==1){
        this.anotacionesEquipoA=this.anotacionesEquipoA+1;
        }else {
        this.anotacionesEquipoB=this.anotacionesEquipoB+1;
        
        }

    }
}
