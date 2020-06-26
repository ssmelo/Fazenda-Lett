/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazenda;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Fazenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o tamanho do pato: ");        
        int patoTam = ler.nextInt();
        System.out.println("Entre com a idade do pato: ");        
        int patoIda = ler.nextInt();
        System.out.println("Entre com a cor do pato: ");        
        String patoCor = ler.next();
        Pato pat = new Pato(patoTam, patoIda, patoCor);
        
        System.out.println("Entre com o tamanho da vaca: ");        
        int vacaTam = ler.nextInt();
        System.out.println("Entre com a idade da vaca: ");        
        int vacaIda = ler.nextInt();
        System.out.println("Entre com a cor da vaca: ");        
        String vacaCor = ler.next();
        Vaca vac = new Vaca(vacaTam, vacaIda, vacaCor);
        
        System.out.println("Entre com o tamanho da galinha: ");        
        int galinhaTam = ler.nextInt();
        System.out.println("Entre com a idade da galinha: ");        
        int galinhaIda = ler.nextInt();
        System.out.println("Entre com a cor da galinha: ");        
        String galinhaCor = ler.next();
        Galinha gal = new Galinha(galinhaTam, galinhaIda, galinhaCor);
        
        System.out.println("Entre com o tamanho do morcego: ");        
        int morcegoTam = ler.nextInt();
        System.out.println("Entre com a idade do morcego: ");        
        int morcegoIda = ler.nextInt();
        System.out.println("Entre com a cor do morcego: ");        
        String morcegoCor = ler.next();
        Morcego mor = new Morcego(morcegoTam, morcegoIda, morcegoCor);        
        
        System.out.println("\nMeu pato:\n");        
        pat.info();
        
        System.out.println("\nMinha galinha:\n");
        gal.info();
        
        System.out.println("\nMinha vaca:\n");
        vac.info();
        
        System.out.println("\nMeu morcego:\n");
        mor.info();
    }
    
}
