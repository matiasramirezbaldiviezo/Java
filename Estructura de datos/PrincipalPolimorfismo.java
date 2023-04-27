package Febrero_27;

public class PrincipalPolimorfismo {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Circunferencia c2 = new Circunferencia();
        Rectangulo r1 =new Rectangulo();
        c1.lado = 5;
        c1.perimetro = c1.calcularPerimetro();
        c1.area = c1.calcularArea();
        c1.mostrarDatos();
        c2.radio = 7;
        c2.area = c2.calcularArea();
        c2.perimetro = c2.calcularPerimetro();
        c2.mostrarDatos();
        r1.altura = 4;
        r1.base=9;
        r1.area = r1.calcularArea();
        r1.perimetro = r1.calcularPerimetro();
        r1.mostrarDatos();
    }
}
