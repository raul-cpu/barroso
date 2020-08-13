
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juare
 */
public class ListaAlumnos{
 
      static double prom;

        /**
         *
         * @param args
         */
    public static void main( String[] args ){
        
     Scanner leer = new Scanner(System.in);
 
        NodoLista4 nodo = new NodoLista4();
        int op;
 
        ArrayList lista = new ArrayList();
     do{
        System.out.println( "Ingrese el nombre del alumno:" );
        nodo.nom = leer.next();
        System.out.println( "Ingrese la primera calificación:" );
        nodo.calif1 = leer.nextInt();
        System.out.println( "Ingrese la segunda calificación:" );
        nodo.calif2 = leer.nextInt();
        System.out.println( "Ingrese la tercera calificación:" );
        nodo.calif3 = leer.nextInt();
 
        lista.add("Nombre del alumno:\n"+nodo.nom);
        lista.add("Calificación 1:\n"+nodo.calif1);
        lista.add("Calificación 2:\n"+nodo.calif2);
        lista.add("Calificación 3\n"+nodo.calif3);
 
        promedio(nodo.calif1, nodo.calif2, nodo.calif3);
 
        lista.add("Su promedio es:\n"+prom);
 
        System.out.println( "¿Desea ingresar otro alumno?" );
        System.out.println( "1.-Si\t 2.-No" );
        op = leer.nextInt();
     }
      while(op != 2);
        List lista2 = new ArrayList(lista);
        Iterator it = lista2.iterator();
       while (it.hasNext()){
            System.out.println(it.next()+"");
         }
   }
 
      private static double promedio(int calif1, int calif2, int calif3){
          int suma = calif1 + calif2 + calif3;
          prom = suma/3;
          return prom;
      }
    }
