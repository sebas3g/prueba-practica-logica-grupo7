```java
import java.util.Scanner;

public class ExpressLogistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadEnvios;

        do {
            System.out.print("Ingrese la cantidad de envios: ");
            cantidadEnvios = scanner.nextInt();

            if (cantidadEnvios <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
            }

        } while (cantidadEnvios <= 0);

        double totalFacturado = 0;
        int cantidadExpress = 0;
        double paqueteMasPesado = 0;

        for (int i = 1; i <= cantidadEnvios; i++) {

            System.out.println("\n===== ENVIO " + i + " =====");

            System.out.print("Ingrese el numero de guia: ");
            String guia = scanner.next();

            double peso;

            do {
                System.out.print("Ingrese el peso del paquete (kg): ");
                peso = scanner.nextDouble();

                if (peso <= 0 || peso > 10) {
                    System.out.println("Peso invalido. Debe ser mayor que 0 y maximo 10 kg.");
                }

            } while (peso <= 0 || peso > 10);

            int zona;

            do {
                System.out.println("\nZONA DE ENVIO");
                System.out.println("1. Local");
                System.out.println("2. Nacional");
                System.out.println("3. Internacional");
                System.out.print("Seleccione la zona: ");
                zona = scanner.nextInt();

                if (zona < 1 || zona > 3) {
                    System.out.println("Zona invalida. Seleccione 1, 2 o 3.");
                }

            } while (zona < 1 || zona > 3);

            double tarifa = 0;

            switch (zona) {
                case 1:
                    tarifa = 5.00;
                    break;

                case 2:
                    tarifa = 8.00;
                    break;

                case 3:
                    tarifa = 12.00;
                    break;
            }

            System.out.print("¿El envio es Express? (si/no): ");
            String express = scanner.next();

            double recargo = 0;

            if (express.equalsIgnoreCase("si")) {
                recargo = tarifa * 0.30;
                cantidadExpress++;
            }

            double totalEnvio = tarifa + recargo;
            totalFacturado += totalEnvio;

            if (peso > paqueteMasPesado) {
                paqueteMasPesado = peso;
            }

            System.out.println("\nEnvio registrado correctamente.");
            System.out.println("Guia: " + guia);
            System.out.println("Peso: " + peso + " kg");
            System.out.println("Tarifa: $" + tarifa);
            System.out.println("Recargo Express: $" + recargo);
            System.out.println("Total del envio: $" + totalEnvio);
        }

        System.out.println("\n================================");
        System.out.println("       RESUMEN DE ENVIOS");
        System.out.println("================================");
        System.out.println("Total facturado: $" + totalFacturado);
        System.out.println("Cantidad de envios Express: " + cantidadExpress);
        System.out.println("Paquete mas pesado: " + paqueteMasPesado + " kg");
        System.out.println("================================");
        System.out.println("Proceso finalizado correctamente.");

       
    }
}
