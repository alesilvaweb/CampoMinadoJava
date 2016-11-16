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
public class Jogo extends Tabuleiro implements Jogar{
        
    public Jogo(int tamanho) {
        super(tamanho);
        
    }

    @Override
    public void novajogada(int x, int y) {
          if(tab[x][y].toString()=="L"){
              System.out.println("Você pisou em uma bomba leve");
              setVida(getVida()-1);
          }else
              if(tab[x][y].toString()=="P"){
                   System.out.println("Você pisou em uma bomba pesada");
                   setVida(0);
              }else{
                    System.out.println("Você pisou em um campo vazio");
                    buscarVizinhos(x,y);
              }
        setTentativa(getTentativa()+1);  
        System.out.println("");
        }

        private void buscarVizinhos(int x, int y) {
            int n =0;
            for (int i = x; tab[x][i].toString()=="-"; i++) {
                
                System.out.println("-> "+tab[x][i]);
                
            }
            System.out.println("");
             for (int i = x;tab[x][i].toString()=="-"; i++) {
                
                System.out.println("->  "+tab[i][y]);
             
            }
             System.out.println("");
             for (int i = x;tab[x][i].toString()=="-"; i++) {
               
                    
                System.out.println("->   "+tab[x][i]);
                 x++;
            }
             System.out.println("");
        }
  
    }
    
    
    

