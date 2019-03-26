
package aula01_ex01;

import aula01_ex01.Curso;

public class Aula01_Ex01 {

    public static void main(String[] args) {
        
        Data d = new Data(02,01,1982);
        
        Curso c = new Curso("Topicos de Inteligencia Artificial", 8, d);
        
        System.out.println(c.toString());
        
        c.setNome("Programacao Web I");
        c.setDuracao(6);
        
        System.out.println(c.toString());
        
    }
    
}
