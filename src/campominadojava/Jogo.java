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
         System.out.println("");
          if(tab[x][y].toString()=="L"){
              System.out.println("Você pisou em uma bomba leve");
              setVida(getVida()-1);
          }else
              if(tab[x][y].toString()=="P"){
                  System.out.println("");
                   System.out.println("Você pisou em uma bomba pesada");
                   setVida(0);
              }else{
                    System.out.println("Você pisou em um campo vazio");
                    buscarVizinhos(x,y);
              }
        setTentativa(getTentativa()+1);  
        System.out.println("");
        }
        public int buscaLinhaesquerda(int x,int y){
            int n=0;
            
            for (int i = y;i>=0; i--){ 
                System.out.println(tab[x][i].toString());
                if(tab[x][i].toString()=="-"){
                    System.out.println(tab[x][i].toString()); 
                     n++; 
                };
                
            }
            return n;
        }
        
        public int buscaLinhaDireita(int x,int y){
            int n=0;
            
               for (int i = y; i<tab.length; i++) { 
                   System.out.println(i);
               if(tab[x][i].toString()=="-"){
                     n++; 
                }; 
            
            }
            return n;
        }
        public int buscaColunaAcima(int x,int y){
            int n=0;
            for (int i=x;i>=0; i--) { 
                 System.out.println(i);
                if(tab[i][y].toString()=="-"){
                     n++;
                };   
            }
            return n;
        }
        public int buscaColunaAbaixo(int x,int y){
            int n=0;
             for (int i = x;i<tab.length; i++) { 
                  System.out.println(i);
                if(tab[i][y].toString()=="-"){
                     n++;
                };   
            }
            return n;
        }
//        public int buscaDiagonalPrincipalDireita(int x,int y){
//            int n=0;
//            for (int i = x; tab[x][y].toString()=="-"&&i<tab.length-1; i++) { 
//                x++;
//                y++;
//                n++;   
//            }
//            return n;
//        }
//        public int buscacoDiagonalPrincipalEsquerda(int x,int y){
//            int n=0;
//            for (int i = x; tab[x][y].toString()=="-"&&i>0; i--) { 
//               x--;
//               y--;
//               n++;   
//            }
//            return n;
//        }

        private void buscarVizinhos(int x, int y) {
          
                 System.out.println("----------------------------------");  
                 System.out.println("Esquerda-> "+buscaLinhaesquerda(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("Direita->  "+buscaLinhaDireita(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("Cima->  "+buscaColunaAcima(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("Baixo->  "+buscaColunaAbaixo(x, y));
                 System.out.println("----------------------------------");
//                 System.out.println("DiagPrinBaixo->  "+buscaDiagonalPrincipalDireita(x, y));
//                 System.out.println("");
//                 System.out.println("DiagPrinCima->  "+buscacoDiagonalPrincipalEsquerda(x, y));
//                 System.out.println("");
                 
        }
    }
    
    
    

