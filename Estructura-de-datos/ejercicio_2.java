
package Practica_3;

import java.util.Scanner;

/**
 *
 * @author Matias Y Rodrigo
 */
public class ejercicio_2 {
    
    public static String fila1 = "*.";
    public static String fila2 = "**";
    public static String fila3 = ".*";
    public static String fila4 = "..";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fila1sc,fila2sc,fila3sc;
        int casos= sc.nextInt();
        while(casos!=0){
        String letra = sc.nextLine();
        
        if(letra.equals("s")||letra.equals("S")){
            
            
            
           
        String numerosentrada = sc.nextLine();
        
        for(int i = 0; i < numerosentrada.length(); i++){
            char numero = numerosentrada.charAt(i);

          
                
                
                
            if(numero == '0'){
                System.out.println(fila3);
                System.out.println(fila2);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '1'){
                System.out.println(fila1);
                System.out.println(fila4);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '2'){
                System.out.println(fila1);
                System.out.println(fila1);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '3'){
                System.out.println(fila2);
                System.out.println(fila4);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '4'){
                System.out.println(fila2);
                System.out.println(fila3);
                System.out.println(fila4);
                System.out.println("==");
                casos--;
            }
           else if(numero == '5'){
                System.out.println(fila1);
                System.out.println(fila3);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '6'){
                System.out.println(fila2);
                System.out.println(fila1);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '7'){
                System.out.println(fila2);
                System.out.println(fila2);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if(numero == '8'){
                System.out.println(fila1);
                System.out.println(fila2);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
            }
            else if (numero == '9'){
                System.out.println(fila3);
                System.out.println(fila1);
                System.out.println(fila4);
                System.out.println("===");
                casos--;
                
            
            }
        }
        
        }else{
            
            fila1sc = sc.nextLine();
            fila2sc = sc.nextLine();
            fila3sc = sc.nextLine();
            if(fila1sc.equals(fila3)&fila2sc.equals(fila2)&fila3sc.equals(fila4)){
                System.out.println("0");
                casos--;
            }
            if(fila1sc.equals(fila1)&fila2sc.equals(fila4)&fila3sc.equals(fila4)){
                System.out.println("1");
                casos--;
            }
            if(fila1sc.equals(fila1)&fila2sc.equals(fila1)&fila3sc.equals(fila4)){
                System.out.println("2");
                casos--;
            }
            if(fila1sc.equals(fila2)&fila2sc.equals(fila4)&fila3sc.equals(fila4)){
                System.out.println("3");
                casos--;
            }
            if(fila1sc.equals(fila2)&fila2sc.equals(fila3)&fila3sc.equals(fila4)){
                System.out.println("4");
                casos--;
            }
            if(fila1sc.equals(fila1)&fila2sc.equals(fila3)&fila3sc.equals(fila4)){
                System.out.println("5");
                casos--;
            }
            if(fila1sc.equals(fila2)&fila2sc.equals(fila1)&fila3sc.equals(fila4)){
                System.out.println("6");
                casos--;
            }
            if(fila1sc.equals(fila2)&fila2sc.equals(fila2)&fila3sc.equals(fila4)){
                System.out.println("7");
                casos--;
            }
            if(fila1sc.equals(fila1)&fila2sc.equals(fila2)&fila3sc.equals(fila4)){
                System.out.println("8");
                casos--;
            }
            if(fila1sc.equals(fila3)&fila2sc.equals(fila1)&fila3sc.equals(fila4)){
                System.out.println("9");
                casos--;
            }
        }
        }
    }
}
    

