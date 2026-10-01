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

# ALGORITMO – EXPRESSLOGISTICS

**Inicio**

1. Solicitar la cantidad de envíos que se desean registrar.
2. Validar que la cantidad sea mayor que 0.
3. Inicializar:

   * `totalFacturado = 0`
   * `cantidadExpress = 0`
   * `paqueteMasPesado = 0`
4. Repetir el proceso para cada envío:

   * Solicitar el número de guía.
   * Solicitar el peso del paquete.
   * Validar que el peso sea mayor que 0 y menor o igual a 10 kg.
   * Solicitar la zona del envío.
   * Validar que la zona sea 1, 2 o 3.
   * Utilizar `switch` para determinar la tarifa de acuerdo con la zona.
   * Preguntar si el envío es Express.
   * Si es Express, aplicar el recargo y aumentar el contador de envíos Express.
   * Sumar el valor del envío al total facturado.
   * Comparar el peso con el paquete más pesado registrado.
   * Si el peso actual es mayor, actualizar el paquete más pesado.
5. Mostrar el total facturado.
6. Mostrar la cantidad de envíos Express.
7. Mostrar el peso del paquete más pesado.
8. Mostrar un mensaje indicando que el proceso terminó correctamente.

**Fin**


## Pseudocódigo 

```
// Tarifas por kg: 1 Local $1.50 | 2 Nacional $3.50 | 3 Internacional $9.00
// Recargo Express: 25% sobre el costo
// Pesos mayores a 10 kg se rechazan
// =====================================================
Algoritmo ExpressLogistics
	Definir n, i, zona, cantExpress, cantRechazados, cantProcesados Como Entero
	Definir peso, tarifaKg, costo, recargo, totalFacturado, pesoMax Como Real
	Definir guia, guiaMax, resp Como Caracter

	// Inicializacion de contadores, acumulador y maximo
	totalFacturado <- 0
	cantExpress <- 0
	cantRechazados <- 0
	cantProcesados <- 0
	pesoMax <- 0
	guiaMax <- "Ninguna"

	Escribir "===== EXPRESSLOGISTICS - CONTROL DE ENVIOS ====="

	// Validacion de la cantidad de envios
	Repetir
		Escribir "Ingrese la cantidad de envios a procesar: "
		Leer n
		Si n <= 0 Entonces
			Escribir "Error: la cantidad debe ser mayor a 0."
		FinSi
	Hasta Que n > 0

	Para i <- 1 Hasta n Con Paso 1 Hacer
		Escribir ""
		Escribir "------ Envio ", i, " de ", n, " ------"
		Escribir "Numero de guia: "
		Leer guia

		// Validacion del peso
		Repetir
			Escribir "Peso del paquete (kg): "
			Leer peso
			Si peso <= 0 Entonces
				Escribir "Error: el peso debe ser mayor a 0."
			FinSi
		Hasta Que peso > 0

		Si peso > 10 Entonces
			Escribir "ENVIO RECHAZADO: el peso supera los 10 kg."
			cantRechazados <- cantRechazados + 1
		SiNo
			// Validacion de la zona
			Repetir
				Escribir "Zona (1 Local, 2 Nacional, 3 Internacional): "
				Leer zona
				Si zona < 1 O zona > 3 Entonces
					Escribir "Error: la zona debe ser 1, 2 o 3."
				FinSi
			Hasta Que zona >= 1 Y zona <= 3

			// Validacion de Express
			Repetir
				Escribir "Es envio Express? (S/N): "
				Leer resp
				resp <- Mayusculas(resp)
				Si resp <> "S" Y resp <> "N" Entonces
					Escribir "Error: responda S o N."
				FinSi
			Hasta Que resp = "S" O resp = "N"

			// Tarifa segun la zona
			Segun zona Hacer
				1:
					tarifaKg <- 1.50
					Escribir "Zona: Local"
				2:
					tarifaKg <- 3.50
					Escribir "Zona: Nacional"
				3:
					tarifaKg <- 9.00
					Escribir "Zona: Internacional"
				De Otro Modo:
					tarifaKg <- 0
			FinSegun

			costo <- peso * tarifaKg

			// Recargo por envio Express
			recargo <- 0
			Si resp = "S" Entonces
				recargo <- costo * 0.25
				cantExpress <- cantExpress + 1
			FinSi
			costo <- costo + recargo

			// Acumulador y contador
			totalFacturado <- totalFacturado + costo
			cantProcesados <- cantProcesados + 1

			// Paquete mas pesado (maximo)
			Si peso > pesoMax Entonces
				pesoMax <- peso
				guiaMax <- guia
			FinSi

			Escribir "Guia: ", guia, " | Recargo: $", recargo, " | Total a pagar: $", costo
		FinSi
	FinPara

	// Resultados finales
	Escribir ""
	Escribir "=============== RESUMEN ==============="
	Escribir "Envios procesados: ", cantProcesados
	Escribir "Envios rechazados (> 10 kg): ", cantRechazados
	Escribir "Total facturado: $", totalFacturado
	Escribir "Cantidad de envios Express: ", cantExpress
	Si cantProcesados > 0 Entonces
		Escribir "Paquete mas pesado: guia ", guiaMax, " con ", pesoMax, " kg"
	SiNo
		Escribir "No se proceso ningun envio."
	FinSi
	Escribir "Fin del programa."
FinAlgoritmo

```
#DIAGAMA DE FLUJO 


<img width="1773" height="2980" alt="Diagrama_Flujo_ExpressLogistics_Grupo7" src="https://github.com/user-attachments/assets/e3cf90b1-dcd3-450d-9212-b32194a53181" />
