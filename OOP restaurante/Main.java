import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Plato plato1 = new Plato("Pastas Italianas", 20000, "Son unas ricas pastas a la boloñesa con tocineta", 10, 0);

        Plato plato2 = new Plato("Arroz con Huevo", 10000,
                "Son unos deliciosos huevos revueltos con arroz finamente seleccionado", 8, 0);

        System.out.println("Ingrese el número de platos preparados que va a tener las pastas italianas:");
        plato1.preparar();

        System.out.println("------------------------------");
        plato1.imprimir();

        System.out.println("------------------------------");
        System.out.println("Ingrese cuántos platos va a servir de las pastas italianas:");
        int servir1 = teclado.nextInt();
        plato1.servir(servir1);

        System.out.println("------------------------------");
        plato1.imprimir();

        System.out.println("------------------------------");
        System.out.println("Ingrese el número de platos preparados que va a tener el arroz con huevo:");
        plato2.preparar();

        System.out.println("------------------------------");
        plato2.imprimir();

        System.out.println("------------------------------");
        System.out.println("Ingrese cuántos platos va a servir de arroz con huevo:");
        int servir2 = teclado.nextInt();
        plato2.servir(servir2);

        System.out.println("------------------------------");
        plato2.imprimir();

        Bebida bebida1 = new Bebida("Guarapo", 5000,
                "Un jugo delicioso que proviene de la caña y tiene un sabor dulce y fresco al mismo tiempo", 9);
        System.out.println("------------------------------");
        bebida1.imprimir();
        bebida1.servir();

        Bebida bebida2 = new Bebida("Guandolo", 4000, "Un delicioso jugo de Colombia hecho con panela y limón", 7);
        System.out.println("------------------------------");
        bebida2.imprimir();
        bebida2.servir();

        System.out.println("------------------------------");
        System.out.println("Ingrese el número de platos preparados que va a tener las pastas italianas:");
        plato1.preparar();

        // esta es otra forma de imprimir por uno de los metodos que pidieron toString

        System.out.println("------------------------------");
        plato1.imprimir();
        System.out.println("------------------------------");

        System.out.println(plato1.toString());
        System.out.println("------------------------------");

        System.out.println(plato2.toString());
        System.out.println("------------------------------");

        System.out.println(bebida1.toString());
        System.out.println("------------------------------");

        System.out.println(bebida2.toString());
        System.out.println("------------------------------");

    }
}
