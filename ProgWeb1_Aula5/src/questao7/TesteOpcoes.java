/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import javax.swing.JOptionPane;

/**
 *
 * @author silviacb
 */
public class TesteOpcoes {
    public static void main(String[] args) {
        int opcao = montaMenu();
        switch(opcao){
            case 3: JOptionPane.showMessageDialog(null, "Abrir");
                break;
        }
    }
    private static int montaMenu(){
        String str = "";
        for(OpcoesMenu op : OpcoesMenu.values())
            str +=  op.toString() + "\n";
        return Integer.parseInt(JOptionPane.showInputDialog(str));             
    }
}
