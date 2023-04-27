package Algoritmo_Operativa2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class EOQ_con_restricciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de artículos");
        int x = sc.nextInt();
        int[] k = new int[x];
        int[] d = new int[x];
        double[] h = new double[x];
        double[] a = new double[x];
        double ATotal;
        double[] YiS = new double[x];
        double[] YiC = new double[x];
        double λ = 0;
        double YiSTotal = 0;
        double YiCTotal = 0;
        double totalS = 0;
        double totalC = 0;
        double[] MultS = new double[x];
         double[] MultC = new double[x];
        
       
        int n=0;
        int p=0;

        for (int i = 0; i < x; i++) {
            System.out.println("Ingrese el costo K "+(i+1) );
            k[i] = sc.nextInt();
            System.out.println("Ingrese el costo de la demanda D " +(i+1));
            d[i] = sc.nextInt();
            System.out.println("Ingrese H "+(i+1));
            h[i] = sc.nextDouble();
            System.out.println("Ingrese a "+(i+1));
            a[i] = sc.nextDouble();
        }
        System.out.println("Ingrese el Límite Total Pedida");
        ATotal = sc.nextDouble();
        totalC = ATotal + 1;
        System.out.println("Articulo    K      D       H       a");
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1 + "          " + k[i] + "     " + d[i] + "       " + h[i] + "    " + a[i]);
            ;

        }
        System.out.println("Esta es la forma para hallar el Y optimo sin restricción");
        System.out.println("        ______");
        System.out.println("yiS=   / 2KD");
        System.out.println("      / ______");
        System.out.println("     V    H    ");

        for (int i = 0; i < x; i++) {
            YiS[i] = (double) Math.sqrt((2 * k[i] * d[i]) / h[i]);
            System.out.println("        ______________________________");
            System.out.println("       /  2 *" + k[i] + " * " + d[i]);
            System.out.println("yi=   /_______________________________" + "        =" + YiS[i]);
            System.out.println("     V     " + h[i] + "   ");
        }

        for (int i = 0; i < x; i++) {
            YiSTotal = YiS[i] + YiSTotal;
        }
        System.out.println("La suma total de Yi sin restricción es: ");
        System.out.println(YiSTotal);

        for (int i = 0; i < x; i++) {
            MultS[i] = YiS[i] * a[i];
        }

        for (int i = 0; i < x; i++) {
            totalS = MultS[i] + totalS;
        }
        System.out.println("La suma total de Yi*ai sin restricción es: ");
        System.out.println(totalS);

        if (totalS > ATotal) {
            System.out.println(totalS + " > " + ATotal);
            System.out.println("Considerando que que la suma total de areas sobrepasa el limite");
            System.out.println("utilizamos la formula de y optimo con restriccion");
            System.out.println("Esta es la forma para hallar el Y optimo con restricción");
            System.out.println("        ________");
            System.out.println("yiS=   / 2KiDi");
            System.out.println("      / ________");
            System.out.println("     V   Hi-2λai  ");
        } else {
            System.out.println(totalS + " < " + ATotal);
            System.out.println("Considerando que que la suma total de areas no sobrepasa el limite");
            System.out.println("entonces los valores de y si son optimos y no sobrepasan el limite");
        }

        
        
        while(n==0){
          System.out.println("Ingresar el valor lambda");  
          λ=sc.nextDouble();
          for (int i = 0; i < x; i++) {
                YiC[i] = Math.sqrt((2 * k[i] * d[i]) / (h[i] - 2 * (λ * a[i])));
        
        }
           for (int i = 0; i < x; i++) {
           
            YiCTotal = YiC[i] + YiCTotal;
        }
           System.out.println("La suma total de Yi con restricción es: "+YiCTotal);
        for (int i = 0; i < x; i++) {
                MultC[i] = YiC[i] * a[i];
            }
        
        for (int i = 0; i < x; i++) {
            totalC = MultC[i] + totalC;
        }
        System.out.println("La suma total de las multiplicaciones es = "+totalC);
            System.out.println(totalC+"<"+ATotal);
            System.out.println("Es aproximado?      SI=1   Y NO=0 "  );
            p=sc.nextInt();
            if(p==1){
            n=1;
            
            } 
            else
                n=0;
                λ=0;
    }
        
      
            
            
            
            
            
            
        if (totalC <ATotal) {
        System.out.println("El valor λ para este ejercicio es :" + λ);
        }
  
        
        
              
        for (int i = 0; i < x; i++) {

            System.out.println("         ______________________________");
            System.out.println("        /  2 *" + k[i] + " * " + d[i]);
            System.out.println("yiC=   /_______________________________" + "        =" + YiC[i]);
            System.out.println("     V     " + h[i] + "-2*" + λ + "*" + a[i]);
        }

        System.out.println("Realizamos sumatoria total de la multiplicacion de y optima con restriccion ");
        System.out.println("* el valor de su area");
        System.out.println("para poder realizar la comparacion con el limite ");
        for (int i = 0; i < x; i++) {
            System.out.println((i+1)+" producto ="+YiC[i]+"*"+a[i]+" = "+YiC[i]);
            

        }
        System.out.println("La suma total es = "+totalC);
        System.out.println(totalC+"<"+ATotal);
        

    }

}
