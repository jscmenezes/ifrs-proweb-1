
package listaex01;

import java.util.Scanner;
import static listaex01.Menu.montaMenu;

public class TesteMenu {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Curso cursos[] = new Curso[100];
        int cont = 0;
        
        while(true){
            int opcao = montaMenu();
            switch(opcao){
                case 1:
                    System.out.println("\n\nCadastro de curso: ");
                    System.out.println("\n");
                    
                    System.out.println("Nome: \n");
                    String nome = in.nextLine();
                    System.out.println("Duracao: \n");
                    double duracao = in.nextDouble();
                    System.out.println("Data: \n\n");
                    System.out.println("dia: \n");
                    int dia = in.nextInt();
                    System.out.println("mês: \n");
                    int mes = in.nextInt();
                    System.out.println("ano: \n");
                    int ano = in.nextInt();
                    
                    System.out.println("Cadastrando o curso " + nome + " ...\n");
                    
                    cursos[cont] = new Curso(nome, duracao, new Data(dia,mes,ano));
                    
                    System.out.println("Cadastramento realizado!\n");
                    System.out.println("\n");
                    System.out.println("Nome: " + nome + "\n");
                    System.out.println("Duracao: "+ duracao + "\n");
                    System.out.println("Data: " + dia + "/" + mes + "/" + ano + "\n");
                    System.out.println("\n");
                    break;
                
                case 0:
                    System.out.println("Saindo..");
                    System.exit(0);
                    break;
                
            }
        }
        
    
    }
    
}
