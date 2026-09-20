package model;

import java.util.List;

public class Cliente {
    //Atributos de Cliente
    private String nombre;
    private int identificacion;
    private String correo;
    private int telefono;
    private String direccion;

    // Lista Cliente -> Pedido
    private List<Pedido> listClientePedidos;

    /**
     * Metodo constructor de la clase Cliente
     * @param nombre del cliente
     * @param identificacion del cliente
     * @param correo del cliente
     * @param telefono del cliente
     * @param direccion del cliente
     */
    public Estudiante(String nombre, int identificacion, String correo, int telefono, String direccion;){
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Pedido> getListClientePedidos() {
        return listClientePedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListClientePedidos(List<Pedido> listClientePedidos) {
        this.listClientePedidos = listClientePedidos;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", listClientePedidos=" + listClientePedidos +
                '}';
    }
}