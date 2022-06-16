/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Cliente;
import Logica.LogicaClienteBinario;
import Logica.LogicaClienteTxt;
import static Presentacion.ArchivoTexto.objetoLogicaClienteTxt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class ArchivoBinario {
    
    static LogicaClienteBinario objetoLogicaClienteBin = new LogicaClienteBinario();
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarClienteBinario();
        AgregarClienteBinario();
        ListarClienteBinario();     
    }
    
    void menuArchivoBinario() throws IOException, FileNotFoundException, ClassNotFoundException{
        
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
                case 1: AgregarClienteBinario();    
                break;
                case 2: EliminarClienteBinario();
                break;
                case 3: ListarClienteBinario();
                break;
                
            }
        }
    }

    private static void AgregarClienteBinario() throws IOException {
        
        Cliente objetoCliente = new Cliente();
        
        objetoCliente.setId_cliente(1);
        objetoCliente.setNom_cliente("Jorge");
        objetoCliente.setFecha_m("06-14-22");
        objetoLogicaClienteTxt.ValidarId(objetoCliente);
        
        if (objetoLogicaClienteTxt.ValidarId(objetoCliente)) {
            System.out.println("Cliente agregado");          
        }
        else{
            System.out.println("Codigo invalido");    
        }
        
    }

    private static void ListarClienteBinario() throws IOException, FileNotFoundException, ClassNotFoundException {
        
        ArrayList<Cliente> ArrayClientes = new ArrayList<Cliente>();
        objetoLogicaClienteBin.ListarClientes(ArrayClientes);
        for (Cliente tmpCliente : ArrayClientes) {
            System.out.println(tmpCliente.toString());
        }
    }

    private void EliminarClienteBinario() {
       
    }
    
}
