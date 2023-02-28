package Lab14;

import java.util.Objects;

public class Client extends Human implements Test{
    int discountCard;
    double amountOfMoney;

    public Client(String fio, int phoneNumber) {
        super(fio, phoneNumber);
        this.discountCard = 555;
    }

    public void learnAboutTheProduct() {
        System.out.println("Клиент узнает про товар");
    }

    public void buy(double amountOfMoney) {
        System.out.println("Клиет покупает товар");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return discountCard == client.discountCard &&
                Double.compare(client.amountOfMoney, amountOfMoney) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountCard, amountOfMoney);
    }

    @Override
    public String toString() {
        return "Client{" +
                "discountCard=" + discountCard +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, client!");
    }
}
