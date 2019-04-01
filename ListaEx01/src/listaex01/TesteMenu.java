
package listaex01;

import java.util.Scanner;
import static listaex01.Menu.montaMenu;

public class TesteMenu {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int cont = 0;
        
        while(true){
            int opcao = montaMenu();
            switch(opcao){
                case 1:
                    System.out.println("\nVoce digitou " + opcao + "\n");
                    break;
                
                case 0:
                    System.out.println("Saindo..");
                    System.exit(0);
                    break;
                
            }
        }
        
    
    }
    
}
