/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.ClienteTxt;
import Clases.Cliente;
import Presentacion.ArchivoTexto;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class LogicaClienteTxt {
    
    ClienteTxt objetoClieneTxt = new ClienteTxt();
    ArchivoTexto objetoArchivoTexto = new ArchivoTexto();
    
    public boolean ValidarId( Cliente objetoCliente) throws IOException {
        if (objetoCliente.getId_cliente() > 0) {                     
           return objetoClieneTxt.AgregarCliente(objetoCliente);
        } 
        return false;
    }
    
    public void ListarClientes(ArrayList<Cliente>ArrayClientes){
        objetoClieneTxt.LeerClientes(ArrayClientes);
    }  
}
