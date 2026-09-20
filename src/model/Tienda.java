package model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
     //Atributos de la Tienda
     public String nombre, horario, direccion;
     public int cantEmpleados, telefono, nit;

     //Relaciones de la tienda, clientes, pedidos, pagos y productos
     private List<Cliente> listTiendaClientes;
     private List<Pedido> listTiendaPedidos;
     private List<Pago> listTiendaPagos;
     private List<Producto> listTiendaProductos;

     /**
      *
      * @param nombre de la tienda
      * @param horario de la tienda
      * @param direccion de la tienda
      * @param cantEmpleados de la tienda
      * @param telefono de la tienda
      * @param nit de la tienda
      */
     public Tienda(String nombre, String horario, String direccion, int cantEmpleados, int telefono, int nit){
          this.direccion = direccion;
          this.nombre = nombre;
          this.telefono = telefono;
          this.nit = nit;
          this.listTiendaClientes = new ArrayList();
          this.listTiendaPedidos = new ArrayList();
          this.listTiendaPagos = new ArrayList();
          this.listTiendaProductos = new ArrayList();
     }

     //GETTERS & SETTERS

     public String getNombre() {
          return nombre;
     }

     public String getHorario() {
          return horario;
     }

     public String getDireccion() {
          return direccion;
     }

     public int getCantEmpleados() {
          return cantEmpleados;
     }

     public int getTelefono() {
          return telefono;
     }

     public int getNit() {
          return nit;
     }

     public List<Cliente> getListTiendaClientes() {
          return listTiendaClientes;
     }

     public List<Pedido> getListTiendaPedidos() {
          return listTiendaPedidos;
     }

     public List<Pago> getListTiendaPagos() {
          return listTiendaPagos;
     }

     public List<Producto> getListTiendaProductos() {
          return listTiendaProductos;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public void setHorario(String horario) {
          this.horario = horario;
     }

     public void setDireccion(String direccion) {
          this.direccion = direccion;
     }

     public void setCantEmpleados(int cantEmpleados) {
          this.cantEmpleados = cantEmpleados;
     }

     public void setTelefono(int telefono) {
          this.telefono = telefono;
     }

     public void setNit(int nit) {
          this.nit = nit;
     }

     public void setListTiendaClientes(List<Cliente> listTiendaClientes) {
          this.listTiendaClientes = listTiendaClientes;
     }

     public void setListTiendaPedidos(List<Pedido> listTiendaPedidos) {
          this.listTiendaPedidos = listTiendaPedidos;
     }

     public void setListTiendaPagos(List<Pago> listTiendaPagos) {
          this.listTiendaPagos = listTiendaPagos;
     }

     public void setListTiendaProductos(List<Producto> listTiendaProductos) {
          this.listTiendaProductos = listTiendaProductos;
     }

     @java.lang.Override
     public java.lang.String toString() {
          return "Tienda{" +
                  "nombre='" + nombre + '\'' +
                  ", horario='" + horario + '\'' +
                  ", direccion='" + direccion + '\'' +
                  ", cantEmpleados=" + cantEmpleados +
                  ", telefono=" + telefono +
                  ", nit=" + nit +
                  ", listTiendaClientes=" + listTiendaClientes +
                  ", listTiendaPedidos=" + listTiendaPedidos +
                  ", listTiendaPagos=" + listTiendaPagos +
                  ", listTiendaProductos=" + listTiendaProductos +
                  '}';
     }
}
