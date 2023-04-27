package Practica_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class calentamiento {

    public static void main(String[] args) throws IOException {

        Double x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String p=sc.nextLine();
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        

      //  x=br.readLine();
       
        if (x > 0.0 && y > 0.0) {
            System.out.print("Q1");

        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q2");

        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q4");

        } else if (x == 0.0 && y > 0.0) {
            System.out.println("Eixo X");

        }
        else if (x> 0.0 && y ==0.0) {
            System.out.println("Eixo Y");

        }
        else
        {
        System.out.println("Origem");
        }

    }

}
