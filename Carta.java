public class Carta {
    private String nombre;
    private String tipo;
    private int costo;

    public Carta(String nombre, String tipo, int costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "Nombre='" + nombre + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Costo=" + costo +
                '}';
    }
}

