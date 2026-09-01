package cl.speedfast;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Referencias polimórficas: tipo Pedido, objetos de subclases.
        Pedido[] pedidos = {
                new PedidoComida(101, "Av. Grecia 1256, Maipú", 3),
                new PedidoEncomienda(102, "Av. Manuel Montt 789, Providencia", 7),
                new PedidoExpress(103, "Pasaje Vista Cordillera 321, La Florida", 6)
        };

        // 1. Resumen de pedidos con tiempo estimado de entrega.
        System.out.println("——— SpeedFast — Resumen de Pedidos ———");
        System.out.println();
        for (Pedido p : pedidos) {
            p.mostrarResumen();
            System.out.println();
        }

        // 2. Asignación automática de repartidores (sobrescritura sin parámetro).
        System.out.println("——— Asignación Automática de Repartidores ———");
        System.out.println();
        for (Pedido p : pedidos) {
            p.asignarRepartidor();
            System.out.println();
        }

        // 3. Asignación manual de repartidores (sobrecarga con nombre).
        System.out.println("——— Asignación Manual de Repartidores ———");
        System.out.println();
        pedidos[0].asignarRepartidor("Franco Martinez");
        System.out.println();
        pedidos[1].asignarRepartidor("Josefina Acevedo");
        System.out.println();

        // 4. Despacho de pedidos — uso de la interfaz Despachable.
        System.out.println("——— Despacho de Pedidos ———");
        ((Despachable) pedidos[0]).despachar();
        ((Despachable) pedidos[1]).despachar();
        System.out.println();

        // 5. Cancelación de un pedido — uso de la interfaz Cancelable.
        System.out.println("——— Cancelación de Pedido ———");
        ((Cancelable) pedidos[2]).cancelar();
        System.out.println();

        // 6. Historial de entregas realizadas — uso de la interfaz Rastreable.
        System.out.println("——— Historial ———");
        for (Pedido p : pedidos) {
            List<String> eventos = p.verHistorial();
            for (String evento : eventos) {
                System.out.println("- " + evento);
            }
        }
    }
}