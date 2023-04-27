package OCTUBRE_29;

/*
EJEMPLO DE INPUT
42 155
1 2 2
1 3 5
1 8 2
1 9 3
1 10 6
1 15 5
1 16 6
1 17 7
2 3 2
2 8 3
2 9 2
2 10 3
2 11 6
2 15 6
2 16 5
2 17 6
2 18 7
3 8 6
3 9 3
3 10 2
3 11 3
3 15 7
3 16 6
3 17 5
3 18 6
8 9 2
8 10 5
8 15 2
8 16 3
8 17 6
8 22 5
9 10 2
9 11 5
9 15 3
9 16 2
9 17 3
9 18 6
9 22 6
9 25 7
10 11 2
10 15 6
10 16 3
10 17 1
10 18 3
10 22 7
10 25 6
11 16 6
11 17 3
11 18 2
11 25 5
13 14 2
13 18 6
13 20 2
13 21 3
13 25 7
13 27 5
13 28 6
14 20 3
14 21 2
14 27 6
14 28 5
15 16 2
15 17 5
15 22 2
15 29 5
15 30 6
15 31 7
16 17 2
16 18 5
16 22 3
16 25 6
16 29 6
16 30 5
16 31 6
16 32 7
17 18 2
17 22 6
17 25 3
17 29 7
17 30 6
17 31 5
17 32 6
18 20 5
18 25 2
18 27 6
18 30 7
18 31 6
18 32 5
18 34 7
20 21 2
20 25 6
20 27 2
20 28 3
20 32 7
20 34 5
21 27 3
21 28 2
21 34 6
22 29 2
22 30 3
22 31 6
22 36 5
22 37 6
22 38 7
25 27 5
25 30 6
25 31 3
25 32 2
25 34 6
25 37 7
25 38 6
25 39 5
25 40 6
27 28 2
27 32 6
27 34 2
27 39 7
27 40 6
27 42 6
28 34 3
28 40 7
28 42 5
29 30 2
29 31 5
29 36 2
29 37 3
29 38 6
30 31 2
30 32 5
30 36 3
30 37 2
30 38 3
30 39 6
31 32 2
31 36 6
31 37 3
31 38 2
31 39 3
31 40 6
32 34 5
32 37 6
32 38 3
32 39 2
32 40 3
34 39 6
34 40 3
34 42 3
36 37 2
36 38 5
37 38 2
37 39 5
38 39 2
38 40 5
39 40 2
40 42 5

*/
import java.util.*;

public class Dijkstra {
    
    //similar a los defines de C++
    static final int MAX = 10005;  //maximo numero de vértices
    static final int INF = 1<<30;  //definimos un valor grande que represente la distancia infinita inicial, basta conque sea superior al maximo valor del peso en alguna de las aristas

    //En el caso de java usamos una clase que representara el pair de C++
    static class Node implements Comparable<Node>
    {
        int first, second;
        Node( int d , int p )  //constructor
        {                          
            this.first = d;
            this.second = p;
        }
        public int compareTo( Node other)
        {              
         //es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
            if( second > other.second ) return 1;
            if( second == other.second ) return 0;
            return -1;
        }
    };
    
    static Scanner sc = new Scanner( System.in );      //para lectura de datos
    static List< List< Node > > ady = new ArrayList< List< Node > >(); //lista de adyacencia
    static int distancia[ ] = new int[ MAX ];          //distancia[ u ] distancia de vértice inicial a vértice con ID = u
    static boolean visitado[ ] = new boolean[ MAX ];   //para vértices visitados
    static PriorityQueue< Node > Q = new PriorityQueue<Node>(); //priority queue propia de Java, usamos el comparador definido para que el de menor valor este en el tope
    static int V;                                      //numero de vertices
    static int previo[] = new int[ MAX ];              //para la impresion de caminos
    
