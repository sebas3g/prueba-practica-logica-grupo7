## 1. Problema 

Solicitar guía, peso, zona (1 Local, 2 Nacional, 3 Internacional) y si es Express. Rechazar pesos mayores a 10 kg; usar switch para tarifa y if para recargo; procesar N envíos; mostrar total facturado, cantidad Express y paquete más pesado.

## 2. Análisis del problema
El sistema ExpressLogistics permitirá gestionar los envíos de una empresa de mensajería. Para cada envío se solicitará el número de guía, el peso del paquete, la zona de destino y si el cliente desea un servicio Express.
El sistema deberá rechazar los paquetes cuyo peso sea mayor a 10 kg. Para los paquetes aceptados, se utilizará una estructura switch para determinar la tarifa según la zona de envío y una estructura if para aplicar el recargo correspondiente cuando el envío sea Express.
Además, el programa procesará una cantidad N de envíos y llevará un control acumulativo para obtener al finalizar el total facturado, la cantidad de envíos Express y el peso del paquete más pesado

## Análisis del problema: Sistema de envíos

| Entradas | Procesos | Salidas |
|----------|----------|---------|
| Cantidad de envíos | Validar que el peso no sea mayor a 10 kg | Total facturado |
| Número de guía | Determinar la tarifa mediante `switch` | Cantidad de envíos Express |
| Peso del paquete | Aplicar recargo mediante `if` cuando el servicio sea Express | Peso del paquete más pesado |
| Zona de envío | Acumular el total facturado | Mensaje de rechazo cuando el peso sea mayor a 10 kg |
| Tipo de servicio: Express o normal | Contar los envíos Express | |
| | Comparar los pesos para encontrar el paquete más pesado | |

