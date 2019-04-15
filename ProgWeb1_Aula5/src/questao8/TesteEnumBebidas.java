/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import questao9.Enumeracoes;

/**
 *
 * @author silviacb
 */
public class TesteEnumBebidas {
    public static void main(String[] args) {
        System.out.println(Bebida.CocaCola + 
                          ": R$" + Bebida.CocaCola.getPreco());
        
        for (Bebida bebida : Bebida.values()) {
            System.out.println(bebida.toString());
        }
    }
}
