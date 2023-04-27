
package Ejercicos_Abs_Heren_Encap;


public class MedioDeTransporte {
    
    private int numero_de_llantas;
    private int capacidad_de_gasolina;
    private int capacidad_de_personas;
    private String Modelo;
    private double potencia_de_motor;
    
    

    public int getNumero_de_llantas() {
        return numero_de_llantas;
    }

    public void setNumero_de_llantas(int numero_de_llantas) {
        this.numero_de_llantas = numero_de_llantas;
    }

    public int getCapacidad_de_gasolina() {
        return capacidad_de_gasolina;
    }

    public void setCapacidad_de_gasolina(int capacidad_de_gasolina) {
        this.capacidad_de_gasolina = capacidad_de_gasolina;
    }

    public int getCapacidad_de_personas() {
        return capacidad_de_personas;
    }

    public void setCapacidad_de_personas(int capacidad_de_personas) {
        this.capacidad_de_personas = capacidad_de_personas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPotencia_de_motor() {
        return potencia_de_motor;
    }

    public void setPotencia_de_motor(double potencia_de_motor) {
        this.potencia_de_motor = potencia_de_motor;
    }
    
    public void mostrarDatos(){
     System.out.println("===============================");
     if (this instanceof Terrestre )
     System.out.println("===============Terrestre=============");
     else if(this instanceof Aereo)
     System.out.println("===============AEREO=============");   
     
     
    System.out.println("CAPACIDAD DE GASOLINA :"+this.getCapacidad_de_gasolina() + "LTS");
    System.out.println("CAPACIDAD DE PERSONAS :"+this.getCapacidad_de_personas() );
    System.out.println("NUMERO DE LLANTAS :"+this.getNumero_de_llantas());
    System.out.println("POTENCIA DE MOTOR :"+this.getPotencia_de_motor() +"CABALLOS DE FUERZA" );
    }
   
    
    
    //Definimos el metodo constructor
    public MedioDeTransporte(int numero_de_llantas,int capacidad_de_gasolina,int capacidad_de_personas,String Modelo,double potencia_de_motor)
    {
    this.setNumero_de_llantas(numero_de_llantas);
    this.setCapacidad_de_gasolina(capacidad_de_gasolina);
    this.setCapacidad_de_personas(capacidad_de_personas);
    this.setModelo(Modelo);
    this.setPotencia_de_motor(potencia_de_motor);
    }
    public static void main(String[] args) {
        
                Terrestre t1 = new Terrestre(4,300,6,"camioneta",145.8,"Manual",true);
		t1.mostrarDatos();
		Aereo a1 =  new Aereo(32,2000,200,"Avion_Comercial",864.7,1200,90.4);
		a1.mostrarDatos();
        
    }
    
}
