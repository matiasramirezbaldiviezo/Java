package Febrero_20;

public class Automovil {
    //Defino mis variables de instancia
    //para que la clase esté encapsulada debo definir mis atributos con el modificador private
    

    
    private String marca;
    private float cilindrada;
    private int modelo;
    
   

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.println("====================================");
        System.out.println("MARCA: " + this.getMarca());
        System.out.println("CILINDRADA: " + this.getCilindrada());
        System.out.println("MODELO: " + this.getModelo());
    }

}
