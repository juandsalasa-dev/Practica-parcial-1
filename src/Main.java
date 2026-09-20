import model.Tienda;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Inversiones Abelardo", "cuando el quiera abrir", "carrera 20", 69, 34161625, 10027);
        int opcion2 = 0;

        while (opcion2 != 4) {

            try {
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        MENU PRINCIPAL
                        
                        1. Clientes
                        2. Productos
                        3. Pedidos
                        4. Cerrar
                        """));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            }

            int opcion3 = 0;

            switch (opcion2) {
                case 1:
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                            MENÚ CLIENTES
                            1. Registrar Cliente
                            2. Mostrar datos del cliente
                            3. Actualizar Cliente
                            4. Eliminar cliente
                            5. Volver al menú principal
                            """));

                    if (opcion3 == 1) {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente:"));
                        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del cliente:");
                        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del cliente:"));
                        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del cliente:");

                        tienda.crearCliente(nombre, identificacion, correo, telefono, direccion);

                    } else if (opcion3 == 2) {
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente a buscar:"));

                        tienda.mostrarCliente(identificacion);

                    } else if (opcion3 == 3) {
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente a actualizar:"));
                        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del cliente:");
                        String nuevoCorreo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo del cliente:");
                        int nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo teléfono del cliente:"));
                        String nuevaDireccion = JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del cliente:");

                        tienda.actualizarCliente(identificacion, nuevoNombre, nuevoCorreo, nuevoTelefono, nuevaDireccion);

                    } else if (opcion3 == 4) {
                        int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente a eliminar:"));

                        tienda.eliminarCliente(identificacion);

                    } else if (opcion3 == 5) {
                        break;
                    }
                    break;


                case 2:
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                            MENÚ PRODUCTOS
                            1. Registrar producto
                            2. Mostrar datos del producto
                            3. Actualizar producto
                            4. Eliminar producto
                            5. Volver al menú principal
                            """));

                    if (opcion3 == 1) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código del producto:"));
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
                        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción del producto:");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
                        int cantDisponible = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad disponible:"));

                        tienda.crearProducto(codigo, nombre, descripcion, precio, cantDisponible);

                    } else if (opcion3 == 2) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código del producto a consultar:"));

                        tienda.mostrarProducto(codigo);

                    } else if (opcion3 == 3) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código del producto a actualizar:"));
                        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del producto:");
                        String nuevaDescripcion = JOptionPane.showInputDialog(null, "Ingrese la nueva descripción del producto:");
                        double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio:"));
                        int nuevaCantDisponible = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad disponible:"));

                        tienda.actualizarProducto(codigo, nuevoNombre, nuevaDescripcion, nuevoPrecio, nuevaCantDisponible);

                    } else if (opcion3 == 4) {
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código del producto a eliminar:"));

                        tienda.eliminarProducto(codigo);

                    } else if (opcion3 == 5) {
                        break;
                    }
                    break;


                case 3:
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("""
                            MENÚ PEDIDOS
                            1. Realizar pedido
                            2. Mostrar datos del pedido
                            3. Actualizar pedido
                            4. Eliminar pedido
                            5. Volver al menú principal
                            """));

                    if (opcion3 == 1) {
                        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de pedido:"));
                        String fechaCreacion = JOptionPane.showInputDialog(null, "Ingrese la fecha de creación:");
                        String estado = JOptionPane.showInputDialog(null, "Ingrese el estado del pedido:");
                        int clienteId = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación del cliente asociado:"));
                        String metodoPago = JOptionPane.showInputDialog(null, "Ingrese el método de pago:");

                        tienda.crearPedido(numeroPedido, fechaCreacion, estado, clienteId, metodoPago);

                    } else if (opcion3 == 2) {
                        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de pedido a consultar:"));

                        tienda.mostrarPedido(numeroPedido);

                    } else if (opcion3 == 3) {
                        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de pedido a actualizar:"));
                        String nuevoEstado = JOptionPane.showInputDialog(null, "Ingrese el nuevo estado del pedido:");

                        tienda.actualizarPedido(numeroPedido, nuevoEstado);

                    } else if (opcion3 == 4) {
                        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de pedido a eliminar:"));

                        tienda.eliminarPedido(numeroPedido);

                    } else if (opcion3 == 5) {
                        break;
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }
        }
    }
}