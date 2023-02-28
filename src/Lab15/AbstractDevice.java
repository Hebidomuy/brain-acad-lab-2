package Lab15;

public abstract class AbstractDevice {
    String name;
    int serialNumber;

    public AbstractDevice() {
       //powerOn();
    }

    public abstract void powerOn();

    public abstract void powerOff();

}
