package SEPTIEMBRE_29;

public class ListaEnlazadaSimple {
    //Declaro la variable de instancia cabecera para determinar donde 
    //comienza mi lista enlazada

    Nodo cabecera;
    //defino mi estructura Nodo

    static class Nodo {

        int valor;
        Nodo puntero;
    }

    public void adicionarEnLista(int dato) {
        //con el dato que me llega al método creo un nodo
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.valor = dato;
        nuevoNodo.puntero = null;//aun que no le asigne el valor null, este ya apunta a null
        //pregunto si mi Lista Enlazada esta vacía
        if (this.cabecera == null) {
            this.cabecera = nuevoNodo;
        } else {
            //PARA recorrer la Lista Enlazada utilizo una variable auxiliar
            Nodo aux = this.cabecera;
            while (aux.puntero != null) {
                aux = aux.puntero; //de esta manera recorro la variable auxiliar
            }
            aux.puntero = nuevoNodo;
        }
    }

    public void mostrarListaEnlazada() {
        if (this.cabecera == null) {
            System.out.println("La Lista Enlazada está vacia.");
        } else {
            //declaro una variable auxiliar para recorrer la lista enlazada
            Nodo aux = this.cabecera;
            while (aux != null) {
                System.out.print(aux.valor + "->");
                aux = aux.puntero;
            }
            System.out.println("null");
        }
    }

    public void quitarcomopila() {
        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            Nodo aux = this.cabecera;
            Nodo aux2 = aux.puntero;
            while (aux != null) {
                aux2 = aux.puntero;
                if (aux2.puntero == null) {
                    aux.puntero = null;

                }
                System.out.print(aux.valor + "->");
                aux = aux.puntero;
            }
            System.out.println("null");

        }

    }

    public void quitarcomocola() {
        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            Nodo aux = this.cabecera;
            Nodo aux2 = aux.puntero;
            aux = aux2;
            while (aux != null) {

                System.out.print(aux.valor + "->");
                aux = aux.puntero;
            }
            System.out.println("null");

        }

    }

    public void borrarporposicion(int posicion) {
        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            if(posicion==1)
                this.cabecera=this.cabecera.puntero;
            else {
            Nodo aux = this.cabecera;
            Nodo aux2 = aux.puntero;   
            int cont=2;
            while(aux2!=null){
                if(cont==posicion){
                aux.puntero =aux2.puntero;
                aux2.puntero=null ;
                aux2=aux.puntero;
                
                
                }
                
                aux =aux.puntero;
                aux2=aux.puntero;
                cont++;
                System.out.print(aux.valor + "->");
            }
              System.out.println("null");
                    
        }
        }
        }

    public void remplazarenlista(int vv,int vn) {
        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            if(this.cabecera.valor==vv)
                this.cabecera.valor=vn;
            else
            {
                Nodo aux = this.cabecera;
                  while(aux!=null){
                      if(aux.valor==vv){
                      aux.valor=vn;
                     
                      }
                       System.out.print(aux.valor + "->");
                      aux=aux.puntero;
                  }
                  System.out.println("null");
            }  
            
        
        }

    }

    public void borrarEnListaPorValor(int valorABorrar) {
        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            if (this.cabecera.valor == valorABorrar) {
                this.cabecera = this.cabecera.puntero;
            } else {
                Nodo aux = this.cabecera;
                Nodo aux2 = aux.puntero;
                while (aux2 != null) {
                    if (aux2.valor == valorABorrar) {
                        aux.puntero = aux2.puntero;
                        
                        aux2.puntero = null;
                        aux2 = aux.puntero;
                    }
                    aux = aux.puntero;
                    aux2 = aux.puntero;
                    System.out.print(aux.valor + "->");
                }
                System.out.println("null");
            }
        }
    }

    public void ordenarlistaenlazadamayoramenor() {

        if (this.cabecera == null) {
            System.out.println("La lista enlazada está vacia");
        } else {
            Nodo aux = this.cabecera;
            while (aux != null) {
                
                System.out.print(aux.valor + "->");
                aux = aux.puntero;
            }
            System.out.println("null");
        
     
    }}
   

    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.mostrarListaEnlazada();
        lista.adicionarEnLista(3);
        lista.adicionarEnLista(7);
        lista.adicionarEnLista(11);
        lista.mostrarListaEnlazada();
        lista.adicionarEnLista(4);
        lista.adicionarEnLista(5);
        lista.adicionarEnLista(1);
        lista.adicionarEnLista(9);
        lista.adicionarEnLista(77);
        lista.adicionarEnLista(1);
        lista.adicionarEnLista(111);
        System.out.println("Motrar lista completa");
        lista.mostrarListaEnlazada();
         System.out.println("Quitar valor 1 de lista");
        lista.borrarEnListaPorValor(1);
        lista.mostrarListaEnlazada();
         System.out.println("Quitar valor 3 de lista");
        lista.borrarEnListaPorValor(3);
        System.out.println("Motrar lista modificada");
        lista.mostrarListaEnlazada();
         System.out.println("Quitar valor como pila");
        lista.quitarcomopila();
        System.out.println("Quitar valor como cola");
        lista.quitarcomocola();
         System.out.println("Quitar por posicion numero 3");
        lista.borrarporposicion(3);
        
  
        System.out.println("Sustituir valor 77 por 99 en lista");
        lista.remplazarenlista(77, 99);
        

    }

}
