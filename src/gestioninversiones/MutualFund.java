/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninversiones;

/**
 *
 * @author Estudiante
 */
public class MutualFund extends ShareAsset{
   protected double totalShares;

    @Override
    public double getMarketValue() {
        //las acciones que tengo por lo que cuesta cada accion
       return this.totalShares* this.currentPrice;
    }
    
    //El siguiente metodo esta sobreescrito, ya esta en los padres 
    @Override
    public double getProfit() {
      return(this.totalShares* this.currentPrice)-this.totalCost;
    }
   
}
