# ExpressLogistics – Envíos

## Integrantes

- Sebastian Navas
- Francis Bonifaz
- David Puniña
- Dixon Padro

## Actividades de cada integrante

### Sebastian Navas
- Desarrollo de la estructura principal del programa.
- Implementación del ingreso de datos con `Scanner`.
- Registro de los envíos y cantidad de envíos a procesar.
- Algoritmo

### Francis Bonifaz
- Implementación del menú y selección de la zona mediante `switch`.
- Desarrollo del cálculo de las tarifas según la zona.
- Apoyo en las pruebas del programa.
- Pseudocódigo y diagrama de Flujo

### David Puniña
- Implementación de las validaciones de datos.
- Validación del peso máximo de 10 kg.
- Implementación del recargo para los envíos Express.
-  Análisis, Datos de entrada, procesos, salidas

### Dixon Padro
- Implementación de contadores y acumuladores.
- Cálculo del total facturado, cantidad de envíos Express y paquete más pesado.
- Revisión y corrección de errores del programa.
- Prueba de escritorio

## Ejercicio asignado

**Grupo 7 – ExpressLogistics: Envíos**

El programa permite registrar varios envíos solicitando los siguientes datos:

- Número de guía.
- Peso del paquete en kilogramos.
- Zona de envío:
  - 1. Local
  - 2. Nacional
  - 3. Internacional
- Si el envío es Express.

El programa rechaza los paquetes que tengan un peso mayor a 10 kg. Utiliza una estructura `switch` para determinar la tarifa según la zona y una estructura `if` para aplicar el recargo correspondiente al servicio Express.

Al finalizar, se muestran:

- Total facturado.
- Cantidad de envíos Express.
- Paquete más pesado.

## Instrucciones para ejecutar

1. Abrir el proyecto en **Visual Studio Code**.
2. Tener instalado Java y configurado correctamente.
3. Abrir el archivo `ExpressLogistics.java`.
4. Ejecutar el programa.
5. Ingresar la cantidad de envíos que se desean registrar.
6. Ingresar los datos solicitados para cada envío.
7. El programa validará los datos ingresados.
8. Al finalizar, se mostrarán los resultados y el total facturado.

## Casos de prueba

### Caso 1: Envío local Express

**Entrada:**

```text
Cantidad de envíos: 1
Guía: G001
Peso: 5 kg
Zona: 1
Express: Si
```

**Resultado esperado:**

```text
Envío registrado correctamente.
Cantidad de envíos Express: 1
Paquete más pesado: 5 kg
Total facturado: [valor calculado]
```

### Caso 2: Varios envíos

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
```

**Resultado esperado:**

```text
Envíos registrados correctamente.
Cantidad de envíos Express: 1
Paquete más pesado: 10 kg
Total facturado: [valor calculado]
```

### Caso 3: Peso inválido

**Entrada:**

```text
Cantidad de envíos: 1
Guía: G003
Peso: 12 kg
```

**Resultado esperado:**

```text
Peso inválido.
No se permiten paquetes mayores a 10 kg.
Se solicita nuevamente el peso.
```

