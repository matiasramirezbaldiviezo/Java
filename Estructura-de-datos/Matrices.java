package SEPTIEMBRE_22;

/**
 *
 * @author MatiasRamirez
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
        //nuevoNodo.puntero = null;
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
        System.out.println("=====================================");
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
    
    public static Matrices sumaDeMatrices(Matrices m1, Matrices m2)
    {
    	if(m1.filas==m2.filas&m1.columnas==m2.columnas)
    	{
    		//Las matrices pueden sumarse
    		Matrices s = new Matrices(m1.filas,m2.columnas); //Así deben definir la matriz resultante para la suma
    		for(int i=1; i<=m1.filas; i++)
    			for(int j=1; j<=m1.columnas; j++)
    			{
    				int dato = m1.buscarNodo(i,j).dato+m2.buscarNodo(i, j).dato;
    				s.adicionarEnMatriz(dato, i, j);
    			}			
    		return s;
    	}
    	else
    		return null;
    }


    public static Matrices multicacionDeMatrices(Matrices m1, Matrices m2)
    {
    	if(m1.columnas==m2.filas)
    	{
    		//Las matrices pueden multiplicarse
    		Matrices m = new Matrices(m1.filas,m2.columnas);//Así deben definir la matriz resultante para la multiplicacion 
    		for(int i=1; i<=m1.filas; i++)
    			for(int j=1; j<=m1.columnas; j++)
    			{
    				int dato=0;
    				for(int k=0; k<m1.columnas; k++)
    				{
    					int aux = m1.buscarNodo(i,k+1).dato * m2.buscarNodo(k+1,j).dato;
    					dato= dato + aux;
    				}
    				m.adicionarEnMatriz(dato, i, j);
    			}			
    		return m;
    	}
    	else
    		return null;
    }
   
    public static void main(String[] args) 
    {
    	
        Matrices m1 = new Matrices(2,2);
        m1.adicionarEnMatriz(3, 1, 1);
        m1.adicionarEnMatriz(7, 2, 2);
        m1.adicionarEnMatriz(8, 1, 2);
        m1.adicionarEnMatriz(9, 2, 1);	
        System.out.println("Matriz 1");
        m1.mostrarMatriz();
        Matrices m2 = new Matrices(2,2);
        m2.adicionarEnMatriz(5, 1, 1);
        m2.adicionarEnMatriz(-1, 2, 2);
        m2.adicionarEnMatriz(2, 1, 2);
        m2.adicionarEnMatriz(1, 2, 1);
        System.out.println("Matriz 2");
        m2.mostrarMatriz();
        Matrices suma = sumaDeMatrices(m1,m2);
        Matrices multiplicacion = multicacionDeMatrices(m1,m2);
        if(suma == null)
        	System.out.println("Las dimensiones de las matrices no son iguales por eso no se pueden sumasr");
        else
        {
            System.out.println("Matriz Referida a Suma");
            suma.mostrarMatriz();
            System.out.println("Matriz Referida a Multiplicacion");
            multiplicacion.mostrarMatriz();
            System.out.println("Matriz Referida a Transpuesta");
            multiplicacion.mostrarMatrizTranspuesta();
        }   
        if(multiplicacion == null)
        {
            System.out.println("Las dimensiones de las matrices no son iguales por eso no se pueden multiplicar");
        
        }
        else
        {
            	System.out.println("Matriz Referida a Multiplicacion");
                multiplicacion.mostrarMatriz();
                System.out.println("Matriz Referida a Transpuesta");
                multiplicacion.mostrarMatrizTranspuesta();
        }   
    }
    
}