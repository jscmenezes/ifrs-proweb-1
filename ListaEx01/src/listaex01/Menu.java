
package listaex01;

import java.util.Scanner;

public class Menu {
    
    public static int montaMenu(){
        Scanner in = new Scanner(System.in);
        String menu = "Escolha uma opção:\n";
                menu += "\n";
                menu += "1 - Cadastrar Curso\n";
                menu += "2 - Pesquisar curso por nome\n";
                menu += "3 - Pesquisar curso por data em que ocorre\n";
                menu += "4 - Listar todos os cursos\n";
                menu += "\n";
                menu += "0 - Sair\n";
        
        System.out.println(menu);
        return in.nextInt();
        
    }
    
}
