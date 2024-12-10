package model;

public class Pedido {
    private int id;
    private int id_pedido;
    private int id_cliente;
    private String data_pedido;
    private double total;

    public Pedido(int id, int id_pedido, int id_cliente, String data_pedido, double total) {
        this.id = id;
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.data_pedido = data_pedido;
        this.total = total;
    }

    public Pedido(int id_pedido, int id_cliente, String data_pedido, double total) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.data_pedido = data_pedido;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", id_pedido=" + id_pedido + ", id_cliente=" + id_cliente + ", data_pedido=" + data_pedido + ", total=" + total + '}';
    }
}
    

    

    