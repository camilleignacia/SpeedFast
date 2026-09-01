package cl.speedfast;

/**
 * Interfaz que define el contrato para despachar un pedido.
 */
public interface Despachable {
    /** Ejecuta el despacho del pedido al repartidor asignado. */
    void despachar();
}