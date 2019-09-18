/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Stack;

/**
 *
 * @author hiroshi
 */
public class Listagen {

    private No L;

    public Listagen() {
        this.L = null;
    }

    private String getAtomo(int pos, String entrada) {
        String aux = "";
        while (pos < entrada.length() && Character.isLetter(entrada.charAt(pos))) {
            System.out.println("" + entrada.charAt(pos));
            aux += entrada.charAt(pos) + "";
            pos++;
        }
        return aux;
    }

    public boolean atomo(No L) {
        if (L instanceof Atomo) {
            return true;
        }
        return false;
    }

    public Atomo criaT(String info) {
        return new Atomo(info);
    }

    public No Cons(Lista H, Lista T) {
        if (atomo(T)) {
            System.out.println("Erro");
            return null;
        } else {
            return new Lista(H, T);
        }
    }

    public void Construir(String entrada) {
        String aux;
        No ultimo = null;
        Stack pilha = new Stack();
        for (int i = 0; i < entrada.length(); i++) {
            if (L == null) {
                if (entrada.charAt(i) == '[') {
                    L = Cons(null, null);
                    ultimo = L;
                } else {
                    System.out.println("Há um atomo no inicio da lista");
                }
            } else {
                if(entrada.charAt(i) == '[')
                {
                    ((Lista)ultimo).setCabeca(Cons(null,null));
                    pilha.push(ultimo);
                    ultimo = ((Lista)ultimo).getCabeca();
                }
                if(entrada.charAt(i) == ',')
                {
                    ((Lista)ultimo).setCauda(Cons(null,null));
                    ultimo = ((Lista)ultimo).getCauda();
                }
                if (Character.isLetter(entrada.charAt(i))) {
                    aux = "";
                    while (i < entrada.length() && Character.isLetter(entrada.charAt(i))) {
                        aux += entrada.charAt(i++) + "";
                    }
                    ((Lista)ultimo).setCabeca(criaT(aux));
                }
                if(entrada.charAt(i) == ']')
                    ultimo = ((Lista)pilha.pop());
            }
        }
    }

    public void exibe() {
        
    }

}
