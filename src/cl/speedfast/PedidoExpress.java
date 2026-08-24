package cl.speedfast;

/**
 * Subclase para pedidos express. Asigna al repartidor más cercano disponible.
 */
public class PedidoExpress extends Pedido {

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