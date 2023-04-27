
package Febrero_27;


public class Rectangulo extends FiguraGeometrica {
    public double base;
    public double altura;
    
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ALTURA: =" + this.altura);
        System.out.println("BASE: =" + this.base);
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return this.altura*2 + this.base*2;
    }

   
}
