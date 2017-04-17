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
public class Stock extends ShareAsset {
    protected int totalShares;

    public Stock(int totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    
    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }
    
    
    
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
