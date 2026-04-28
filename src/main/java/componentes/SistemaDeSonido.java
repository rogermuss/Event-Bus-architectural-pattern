package componentes;

import bus.EventBus;
import eventos.BandaTocandoEvent;

public class SistemaDeSonido {
    public SistemaDeSonido(EventBus eventBus) {
        eventBus.suscribir(BandaTocandoEvent.class, this::ajustarSonido);
    }

    private void ajustarSonido(BandaTocandoEvent evento) {
        System.out.println("[SONIDO] Ecualizador calibrado para: " + evento.getNombreCancion());
    }
}