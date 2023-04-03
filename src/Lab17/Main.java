package Lab17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("ATB", "dqfmfwfwf");

        List<User> userList = new ArrayList<>();

        userList.add(new User("01", "12345", "Valera", PositionsOfEmployees.DIRECTOR));
        userList.add(new User("02", "67890", "Sasha", PositionsOfEmployees.ADMINISTRATOR));
        userList.add(new User("03", "15439", "Andrei", PositionsOfEmployees.MANAGER));
        userList.add(new User("04", "75033", "Nikita", PositionsOfEmployees.CLIENT));
        userList.add(new User("05", "74809", "Danil", PositionsOfEmployees.ANONYMOUS));

        store.setUserList(userList);

        while (true) {
            tryLogin(store);
        }
    }


    public static void tryLogin(Store store) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = in.nextLine();
        System.out.println("Введите пароль: ");
        String password = in.nextLine();

        if (store.login(login, password)) {
            store.getCurrentUserRights();
            store.logout();
        } else {
            System.out.println("Неверный логин и/или пароль");
        }
    }
}