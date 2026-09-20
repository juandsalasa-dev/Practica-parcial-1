package model;

import java.util.List;

public class Tienda {
     public String nombre, horario, direccion;
     public int cantEmpleados, telefono, nit;

     private List<Cliente> listTiendaClientes;
     private List<Pedido> listTiendaPedidos;
     private List<Pago> listTiendaPagos;
     private List<Producto> listTiendaProductos;


}
