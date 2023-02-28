package Lab14;

import java.util.Objects;

public class Cashier extends Employee {
    String cashDeskNumber;

    public Cashier(String fio, int phoneNumber) {
        super(fio, phoneNumber);

    }

    public void countMoney() {
        System.out.println("Кассир считает деньги");
    }

    @Override
    public void toDoWork() {
        System.out.println("Кассир: обслуживает покупателей, следит за наличием товаров на витринах и полках, постоянное место нахождения работника – за кассой.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return Objects.equals(cashDeskNumber, cashier.cashDeskNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashDeskNumber);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "cashDeskNumber='" + cashDeskNumber + '\'' +
                '}';
    }
}
