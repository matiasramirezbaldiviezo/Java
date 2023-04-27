
package Ejercicos_Abs_Heren_Encap;


public class Aereo extends MedioDeTransporte {
        //creo mi variable atributo
        private int potencia_de_despege;
        private double Tiempo_de_vuelo;

    public int getPotencia_de_despege() {
        return potencia_de_despege;
    }

    public void setPotencia_de_despege(int potencia_de_despege) {
        this.potencia_de_despege = potencia_de_despege;
    }

    public double getTiempo_de_vuelo() {
        return Tiempo_de_vuelo;
    }

    public void setTiempo_de_vuelo(double Tiempo_de_vuelo) {
        this.Tiempo_de_vuelo = Tiempo_de_vuelo;
    }
	
    
        
    public Aereo (int numero_de_llantas,int capacidad_de_gasolina,int capacidad_de_personas,String Modelo,double potencia_de_motor,int Potencia_de_despege,double Tiempo_de_vuelo)
	{
		super(numero_de_llantas, capacidad_de_gasolina, capacidad_de_personas, Modelo, potencia_de_motor);
		this.setPotencia_de_despege(Potencia_de_despege);
		this.setTiempo_de_vuelo(Tiempo_de_vuelo);
	}    
        
        
        
        
    public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("POTENCIA DE DESPEJE: "+this.getPotencia_de_despege() +"");
                System.out.println("TIEMPO DE VUELO : "+this.getTiempo_de_vuelo() +"HRS");    
                    
	}

    
}
