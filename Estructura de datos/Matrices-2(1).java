/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEPTIEMBRE_22;

/**
 *
 * @author 59160
 */
public class Matrices 
{
    Nodo primero;
    Nodo ultimo;
    int filas;
    int columnas;
    
    static class Nodo
    {
        int dato;
        int fila;
        int columna;
        Nodo puntero;
    }
    
    
    public void adicionarEnMatriz(int dato, int f, int c)
    {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;
        nuevoNodo.fila = f;
        nuevoNodo.columna = c;
        nuevoNodo.puntero = null;
        if(this.primero == null)
        {
            this.primero = nuevoNodo;
            this.ultimo = nuevoNodo;
        }
        else
        {
            this.ultimo.puntero = nuevoNodo;
            this.ultimo = nuevoNodo;
        }
    }
    
    
    public void mostrarMatriz()
    {
        for(int i = 1; i<=this.filas ; i++)
        {
            for(int j=1 ; j<=this.columnas; j++)
            {	
                Nodo aux = buscarNodo(i,j);
		System.out.print(aux.dato+"\t");
            }
	System.out.println();
        }
            
    }
    public void mostrarMatrizTranspuesta()
    {
        for(int i = 1; i<=this.filas ; i++)
        {
            for(int j=1 ; j<=this.columnas; j++)
            {	
                Nodo aux = buscarNodo(j,i);
		System.out.print(aux.dato+"\t");
            }
	System.out.println();
        }
            
    }
    
    public Nodo buscarNodo(int f, int c)
    {
        Nodo aux = this.primero;
        while(true)
        {
            if(aux.fila == f & aux.columna == c)
            return aux;
            aux = aux.puntero;
        }
    }
    //definimos el constructor para una Matriz
    public Matrices(int f, int c)
    {
    	this.filas = f;
    	this.columnas = c;
    	this.primero = null;
    }
    
   
    public static void main(String[] args) 
    {
        Matrices m1 = new Matrices(2,2);
        m1.adicionarEnMatriz(1, 1, 1);
        m1.adicionarEnMatriz(4, 2, 2);
        m1.adicionarEnMatriz(2, 1, 2);
        m1.adicionarEnMatriz(3, 2, 1);
        m1.mostrarMatriz();
        m1.mostrarMatrizTranspuesta();
        Matrices m2 = new Matrices(2, 2);
        Matrices suma = new Matrices(2,2);
        //suma.sumarMatrices(m1,m2);
        
    }
    
}
