import java.util.ArrayList;

public class Inventario {
    private ArrayList<Carta> cartas;

    public Inventario() {
        cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void listarCartas() {
        if (cartas.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < cartas.size(); i++) {
                System.out.println((i + 1) + ". " + cartas.get(i));
            }
        }
    }

    public void eliminarCarta(int indice) {
        if (indice >= 0 && indice < cartas.size()) {
            cartas.remove(indice);
            System.out.println("Carta eliminada correctamente.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public int cantidadCartas() {
        return cartas.size();
    }
}

