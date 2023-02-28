package Lab14;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Objects;

public class Employee extends Human {
    List<Data> employmentDate;
    double salary;
    Boolean presence;

    public Employee(String fio, int phoneNumber) {
        super(fio, phoneNumber);
    }

    public void comeToWork() {
        System.out.println("Сотрудник приходит на работу");
    }

    public void goToLunch() {
        System.out.println("Сотрудник идет на обед");
    }

    public void toDoWork() {
        System.out.println("Сотрудник делает работу");
    }

    @Override
    public void messageGreetings() {
        System.out.println("Привет, ghbdtn");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(employmentDate, employee.employmentDate) &&
                Objects.equals(presence, employee.presence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, salary, presence);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employmentDate=" + employmentDate +
                ", salary=" + salary +
                ", presence=" + presence +
                '}';
    }
}
