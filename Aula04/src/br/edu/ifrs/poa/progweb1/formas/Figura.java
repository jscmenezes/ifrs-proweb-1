
package br.edu.ifrs.poa.progweb1.formas;

import br.edu.ifrs.poa.progweb1.util.Cor;

public abstract class Figura {
    
    public static int contador;
    public Cor cor;

    public Figura() {
    }

    public Figura(int contador) {
        this.contador = contador;
    }
    
    public static int getContador(){
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public abstract double calculaArea();
    
    @Override
    public String toString() {
        return "Figura{" + "contador=" + contador + '}';
    }
    
    
}
