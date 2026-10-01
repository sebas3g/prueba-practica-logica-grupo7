# EXPRESSLOGISTICS – SISTEMA DE GESTIÓN DE ENVÍOS

## Proyecto de Programación – Grupo 7

---

## 1. Integrantes

| N.º | Integrante | Aporte al proyecto |
|---|---|---|
| 1 | **Francis Bonifaz** | Análisis del problema, algoritmo y documentación. |
| 2 | **Sebastian Navas** | Desarrollo de la estructura principal del programa en Java. |
| 3 | **David Punina** | Implementación de tarifas, validaciones y servicio Express. |
| 4 | **Dixon Prado** | Pruebas, contador, acumulador y cálculo del paquete más pesado. |

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

```text
ExpressLogistics.java
