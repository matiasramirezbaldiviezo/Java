package OCTUBRE_01;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UsoDelLinkedHashMap {

    public static void main(String[] args) {
        Map<Integer, String> miLinkedHashMap = new LinkedHashMap<Integer, String>();
        miLinkedHashMap.put(1, "BMW");
        miLinkedHashMap.put(8, "FERRARI");
        miLinkedHashMap.put(3, "LAMBORGINI");
        miLinkedHashMap.put(7, "TOYOTA");
        miLinkedHashMap.put(2, "RENAULT");
        miLinkedHashMap.put(4, "TOYOTA");
        System.out.println(miLinkedHashMap.values());
        System.out.println(miLinkedHashMap.toString());
        System.out.println(miLinkedHashMap.get(7));//al no estar ordenado la b�squeda es ineficiente
        Iterator it = miLinkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer llave = (Integer) it.next();//con el m�todo next() recorremos el iterador
            System.out.println("Llave->" + llave + " Valor-> " + miLinkedHashMap.get(llave));
        }
        System.out.println(miLinkedHashMap.toString());

    }

}
