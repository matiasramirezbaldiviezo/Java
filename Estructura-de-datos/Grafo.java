package OCTUBRE_29;
public class Grafo{
	
	Nodo primero;
	String camino;
	int pesoAcumulado;

	public static class Nodo{
		String nombre;
		Nodo siguiente;
		Arista ar1;
		Arista ar2;
	}
	public static class Arista{
		Nodo puntero;
		int peso;
	}
	public void agregarNodo(String n){
		Nodo nuevo = new Nodo();
		nuevo.nombre = n;
		nuevo.ar1 = null;
		nuevo.ar2 = null;
		if(this.primero == null){
			this.primero = nuevo;
		}else{
			Nodo aux = this.primero;
			while(aux.siguiente != null){
				aux = aux.siguiente;
			}
			aux.siguiente = nuevo;
		}
	}
	public void agregarArista(Nodo origen, Nodo puntero, int peso){
		if(origen.ar1 != null && origen.ar2 != null){
			System.out.println("Aristas no disponibles");
		}else{
			Arista nuevaArista = new Arista();
			nuevaArista.peso = peso;
			nuevaArista.puntero = puntero;
			if(origen.ar1 == null){
				origen.ar1 = nuevaArista;
			}else{
				origen.ar2 = nuevaArista;
			}
		}
	}
	public void mostrarGrafo(){
		Nodo aux = this.primero;
		while(aux != null){
			System.out.println("NODO " + aux.nombre);
			if(aux.ar1 != null){
				System.out.println("Se conecta con " + aux.ar1.puntero.nombre + " con peso " + aux.ar1.peso);
			}
			if(aux.ar2 != null){
				System.out.println("Se conecta con " + aux.ar2.puntero.nombre + " con peso " + aux.ar2.peso);
			}
			aux = aux.siguiente;
		}
	}
	public Nodo buscarNodo(String n){
		Nodo aux = this.primero;
		while(!aux.nombre.equals(n)){
			aux = aux.siguiente;
		}
		return aux;
	}
	public void obtenerCaminoMinimo(Nodo origen, Nodo destino)
	{
		this.camino = this.camino + origen.nombre + "->";
		
		if(origen==destino)
			System.out.println("Hay un camino: "+this.camino+" con un total de "+this.pesoAcumulado);
		else
		{
			if(origen.ar1!=null)
			{
				this.pesoAcumulado += origen.ar1.peso;
				obtenerCaminoMinimo(origen.ar1.puntero, destino);
			}
			if(origen.ar2!=null)
			{
				this.pesoAcumulado += origen.ar2.peso;
				obtenerCaminoMinimo(origen.ar2.puntero, destino);
			}
		}
	}
	public static void main(String[] args){
		Grafo objeto = new Grafo();
		objeto.agregarNodo("A");
		objeto.agregarNodo("B");
		objeto.agregarNodo("C");
		objeto.agregarNodo("D");
		objeto.agregarNodo("E");
		objeto.agregarArista(objeto.buscarNodo("A"), objeto.buscarNodo("C"), 4);
		objeto.agregarArista(objeto.buscarNodo("A"), objeto.buscarNodo("D"), 7);
		//objeto.agregarArista(objeto.buscarNodo("A"), objeto.buscarNodo("E"), 11);
		objeto.agregarArista(objeto.buscarNodo("C"), objeto.buscarNodo("B"), 2);
		objeto.agregarArista(objeto.buscarNodo("B"), objeto.buscarNodo("E"), 5);
		objeto.agregarArista(objeto.buscarNodo("D"), objeto.buscarNodo("E"), 6);
		objeto.mostrarGrafo();
		objeto.obtenerCaminoMinimo(objeto.buscarNodo("A"), objeto.buscarNodo("E"));
	}
}