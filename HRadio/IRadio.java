public interface IRadio {
    public void SaveStation(int id,double station);
    public boolean isAM();
    public boolean isOn();
    public double SelectStation(int id);
    public void SwitchOnOff();
    public void SwitchAMFM();
    public double nextStation();
 }