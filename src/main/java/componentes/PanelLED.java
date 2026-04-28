package componentes;

import bus.EventBus;
import eventos.BandaTocandoEvent;
import eventos.BebidaServidaEvent;
import eventos.ComidaPreparadaEvent;

public class PanelLED {
    public PanelLED(EventBus eventBus) {
        eventBus.suscribir(BebidaServidaEvent.class, this::mostrarBebida);
        eventBus.suscribir(ComidaPreparadaEvent.class, this::mostrarComida);
        eventBus.suscribir(BandaTocandoEvent.class, this::mostrarBanda);
    }

    private void mostrarBebida(BebidaServidaEvent evento) {
        System.out.println("[LED] Bebida en camino a " + evento.getMesaId() + " -> " + evento.getBebida());
    }

    private void mostrarComida(ComidaPreparadaEvent evento) {
        System.out.println("[LED] Pedido " + evento.getPedidoId() + " listo: " + evento.getPlato());
    }

    private void mostrarBanda(BandaTocandoEvent evento) {
        System.out.println("[LED] En escena: " + evento.getNombreBanda() + " tocando " + evento.getNombreCancion());
    }
}