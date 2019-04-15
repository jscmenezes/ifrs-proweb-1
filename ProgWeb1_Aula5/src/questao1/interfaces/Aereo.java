/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1.interfaces;

/**
 *
 * @author silviacb
 */
public interface Aereo {
    public default void imprimir() {
        System.out.println("Anda no Ar!");
    }
}
