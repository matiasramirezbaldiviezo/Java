package SEPTIEMBRE_24;

import java.util.Scanner;
/*
M
S
L
S
H
N
S
O
N
N
S
A
N
N
S
D
S
N
S
U
N
N
N
S
O
N
N

 */

public class ArbolBinario 
{
	Nodo nodoRaiz;
	
	static class Nodo
	{
		char letra;
		Nodo hijoIzq;
		Nodo hijoDer;
	}
	
	public void llenarArbolBinario(Nodo puntero)
	{
		Scanner entrada = new Scanner(System.in);
		Nodo nuevoNodo = new Nodo();
		if(this.nodoRaiz==null)
		{
			this.nodoRaiz = nuevoNodo;
			System.out.print("Ingrese el nombre del Nodo Raiz->");
			nuevoNodo.letra = entrada.next().charAt(0);
		}
		else
		{
			nuevoNodo = puntero;
			System.out.print("Ingrese el nombre del Nodo->");
			nuevoNodo.letra = entrada.next().charAt(0);
		}
		System.out.print("El nodo "+nuevoNodo.letra+" tiene hijo por la Izquierda S/N? ->");
		char resp = entrada.next().charAt(0);
		if(resp=='S')
		{
			//si el nodo tiene un hijo por la izquierda debo invocar recursivamente para 
			//poder enlazar la estructura árbol binario
			nuevoNodo.hijoIzq = new Nodo();//le estoy asignando un espacio en la memoria
			llenarArbolBinario(nuevoNodo.hijoIzq);
		}
		System.out.print("El nodo "+nuevoNodo.letra+" tiene hijo por la Derecha S/N? ->");
		resp = entrada.next().charAt(0);
		if(resp=='S')
		{
			//si el nodo tiene un hijo por la derecha debo invocar recursivamente para 
			//poder enlazar la estructura árbol binario
			nuevoNodo.hijoDer = new Nodo();//le estoy asignando un espacio en la memoria
			llenarArbolBinario(nuevoNodo.hijoDer);
		}
	}
	public void mostrarInOrden(Nodo puntero)
	{
		if(puntero!=null)
		{
			mostrarInOrden(puntero.hijoIzq);
			System.out.print(puntero.letra);
			mostrarInOrden(puntero.hijoDer);
		}
	}
	
	public static void main(String[] args) 
	{
		ArbolBinario arbolBinario = new ArbolBinario();
		arbolBinario.llenarArbolBinario(null);
		System.out.println("================RECORRIDO INORDEN==============");
		arbolBinario.mostrarInOrden(arbolBinario.nodoRaiz);
		System.out.println("\n================RECORRIDO PREORDEN==============");
		System.out.println("\n================RECORRIDO POSTORDEN==============");
		
	}

}
