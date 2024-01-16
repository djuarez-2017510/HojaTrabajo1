public interface IRadio {
    public void saveStation(int id,double station);
    public boolean isAm();
    public boolean isOn();
    public double selectStation(int id);
    public void switchOnOff();
    public void switchAMFM();
    public double nextStation();
 }