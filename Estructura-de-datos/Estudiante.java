package Febrero_20;

import java.util.ArrayList;

public class Estudiante {
    //defino mis variables de instancia

    String nombreCompleto;
    char genero;
    float estatura;
    Fecha diaNacimiento;
    ArrayList<Persona> familia;
    //aqui implementa la abstraccion de datos para definir como estara compuesta una fecha

    static class Fecha {

        int dia;
        int mes;
        int anio;
    }

    static class Persona {

        String nombre;
        String tipo;
    }

    public void mostrarDatos() {
        System.out.println("====================================");
        System.out.println("ESTUDIANTE: " + this.nombreCompleto);
        System.out.println("GENERO: " + this.genero);
        System.out.println("ESTATURA: " + this.estatura + " Mts.");
        //System.out.println("FECHA DE NACIMIENTO: "+this.diaNacimiento);
        System.out.println("FECHA DE NACIMIENTO: " + this.diaNacimiento.dia + "/"
                + this.diaNacimiento.mes + "/" + this.diaNacimiento.anio);
    }

    //Genero el m彋odo Constructor para la clase Estudiante
    public Estudiante(String nombre, char genero, float estatura, int d, int m, int a) {
        this.nombreCompleto = nombre;
        this.genero = genero;
        this.estatura = estatura;
        this.diaNacimiento = new Fecha();
        this.diaNacimiento.dia = d;
        this.diaNacimiento.mes = m;
        this.diaNacimiento.anio = a;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("NAOMI OSAKA", 'F', 1.73F, 3, 4, 2001);
        e1.mostrarDatos();
        Estudiante e2 = new Estudiante("ROGER FEDERER", 'M', 1.83F, 12, 9, 1981);
        e2.mostrarDatos();
    }

}
