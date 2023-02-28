package Lab14;

import java.util.Objects;

public class Manager extends Employee implements Test{
    String department;

    public Manager(String fio, int phoneNumber, String department) {
        super(fio, phoneNumber);
        this.department = department;
    }

    public void consult() {
        System.out.println("Менеджер рассказывает о товаре");
    }

    public void talkAboutDiscounts() {
        System.out.println("Менеджер рассказывает про скидки");
    }

    public void giveAdvice() {
        System.out.println("Менеджер советует товар");
    }

    @Override
    public void toDoWork() {
        System.out.println("Менеджер: выявляет потенциальных клиентов, осуществляет анализ потребностей клиентов, их уровень и направленность.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, manager!");
    }
}

