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
public class Morcego extends Mamifero implements IVoador{
    public Morcego(int tamanho, int idade, String pelo){
        super(tamanho, idade, pelo);
    }
    
    public void emitirSom(){
        System.out.println("Faaah Faaah! (farfalho)");
    }
    
    public void voar(){
        System.out.println("Posso voar à 20 metros do solooo!!");
    }
    
    public void info(){
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Tamanho: %dcm\n", tamanho);
        System.out.printf("Minha pena é: %s\n", pelo);
        System.out.print("Meu som: ");
        emitirSom();
        amamentar();
        voar();
    }
}
