package GasStation.Mashinka;

import java.io.IOException;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 80);
        client.runClient();
    }
}