package cl.speedfast;

/**
 * Subclase para pedidos de comida. Requiere repartidor con mochila térmica.
 */
public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, "PedidoComida", distanciaKm);
    }

    // Sobrescritura: informa el requisito específico de este tipo de pedido.
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Requiere repartidor con mochila térmica.");
    }

    // Sobrecarga: valida el requisito y asigna al repartidor por nombre.
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int)(2 * getDistanciaKm());
    }
}