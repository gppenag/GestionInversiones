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
public class GestionInversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un unico banco
        Bank banco = new Bank();
        
        Client client1 = new Client("g", "G", "123", 12, "gggg");
        Client client2 = new Client("h", "H", "123", 12, "hhh");
        
        Asset activo1 = new Cash(100);
        Asset activo2 = new Stock(2,"google", 100, 80);
        client1.addAsset(activo1);
        client1.addAsset(activo2);
        banco.addClients(client1);
        
        Asset activo3 = new MutualFund(symbol, 0, 0)
    }
    
}
