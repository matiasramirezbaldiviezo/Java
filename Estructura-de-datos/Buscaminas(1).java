/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucb.juegos.buscaminas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class Buscaminas {

    public int[][] juego;
    public char[][] minas;
    
    public static final int PERDIDO = -1;
    public static final int GANADO = 1;
    public static final int CONTINUA = 0;
    
    //Marca la posición como bomba
    public void marcar(int f, int c){
        this.juego[f][c] = 2;
    }
    
    
    public int jugar(int f, int c){
        
        if(this.juego[f][c] == 0){
            
            //destapar
            this.juego[f][c] = 1;
            
            //verifica si era bomba
            if(this.minas[f][c] == 'B'){
                this.perdido();
                return PERDIDO;
            }
            
            //verifica si ganó
            //------------------
            int ceros = 0;
            //cuenta los ceros
            for(int i=0; i<10; i++){
                for(int j=0; j<10; j++){
                    if(this.juego[i][j] == 0){
                        ceros++;
                    }
                }
            }            
            //si ya no hay ceros ganó
            if(ceros == 0){
                this.ganado();
                return GANADO;
            }
            
        } 
        
        return CONTINUA;
    }
    
    
    public void perdido(){
        JOptionPane.showMessageDialog(null, "Game Over");
    }

    public void ganado(){
        JOptionPane.showMessageDialog(null, "Win");
    }

    
    public void inicializar() {
        //crea la matriz
        this.minas = new char[10][10];
        this.juego = new int[10][10];

        //llena la matriz de 0
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.minas[i][j] = '0';
                this.juego[i][j] = 0;
            }
        }

        //llenar bombas
        int bombas = 10;
        Random azar = new Random();
        int i, j;

        while (bombas > 0) {
            //genera una posición i,j al azar
            i = azar.nextInt(10);
            j = azar.nextInt(10);

            //si la posición i,j esta vacía (0) pone la bomba 
            //y descuenta el contador
            if (this.minas[i][j] == '0') {
                this.minas[i][j] = 'B';
                bombas = bombas - 1;
            }
        }

        //contar las bombas y poner los valores en minas
        int numBombas;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {

                if (this.minas[f][c] != 'B') {

                    numBombas = 0;
                    //cuenta las bombas alrededor de f,c
                    numBombas = numBombas + this.cuentaBomba(f - 1, c - 1);
                    numBombas = numBombas + this.cuentaBomba(f - 1, c);
                    numBombas = numBombas + this.cuentaBomba(f - 1, c + 1);
                    numBombas = numBombas + this.cuentaBomba(f, c + 1);
                    numBombas = numBombas + this.cuentaBomba(f + 1, c + 1);
                    numBombas = numBombas + this.cuentaBomba(f + 1, c);
                    numBombas = numBombas + this.cuentaBomba(f + 1, c - 1);
                    numBombas = numBombas + this.cuentaBomba(f, c - 1);

                    //convierte el int numBombas en string, extrae el 
                    //elemento 0 que es un char y lo carga en la matriz
                    this.minas[f][c] = String.valueOf(numBombas).charAt(0);
                }
            }
        }

    }

    //cuenta las bombas que hay alrededor de la celda en la posición i,j
    private int cuentaBomba(int i, int j) {
        
        int b = 0;

        if (i >= 0 && i <= 9) {
            if (j >= 0 && j <= 9) {
                if (this.minas[i][j] == 'B') {
                    b = 1;
                }
            }
        }

        return b;
    }
    
    
    public void mostrar(){
        
        System.out.println("===============================");
        System.out.println("JUEGO");
        System.out.println("===============================");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.juego[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("===============================");
        System.out.println("MINAS");
        System.out.println("===============================");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.minas[i][j] + "  ");
            }
            System.out.println("");
        }  
    }

}
