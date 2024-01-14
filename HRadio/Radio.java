public class Radio implements IRadio {
    private boolean state;
    private double station;
    private double[] ArrayAM=new double[11];
    private double[] ArrayFM=new double[11];
    private boolean amfm;

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
        }
        else{
            state=true;
            System.out.println("Se encendió la radio ");
        }

    }
    public void SwitchAMFM(){
        if(isOn()){
            if(amfm==true){
                amfm=false;
                System.out.println("Se cambio a AM");
            }
            else{
                amfm=true;
                System.out.println("Se cambio a FM");
            }
        }else{
            System.out.println("La radio no esta encendida");
        }
         
    }

    public boolean isAM(){
        return amfm == false;
    }

    public boolean isOn(){
        return state == true;
    }

}
   
