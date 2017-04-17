/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninversiones;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Bank {
    
    //La clave string me permite ordenar los atributos de Client tipo String
    private HashMap<String, Client> clients;

    public Bank() {
        this.clients = new HashMap<>();
    }
     public void addClients(Client client){
         this.clients.put(client.getEmail(), client);
     }
     
     //recorro todos los clientes en los clientes todas las acciones
     public double getAllMarketValue (){
         double total = 0;
         for (Client client: this.clients.values()) {
             for(Asset asset : client.getAssets()){
                 total+=asset.getMarketValue();
             }
         }
         return total;
     }


    public double getAllProfit (){
         double total = 0;
         for (Client client: this.clients.values()) {
             for(Asset asset : client.getAssets()){
                 total+=asset.getProfit();
             }
         }
         return total;
     }
}