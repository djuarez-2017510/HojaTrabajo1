import java.util.Scanner;

/*Curso: Estructura de Datos 
 * Catedratico: Pablo Godoy
 * Sección: 41
 * Programadores: Andrés Mazariegos y Daniel Jurez 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Radio miradio= new Radio();

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
                miradio.SwitchOnOff();
                    break;
                case 2:
                if(miradio.isOn()){
                    miradio.SwitchAMFM();
                }else{
                    System.out.println("La radio no esta encendida");
                }
                    break;
                case 3:
                if(miradio.isOn()){
                    System.out.println("La estación actual: " + miradio.nextStation());
                }else{
                    System.out.println("La radio no esta encendida");
                }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                System.out.println("Saliendo del programa");
                System.exit(0);
                default:
                    System.out.println("No es una opción valida");
            }
        }
    }
}