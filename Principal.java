import java.util.Scanner;

public class Principal{
    
    public static void main(String[] args) {
        
    


    Scanner teclado = new Scanner(System.in);
    metodos m = new metodos();

    System.out.println("¿Cuantas filas tendra?");
    int filas = Integer.parseInt(teclado.nextLine());

    System.out.println("¿Cuantas columnas tendra?");
    int columnas = Integer.parseInt(teclado.nextLine());

    objProductosuper[][] matriz = new objProductosuper[filas][columnas];

    matriz = m.registrarProductos(matriz);

    System.out.println("\nProductos disponibles:");
    m.mostrarDisponibles(matriz);
    }
}
