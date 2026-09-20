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
     private List<Carrito> listTiendacarrito;

     /**
      *Metdodo constructor de la tienda
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
          this.listTiendacarrito= new ArrayList<>();
     }

     // METODOS CRUD PRODUCTOS


     /**
      * metodo para crear un producto
      * @param codigo del producto
      * @param precio del producto
      * @param cantDisponible del producto
      * @param nombre del producto
      * @param descripcion del producto
      * @return
      */

     public boolean crearProducto(int codigo, int precio, int cantDisponible, String nombre, String descripcion) {
          boolean creado = false;
          Producto producto = buscarProducto(codigo);
          if (producto == null) {
               Producto produ = new Producto(codigo,precio, cantDisponible,nombre,descripcion);
               listTiendaProductos.add(produ);
               creado = true;
          }
          return creado;
     }

     /**
      * metodo para buscar el producto
      * @param codigo del producto
      * @return
      */

     public Producto buscarProducto(int codigo){
          Producto encontrado = null;
          for (int i = 0; i < listTiendaProductos.size(); i++) {
               Producto producto = listTiendaProductos.get(i);
               if (producto.getCodigo() == codigo) {
                    encontrado = producto;
                    break;
               }
          }
          return encontrado;
     }

     /**
      * metodo para actualizar datos del producto
      * @param codigo
      * @param nuevoPrecio
      * @param nuevaCantDisponible
      * @param nuevoNombre
      * @param nuevaDescripcion
      * @return
      */

     public boolean actualizarProducto(int codigo, int nuevoPrecio, int nuevaCantDisponible, String nuevoNombre, String nuevaDescripcion) {
          boolean actualizado = false;
          Producto producto = buscarProducto(codigo);
          if (producto != null) {
               producto.setPrecio(nuevoPrecio);
               producto.setCantDisponile(nuevaCantDisponible);
               producto.setNombre(nuevoNombre);
               producto.setDescripcion(nuevaDescripcion);
               actualizado = true;
          }
          return actualizado;
     }

     /**
      * Metodo para eliminar producto
      * @param codigo del Producto
      * @return
      */
     public boolean eliminarProducto(int codigo) {
          Producto producto = buscarProducto(codigo);
          if (producto != null) {
               listTiendaProductos.remove(producto);
               return true;
          }
          return false;
     }


     //METODOS CRUD PEDIDOS

     /**
      * metodo para crear pedido
      * @param numeroPedido
      * @param fechaCreacion
      * @param estado
      * @param valorTotal
      * @return
      */
     public boolean crearPedido(int numeroPedido, String fechaCreacion, String estado, double valorTotal) {
          boolean creado = false;
          Pedido pedido = buscarPedido(numeroPedido);
          if (pedido == null) {
               Pedido nuevoPedido = new Pedido(numeroPedido, fechaCreacion, estado, valorTotal);
               listTiendaPedidos.add(nuevoPedido);
               creado = true;
          }
          return creado;
     }

     /**
      * metodo para buscar pedido
      * @param numeroPedido
      * @return
      */
     public Pedido buscarPedido(int numeroPedido) {
          Pedido encontrado = null;
          for (int i = 0; i < listTiendaPedidos.size(); i++) {
               Pedido pedido = listTiendaPedidos.get(i);
               if (pedido.getNumeroPedido() == numeroPedido) {
                    encontrado = pedido;
                    break;
               }
          }
          return encontrado;
     }

     /**
      *metodo para actualizar datos del pedido
      * @param numeroPedido
      * @param nuevoEstado
      * @param nuevoValorTotal
      * @return
      */

     public boolean actualizarPedido(int numeroPedido, String nuevoEstado, double nuevoValorTotal) {
          boolean actualizado = false;
          Pedido pedido = buscarPedido(numeroPedido);
          if (pedido != null) {
               pedido.setEstado(nuevoEstado);
               pedido.setValorTotal(nuevoValorTotal);
               actualizado = true;
          }
          return actualizado;
     }

     /**
      *metodo para eliminar pedido
      * @param numeroPedido
      * @return
      */
     public boolean eliminarPedido(int numeroPedido) {
          Pedido pedido = buscarPedido(numeroPedido);
          if (pedido != null) {
               listTiendaPedidos.remove(pedido);
               return true;
          }
          return false;
     }


     // METODOS CRUD PAGOS

     /**
      * metdodo para registrar pagos
      * @param fechaPago
      * @param metodoPago
      * @param valorPagado
      * @param estadoTransaccion
      * @param pedido
      * @return
      */

     public boolean crearPago(String fechaPago, String metodoPago, double valorPagado, String estadoTransaccion, Pedido pedido) {
          boolean creado = false;
          Pago pago = buscarPagoPorPedido(pedido.getNumeroPedido());
          if (pago == null) {
               Pago nuevoPago = new Pago(fechaPago, metodoPago, valorPagado, estadoTransaccion, pedido);
               listTiendaPagos.add(nuevoPago);
               creado = true;
          }
          return creado;
     }

     /**
      * Método para buscar un pago asociado a un número de pedido
      * @param numeroPedido
      * @return
      */
     public Pago buscarPagoPorPedido(int numeroPedido) {
          Pago encontrado = null;
          for (int i = 0; i < listTiendaPagos.size(); i++) {
               Pago pago = listTiendaPagos.get(i);
               if (pago.getPedido() != null && pago.getPedido().getNumeroPedido() == numeroPedido) {
                    encontrado = pago;
                    break;
               }
          }
          return encontrado;
     }

     /**
      * Método para actualizar el estado del pago o método de pago
      * @param numeroPedido
      * @param nuevoEstadoTransaccion
      * @param nuevoMetodoPago
      * @return
      */

     public boolean actualizarPago(int numeroPedido, String nuevoEstadoTransaccion, String nuevoMetodoPago) {
          boolean actualizado = false;
          Pago pago = buscarPagoPorPedido(numeroPedido);
          if (pago != null) {
               pago.setEstadoTransaccion(nuevoEstadoTransaccion);
               pago.setMetodoPago(nuevoMetodoPago);
               actualizado = true;
          }
          return actualizado;
     }

     /**
      *  Método para eliminar/cancelar un pago
      * @param numeroPedido del pago
      * @return
      */
     public boolean eliminarPago(int numeroPedido) {
          Pago pago = buscarPagoPorPedido(numeroPedido);
          if (pago != null) {
               listTiendaPagos.remove(pago);
               return true;
          }
          return false;
     }

     // METODOS CRUD CLIENTES

     /**
      *  Metdoso para registrar un cliente
      * @param nombre
      * @param identificacion
      * @param correo
      * @param telefono
      * @param direccion
      * @return
      */
     public boolean crearCliente(String nombre, int identificacion, String correo, int telefono, String direccion) {
          boolean creado = false;
          Cliente cliente = buscarCliente(identificacion);
          if (cliente == null) {
               Cliente nuevoCliente = new Cliente(nombre, identificacion, correo, telefono, direccion);
               listTiendaClientes.add(nuevoCliente);
               creado = true;
          }
          return creado;
     }

     /**
      * Método para buscar un cliente por identificación
      * @param identificacion del cliente
      * @return
      */
     public Cliente buscarCliente(int identificacion) {
          Cliente encontrado = null;
          for (int i = 0; i < listTiendaClientes.size(); i++) {
               Cliente cliente = listTiendaClientes.get(i);
               if (cliente.getIdentificacion() == identificacion) {
                    encontrado = cliente;
                    break;
               }
          }
          return encontrado;
     }

     /**
      * Método para actualizar un cliente
      */
     public boolean actualizarCliente(int identificacion, String nuevoNombre, String nuevoCorreo, int nuevoTelefono, String nuevaDireccion) {
          boolean actualizado = false;
          Cliente cliente = buscarCliente(identificacion);
          if (cliente != null) {
               cliente.setNombre(nuevoNombre);
               cliente.setCorreo(nuevoCorreo);
               cliente.setTelefono(nuevoTelefono);
               cliente.setDireccion(nuevaDireccion);
               actualizado = true;
          }
          return actualizado;
     }

     /**
      * Método para eliminar un cliente
      */
     public boolean eliminarCliente(int identificacion) {
          Cliente cliente = buscarCliente(identificacion);
          if (cliente != null) {
               listTiendaClientes.remove(cliente);
               return true;
          }
          return false;
     }

     // METODOS CRUD CARRITO

     /**
      * Método para crear/agregar un item al Carrito
      * @param cantidad
      * @param precioAplicado
      * @param subtotal
      * @return
      */
     public boolean crearCarrito(int cantidad, double precioAplicado, double subtotal) {
          Carrito nuevoCarrito = new Carrito(cantidad, precioAplicado, subtotal);
          listTiendacarrito.add(nuevoCarrito);
          return true;
     }

     /**
      * Método para buscar un elemento en el carrito por su posición (índice)
      */
     public Carrito buscarCarrito(int indice) {
          if (indice >= 0 && indice < listTiendacarrito.size()) {
               return listTiendacarrito.get(indice);
          }
          return null;
     }

     /**
      * Método para actualizar la cantidad y el subtotal de un ítem en el Carrito
      */
     public boolean actualizarCarrito(int indice, int nuevaCantidad, double nuevoPrecioAplicado) {
          Carrito carrito = buscarCarrito(indice);
          if (carrito != null) {
               carrito.setCantidad(nuevaCantidad);
               carrito.setPrecioAplicado(nuevoPrecioAplicado);
               carrito.setSubtotal(nuevaCantidad * nuevoPrecioAplicado);
               return true;
          }
          return false;
     }

     /**
      * Método para eliminar un elemento del Carrito por su índice
      */
     public boolean eliminarCarrito(int indice) {
          Carrito carrito = buscarCarrito(indice);
          if (carrito != null) {
               listTiendacarrito.remove(carrito);
               return true;
          }
          return false;
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
