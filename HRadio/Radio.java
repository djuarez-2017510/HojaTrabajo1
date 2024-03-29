/**
 * Representa una radio que puede cambiar entre frecuencias AM y FM,
 * guardar y seleccionar estaciones, y controlar su estado de encendido.
 */
public class Radio implements IRadio {

    private boolean state; // Representa si la radio está encendida (true) o apagada (false).
    private double[] arrayAM = new double[11]; // Arreglo para almacenar estaciones AM guardadas.
    private double[] arrayFM = new double[11]; // Arreglo para almacenar estaciones FM guardadas.
    private boolean amfm; // Representa la banda de frecuencia actual: false para AM, true para FM.
    protected int numberAM = 530; // Representa la frecuencia AM actual.
    protected double numberFM = 87.9; // Representa la frecuencia FM actual.

    /**
     * Constructor para la clase Radio.
     * Inicializa la radio con valores predeterminados.
     */
    public Radio() {
        // AM se establece como la banda de frecuencia predeterminada.
        amfm = false;
        // La radio está apagada inicialmente.
        state = false;
    }

    /**
     * Enciende o apaga la radio.
     */
    public void SwitchOnOff() {
        if (state == true) {
            state = false;
            System.out.println("Se apagó la Radio");
        } else {
            state = true;
            System.out.println("Se encendió la radio");
        }
    }

    /**
     * Cambia entre las frecuencias AM y FM.
     */
    public void SwitchAMFM() {
        if (amfm == true) {
            amfm = false;
            System.out.println("Se cambió a AM");
        } else {
            amfm = true;
            System.out.println("Se cambió a FM");
        }
    }

    /**
     * Verifica si la radio está sintonizada en AM.
     * @return true si está en AM, false si está en FM.
     */
    public boolean isAM() {
        return amfm == false;
    }

    /**
     * Verifica si la radio está encendida.
     * @return true si está encendida, false si está apagada.
     */
    public boolean isOn() {
        return state == true;
    }

    /**
     * Avanza a la siguiente estación de radio según la banda actual.
     * @return La nueva frecuencia de la estación.
     */
    public double nextStation() {
        if (isOn()) {
            if (isAM()) {
                numberAM += 100;
                if (numberAM > 1610) {
                    numberAM = 530;
                }
                return numberAM;
            } else {
                numberFM += 0.2;
                if (numberFM > 107.9) {
                    numberFM = 87.9;
                }
                return numberFM;
            }
        } else {
            System.out.println("La radio está apagada");
        }
        return 0;
    }

    /**
     * Guarda la estación actual en una posición específica del arreglo.
     * @param id La posición en la que se guardará la estación.
     * @param number La frecuencia de la estación a guardar.
     */
    public void SaveStation(int id, double number) {
        if (isAM()) {
            if (id >= 0 && id < arrayAM.length) {
                arrayAM[id] = number;
            } else {
                System.out.println("Posición no válida para la frecuencia AM.");
            }
        } else {
            if (id >= 0 && id < arrayFM.length) {
                arrayFM[id] = number;
            } else {
                System.out.println("Posición no válida para la frecuencia FM.");
            }
        }
    }

    /**
     * Selecciona una estación guardada en una posición específica del arreglo.
     * @param id La posición de la estación guardada que se seleccionará.
     * @return La frecuencia de la estación seleccionada.
     */
    public double SelectStation(int id) {
        double estacionSeleccionada = 0.0;

        if (isAM()) {
            if (id >= 0 && id < arrayAM.length) {
                estacionSeleccionada = arrayAM[id];
                if (estacionSeleccionada != 0.0) {
                    System.out.println("La radio se ha movido a la estación asignada en el botón " + (id + 1) +
                            " en la frecuencia AM: " + estacionSeleccionada);
                    numberAM = (int)estacionSeleccionada;
                } else {
                    System.out.println("El botón no tiene asignada ninguna estación");
                }
            } else {
                System.out.println("Posición no válida para la frecuencia AM.");
            }

        } else {
            if (id >= 0 && id < arrayFM.length) {
                estacionSeleccionada = arrayFM[id];
                if (estacionSeleccionada != 0.0) {
                    System.out.println("La radio se ha movido a la estación asignada en el botón " + (id + 1) +
                            " en la frecuencia FM: " + estacionSeleccionada);
                    numberFM = estacionSeleccionada;
                } else {
                    System.out.println("El botón no tiene asignada ninguna estación");
                }
            } else {
                System.out.println("Posición no válida para la frecuencia FM.");
            }
        }

        return estacionSeleccionada;
    }
}
