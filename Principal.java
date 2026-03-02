import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();

         System.out.println("¿Cuántas filas tendrá?");
        int filas = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuántas columnas tendrá?");
        int columnas = Integer.parseInt(teclado.nextLine());

        objProductosuper[][] matriz = new objProductosuper[filas][columnas];

        matriz = m.registrarProductos(matriz);

        objProductosuper disponibles = m.encontrarDisponibles(matriz);

        System.out.println("Productos true");
        System.out.println(disponibles);

    }
}
