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
public abstract class Animal {
    protected int tamanho;
    protected int idade;   

    public Animal(int tamanho, int idade){
        this.tamanho = tamanho;
        this.idade = idade;
    }
    
    public abstract void emitirSom();
    public abstract void info();
    
}
