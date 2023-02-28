package AdditionalTask;

public class Motorcycle {
    String number;
    Double gasTankMax;
    Double gasTank;
    Double distance;


    public Double getGasTank() {
        return gasTank;
    }

    public void setGasTank(Double gasTank) {
        this.gasTank = gasTank;
    }

    public Double getGasTankMax() {
        return gasTankMax;
    }

    public Double getDistance() {
        return distance;
    }

    public Motorcycle(String number) {
        this.number = number;
        this.gasTankMax = 100D;
        this.gasTank = 100D;
        this.distance = 0D;
    }

    public void traveledTheDistance(double distance) {
        this.distance += distance;
        this.gasTank = this.gasTank - distance;
    }

    public void getFuel(Motorcycle motorcycleOut) {
        Double motorcycleInFreeSpace = this.getGasTankMax() - this.getGasTank();
        if (motorcycleInFreeSpace >= motorcycleOut.getGasTank()) {
            this.setGasTank(this.getGasTank() + motorcycleOut.getGasTank());
            motorcycleOut.setGasTank(0D);
        } else if (motorcycleInFreeSpace < motorcycleOut.getGasTank()) {
            this.setGasTank(this.getGasTankMax());
            motorcycleOut.setGasTank(motorcycleOut.getGasTank() - motorcycleInFreeSpace);
        }
    }


    public static Motorcycle[] refueling(Motorcycle[] motorcycles) {
        int resultSize = 0;
        resultSize = motorcycles.length / 2;
        Motorcycle[] result = new Motorcycle[resultSize];
        for (int i = 0; i < result.length; i++) {
            result[i] = motorcycles[i];
            result[i].getFuel(motorcycles[i + result.length]);
        }
        return result;
    }
}