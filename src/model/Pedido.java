package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Atributos de Pedido
    private int numeroPedido;
    private String fechaCreacion, estado;
    private double valorTotal;

    //Relaciones de pedido -> carrito, pedido -> cliente, pedido -> pago
    private List<Carrito> listPedidoCarrito;
    private Cliente cliente;
    private Pago pago;

    /**
     * metodo constructor del pedido
     * @param numeroPedido
     * @param fechaCreacion del pedido
     * @param estado del pedido
     * @param valorTotal del pedido
     */

    public Pedido(int numeroPedido, String fechaCreacion, String estado, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.valorTotal = valorTotal;
        this.listPedidoCarrito = new ArrayList<>();
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

    public String getEstado() {
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

    public void setEstado(String estado) {
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