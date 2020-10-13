/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author EQUIPO ESTRUCTURAS
 */
public class lista {
    public persona Q, T, R;

    persona creanodo(int valor, persona inicio) {

        persona nodo = new persona();

        nodo.numero = valor;
        if (inicio == null) {
            nodo.back = null;
            nodo.next = null;
            inicio = nodo;
        } else if (inicio.next == null) {
            if (nodo.numero >= inicio.numero) {
                inicio.next = nodo;
                nodo.back = inicio;
                nodo.next = null;
            } else {
                inicio.back = nodo;
                nodo.next = inicio;
                nodo.back = null;
                inicio = nodo;
            }
        } else {
            if (nodo.numero >= inicio.numero) {
                T = inicio;
                while (nodo.numero > T.numero) {
                    if (T.next == null) {
                        T.next = nodo;
                        nodo.back = T;
                        nodo.next = null;
                    } else {
                        T = T.next;
                    }
                }
                if (nodo.back == null) {
                    R = T.back;
                    nodo.back = R;
                    nodo.next = T;
                    R.next = nodo;
                    T.back = nodo;
                }
            } else {
                inicio.back = nodo;
                nodo.next = inicio;
                nodo.back = null;
                inicio = nodo;
            }
        }

        System.out.println("MEMORIA: " + nodo);
        System.out.println("NUMERO: " + nodo.numero);
        return inicio;
    }

    public void imprimirnodo(persona inicio) {
        if(inicio==null){
            System.out.println("Lista vacia");
        }
        else{
        Q = inicio;
        System.out.println("IMPRIMIENDO LISTA");
        System.out.println(".......................");
        while (Q != null) {
            
            System.out.println("ANTERIOR " + Q.back);
            System.out.println("VALOR "+Q.numero+ " MEMORIA "+Q);
            System.out.println("SIGUIENTE " + Q.next);
            System.out.println(".......................");
            Q = Q.next;
            }
        }
    }

    public persona eliminarnodo(persona inicio) {
        if (inicio == null) {
            System.out.println("Lista vacia");
        }
        T = inicio;
        while (T.next != null) {
            R = T;
            T = T.next;
        }
        R.next = null;
        System.out.println(T.numero + "  HA SIDO ELIMINADO.... ");
        System.out.println("................ ");
        return inicio;
    }

    public persona eliminarx(int v, persona inicio) {
        T = inicio;
        if (v == inicio.numero) {
            R = inicio;
            System.out.println(R.numero + "  HA SIDO ELIMINADO.... ");
            System.out.println("................ ");
            R = null;
            inicio = inicio.next;
            inicio.back = null;
        } else {
            while (T.numero != v) {
                T = T.next;
            }
            if (T.next == null) {
                R = T.back;
                R.next = null;
                System.out.println(T.numero + "  HA SIDO ELIMINADO.... ");
                System.out.println("................ ");
                T = null;
            } else {
                R = T.back;
                Q = T.next;
                R.next = Q;
                Q.back = R;
                System.out.println(T.numero + "  HA SIDO ELIMINADO.... ");
                System.out.println("................ ");
                T = null;
            }
        }
        return inicio;
    }
}
