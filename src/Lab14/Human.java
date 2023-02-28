package Lab14;

import java.util.Date;
import java.util.Objects;

public class Human {
    String fio;
    Date dateOfBirth;
    int phoneNumber;

    public Human(String fio, int phoneNumber) {
        this.fio = fio;
        this.phoneNumber = phoneNumber;
    }

    public void messageGreetings() {
        System.out.println("Привет");
    }

    public void messageParting() {
        System.out.println(555);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return phoneNumber == human.phoneNumber &&
                Objects.equals(fio, human.fio) &&
                Objects.equals(dateOfBirth, human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, dateOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
