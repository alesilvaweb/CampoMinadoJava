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
              System.out.println("");
              System.out.println("Você pisou em uma bomba leve");
              setVida(getVida()-1);
          }else
              if(tab[x][y].toString()=="P"){
                   System.out.println("");
                   System.out.println("Você pisou em uma bomba pesada");
                   setVida(0);
              }else{
                    System.out.println("");
                    System.out.println("Você pisou em um campo vazio");
                    buscarVizinhos(x,y);
              }
        setTentativa(getTentativa()+1);  
        System.out.println("");
        }
        public int buscaLinhaesquerda(int x,int y){
            int n=0;
            for (int i = y;i>=0; i--){ 
                if(tab[x][i].toString()=="-"){
                     n++; 
                }else
                    if(tab[x][i].toString()=="P"){
                        i=0;
                    }else
                        if(tab[x][i].toString()=="L"){
                            i=0;
                        };
            }
            return n;
        }
        
        public int buscaLinhaDireita(int x,int y){
            int n=0;
            
               for (int i = y; i<tab.length; i++) { 
               if(tab[x][i].toString()=="-"){
                     n++; 
                }else
                    if(tab[x][i].toString()=="P"){
                        i=tab.length;
                    }else
                        if(tab[x][i].toString()=="L"){
                            i=tab.length;
                        }; 
            }
            return n;
        }
        public int buscaColunaAcima(int x,int y){
            int n=0;
            for (int i=x;i>=0; i--) {   
                if(tab[i][y].toString()=="-"){
                     n++;
                }else
                    if(tab[i][y].toString()=="P"){
                        i=0;
                    }else
                        if(tab[i][y].toString()=="L"){
                            i=0;
                        };   
            }
            return n;
        }
        public int buscaColunaAbaixo(int x,int y){
            int n=0;
             for (int i = x;i<tab.length; i++) { 
                if(tab[i][y].toString()=="-"){
                     n++;
                }else
                    if(tab[i][y].toString()=="P"){
                        i=tab.length;
                    }else
                        if(tab[i][y].toString()=="L"){
                            i=tab.length;
                        };   
            }
            return n;
        }
        public int buscaDiagonalPrincipalDireita(int x,int y){
            int n=0;
            for (int i = x, j=y;i<tab.length&&j<tab.length;j++, i++) { 
                if(tab[i][j].toString()=="-"){
                     n++;
                }else
                    if(tab[i][j].toString()=="P"){
                        i=tab.length;
                        j=tab.length;
                    }else
                        if(tab[i][j].toString()=="L"){
                            i=tab.length;
                            j=tab.length;
                        };     
            }
            return n;
        }
        public int buscaDiagonalPrincipalEsquerda(int x,int y){
            int n=0;
           for (int i=x, j=y;i>=0&&j>=0;j--, i--) { 
                if(tab[i][j].toString()=="-"){
                     n++;
                }else
                    if(tab[i][j].toString()=="P"){
                        i=0;
                        j=0;
                    }else
                        if(tab[i][j].toString()=="L"){
                            i=0;
                            j=0;
                        }; 
           }        
            return n;
        }
        public int buscaDiagonalSecundariaEsquerda(int x,int y){
            int n=0;
           for (int i=x, j=y;i>=0&&j>=0;j++, i--) { 
                if(tab[i][j].toString()=="-"){
                     n++;
                }else
                    if(tab[i][j].toString()=="P"){
                        i=0;
                        j=tab.length;
                    }else
                        if(tab[i][j].toString()=="L"){
                            i=0;
                            j=tab.length;
                        }; 
           }        
            return n;
        }
        public int buscaDiagonalSecundariaDireita(int x,int y){
            int n=0;
           for (int i=x, j=y;i>=0&&j>=0;j--, i++) { 
                if(tab[i][j].toString()=="-"){
                     n++;
                }else
                    if(tab[i][j].toString()=="P"){
                        i=tab.length;
                        j=0;
                    }else
                        if(tab[i][j].toString()=="L"){
                            i=tab.length;
                            j=0;
                        }; 
           }        
            return n;
        }

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
                 System.out.println("DiagPrinBaixo->  "+buscaDiagonalPrincipalDireita(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("DiagPrinCima->  "+buscaDiagonalPrincipalEsquerda(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("DiagSecCima->  "+buscaDiagonalSecundariaEsquerda(x, y));
                 System.out.println("----------------------------------");
                 System.out.println("DiagSecCima->  "+buscaDiagonalSecundariaDireita(x, y));
                 System.out.println("----------------------------------");
                 
        }
    }
    
    
    

