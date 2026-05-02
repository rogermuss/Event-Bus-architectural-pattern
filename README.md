# Taberna EventBus

Implementación del patrón arquitectónico Publisher/Subscriber mediante un Event Bus en Java.

## Descripción

Sistema de eventos para una taberna universitaria llamada "El Gólem Alquímico".
Los componentes se comunican exclusivamente a través del EventBus, sin referencias directas entre ellos.

## Componentes

- **EventBus** — Núcleo del sistema, maneja suscripción y publicación de eventos
- **SistemaDePedidos** — Publica pedidos de las mesas
- **Barra** — Prepara bebidas y notifica cuando están listas
- **Cocina** — Prepara comida y notifica cuando está lista
- **Banda** — Publica cuando está tocando una canción
- **SistemaDeSonido** — Ajusta el ecualizador según la canción
- **PanelLED** — Muestra notificaciones de bebidas, comida y banda
- **SistemaDeHumo** — Se activa solo con canciones épicas

## Requisitos

- Java 17
- Maven

## Cómo ejecutar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="Main"
```

## Flujo de eventos

1. `SistemaDePedidos` publica un `PedidoRealizadoEvent`
2. `Barra` reacciona, espera 2 segundos y publica `BebidaServidaEvent`
3. `Cocina` reacciona, espera 5 segundos y publica `ComidaPreparadaEvent`
4. `PanelLED` muestra mensajes de bebida y comida
5. `Banda` publica `BandaTocandoEvent`
6. `SistemaDeSonido` y `PanelLED` reaccionan a la canción
7. `SistemaDeHumo` se activa si la canción es "Bohemian Rhapsody"