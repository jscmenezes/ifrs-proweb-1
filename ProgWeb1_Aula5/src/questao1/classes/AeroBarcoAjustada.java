/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1.classes;

import questao1.interfaces.Aquatico;
import questao1.interfaces.Terrestre;

/**
 *
 * @author silviacb
 */
public class AeroBarcoAjustada implements Aquatico, Terrestre{
    @Override
    public void imprimir() {
        System.out.println("Anda na Terra e na Água!");
    }
}
