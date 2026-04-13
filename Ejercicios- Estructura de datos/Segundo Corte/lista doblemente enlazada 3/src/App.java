import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Navegador navegador = new Navegador();

        do {
            System.out.println("\n=======================================");
            System.out.println("     Navegación de Pestañas");
            System.out.println("=======================================");
            System.out.println(" [1] Abrir Pestaña");
            System.out.println(" [2] Cerrar Pestaña por URL");
            System.out.println(" [3] Mostrar Pestañas");
            System.out.println(" [0] Salir");
            System.out.println("=======================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Título página: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora apertura: ");
                    String hora = sc.nextLine();

                    Pestaña nueva = new Pestaña(titulo, url, hora);

                    navegador.abrirPestaña(nueva);

                    System.out.println("Pestaña abierta.");
                    break;

                case 2:

                    System.out.print("Ingrese URL a cerrar: ");
                    String cerrar = sc.nextLine();

                    navegador.cerrarPestañaActual(cerrar);
                    break;

                case 3:

                    navegador.mostrarPestañas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
