package cl.speedfast;

/**
 * Subclase para encomiendas. Requiere validación de peso y embalaje.
 * Implementa Despachable y Cancelable; hereda Rastreable de Pedido.
 */
public class PedidoEncomienda extends Pedido implements Despachable, Cancelable {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, "PedidoEncomienda", distanciaKm);
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
        registrarEvento(getTipoPedido() + " #" + getIdPedido() + " – entregado por " + nombreRepartidor);
    }

    // Despachable: confirma que la encomienda salió a entrega.
    @Override
    public void despachar() {
        System.out.println("[Pedido Encomienda #" + getIdPedido() + "] Encomienda despachada. Embalaje verificado.");
    }

    // Cancelable: cancela la encomienda.
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido Encomienda #" + getIdPedido() + "...");
        System.out.println("→ Pedido cancelado exitosamente.");
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(20 + 1.5 * getDistanciaKm());
    }
}