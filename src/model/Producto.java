package model;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    //Atributos de producto
    private int codigo, precio, cantDisponile;
    private String nombre, descripcion ;

    //Relación Productos -> Carrito
    private List<Carrito> listProductoCarritos;

    /**
     * Método Constructor de Producto
     * @param codigo del producto
     * @param precio del producto
     * @param cantDisponile del producto
     * @param nombre del producto
     * @param descripcion del producto
     */
    public Producto(int codigo, int precio, int cantDisponile, String nombre, String descripcion){
        this.codigo = codigo;
        this.precio = precio;
        this.cantDisponile = cantDisponile;
        this.nombre = nombre;
        this.descripcion = descripcion;

        this.listProductoCarritos= new ArrayList<>();
    }

    //GETTERS & SETTERS

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantDisponile() {
        return cantDisponile;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Carrito> getListProductoCarritos() {
        return listProductoCarritos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantDisponile(int cantDisponile) {
        this.cantDisponile = cantDisponile;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setListProductoCarritos(List<Carrito> listProductoCarritos) {
        this.listProductoCarritos = listProductoCarritos;
    }

    @java.lang.Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", cantDisponile=" + cantDisponile +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listProductoCarritos=" + listProductoCarritos +
                '}';
    }
}
