package Competencia;

import java.util.Scanner;

public class ProblemD {

    public static void main(String[] args) {
        int valores[] = new int[4];
        int sumas[]= new int [6];
        int aux=0;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scn.nextInt();
            //System.out.println(valores[i]);
        }
        
        for (int i=0 ;i<sumas.length;i++){
            
            for (int j=0;j<sumas.length;j++){
                sumas[i]=valores[j] + valores[j+1];
                System.out.println(sumas[i]);
                
            
            }
        
        }
        
       
        int sum1 = valores[0] + valores[1];
        int sum2 = valores[0] + valores[2];
        int sum3 = valores[0] + valores[3];
        int sum4 = valores[1] + valores[2];
        int sum5 = valores[1] + valores[3];
        int sum6 = valores[2] + valores[3];
        

        
        int menor=0;
        int resultado[] = new int[15];

        resultado[0] = Math.abs(sum1 - sum2);
        resultado[1] = Math.abs(sum1 - sum3);
        resultado[2] = Math.abs(sum1 - sum4);
        resultado[3] = Math.abs(sum1 - sum5);
        resultado[4] = Math.abs(sum1 - sum6);
        resultado[5] = Math.abs(sum2-sum3);
        resultado[6] = Math.abs(sum2-sum4);
        resultado[7] = Math.abs(sum2-sum5);
        resultado[8] = Math.abs(sum2-sum6);
        resultado[9] = Math.abs(sum3-sum4);
        resultado[10] = Math.abs(sum3-sum5);
        resultado[11] = Math.abs(sum3-sum6);
        resultado[12] = Math.abs(sum4-sum5);
        resultado[13] = Math.abs(sum4-sum6);
        resultado[14] = Math.abs(sum5-sum6);
        
        
        for(int i=0; i<resultado.length;i++){
  
            if(resultado[i]<=menor){
                menor=resultado[i];
            }
        }
        System.out.println(menor);

    }

}