    //función de inicialización
    static void init(){
        for( int i = 0 ; i <= V ; ++i ){
            distancia[ i ] = INF;  //inicializamos todas las distancias con valor infinito
            visitado[ i ] = false; //inicializamos todos los vértices como no visitados
            previo[ i ] = -1;      //inicializamos el previo del vertice i con -1
        }
    }

    //Paso de relajacion
    static void relajacion( int actual , int adyacente , int peso ){
        //Si la distancia del origen al vertice actual + peso de su arista es menor a la distancia del origen al vertice adyacente
        if( distancia[ actual ] + peso < distancia[ adyacente ] ){
            distancia[ adyacente ] = distancia[ actual ] + peso;  //relajamos el vertice actualizando la distancia
            previo[ adyacente ] = actual;                         //a su vez actualizamos el vertice previo
            Q.add( new Node( adyacente , distancia[ adyacente ] ) ); //agregamos adyacente a la cola de prioridad
        }
    }

    //Impresion del camino mas corto desde el vertice inicial y final ingresados
    static void print( int destino ){
        if( previo[ destino ] != -1 )    //si aun poseo un vertice previo
            print( previo[ destino ] );  //recursivamente sigo explorando
        System.out.printf("%d " , destino );        //terminada la recursion imprimo los vertices recorridos
    }

    
    static void dijkstra( int inicial ){
        init(); //inicializamos nuestros arreglos
        Q.add( new Node( inicial , 0 ) ); //Insertamos el vértice inicial en la Cola de Prioridad
        distancia[ inicial ] = 0;      //Este paso es importante, inicializamos la distancia del inicial como 0
        int actual , adyacente , peso;
        while( !Q.isEmpty() ){                   //Mientras cola no este vacia
            actual = Q.element().first;            //Obtengo de la cola el nodo con menor peso, en un comienzo será el inicial
            Q.remove();                           //Sacamos el elemento de la cola
            if( visitado[ actual ] ) continue; //Si el vértice actual ya fue visitado entonces sigo sacando elementos de la cola
            visitado[ actual ] = true;         //Marco como visitado el vértice actual

            for( int i = 0 ; i < ady.get( actual ).size() ; ++i ){ //reviso sus adyacentes del vertice actual
                adyacente = ady.get( actual ).get( i ).first;   //id del vertice adyacente
                peso = ady.get( actual ).get( i ).second;        //peso de la arista que une actual con adyacente ( actual , adyacente )
                if( !visitado[ adyacente ] ){        //si el vertice adyacente no fue visitado
                    relajacion( actual , adyacente , peso ); //realizamos el paso de relajacion
                }
            }
        }


        //System.out.printf( "Distancias mas cortas iniciando en vertice %d\n" , inicial );
        /*for( int i = 1 ; i <= V ; ++i ){
            System.out.printf("Vertice %d , distancia mas corta = %d\n" , i , distancia[ i ] );
        }

        System.out.println("\n**************Impresion de camino mas corto**************");
        */
        System.out.printf("Ingrese vertice destino: ");
        int destino;
        destino = sc.nextInt();
        System.out.printf("La distancia mínima al destino: "+distancia[destino]+"\nCamino: ");
        print( destino );
        System.out.printf("\n");
    }
    
    
    public static void main(String[] args) 
    {
        int E , origen, destino , peso , inicial;
        V = sc.nextInt();
        E = sc.nextInt();
        for( int i = 0 ; i <= V ; ++i ) ady.add(new ArrayList<Node>()) ; //inicializamos lista de adyacencia
        for( int i = 0 ; i < E ; ++i )
        {
            origen = sc.nextInt(); destino = sc.nextInt(); peso = sc.nextInt();
            ady.get( origen ).add( new Node( destino , peso ) );    //grafo diridigo
            ady.get( destino ).add( new Node( origen , peso ) ); //no dirigido
        }
        System.out.print("Ingrese el vertice inicial: ");
        inicial = sc.nextInt();
        dijkstra( inicial );
    }
} 