package model;

public class Pago {
    //Atributos de pago
    private String fechaPago;
    private String metodoPago, estadoTransaccion;
    private double valorPagado;

    // Relaciones Pedido -> Pago
    private Pedido pedido;

    /**
     * Método Constructor de Pago
     * @param fechaPago
     * @param metodoPago
     * @param valorPagado
     * @param estadoTransaccion
     */
    public Pago(String fechaPago, String metodoPago, double valorPagado,String estadoTransaccion, Pedido pedido) {
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.valorPagado = valorPagado;
        this.estadoTransaccion = estadoTransaccion;
        this.pedido=pedido;
    }

    //GETTERS & SETTERS

    public String getFechaPago() {
        return fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public String  getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Pago{" +
                "fechaPago='" + fechaPago + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", valorPagado=" + valorPagado +
                ", estadoTransaccion=" + estadoTransaccion +
                ", pedido=" + pedido +
                '}';
    }
}