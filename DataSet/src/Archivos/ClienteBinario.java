/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Cliente;
import Logica.MiObjectOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class ClienteBinario {
    static String fichero = "ClientesBin.dat";
    public static boolean GrabarClienteBin(ArrayList<Cliente> ArrayClientes) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Cliente ObjCliente:  ArrayClientes){
            // grabar todo el objeto
            oos.writeObject(ObjCliente);
        }
        oos.close();  // Se cierra al terminar.
        return true;
    }
    
    public static void ImportarClienteBin(ArrayList<Cliente> ArrayClientes) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Cliente aux = (Cliente) ois.readObject();
            while (aux!=null){
                if (aux instanceof Cliente) {               
                    //System.out.println(aux);
                    ArrayClientes.add((Cliente)aux);
                }
                aux = (Cliente) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
    
    public static void AddClienteBin (ArrayList<Cliente> ArrayClientes)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Cliente ObjCliente:  ArrayClientes){
                oos.writeUnshared(ObjCliente);
        }
        oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
            
}
