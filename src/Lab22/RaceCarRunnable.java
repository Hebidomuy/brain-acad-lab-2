package Lab22;

import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car implements Runnable{
    private double passed;
    private double distance;
    public boolean isFinish;
    private CountDownLatch latch;
    private long finishTime;

    public RaceCarRunnable(String name, int maxSpeed, double distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public long getFinishTime(){ return finishTime; }

    private int getRandomSpeed() {
        int max = super.getMaxSpeed();
        int min = super.getMaxSpeed() / 2;
        return (max - min) + min;
    }

    @Override
    public String toString() {
        return "RaceCarRunnable{" +
                "passed=" + passed +
                ", distance=" + distance +
                ", isFinish=" + isFinish +
                '}';
    }

    @Override
    public void run() {

        while (!isFinish()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int speed = getRandomSpeed();
            this.passed += speed;
            System.out.println(getName() + " => speed: " + speed + "; progress: " + passed + "/" + distance);
            if (this.passed >= this.distance) {
                this.passed = this.distance;
                this.isFinish = true;
                finishTime = System.currentTimeMillis() - Race.startRaceTime.get();
                this.latch.countDown();
                System.out.println(getName() +  " FINISHED !");
                System.out.println("end " + super.getName() +" thread ");

            }
        }
    }
}