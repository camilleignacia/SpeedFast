package cl.speedfast;

/**
 * Subclase para pedidos de comida. Requiere repartidor con mochila térmica.
 * Implementa Despachable y Cancelable; hereda Rastreable de Pedido.
 */
public class PedidoComida extends Pedido implements Despachable, Cancelable {

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
        registrarEvento(getTipoPedido() + " #" + getIdPedido() + " – entregado por " + nombreRepartidor);
    }

    // Despachable: confirma que el pedido salió a entrega.
    @Override
    public void despachar() {
        System.out.println("[Pedido Comida #" + getIdPedido() + "] Pedido despachado con mochila térmica.");
    }

    // Cancelable: cancela el pedido de comida.
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido Comida #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int)(2 * getDistanciaKm());
    }
}