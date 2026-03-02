import java.util.Scanner;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    // Registrar productos en la matriz
    public objProductosuper[][] registrarProductos(objProductosuper[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                objProductosuper P = new objProductosuper();

                System.out.println("\nProducto en posición [" + i + "][" + j + "]");

                System.out.print("Ingrese nombre: ");
                P.setNombre(teclado.nextLine());

                System.out.print("Ingrese Precio: ");
                P.setPrecio(Double.parseDouble(teclado.nextLine()));

                System.out.print("Disponible? (true/false): ");
                P.setDisponibilidad(Boolean.parseBoolean(teclado.nextLine()));

                matriz[i][j] = P;
            }
        }

        return matriz;
    }


public void mostrarDisponibles(objProductosuper[][] matriz) {

    boolean hayDisponibles = false;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {

            if (matriz[i][j] != null && matriz[i][j].isDisponibilidad()) {

                System.out.println("Producto en [" + i + "][" + j + "]");
                System.out.println("Nombre: " + matriz[i][j].getNombre());
                System.out.println("Precio: " + matriz[i][j].getPrecio());
                System.out.println("Disponible: " + matriz[i][j].isDisponibilidad());
                System.out.println("---------------------------");

                hayDisponibles = true;
            }
        }
    }

    if (!hayDisponibles) {
        System.out.println("No hay productos disponibles.");
    }
} 
} 