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

    public void addClients(Client client) {
        this.clients.put(client.getEmail(), client);
    }

    //recorro todos los clientes en los clientes todas las acciones
    public double getAllMarketValue() {
        double total = 0;
        for (Client client : this.clients.values()) {
            for (Asset asset : client.getAssets()) {
                total += asset.getMarketValue();
            }
        }
        return total;
    }

    public double getAllProfit() {
        double total = 0;
        for (Client client : this.clients.values()) {
            for (Asset asset : client.getAssets()) {
                total += asset.getProfit();
            }
        }
        return total;
    }

    //En una variable hashMap estamos guardando 4 valores 
    public HashMap getAllByTypesAssets() {
        HashMap<String, Double> total = new HashMap<>();
        for (Client client : this.clients.values()) {
            for (Asset asset : client.getAssets()) {
                //instanceof - ¿Es de tipo cash?
                if (asset instanceof Cash) {
                    //si total no contiene la clave cash, su valor  es el valor que esta almacenado
                    if (!total.containsKey("cash")) {
                        total.put("cash", asset.getMarketValue());
                    } else {
                        // total.put("cash",+ asset.getMarketValue());
                        Double valorActual = total.get("cash");
                        Double nuevoValor = valorActual + asset.getMarketValue();
                        total.put("cash", nuevoValor);
                    }
                } else if (asset instanceof MutualFund) {
                    if (!total.containsKey("MutualFund")) {
                        total.put("MutualFund", asset.getMarketValue());
                    } else {
                        Double valorActual = total.get("MutualFund");
                        Double nuevoValor = valorActual + asset.getMarketValue();
                        total.put("MutualFund", nuevoValor);
                    }
                } else if (asset instanceof Stock) {
                    if (!total.containsKey("MutualFund")) {
                        total.put("MutualFund", asset.getMarketValue());
                    } else {
                        Double valorActual = total.get("MutualFund");
                        Double nuevoValor = valorActual + asset.getMarketValue();
                        total.put("MutualFund", nuevoValor);
                    }
                } else if (asset instanceof DividentStock) {
                    if (!total.containsKey("DividentStock")) {
                        total.put("DividentStock", asset.getMarketValue());
                    } else {
                        Double valorActual = total.get("DividentStock");
                        Double nuevoValor = valorActual + asset.getMarketValue();
                        total.put("DividentStock", nuevoValor);
                    }
                } else if (asset instanceof Stock) {
                    if (!total.containsKey("Stock")) {
                        total.put("Stock", asset.getMarketValue());
                    } else {
                        Double valorActual = total.get("Stock");
                        Double nuevoValor = valorActual + asset.getMarketValue();
                        total.put("Stock", nuevoValor);
                    }
                }

            }
        }
        return total;
    }

    public Client getMaxProfit() {
        for (Client client : this.clients.values()) {
            for (int i = 0; i < client.getAsset().size(); i++) {
                
            }

            
        }
        return null;
    }
}
