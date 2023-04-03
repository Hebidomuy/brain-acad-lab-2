package Lab19;

public class GameConsole implements Powered {
    private final String brand;
    private final String serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(String brand, String serial, int waitingCounter) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(brand, 1, this.serial);
        this.secondGamepad = new Gamepad(brand, 2, this.serial);
        this.isOn = false;
        this.activeGame = null;
        this.waitingCounter = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerial() {
        return serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Консоль включена.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Консоль выключена.");
    }

    public void loadGame(Game game) {
        activeGame = game;
        System.out.println("Game " + game.getName() + " is loading...");
    }

    public void playGame() {
        checkStatus();
        gamepadTurnedOff(firstGamepad);
        gamepadTurnedOn(secondGamepad);
        if (activeGame != null) {
            System.out.println("Playing " + activeGame.getName() + ".");
            firstGamepad.decreaseCharge(10);
            secondGamepad.decreaseCharge(10);
            System.out.println("FirstGamepad charge: " + firstGamepad.getChargeLevel() + "%.");
            System.out.println("SecondGamepad charge: " + secondGamepad.getChargeLevel() + "%.");
        } else {
            System.out.println("No game is loaded.");
        }
    }

    private void checkStatus() {
        if (!firstGamepad.isOn() && !secondGamepad.isOn()) {
            System.out.println("Connect a gamepad.");
            waitingCounter++;
        } else {
            waitingCounter = 0;
        }
        if (waitingCounter > 5) {
            powerOff();
            throw new GameConsoleException();
        }
    }

    public void gamepadTurnedOn(Gamepad gamepad) {
        if (!isOn) {
            powerOn();
        }
        if (gamepad == firstGamepad && !secondGamepad.isOn()) {
            firstGamepad.setFirstPlayer(true);
            secondGamepad.setFirstPlayer(false);
        } else if (gamepad == secondGamepad && !firstGamepad.isOn()) {
            secondGamepad.setFirstPlayer(true);
            firstGamepad.setFirstPlayer(false);
        }
    }

    public void gamepadTurnedOff(Gamepad gamepad) {
        if (gamepad == firstGamepad && firstGamepad.isFirstPlayer()) {
            secondGamepad.setFirstPlayer(true);
        } else if (gamepad == secondGamepad && secondGamepad.isFirstPlayer()) {
            firstGamepad.setFirstPlayer(true);
        }
    }

    public class Gamepad implements Powered {
        private final String brand;
        private final String consoleSerial;
        private final int connectedNumber;
        private GamepadColor color;
        private double chargeLevel;
        private boolean isOn;
        private boolean isFirstPlayer;

        public Gamepad(String brand, int connectedNumber, String consoleSerial) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;
            this.color = GamepadColor.BLACK;
            this.chargeLevel = 100.0;
            this.isOn = false;
            this.isFirstPlayer = false;
        }

        public String getBrand() {
            return brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public GamepadColor getColor() {
            return color;
        }

        public void setColor(GamepadColor color) {
            this.color = color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(int chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        @Override
        public void powerOn() {

        }

        @Override
        public void powerOff() {

        }

        public void decreaseCharge(int i) {
            if (isOn) {
                this.chargeLevel -= i;
                if (this.chargeLevel < 0) {
                    this.chargeLevel = 0;
                }
            }
        }

        public void setFirstPlayer(boolean isFirstPlayer) {
            this.isFirstPlayer = isFirstPlayer;
        }

        public boolean isFirstPlayer() {
            return isFirstPlayer;
        }
    }

    enum GamepadColor {
        BLACK, WHITE, BLUE, RED, GREEN
    }
}
