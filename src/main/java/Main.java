import bus.EventBus;
import componentes.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        SistemaDePedidos sistemaDePedidos = new SistemaDePedidos(eventBus);
        new Barra(eventBus);
        new Cocina(eventBus);
        new PanelLED(eventBus);
        new SistemaDeSonido(eventBus);
        new SistemaDeHumo(eventBus);

        Banda banda = new Banda(eventBus, "Los Seguidores de Jesus");

        sistemaDePedidos.realizarPedido(
                "Mesa 3",
                "pedido_007",
                List.of("refresco", "pizza")
        );

        banda.tocarCancion("Schlemmer?", 354);
    }
}