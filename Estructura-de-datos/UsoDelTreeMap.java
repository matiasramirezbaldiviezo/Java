package OCTUBRE_01;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class UsoDelTreeMap 
{
	public static void main(String[] args) 
	{
		//Se declara un objeto de la clase HashMap
		Map<Integer,String> miTreeMap= new TreeMap<Integer,String>();
		miTreeMap.put(1,"Cálculo");
		miTreeMap.put(7,"Programación I");
		miTreeMap.put(4,"Estructura de Datos");
		miTreeMap.put(5,"Inglés Técnico");
		miTreeMap.put(2,"Lenguaje");
		miTreeMap.put(10,"MicroEconomía");
		miTreeMap.put(2,"Lenguaje");//El TreeMap no admite duplicados
		miTreeMap.put(5,"Base de Datos");//Cuando ingresamos un valor diferente para una llave ya existente se reemplaza
		System.out.println(miTreeMap.values());
		System.out.println(miTreeMap.toString());
		Iterator it = miTreeMap.keySet().iterator();
		while(it.hasNext())
		{
			Integer llave =(Integer) it.next();//con el método next() recorremos el iterador
			System.out.println("Llave->"+llave+" Valor-> "+miTreeMap.get(llave));
		}
		System.out.println(miTreeMap.remove(5));
		System.out.println(miTreeMap.toString());
	}
}
