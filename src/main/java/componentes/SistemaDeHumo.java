package componentes;

import bus.EventBus;
import eventos.BandaTocandoEvent;

public class SistemaDeHumo {
    public SistemaDeHumo(EventBus eventBus) {
        eventBus.suscribir(BandaTocandoEvent.class, this::activarHumo);
    }

    private void activarHumo(BandaTocandoEvent evento) {
        if (evento.getNombreCancion().equalsIgnoreCase("Bohemian Rhapsody")) {
            System.out.println("[HUMO] Maquina activada! Cancion epica detectada: " + evento.getNombreCancion());
        }
    }
}