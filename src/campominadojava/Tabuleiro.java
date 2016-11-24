
package campominadojava;
import java.util.Random;

/**
 *
 * @author alessandros
 */
public class Tabuleiro{
    protected Celula tab[][];
    private int vida;
    private int tentativa;

    
    public Tabuleiro(int tamanho) {
        this.tab = new Celula[tamanho][tamanho];
        this.vida = 5;
        this.tentativa = 0;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }
    
    public void editaTabuleiro(String str,int x,int y){
        this.tab[x][y].setIcon(str);
                
    }
    
    public void insereNoTabuleiro(Celula celula,int x, int y){
        this.tab[x][y] = celula;
    }
    
    public void insereNovoTabuleiro(){
         int bL = calculaTotalBombaLeve();
         int bP = calculaTotalBombas()-bL;
         int x ,y;
         Random r = new Random();
         MinaBombaPesada pesada = new MinaBombaPesada("Pesada", "P", 2);
         MinaBombaLeve leve = new MinaBombaLeve("Leve", "L", 1);
         MinaVazia vazia = new MinaVazia("Vazia", "-", 0);
           
                   for (int i = 0; i < bP; i++) {//Insere Bombas pesadas
                   x = r.nextInt(tab.length);
                   y = r.nextInt(tab.length); 
                        if(tab[x][y]==null){
                       insereNoTabuleiro(pesada, x, y);
                   }else{
                            i--;
                        }
                   }
                       for (int i = 0; i < bL; i++) { //Insere Bombas Leves
                            x = r.nextInt(tab.length);
                            y = r.nextInt(tab.length); 
                                if(tab[x][y]==null){
                                insereNoTabuleiro(leve, x, y);
                            }else{ 
                                    i--;
                                }
                       }
                       for (int i = 0; i < tab.length; i++) {//Insere Campos vazios
                           for (int j = 0; j < tab.length; j++) {
                                 if(tab[i][j]==null){
                                insereNoTabuleiro(vazia, i, j);     
                              }
                               
                           }
                       }         
                    

         System.out.println("");
         System.out.println("Total de Bombas : "+calculaTotalBombas());
         System.out.println("Bombas Leves: "+bL);
         System.out.println("Bombas Pesada: "+bP);
         System.out.println("");
    }
                       
    public int calculaTotalBombas(){
        double cont=tab.length*tab.length;
        int totalBombas = (int) (Math.round(cont*0.45));
        return totalBombas;
    }
    public int calculaTotalBombaLeve(){
       int totalBombasLeves=(int)Math.round(calculaTotalBombas()*0.4);
        return totalBombasLeves;
    }
    public void imprimeTabuleiro(){
        for (int i = 0; i < tab.length; i++) {
            Celula[] celulas = tab[i];
             System.out.print(" C-"+i+" ");
        }
        System.out.print("=====");
        for (int i = 0; i < tab.length; i++) {
           
            for (int j = 0; j < tab.length; j++) {
                if(j==0){
                    System.out.println("");
                }
                System.out.print(" ["+tab[i][j]+"] "); 
            }
            System.out.print("|L-"+i+"|");
        }
    }

    public Celula getTab(Celula celula,int x, int y){
        return tab[x][y];
    }
   
    
}
