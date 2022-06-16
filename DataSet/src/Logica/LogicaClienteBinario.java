/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.ClienteBinario;
import Archivos.ClienteTxt;
import Clases.Cliente;
import Presentacion.ArchivoTexto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class LogicaClienteBinario {
    
    ClienteBinario objetoClieneBinario = new ClienteBinario();
    
    public boolean ValidarId( Cliente objetoCliente) throws IOException {
        
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        if (objetoCliente.getId_cliente() > 0) {         
           ArrayClientes.add(objetoCliente);
           return objetoClieneBinario.GrabarClienteBin(ArrayClientes);
        } 
        return false;
    }
    
    public void ListarClientes(ArrayList<Cliente>ArrayClientes) throws IOException, FileNotFoundException, ClassNotFoundException{
        objetoClieneBinario.ImportarClienteBin(ArrayClientes);
    }  
}
