/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author hiroshi
 */
public class ListaPilha {

    private Pilha p;

    public void push(Lista L) {
        Pilha nc;
        if (p == null) {
            p = new Pilha(L);
        } else {
           nc = new Pilha(L);
           nc.setProx(p);
           p = nc;
        }
    }
    
    public Lista pop()
    {
        Lista aux = null;
        Pilha auxP;
        if(p == null)
            System.out.println("Pilha vazia");
        else
        {
            auxP = p;
            p = p.getProx();
            aux = auxP.getNo();
            auxP = null;
        }
        return aux;
    }
}
