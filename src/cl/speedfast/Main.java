package cl.speedfast;

public class Main {

    public static void main(String[] args) {

        // Referencias polimórficas: tipo Pedido, objetos de subclases.
        Pedido[] pedidos = {
                new PedidoComida(1, "Av. Grecia 1256, Maipú", 3),
                new PedidoEncomienda(2, "Av. Manuel Montt 789, Providencia", 4),
                new PedidoExpress(3, "Pasaje Vista Cordillera 321, La Florida", 6)
        };

        System.out.println("SpeedFast - Resumen de Pedidos");
        System.out.println();

        for (Pedido p : pedidos) {
            p.mostrarResumen();
            System.out.println();
        }
    }
}