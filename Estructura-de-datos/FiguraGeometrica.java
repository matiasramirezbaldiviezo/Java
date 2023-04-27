package Febrero_27;

abstract public class FiguraGeometrica {
    //Definimos las variables atributo

    public double perimetro;
    public double area;
    //implementamos su modo para mostrar Datos

    public void mostrarDatos() {
        System.out.println("====================================");
        if (this instanceof Cuadrado) {
            System.out.println("==============CUADRADO==============");
        } else if (this instanceof Circunferencia) {
            System.out.println("===========CIRCUNFERENCIA===========");
        
        }else if (this instanceof Rectangulo){
         System.out.println("===========RECTANGULO===========");
        }
        System.out.println("AREA: =" + this.area + " u2");
        System.out.println("PERIMETRO: =" + this.perimetro + " u");
        
    }
    //cuando le aumento el modificador abstract a un modo de la clase padre, le obligo a la clase hija a implementarlo
    //si defino meodos abstractos la clase tambien debe ser definida abstracta

    abstract public double calcularArea();

    abstract public double calcularPerimetro();

}
