package model;

import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String fechaCreacion;
    private boolean estado;
    private double valorTotal;

    private List<Carrito> listPedidoCarrito;
    private Cliente cliente;
    private Pago pago;


}