package Model.Clases;

import Model.Interfaces.IABM;

import java.util.ArrayList;

/**
 * Venta particular, con su lista de productos añadidos a su carrito.
 */
public class Venta {

    private ArrayList<Producto> carrito;
    private float total;
    private float descuento;
    private LugarConsumo lugarConsumo;
    private Cliente UnCliente;

    private int numTicket;

    public Venta(float total, Cliente unCliente, int numTicket, LugarConsumo pos) {
        this.carrito = new ArrayList<>();
        this.total = 0;
        this.lugarConsumo = pos;
        setUnCliente(unCliente);
        this.numTicket = numTicket;

    }

    public float getTotal() {
        return total;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setUnCliente(Cliente unCliente) {
        this.UnCliente = unCliente;
        if (UnCliente.isEsVip() == true) {
            this.descuento = 15;

        } else {
            this.descuento = 0;
        }

    }

    /**
     * calcula el precio final de la venta.
     *
     * @return El precio final.
     */
    public float PrecioFinalVenta() {
        for (int i = 0; i < carrito.size(); i++) {
            this.total = this.total + carrito.get(i).getPrecio();
        }

        this.total = this.total - ((this.total * this.descuento) / 100);
        return total;
    }

    public String listarVenta() {
        String productos = "";
        for (int i = 0; i < carrito.size(); i++) {
            productos = productos + carrito.get(i).toString() + "\n"; //acumula los nombres de los productos comprados
        }
        return "Venta: N°Ticket:" + this.numTicket + ", Productos: " + productos + ", Precio: " + this.total;
    }
    public String MostrarIndexCarrito() {
        String productos = "";
        for (int i = 0; i < carrito.size(); i++) {
            productos = productos +"INDEX: "+i+ "  -  " +carrito.get(i).toString() + "\n"; //acumula los nombres de los productos comprados
        }
        return productos;
    }

    /**
     * agrega productos al carrito
     *
     * @param aux El producto.
     */
    public void agregarProductosAlcarrito(Producto aux) {
        carrito.add(aux);
    }

    public void eliminarProductoDelcarrito(int index) {

        carrito.remove(index);
    }

}