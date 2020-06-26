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
public class Pato extends Ave implements IVoador {
    
  public Pato(int tamanho, int idade, String pena){
    super(tamanho, idade, pena);
  }
  
  public void emitirSom(){
    System.out.println("Qua Qua! (Grasnido)");
  }
  
  public void voar(){
        System.out.println("Posso voar à 2 metros do solooo!!");
  }
  
  public void info(){
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Tamanho: %dcm\n", tamanho);
        System.out.printf("Minha pena é: %s\n", pena);
        System.out.print("Meu som: ");
        emitirSom();
        botarOvos();
        voar();
    }  
  
}
