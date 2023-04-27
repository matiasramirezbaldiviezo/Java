/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCTUBRE_29;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String x1, x2, p, p1;
        float x, y;
        Scanner sc = new Scanner(System.in);
        x1 = sc.next();
        x2 = sc.next();
        p = x1.replace(".", ",");
        p1 = x2.replace(".", ",");
        x = Float.parseFloat(x1);
        y = Float.parseFloat(x2);
        if (x > 0.0 && y > 0.0) {
            System.out.print("Q1");

        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");

        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");

        }
        else if (x == 0.0 && y !=0.0) {
            System.out.println("Eixo X");

        }

        else if (x > 0.0 || x!=0.0) {
            System.out.println("Eixo Y");

        } 
        else {
            System.out.println("Origem");
        }

    }

}
