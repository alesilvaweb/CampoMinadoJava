/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campominadojava;

/**
 *
 * @author alessandros
 */
public class CampoMinadoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Jogo j = new Jogo(5);
        
        //j.novajogada(1, 3);
       
        j.insereNovoTabuleiro();
        j.imprimeTabuleiro();
        j.novajogada(0, 0);
         j.imprimeTabuleiro();
    }
    
}
