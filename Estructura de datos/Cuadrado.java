package Febrero_27;

public class Cuadrado extends FiguraGeometrica {
    //defino su variable atributo

    public double lado;

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("LADO: =" + this.lado);
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);//devuelvo el valor de el lado elevado al cuadrado
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
}
