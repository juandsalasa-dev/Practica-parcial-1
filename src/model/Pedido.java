package model;

import java.util.List;

public class Pedido {
    //Atributos de Pedido
    private int numeroPedido;
    private String fechaCreacion;
    private boolean estado;
    private double valorTotal;

    //Relaciones de pedido -> carrito, pedido -> cliente, pedido -> pago
    private List<Carrito> listPedidoCarrito;
    private Cliente cliente;
    private Pago pago;

    /**
     * Méetodo constructor de Pedido
     * @param numeroPedido
     * @param fechaCreacion
     * @param estado
     * @param valorTotal
     * @param listPedidoCarrito
     * @param cliente
     * @param pago
     */
    public Pedido(int numeroPedido, String fechaCreacion, boolean estado, double valorTotal, List<Carrito> listPedidoCarrito, Cliente cliente, Pago pago) {
        this.numeroPedido = numeroPedido;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.valorTotal = valorTotal;
        this.listPedidoCarrito = listPedidoCarrito;
        this.cliente = cliente;
        this.pago = pago;
    }

    //GETTERS & SETTERS

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Carrito> getListPedidoCarrito() {
        return listPedidoCarrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setListPedidoCarrito(List<Carrito> listPedidoCarrito) {
        this.listPedidoCarrito = listPedidoCarrito;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", estado=" + estado +
                ", valorTotal=" + valorTotal +
                ", listPedidoCarrito=" + listPedidoCarrito +
                ", cliente=" + cliente +
                ", pago=" + pago +
                '}';
    }
}