package Febrero_17;

public class Bicicleta {

    char tipo; //F femenino M Masculino X Mixto
    int nroRueda;
    float peso;
    String marca;
    boolean esDeCompetencia;

    public void mostrarDatos() {
        System.out.println("=======================================================");
        System.out.println("DIRECCION DE MEMORIA: " + this);
        System.out.println("MARCA: " + this.marca);
        System.out.println("TIPO (F FEMENINO, M MASCULINO, X MIXTO): " + this.tipo);
        System.out.println("PESO: " + this.peso + "KG.");
        System.out.println("NUMERO DE RUEDA: " + this.nroRueda);
        System.out.println("ES DE COMPETENCIA: " + this.esDeCompetencia);
    }

    //Voy a definir mi propio constructor
    public Bicicleta(String marca, char tipo, int rueda, float peso, boolean eC) {
        this.marca = marca;
        this.tipo = tipo;
        this.nroRueda = rueda;
        this.peso = peso;
        this.esDeCompetencia = eC;
    }

    public Bicicleta() {
        this.marca = "CALOY";
        this.tipo = 'M';
        this.nroRueda = 21;
        this.peso = 22;
        this.esDeCompetencia = false;
    }

    public Bicicleta(String marca) {
        this.marca = marca;
        this.tipo = 'M';
        this.nroRueda = 21;
        this.peso = 22;
        this.esDeCompetencia = false;
    }

    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("BENSON", 'F', 19, 15.35f, true);
        Bicicleta b2 = new Bicicleta();
        Bicicleta b3 = b1;
        //Si quiero inicializar un objeto con los mismos datos de otro objeto debo crearle su propio espacio 
        Bicicleta b4 = new Bicicleta();
        b4.marca = b1.marca;
        b4.nroRueda = b1.nroRueda;
        b4.peso = b1.peso;
        b4.tipo = b1.tipo;
        //Tanto b3 como b1 comparten el mismo segmento de memoria
        b1.mostrarDatos();
        b2.mostrarDatos();
        b3.tipo = 'M';
        b3.mostrarDatos();
        b1.mostrarDatos();
        b4.mostrarDatos();
    }

}
