package Lab31;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter to send message to server. Write 'exit' to close");

        try (Socket connectToServerSocket = new Socket("localhost", 8888);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(connectToServerSocket.getInputStream())
             );
             PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
             BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));) {

            String userInput, serverOutput;
            while ((userInput = inu.readLine()) != null) {
                out.println(userInput);
                serverOutput = in.readLine();
                System.out.println(serverOutput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }
    }

   //public void sendMessage(String message) {
   //    out.println(message);
   //}

   //public String receiveMessage() {
   //    try {
   //        return in.readLine();
   //    } catch (Exception e) {
   //        e.printStackTrace();
   //        return null;
   //    }
   //}


    //public void close () {
    //    try {

    //    }
}
//}