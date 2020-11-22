/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import gestioclientes.dto.Cliente;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class LogicaNegocio { //Clase que manejará la lista de los clientes
    
    private static ArrayList<Cliente>listaClientes=new ArrayList<>();
    
    public static void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
        
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
}
