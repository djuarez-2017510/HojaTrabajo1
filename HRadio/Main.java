import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Menú de Radio ***");
            System.out.println("1. Encender o Apagar Radio");
            System.out.println("2. Cambiar de estación AM/FM");
            System.out.println("3. Avanzar a la siguiente emisora");
            System.out.println("4. Guardar una emisora");
            System.out.println("5. Seleccionar una emisora guardada");
            System.out.println("0. Salir");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                
                default:
                    System.out.println("No es una opción valida");
            }
        }
    }
}