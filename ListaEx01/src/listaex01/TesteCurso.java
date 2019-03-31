
package listaex01;

import listaex01.Curso;

public class TesteCurso {
    public static void main(String[] args){
        Data data1 = new Data(5,6,3);
        Curso curso1 = new Curso("Blabla", 8, data1);
        System.out.println(curso1.toString());
    }
}
