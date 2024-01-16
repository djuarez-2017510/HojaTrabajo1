import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;


public class RadioTest {
    private Radio radio;

    @Before
    public void setUp() {
        // Enciende la radio para realizar pruebas
        radio = new Radio();
        radio.SwitchOnOff(); 
    }

    @Test
    public void testSaveStation(){
        //Cambia a FM para la prueba
        radio.SwitchAMFM();

        // Guarda una estación en la posición 3 del array
        radio.SaveStation(3, 99.5);
        //Verifica que se haya guardado el valor correcto
        assertEquals(99.5, radio.SelectStation(3), 0.001); 
    }

    @Test
    public void testNextStationAM() {
        int numIterationsToReachEnd = 9;
        //Avanza a la siguiente estación AM
        double initialStation = radio.nextStation();
        //Confirma que haya avanzado correctamente
        assertEquals(630.0, initialStation, 0.001);

        //Avanzar hasta el final de la emisora AM
        for (int i = 0; i < numIterationsToReachEnd; i++) {
            radio.nextStation();
        }
        //Da el siguiente avance para llegar al inicio de nuevo
        double maxAMStation = radio.nextStation(); 
        //Confirma que se llego al inicio correctamente
        assertEquals(530.0, maxAMStation, 0.001);
    }

    @Test
    public void testSelectStationFM() {
        // Cambia a FM para la prueba.
        radio.SwitchAMFM(); 
        // Guarda una estación en la posición 5 del array.
        radio.SaveStation(5, 101.1);
        
        // Verifica si la frecuencia actual es igual a la estación guardada.
        assertEquals(101.1, radio.SelectStation(5), 0.001);
    }
}
