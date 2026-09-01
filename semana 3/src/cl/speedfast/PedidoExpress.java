package cl.speedfast;

/**
 * Subclase para pedidos express. Asigna al repartidor más cercano disponible.
 * Implementa Despachable y Cancelable; hereda Rastreable de Pedido.
 */
public class PedidoExpress extends Pedido implements Despachable, Cancelable {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, "PedidoExpress", distanciaKm);
    }

    // Sobrescritura: busca al repartidor más cercano disponible.
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Buscando repartidor más cercano con disponibilidad inmediata...");
    }

    // Sobrecarga: confirma disponibilidad y asigna por nombre.
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
        registrarEvento(getTipoPedido() + " #" + getIdPedido() + " – entregado por " + nombreRepartidor);
    }

    // Despachable: confirma que el pedido express salió a entrega.
    @Override
    public void despachar() {
        System.out.println("[Pedido Express #" + getIdPedido() + "] Pedido express en camino. Entrega prioritaria.");
    }

    // Cancelable: cancela el pedido express.
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido Express #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }
        return tiempo;
    }
}