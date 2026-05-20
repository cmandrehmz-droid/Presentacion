import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Ronda guardia = new Ronda();
        int opcion;

        do {
            System.out.println("==============================================");
            System.out.println("------Turno de Guardias  Menú Principal-------");
            System.out.println("==============================================");
            System.out.println("1. Agregar Guardia");
            System.out.println("2. Mostrar Ronda de Guardias");
            System.out.println("3. Siguiente Guardia");
            System.out.println("4. Guardia anterior");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String Nombre = sc.nextLine();
                    System.out.print("Sector: ");
                    String Sector = sc.nextLine();
                    guardia.agregarGuardia(Nombre, Sector);
                    System.out.println("Guardia Agregado.");
                    break;

                case 2:
                    guardia.mostrarRondaCompleta();
                    break;

                case 3:
                    guardia.siguiente();
                    guardia.mostrarRondaCompleta();
                    break;

                case 4:
                    guardia.anterior();
                    guardia.mostrarRondaCompleta();
                    break;
                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 0);

        sc.close();
    }
}
