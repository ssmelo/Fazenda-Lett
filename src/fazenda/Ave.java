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
public abstract class Ave extends Animal{
    protected String pena;
    
    public void botarOvos(){
        System.out.println("Botando ovos");
    }
    
    public Ave(int tamanho, int idade, String pena){
        super(tamanho, idade);
        this.pena = pena;
    }    
    
}
