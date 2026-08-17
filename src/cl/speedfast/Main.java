package cl.speedfast;

/**
 * Clase principal del sistema SpeedFast. Demuestra polimorfismo mediante sobrescritura y sobrecarga.
 */
public class Main {

    public static void main(String[] args) {

        // Referencias polimórficas: tipo Pedido, objetos de subclases.
        Pedido[] pedidos = {
                new PedidoComida(1, "Av. Grecia 1256, Maipú"),
                new PedidoEncomienda(2, "Av. Manuel Montt 789, Providencia"),
                new PedidoExpress(3, "Pasaje Vista Cordillera 321, La Florida")
        };

        System.out.println("--- Sobrescritura ---");
        System.out.println();

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
            System.out.println();
        }

        System.out.println("--- Sobrecarga ---");
        System.out.println();

        pedidos[0].asignarRepartidor("Daniel Elgueta");
        System.out.println();

        pedidos[1].asignarRepartidor("María Paz Rojas");
        System.out.println();

        pedidos[2].asignarRepartidor("Ivette Astudillo");
    }
}