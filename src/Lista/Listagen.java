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
public class Listagen {
    private No L;

    public Listagen(){
        this.L = null;
    }
    
    public boolean atomo(No L){
        if(L instanceof Atomo)
            return true;
        return false;
    }
    
    public Atomo criaT(String info){
        return new Atomo(info);
    }
    
    public No Cons(Lista H, Lista T)
    {
        if(atomo(T))
        {
            System.out.println("Erro");
            return null;
        }
        else
            return new Lista(H,T);
    }
    
    public void Construir(String entrada)
    {
        Atomo atomo;
        for(int i = 0; i < entrada.length(); i++)
        {
            if(L == null)
            {
                if(entrada.charAt(i) == '[')
                    L = Cons(null,null);
                else
                    System.out.println("Há um atomo no inicio da lista");

            }
            else
            {
                atomo = criaT("a");
               
            }
        }
    }
    
    public void Cria_Lista(String atomo)
    {
        
    }
    
    public void exibe()
    {
        
    }
    
}
