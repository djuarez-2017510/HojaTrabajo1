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
                    System.out.println("En que boton desea guardarlo(Seleccione un numero del 1 al 12)");
                    int choice2= scanner.nextInt();
                    switch(choice2){
                        case 1:
                        if(miradio.isAM()){
                             miradio.SaveStation(0, miradio.numberAM);

                        }else{
                            miradio.SaveStation(0, miradio.numberFM);

                        }
                        break;
                        case 2:
                         if(miradio.isAM()){
                             miradio.SaveStation(1, miradio.numberAM);

                        }else{
                            miradio.SaveStation(1, miradio.numberFM);

                        }
                        break;
                        case 3:
                         if(miradio.isAM()){
                             miradio.SaveStation(2, miradio.numberAM);

                        }else{
                            miradio.SaveStation(2, miradio.numberFM);

                        }
                        break;
                        case 4:
                         if(miradio.isAM()){
                             miradio.SaveStation(3, miradio.numberAM);
                        }else{
                            miradio.SaveStation(3, miradio.numberFM);

                        }
                        break;
                        case 5:
                          if(miradio.isAM()){
                             miradio.SaveStation(4, miradio.numberAM);

                        }else{
                            miradio.SaveStation(4, miradio.numberFM);

                        }
                        break;
                        case 6:
                          if(miradio.isAM()){
                             miradio.SaveStation(5, miradio.numberAM);

                        }else{
                            miradio.SaveStation(5, miradio.numberFM);

                        }
                        break;
                        case 7:
                          if(miradio.isAM()){
                             miradio.SaveStation(6, miradio.numberAM);

                        }else{
                            miradio.SaveStation(6, miradio.numberFM);

                        }
                        break;
                        case 8:
                          if(miradio.isAM()){
                             miradio.SaveStation(7, miradio.numberAM);

                        }else{
                            miradio.SaveStation(7, miradio.numberFM);

                        }
                        break;
                        case 9:
                          if(miradio.isAM()){
                             miradio.SaveStation(8, miradio.numberAM);

                        }else{
                            miradio.SaveStation(8, miradio.numberFM);

                        }
                        break;
                        case 10:
                          if(miradio.isAM()){
                             miradio.SaveStation(9, miradio.numberAM);

                        }else{
                            miradio.SaveStation(9, miradio.numberFM);

                        }
                        break;
                        case 11:
                          if(miradio.isAM()){
                             miradio.SaveStation(10, miradio.numberAM);

                        }else{
                            miradio.SaveStation(10, miradio.numberFM);

                        }
                        break;
                        case 12:
                          if(miradio.isAM()){
                             miradio.SaveStation(11, miradio.numberAM);

                        }else{
                            miradio.SaveStation(11,miradio.numberFM);

                        }
                        break;
                        


                        default:
                        System.out.println("No existe un boton con ese numero");

                       
                    }

                    break;
                case 5:
                 
                 System.out.println("¿A qué boton quiere acceder?");
                 int choice3= scanner.nextInt();
                 switch (choice3) {
                    case 1:
                    miradio.SelectStation(0);
                        
                        break;
                    case 2:
                     miradio.SelectStation(1);



                    break;
                    case 3:
                     miradio.SelectStation(2);
                    break;
                    case 4:
                     miradio.SelectStation(3);
                    break;
                    case 5:
                     miradio.SelectStation(4);
                    break;
                    case 6:
                     miradio.SelectStation(5);
                    break;
                    case 7:
                     miradio.SelectStation(6);
                    break;
                    case 8:
                     miradio.SelectStation(7);
                    break;
                    case 9:
                     miradio.SelectStation(8);
                    break;
                    case 10:
                     miradio.SelectStation(9);
                    break;
                    case 11:
                     miradio.SelectStation(10);
                    break;
                    case 12:
                     miradio.SelectStation(11);
                    break;

                
                    default:
                    System.out.println("No existe un boton al cual acceder");
                        break;
                }

                
                
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