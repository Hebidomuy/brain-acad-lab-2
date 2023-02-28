package Lab12.transport;

public class Passport {
    private String name;
    private String color;
    private String numberCar;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Passport(String name, String color, String numberCar) {
        this.name = name;
        this.color = color;
        this.numberCar = numberCar;
    }

    public Passport(String name, String color, String numberCar, String ownerName) {
        this.name = name;
        this.color = color;
        this.numberCar = numberCar;
        this.ownerName = ownerName;
    }

    public void changeOwner(String newOwnerName) {
        PassportUtil.changeOwner(this, newOwnerName);
    }
}
