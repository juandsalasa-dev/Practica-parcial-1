package model;

import java.util.List;

public class Cliente {

    private String nombre;
    private int identificacion;
    private String correo;
    private int telefono;
    private String direccion;

    private List<Pedido> listClientePedidos;
}