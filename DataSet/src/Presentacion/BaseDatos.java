/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import java.util.Scanner;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class BaseDatos {
    
    void menuArchivoTexto(){
        
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
                case 1: AgregarClienteDB();    
                break;
                case 2: EliminarClienteDB();
                break;
                case 3: ListarClienteDB();
                break;
                
            }
        }
    }

    private void AgregarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void EliminarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ListarClienteDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
