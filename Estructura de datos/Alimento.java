
package Febrero_20;


public class Alimento {
    private String Nombre;
    private String tipo;
    private float peso;
    private int cantidad_de_alimento;

     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
        return peso;
    }

    
    public int getCantidad_de_alimento() {
        return cantidad_de_alimento;
    }

    public void setCantidad_de_alimento(int cantidad_de_alimento) {
        this.cantidad_de_alimento = cantidad_de_alimento;
    }

    public void mostrardatos(){
        System.out.println("====================================");
        System.out.println("NOMBRE: " + this.getNombre());
        System.out.println("PESO: " + this.getPeso()+" gr");
        System.out.println("TIPO DE ALIMENTO: " + this.getTipo());
        System.out.println("CANTIDAD DE PRODUCTOS: " + this.getCantidad_de_alimento());
    }
}
