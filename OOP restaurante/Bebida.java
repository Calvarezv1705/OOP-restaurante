public class Bebida extends Alimento {

    public Bebida(String nombre, int precio, String descripcion, int calificacion) {
        super(nombre, precio, descripcion, calificacion);
    }

    public void consultar_Precio() {
        int x = 1; // ultimo numero de la tarjeta de identidad
        int descuento = x + 1;

        int calcularDescuento = (descuento * precio) / 100;

        int precioFinal = precio - calcularDescuento;

        System.out.println("el precio de la bebida con descuento es de: " + precioFinal);
    }

    public void servir() {
        System.out.println("se sirvio la bebida " + nombre);
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("descripcion: " + descripcion);
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Descripción: " + descripcion + "\n";
    }
}
