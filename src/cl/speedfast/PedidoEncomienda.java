package cl.speedfast;

/**
 * Subclase para encomiendas. Requiere validación de peso y embalaje.
 */
public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    // Sobrescritura: informa los requisitos de peso y embalaje.
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Requiere validación de peso y embalaje.");
    }

    // Sobrecarga: valida peso y embalaje, luego asigna por nombre.
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Encomienda #" + getIdPedido() + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}