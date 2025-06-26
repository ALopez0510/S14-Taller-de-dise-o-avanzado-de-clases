import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE INVENTARIO DE CARTAS HEARTHSTONE ---");
            System.out.println("1. Agregar carta");
            System.out.println("2. Listar cartas");
            System.out.println("3. Eliminar carta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 1:
                        try {
                            System.out.print("Nombre de la carta: ");
                            String nombre = sc.nextLine();

                            System.out.print("Tipo de la carta (Hechizo, Esbirro, Arma...): ");
                            String tipo = sc.nextLine();

                            System.out.print("Costo de maná: ");
                            int costo = sc.nextInt();
                            sc.nextLine(); // Consumir salto

                            Carta carta = new Carta(nombre, tipo, costo);
                            inventario.agregarCarta(carta);
                            System.out.println("Carta agregada con éxito.");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: El costo debe ser un número entero.");
                            sc.nextLine(); // Limpiar buffer
                        }
                        break;

                    case 2:
                        inventario.listarCartas();
                        break;

                    case 3:
                        inventario.listarCartas();
                        if (inventario.cantidadCartas() > 0) {
                            try {
                                System.out.print("Ingrese el número de la carta a eliminar: ");
                                int indice = sc.nextInt();
                                sc.nextLine();
                                inventario.eliminarCarta(indice - 1); // -1 para índice correcto
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Debe ingresar un número entero.");
                                sc.nextLine();
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
                sc.nextLine(); // Limpiar buffer
                opcion = 0; // Evitar que se cierre el programa
            }

        } while (opcion != 4);
    }
}
