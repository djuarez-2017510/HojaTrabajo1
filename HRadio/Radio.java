public class Radio implements IRadio {
    private boolean state;
    private double station;
    private double[] ArrayAM=new double[11];
    private double[] ArrayFM=new double[11];
    private boolean amfm ;

    public Radio(){
        // en la variable amfm false reprsenta que esta apagada y true que esta encendida
        amfm=false;
        //en la variable state true representa FM y false AM
        state=true;
    }
   public void SwitchAMFM(){
        if(amfm==true){
            amfm=false;
            System.out.println("Se apagó la Radio");
        }
        else{
            amfm=true;
            System.out.println("Se encendió la radio ");
        }


        
    }
    public void SwitchOnOff(){
         if(state==true){
            amfm=false;
            System.out.println("Se cambio a AM");
        }
        else{
            amfm=true;
            System.out.println("Se cambio a FM");
        }

    }
}
   
