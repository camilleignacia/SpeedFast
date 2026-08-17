package cl.speedfast;

/**
 * Clase base que representa un pedido genérico de SpeedFast.
 */
public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public int getIdPedido() { return idPedido; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public String getTipoPedido() { return tipoPedido; }

    // Método genérico que será sobrescrito en cada subclase.
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de forma general...");
    }

    // Sobrecarga: será sobrescrita en cada subclase con validaciones propias.
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }
}