## Pruebas de escritorio

#### Prueba 1. Dos envíos válidos:

* **Entradas:** Se procesan $N = 2$ envíos.
  1. Guía: `G-001` | Peso: `4.5 kg` | Zona: `2` (Nacional) | Express: `1` (Sí)
  2. Guía: `G-002` | Peso: `8.0 kg` | Zona: `3` (Internacional) | Express: `2` (No)

| Paso / Iteración | Variables de Entrada (`guia`, `peso`, `zona`, `express`) | `tarifaBase` + `recargo` | `costoTotalEnvio` | `totalFacturado` (Acumulador) | `cantidadExpress` (Contador) | `pesoMaximo` (Máximo) | `guiaMasPesada` |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Inicio** | — | — | — | `$0.00` | `0` | `0.0 kg` | `""` |
| **Iteración 1** | `G-001`, `4.5 kg`, `2`, `1` | `$5.00` + `$2.50` | `$7.50` | `$7.50` | `1` | `4.5 kg` | `G-001` |
| **Iteración 2** | `G-002`, `8.0 kg`, `3`, `2` | `$10.00` + `$0.00` | `$10.00` | `$17.50` | `1` | `8.0 kg` | `G-002` |
