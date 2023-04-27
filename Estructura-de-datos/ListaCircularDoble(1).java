package SEPTIEMBRE_08;

public class ListaCircularDoble 
{
	Nodo primero;
	Nodo ultimo;
	
	static class Nodo
	{
		int dato;
		Nodo siguiente;
		Nodo anterior;
	}
	
	public void agregarNodo(int dato)
	{
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.dato = dato;
		
		if(this.primero==null)
		{
			nuevoNodo.siguiente = nuevoNodo;
			nuevoNodo.anterior = nuevoNodo;
			this.primero = nuevoNodo;
			this.ultimo = nuevoNodo;
		}
		else
		{
			nuevoNodo.anterior = this.ultimo;
			this.ultimo.siguiente = nuevoNodo;
			nuevoNodo.siguiente = this.primero;
			this.primero.anterior = nuevoNodo;
			this.ultimo = nuevoNodo;
		}
	}
	
	public void mostrarListaCircular(int cantidadElementos)
	{
		if(this.primero==null)
			System.out.println("La Lista Circular está vacia");
		else
		{
			Nodo aux = this.primero;
			for(int i = 0; i<cantidadElementos; i++)
			{
				System.out.print(aux.dato+"->");
				aux = aux.siguiente;
			}
			System.out.println();	
		}
	}
	
	public static void main(String[] args) 
	{
		ListaCircularDoble lista = new ListaCircularDoble();
		lista.mostrarListaCircular(10);
		lista.agregarNodo(4);
		lista.mostrarListaCircular(10);
		lista.agregarNodo(1);
		lista.agregarNodo(2);
		lista.mostrarListaCircular(10);
	}

}
