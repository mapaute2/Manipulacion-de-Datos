/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class DataSet {
    
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        ArchivoTexto objetoTexto = new ArchivoTexto();
        int num = 0;
        
        while( num < 4 ){     
            System.out.println("**Menu**");
            System.out.println("1: Texto");
            System.out.println("2: Binario");
            System.out.println("3: Data Base");
            System.out.println("4: Salir");
            System.out.println("\n");
            System.out.println("Ingrese el numero: ");
            num = scan.nextInt();
            
            switch(num){
                case 1: objetoTexto.menuArchivoTexto();
                break;
//                case 2: menuBinario();
//                break;
//                case 3: menuDataBase();
//                break;
                
            }
        }
    }
}
