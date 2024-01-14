public class Radio implements IRadio {
    private boolean state;
    private double[] ArrayAM=new double[11];
    private double[] ArrayFM=new double[11];
    private boolean amfm;
    private double numberAM;
    private double numberFM;

    public Radio(){
        // en la variable amfm false reprsenta que esta AM y true que esta FM
        amfm=false;
        //en la variable state true representa encendido y false apagado
        state=false;
        numberAM = 530.0;
        numberFM = 87.9;
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
            numberAM += 10.0;
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

}
   
