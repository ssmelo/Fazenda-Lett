/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

/**
 *
 * @author samuel
 */
public abstract class Mamifero extends Animal{
    protected String pelo;
    
    public void amamentar(){
        System.out.println("Amamentando");
    }
    
    public Mamifero(int tamanho, int idade, String pelo){
        super(tamanho, idade);
        this.pelo = pelo;
    }
}
