package com.mycompany.maquinadispensadora;


import java.util.ArrayList;
import java.util.Scanner;

public class Maquina {
	private String nombreMaquina;
	private int monederoMaquina;
        private int codigoProductoSeleccionado;

	public Maquina(String nombreDeMaquina) {
		this.nombreMaquina = nombreDeMaquina;
	}

        public String getNombreMaquina() {
            return nombreMaquina;
        }

	public void mostrarProductos(ArrayList<Producto> productos) {
                System.out.println("-------------------------");
                System.out.println(this.nombreMaquina);
                System.out.println("-------------------------");
                System.out.println("--------Productos--------");
                System.out.println("-------------------------");
		for (int i = 0; i < productos.size() ; i++) {
                    System.out.println("| Código: " + productos.get(i).getCodigoProducto()  + 
                            "\n" + "| Nombre: " + productos.get(i).getNombreProducto() + 
                            "\n" + "| Precio: " + productos.get(i).getPrecioProducto() );
                    System.out.println("-------------------------");
                }
	}

	public void recibirDinero() {
                System.out.println("Ingrese su Dinero");
                Scanner scanner = new Scanner(System.in);
                this.monederoMaquina = scanner.nextInt();
	}

	public void obtenerSeleccionProducto() {
                System.out.println("Ingrese el Codigo de su Producto: ");
                Scanner scanner = new Scanner(System.in);
                this.codigoProductoSeleccionado = scanner.nextInt();
                System.out.println("Usted a seleccionado el codigo: " + this.codigoProductoSeleccionado);
	}

	public void calcularVuelto(int precioProducto) {
                Calculadora calculadora = new Calculadora();
                this.monederoMaquina = calculadora.restar(monederoMaquina, precioProducto);
	}

	public void dispensarProducto(ArrayList<Producto> productos) {
		for (int i = 0; i < productos.size(); i++) {
                    if(productos.get(i).getCodigoProducto()== this.codigoProductoSeleccionado){
                        System.out.println("Usted ha comprado: " + productos.get(i).getNombreProducto() + " a un precio de: $" + productos.get(i).getPrecioProducto() + " pesos");
                        calcularVuelto(productos.get(i).getPrecioProducto());
                        productos.remove(i);
                        break;
                    }
                }
                this.codigoProductoSeleccionado = 0;
	}

	public void devolverVuelto() {
		System.out.println("Su vuelto es : $" + this.monederoMaquina + " pesos.");
                this.monederoMaquina = 0;
	}
}