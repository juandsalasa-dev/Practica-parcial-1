package model;

import java.util.List;

public class Carrito {
    // Atributos de Carrito
    private int cantidad;
    private double precioAplicado;
    private double subtotal;

    // Relacion Producto -> Carrito
    private List<Producto> listCarritoProductos;

    /**
     * Método Constructor de Carrito
     * @param cantidad
     * @param precioAplicado
     * @param subtotal
     * @param listCarritoProductos
     */
    public Carrito(int cantidad, double precioAplicado, double subtotal, List<Producto> listCarritoProductos) {
        this.cantidad = cantidad;
        this.precioAplicado = precioAplicado;
        this.subtotal = subtotal;
        this.listCarritoProductos = listCarritoProductos;
    }

    //GETTERS & SETTERS

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioAplicado() {
        return precioAplicado;
    }

    public void setPrecioAplicado(double precioAplicado) {
        this.precioAplicado = precioAplicado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public List<Producto> getListCarritoProductos() {
        return listCarritoProductos;
    }

    public void setListCarritoProductos(List<Producto> listCarritoProductos) {
        this.listCarritoProductos = listCarritoProductos;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Carrito{" +
                "cantidad=" + cantidad +
                ", precioAplicado=" + precioAplicado +
                ", subtotal=" + subtotal +
                ", listCarritoProductos=" + listCarritoProductos +
                '}';
    }
}