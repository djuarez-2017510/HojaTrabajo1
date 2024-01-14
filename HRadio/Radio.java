public class Radio implements IRadio {
    private boolean state;
    private double[] ArrayAM=new double[11];
    private double[] ArrayFM=new double[11];
    private boolean amfm;
    protected double numberAM=530.0;
    protected double numberFM=87.9;

    public Radio(){
        // en la variable amfm false reprsenta que esta AM y true que esta FM
        amfm=false;
        //en la variable state true representa encendido y false apagado
        state=false;
     

    }
   public void SwitchOnOff(){
        if(state==true){
            state=false;
            System.out.println("Se apagó la Radio");
        }else{
            state=true;
            System.out.println("Se encendió la radio ");
        }

    }
    public void SwitchAMFM(){
            if(amfm==true){
                amfm=false;
                System.out.println("Se cambio a AM");
            }else{
                amfm=true;
                System.out.println("Se cambio a FM");
            }
    }

    public boolean isAM(){
        return amfm == false;
    }

    public boolean isOn(){
        return state == true;
    }

    public double nextStation(){
        if(isAM()){
            numberAM += 100.0;
            if(numberAM > 1610.0){
                numberAM = 530.0;
            }
            return numberAM;
        }else{
            numberFM += 0.2;
            if(numberFM > 107.9){
                numberFM = 87.9;
            }
            return numberFM;
        }
    }
    public void SaveStation(int id, double number) {
        if (isAM()) {
            if (id >= 0 && id < ArrayAM.length) {
                ArrayAM[id] = number;
            } else {
                System.out.println("Posición no válida para la frecuencia AM.");
            }
        } else {
            if (id >= 0 && id < ArrayFM.length) {
                ArrayFM[id] = number;
            } else {
                System.out.println("Posición no válida para la frecuencia FM.");
            }
        }
    }

    public double SelectStation(int id) {
        double estacionSeleccionada = 0.0;

        if (isAM()) {
            if (id >= 0 && id < ArrayAM.length) {
                estacionSeleccionada = ArrayAM[id];
                System.out.println("La radio se ha movido a la estacion asignada en el boton " + id + " en la frecuencia AM: " + estacionSeleccionada);
                numberAM = estacionSeleccionada;
            } else {
                System.out.println("Posición no válida para la frecuencia AM.");
            }
        } else {
            if (id >= 0 && id < ArrayFM.length) {
                estacionSeleccionada = ArrayFM[id];
                System.out.println("La radio se ha movido a la estacion asignada en el boton " + id + " en la frecuencia FM: " + estacionSeleccionada);
                numberFM = estacionSeleccionada;
            } else {
                System.out.println("Posición no válida para la frecuencia FM.");
            }
        }

        return estacionSeleccionada;
    }

}
   
