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
public abstract class  Celula {
    
    private String tipo;
    private String icon;
    private int    valor;

    public Celula(String tipo, String icon, int valor) {
        this.tipo = tipo;
        this.icon = icon;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return   icon ;
    }
    
    
}
