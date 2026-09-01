# SpeedFast - Sistema de Asignación de Pedidos

## Descripción General
Proyecto formativo de la asignatura **Desarrollo Orientado a Objetos II**
(Semana 3: "Diseñando un sistema orientado a objetos con clases abstractas,
polimorfismo e interfaces").
Modela un sistema de repartos a domicilio para la empresa SpeedFast, aplicando
herencia, clase abstracta, sobrescritura, sobrecarga, polimorfismo e interfaces.

---

## Tipos de Pedido

- **PedidoComida:** Requiere repartidor con mochila térmica.
- **PedidoEncomienda:** Requiere validación de peso y embalaje.
- **PedidoExpress:** Asigna al repartidor más cercano con disponibilidad inmediata.

---

## Interfaces implementadas

- **Despachable:** define el contrato para despachar un pedido (`despachar()`).
- **Cancelable:** define el contrato para cancelar un pedido (`cancelar()`).
- **Rastreable:** define el contrato para consultar el historial de entregas (`verHistorial()`).

---

## 📁 Estructura del Proyecto

```text
semana 3/
└── src/
    └── cl/
        └── speedfast/
            ├── Despachable.java
            ├── Cancelable.java
            ├── Rastreable.java
            ├── Pedido.java
            ├── PedidoComida.java
            ├── PedidoEncomienda.java
            ├── PedidoExpress.java
            └── Main.java
```

---

## Autora del Proyecto

- Camila Ignacia Sepúlveda Marcos.

---

© Duoc UC | Escuela de Informática y Telecomunicaciones.