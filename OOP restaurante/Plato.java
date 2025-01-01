import java.util.Scanner;

public class Plato extends Alimento implements IAlimento {

    private int preparado;

    public Plato(String nombre, int precio, String descripcion, int calificacion, int preparado) {
        super(nombre, precio, descripcion, calificacion);
        this.preparado = preparado;
    }

    public int preparar() {
        Scanner teclado = new Scanner(System.in);
        int nuevosPlatos = teclado.nextInt();
        preparado += nuevosPlatos;

        return preparado;
    }

    public void servir(int servir) {
        if (servir > preparado) {
            System.out.println("Error el numero que quieres servir es mayor a lo que tienes preparado");
        } else if (servir <= preparado) {
            this.preparado = preparado - servir;
            System.out.println("se sirvieron: " + servir + " platos");
        }
    }

    public int getPreparado() {
        return preparado;
    }

    public void setPreparado(int preparado) {
        this.preparado = preparado;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("descripcion: " + descripcion);
        System.out.println("platos preparados: " + preparado);
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Platos preparados: " + preparado + "\n";
    }

}
