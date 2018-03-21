package com.mycompany.maquinadispensadora;

public class Producto {
	private String nombreProducto;
	private int precioProducto;
	private int codigoProducto;

	public Producto(String nombreDeProducto, int precioDeProducto, int codigoDeProducto) {
		this.nombreProducto = nombreDeProducto;
                this.precioProducto = precioDeProducto;
                this.codigoProducto = codigoDeProducto;
	}

        public String getNombreProducto() {
            return nombreProducto;
        }

        public int getPrecioProducto() {
            return precioProducto;
        }

        public int getCodigoProducto() {
            return codigoProducto;
        }
}