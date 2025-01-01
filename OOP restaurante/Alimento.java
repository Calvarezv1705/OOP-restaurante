public class Alimento {
    protected String nombre;
    protected int precio;
    protected String descripcion;
    protected int calificacion;

    public Alimento(String nombre, int precio, String descripcion, int calificacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
