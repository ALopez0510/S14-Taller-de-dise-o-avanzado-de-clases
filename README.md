# S14-Taller-de-diseño-avanzado-de-clases

Integrantes: Glen Gorozabel, Alexander López, Santiago Ramirez

Prueba de ejecución:
![image](https://github.com/user-attachments/assets/65b7ae39-ebed-4fb0-859e-7758fe85b7b7)

1. Clase Carta
Esta clase representa una carta de Hearthstone. Guarda su nombre, tipo (como Hechizo, Esbirro, etc.) y su costo de maná.

java
Copiar
Editar
public class Carta {
    private String nombre;
    private String tipo;
    private int costo;
Constructor: permite crear una carta nueva con sus datos.

toString(): para mostrar fácilmente la carta como texto cuando se liste.

2. Clase Inventario
Contiene la lista de cartas y los métodos para trabajar con ellas:

java
Copiar
Editar
private ArrayList<Carta> cartas;
agregarCarta(): añade una nueva carta al inventario.

listarCartas(): imprime todas las cartas guardadas.

eliminarCarta(int indice): elimina una carta según su posición en la lista, validando que el índice esté dentro del rango.

cantidadCartas(): permite saber si hay cartas antes de intentar eliminarlas.

3. Clase Main
Es el programa principal. Aquí se crea el menú, se pide información al usuario y se manejan excepciones.

Menú principal (bucle do...while)
Muestra las opciones y repite hasta que el usuario decida salir (opción 4):

java
Copiar
Editar
do {
    // Mostrar opciones
    // Leer opción del usuario
    // Ejecutar acción según la opción
} while (opcion != 4);

4. Manejo de Excepciones
Se usa para evitar que el programa se cierre si el usuario comete un error.

a) Leer números sin que explote si el usuario pone letras:
java
Copiar
Editar
catch (InputMismatchException e) {
    System.out.println("Error: Debe ingresar un número.");
    sc.nextLine(); // Limpia el error del buffer
}
b) Validar que el nombre y tipo no estén vacíos:
java
Copiar
Editar
if (nombre.trim().isEmpty()) {
    throw new IllegalArgumentException("El nombre no puede estar vacío.");
}
c) Validar que el costo no sea negativo:
java
Copiar
Editar
if (costo < 0) {
    throw new IllegalArgumentException("El costo no puede ser negativo.");
}

5. Eliminar carta
Se muestra la lista, se pide el número de carta a eliminar y se convierte a índice:

java
Copiar
Editar
int indice = sc.nextInt();  // Usuario ingresa 1, 2, 3...
inventario.eliminarCarta(indice - 1);  // Convertir a índice (base 0)
