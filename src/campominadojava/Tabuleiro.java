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
public class Tabuleiro{
    protected Celula tab[][];

    public Tabuleiro(int tamanho) {
        this.tab = new Celula[tamanho][tamanho];
    }
    
    public void insereNoTabuleiro(Celula celula,int x, int y){
        this.tab[x][y] = celula;
    }

    public Celula getTab(Celula celula,int x, int y){
        return tab[x][y];
    }
   
    
}
