/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author María Alejandra Paute
 * fecha: 15 de junio de 2022
 */
public class Cliente implements Serializable{
    
    int id_cliente;
    String nom_cliente;
    String fecha_m;

    public Cliente(int id_cliente, String nom_cliente, String fecha_m) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.fecha_m = fecha_m;
    }

    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getFecha_m() {
        return fecha_m;
    }

    public void setFecha_m(String fecha_m) {
        this.fecha_m = fecha_m;
    }

}
