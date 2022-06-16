/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Logica.LogicaClienteTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class ArchivoTexto {
    
     static LogicaClienteTxt objetoLogicaClienteTxt = new LogicaClienteTxt();
    
    public static void main(String[] args) throws IOException {
       
        AgregarClienteTexto();
        AgregarClienteTexto();
        //System.out.println("Cliente agregado");
        ListarClienteTexto();
    }
    
    void menuArchivoTexto() throws IOException{
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        while( num < 4 ){   
            System.out.println("**Menu**");
            System.out.println("1: AGREGAR");
            System.out.println("2: ELIMINAR");
            System.out.println("3: LISTAR");
            System.out.println("4: SALIR");
            System.out.println("\n");
            System.out.println("Ingrese el numero: ");
            num = scan.nextInt();
            
            switch(num){
                case 1: AgregarClienteTexto();    
                break;
                case 2: EliminarClienteTexto();
                break;
                case 3: ListarClienteTexto();
                break;
                
            }
        }
    }

    private static void AgregarClienteTexto() throws IOException {
        
        Cliente objetoCliente = new Cliente();
        
        objetoCliente.setId_cliente(1);
        objetoCliente.setNom_cliente("Maria Alejandra");
        objetoCliente.setFecha_m("06-15-22");
        objetoLogicaClienteTxt.ValidarId(objetoCliente);
        
        if (objetoLogicaClienteTxt.ValidarId(objetoCliente)) {
            System.out.println("Cliente agregado");          
        }
        else{
            System.out.println("Codigo invalido");    
        }
    }

    private void EliminarClienteTexto() {
    
    }

    private static void ListarClienteTexto() {
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objetoLogicaClienteTxt.ListarClientes(ArrayClientes);
        for (Cliente tmpCliente : ArrayClientes) {
            System.out.println(tmpCliente.toString());
        }
    }
    
    
}
