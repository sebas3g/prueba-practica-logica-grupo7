| Pruebas, contador, acumulador y cálculo del paquete más pesado. |

---

## 2. Ejercicio asignado

### Grupo 7 – ExpressLogistics: Envíos

Desarrollar un programa en **Java** que permita gestionar una cantidad determinada de envíos.

Para cada envío se solicitará:

- Número de guía.
- Peso del paquete.
- Zona de destino.
- Tipo de servicio: Normal o Express.

El sistema deberá rechazar los paquetes cuyo peso sea mayor a **10 kg**.

Para los paquetes aceptados, se determinará la tarifa según la zona de destino:

| Zona | Destino | Tarifa |
|---|---|---:|
| 1 | Local | $3,00 |
| 2 | Nacional | $6,00 |
| 3 | Internacional | $12,00 |

Los envíos que seleccionen el servicio **Express** tendrán un recargo del **50 %**.

Al finalizar el procesamiento de los envíos, el programa mostrará:

- Total facturado.
- Cantidad de envíos Express.
- Peso del paquete más pesado.

---

## 3. Instrucciones para ejecutar

Para ejecutar correctamente el programa se deben seguir los siguientes pasos:

1. Clonar o descargar este repositorio.
2. Abrir el proyecto en **Visual Studio Code**.
3. Verificar que Java se encuentre instalado y configurado.
4. Abrir el archivo:

### Caso de prueba 2 – Varios envíos

**Entrada:**

```text
Cantidad de envíos: 3

Guía: G001
Peso: 2 kg
Zona: 1
Express: No

Guía: G002
Peso: 7 kg
Zona: 2
Express: Si

Guía: G003
Peso: 10 kg
Zona: 3
Express: No

Envíos registrados correctamente.
Cantidad de envíos Express: 1
Paquete más pesado: 10 kg
Total facturado: [valor calculado]
Cantidad de envíos: 2

Guía: G001
Peso: 12 kg
Peso inválido.
No se permiten paquetes mayores a 10 kg.
Se solicita nuevamente el peso.
