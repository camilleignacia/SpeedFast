package cl.speedfast;

/**
 * Clase abstracta base que representa un pedido en SpeedFast.
 */
public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;
    private double distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
        this.distanciaKm = distanciaKm;
    }

    public int getIdPedido() { return idPedido; }
    public String getDireccionEntrega() { return direccionEntrega; }
    public String getTipoPedido() { return tipoPedido; }
    public double getDistanciaKm() { return distanciaKm; }

    // Método genérico que será sobrescrito en cada subclase.
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor de forma general...");
    }

    // Sobrecarga: será sobrescrita en cada subclase con validaciones propias.
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    // Muestra los datos básicos del pedido.
    public void mostrarResumen() {
        System.out.println(tipoPedido + " #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + (int) distanciaKm + " km");
        System.out.println("Tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");
    }

    // Método abstracto, cada subclase implementa su fórmula.
    public abstract int calcularTiempoEntrega();
}