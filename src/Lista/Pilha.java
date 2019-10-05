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
public class Pilha {
    private Lista no;
    private Pilha prox;

    public Pilha(Lista no) {
        this.no = no;
        this.prox = null;
    }

    public Lista getNo() {
        return no;
    }

    public void setNo(Lista no) {
        this.no = no;
    }

    public Pilha getProx() {
        return prox;
    }

    public void setProx(Pilha prox) {
        this.prox = prox;
    }
   
}
