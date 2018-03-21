/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maquinadispensadora;

import java.util.ArrayList;

/**
 *
 * @author Marcos Pinilla
 */
public class MaquinaDispensadora {
    
    public static void llenarMaquinaDispensadora (ArrayList<Producto> productos){
        productos.add(new Producto("Chocman", 200, 1));
        productos.add(new Producto("Chocman", 200, 1));
        productos.add(new Producto("Tuyo", 150, 2));
        productos.add(new Producto("Golazo", 250, 3));
        productos.add(new Producto("Golazo", 250, 3));
        productos.add(new Producto("Kryspo", 500, 4));
        productos.add(new Producto("Tuareg", 650, 5));
        productos.add(new Producto("Triton", 800, 6));
        productos.add(new Producto("Triton", 800, 6));
        productos.add(new Producto("Nik", 700, 7));
    }
    
    public static void main(String[] args) {
        Maquina maquinaSnacks = new Maquina("Maquina de Snacks");
        
        ArrayList<Producto> productos = new ArrayList();
        
        llenarMaquinaDispensadora (productos);
        
        maquinaSnacks.mostrarProductos(productos);
        
        maquinaSnacks.recibirDinero();
        
        maquinaSnacks.obtenerSeleccionProducto();
        
        maquinaSnacks.dispensarProducto(productos);
        
        maquinaSnacks.devolverVuelto();
        
        maquinaSnacks.mostrarProductos(productos);
        
        System.out.println(" Gracias por operar con " + maquinaSnacks.getNombreMaquina());
        
    }
}
