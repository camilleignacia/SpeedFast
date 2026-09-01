package cl.speedfast;

import java.util.List;

/**
 * Interfaz que define el contrato para consultar el historial de un pedido.
 */
public interface Rastreable {
    /**
     * Devuelve el historial de eventos registrados del pedido.
     * @return Lista de strings con los eventos.
     */
    List<String> verHistorial();
}