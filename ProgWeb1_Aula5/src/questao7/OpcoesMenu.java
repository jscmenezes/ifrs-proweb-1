/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

/**
 *
 * @author silviacb
 */
public enum OpcoesMenu {	
	SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	OpcoesMenu(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
        @Override
        public String toString(){
            return this.getValor() + " - " + this.name();
        }
}

