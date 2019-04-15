/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

/**
 *
 * @author silviacb
 */
public enum Bebida {
  CocaCola(2.00),
  Suco(1.50),
  Agua(1.00);

  private double preco;
  
  Bebida(double preco){
   this.preco = preco;
  }

  public double getPreco(){
   return this.preco;
  }
 }


