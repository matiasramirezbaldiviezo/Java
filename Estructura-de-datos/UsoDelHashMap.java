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
		miHashMap.put(1,"Cálculo");
		miHashMap.put(3,"Albegra Lineal");
		miHashMap.put(7,"Programación I");
		miHashMap.put(4,"Estructura de Datos");
		miHashMap.put(5,"Inglés Técnico");
		miHashMap.put(2,"Lenguaje");
		miHashMap.put(10,"MicroEconomía");
		
		System.out.println(miHashMap.values());
		System.out.println(miHashMap.toString());
		Iterator it = miHashMap.keySet().iterator();
		while(it.hasNext())
		{
			Integer llave =(Integer) it.next();//con el método next() recorremos el iterador
			System.out.println("Llave->"+llave+" Valor-> "+miHashMap.get(llave));
		}
		Iterator it2 = miHashMap.keySet().iterator();
		for(int i=0; i<miHashMap.size() ;i++)
		{
			Integer llave =(Integer) it2.next();//con el método next() recorremos el iterador
			System.out.println("Llave->"+llave+" Valor-> "+miHashMap.get(llave));
		}	
		System.out.println(miHashMap.remove(15));
		System.out.println(miHashMap.remove(5));
		System.out.println(miHashMap.toString());
	}

}
