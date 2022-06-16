/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Cliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class ClienteTxt {
    
    public boolean AgregarCliente(Cliente objetoCliente) throws IOException{
        File file = new File("Cliente.txt");
        FileWriter fileWrite = new FileWriter(file,false);
        
        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
        bufferWrite.write(Integer.toString(objetoCliente.getId_cliente())+",");
        bufferWrite.write(objetoCliente.getNom_cliente()+",");
        bufferWrite.write(String.valueOf(objetoCliente.getFecha_m())+"\n");

        bufferWrite.close();
        fileWrite.close();
        return true;
    }
    
    public static ArrayList<Cliente> LeerClientes(ArrayList<Cliente> ArrayClientes){        
        File f = new File("Cliente.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Cliente Objtmp = new Cliente(
                             Integer.valueOf(st.nextToken()), 
                             st.nextToken(),                          
                             st.nextToken()                            
                     );
                     ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }
            
}
