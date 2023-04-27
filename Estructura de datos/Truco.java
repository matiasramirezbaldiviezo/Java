package com.example.ejemplo_08_ps;

public class Truco {

    public class Carta
    {
    	int valor;
    	String palo;
    	int jerarquia;
    	String dirImagen;
    }
    Carta[] maso = new Carta[52];
    
    public Truco()
    {   int valor, palo;
        //Aqui se inicializan las cartas del juego
        for (int i = 0;i<40;i++)
        	maso[i] = new Carta();
		
        //SE INICIALIZA EL CARGADO RANDOMICO DE CARTAS
    	for (int i = 0;i<40;i++)
    	{
    		do
    		{
    			 valor = (int)(Math.random()*12)+1;
    			 palo = (int)(Math.random()*4)+1;
    		}while (verificaCarta(valor,palo));
    		
    		String simbolo;
        	if(palo == 1)
        		simbolo = "BASTOS";//alt 515
        	else if (palo == 2)
        		simbolo = "COPAS";//alt 516
        	else if (palo == 3)
        		simbolo = "OROS";//alt 517
        	else
        		simbolo = "ESPADAS";//alt 518
        	//OBTENGO LA JERARQUIA DE LA CARTA
        	int jerarquia = obtieneJerarquia(valor,simbolo);
        	//CONCATENO LA DIRECCION DE LA IMAGEN
        	String direccion = simbolo.toLowerCase()+"_"+valor+"s";
        	maso[i].valor = valor;
        	maso[i].palo = simbolo;
        	maso[i].jerarquia = jerarquia;
        	maso[i].dirImagen = direccion;
    	}
    }
    public boolean verificaCarta(int valor, int palo)
    {
    	String simbolo;
    	if(palo == 1)
    		simbolo = "BASTOS";//alt 515
    	else if (palo == 2)
    		simbolo = "COPAS";//alt 516
    	else if (palo == 3)
    		simbolo = "OROS";//alt 517
    	else
    		simbolo = "ESPADAS";//alt 518
    	if ((valor == 8)||(valor==9))
    		return true;
    	for (int i = 0;i<40;i++)
    	{
    		if((valor == maso[i].valor)&&(simbolo == maso[i].palo))
    			return true;
    	}
    	return false;
    }
    
    
    public void mostrarBaraja()
    {
    	for (int i=0; i<40; i++)
    		System.out.println("Carta "+(i+1)+"="+
    		this.maso[i].valor+" "+this.maso[i].palo+"("+this.maso[i].jerarquia+")->"+this.maso[i].dirImagen);
    	
    }
    public int obtieneJerarquia(int valor, String palo)
    {
    	if((valor == 1)&&(palo.equals("ESPADAS")))
    		return 1;
    	else if((valor == 1)&&(palo.equals("BASTOS")))
    		return 2;
    	else if((valor == 7)&&(palo.equals("ESPADAS")))
    		return 3;
    	else if((valor == 7)&&(palo.equals("OROS")))
    		return 4;
    	else if(valor == 3)
    		return 5;
    	else if(valor == 2)
    		return 6;
    	else if(valor == 1)
    		return 7;
    	else if(valor == 12)
    		return 8;
    	else if(valor == 11)
    		return 9;
    	else if(valor == 10)
    		return 10;
    	else if(valor == 7)
    		return 11;
    	else if(valor == 6)
    		return 12;
    	else if(valor == 5)
    		return 13;
    	else //if(valor == 4)
    		return 14;
    	
    }

}





