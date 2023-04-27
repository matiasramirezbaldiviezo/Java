package OCTUBRE_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsoDelHashMap 
{
	public static void main(String[] args) 
	{
		//Se declara un objeto de la clase HashMap
		Map<Integer,String> miHashMap= new HashMap<Integer,String>();
		miHashMap.put(1,"C�lculo");
		miHashMap.put(3,"Albegra Lineal");
		miHashMap.put(7,"Programaci�n I");
		miHashMap.put(4,"Estructura de Datos");
		miHashMap.put(5,"Ingl�s T�cnico");
		miHashMap.put(2,"Lenguaje");
		miHashMap.put(10,"MicroEconom�a");
		
		System.out.println(miHashMap.values());
		System.out.println(miHashMap.toString());
		Iterator it = miHashMap.keySet().iterator();
		while(it.hasNext())
		{
			Integer llave =(Integer) it.next();//con el m�todo next() recorremos el iterador
			System.out.println("Llave->"+llave+" Valor-> "+miHashMap.get(llave));
		}
		Iterator it2 = miHashMap.keySet().iterator();
		for(int i=0; i<miHashMap.size() ;i++)
		{
			Integer llave =(Integer) it2.next();//con el m�todo next() recorremos el iterador
			System.out.println("Llave->"+llave+" Valor-> "+miHashMap.get(llave));
		}	
		System.out.println(miHashMap.remove(15));
		System.out.println(miHashMap.remove(5));
		System.out.println(miHashMap.toString());
	}

}
