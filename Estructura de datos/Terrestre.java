
package Ejercicos_Abs_Heren_Encap ;

/**
 *
 * @author Matias
 */
public class Terrestre extends MedioDeTransporte {
    //creo mi variable atributo
    private String Tipo_de_Transmision;
    private boolean tiene_GNV;
    

    public String getTipo_de_Transmision() {
        return Tipo_de_Transmision;
    }

    public void setTipo_de_Transmision(String Tipo_de_Transmision) {
        this.Tipo_de_Transmision = Tipo_de_Transmision;
    }

    public boolean isTiene_GNV() {
        return tiene_GNV;
    }

    public void setTiene_GNV(boolean tiene_GNV) {
        this.tiene_GNV = tiene_GNV;
    }
    
    public Terrestre (int numero_de_llantas,int capacidad_de_gasolina,int capacidad_de_personas,String Modelo,double potencia_de_motor,String Tipo_de_Transmision,boolean tiene_GNV)
	{
		super(numero_de_llantas, capacidad_de_gasolina, capacidad_de_personas, Modelo, potencia_de_motor);
		this.setTipo_de_Transmision(Tipo_de_Transmision);
		this.setTiene_GNV(tiene_GNV);
	}
    
    
    
    //se sobre rescribe el método para mostrar sus datos propios
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("CANTIDAD DE CAMBIOS: "+this.getTipo_de_Transmision());
                if(this.isTiene_GNV() ==true)
                System.out.println("TIENE GNV: SI ");    
                else
                System.out.println("TIENE GNV: NO ");    
                    
	}

    
}
