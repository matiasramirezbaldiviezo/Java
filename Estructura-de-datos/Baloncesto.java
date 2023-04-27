
package Implementar_Polimorfismo;


public class Baloncesto extends Deporte{
    String equipoA;
    String equipoB;
    int anotacionesEquipoA;
    int anotacionesEquipoB;
    
    public void mostrarResultado() {
        System.out.println("====================================");
        System.out.println("Lakers Vs Chicago Bulls");
        System.out.println(this.anotacionesEquipoA + " Vs. " + this.anotacionesEquipoB);
        System.out.println("====================================");
    }
public void anotarcesto(int n) {
        if(n==1){
        this.anotacionesEquipoA=this.anotacionesEquipoA+1;
        }else {
        this.anotacionesEquipoB=this.anotacionesEquipoB+1;
        }

}
}
