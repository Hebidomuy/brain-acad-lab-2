package Lab26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(CreditCard.CardType.VISA, "Bank of Ukraine", 1234567890, "01/24", "123");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("card.ser")))) {
            oos.writeObject(creditCard);
            System.out.println("Объект кредитной карты сериализован");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}