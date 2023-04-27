package Febrero_27;

public class Circunferencia extends FiguraGeometrica {
    //definimos la variable miembro

    public double radio;

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("RADIO: =" + this.radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * this.radio;
    }
}
