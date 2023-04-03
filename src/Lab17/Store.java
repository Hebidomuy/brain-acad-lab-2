package Lab17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Store {
    private String name;
    private String url;
    private List<User> userList;
    private User authorizedUserOfTheStore;

    public boolean login(String inputLogin, String inputPassword) {
        boolean validUserLoginAndPassword = false;
        for (User user : userList) {
            if (user.getLogin().equals(inputLogin) && user.getPassword().equals(inputPassword)) {
                authorizedUserOfTheStore = user;
                validUserLoginAndPassword = true;
                break;
            }
        }
        return validUserLoginAndPassword;
    }

    public void getCurrentUserRights() {
        System.out.println(this.authorizedUserOfTheStore.getRole().getWork());
    }

    public void logout() {
        authorizedUserOfTheStore = null;
        System.out.println("Пользователь вышел из системы");
    }

    public Store(String name, String url) {
        this.name = name;
        this.url = url;
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public User getAuthorizedUserOfTheStore() {
        return authorizedUserOfTheStore;
    }

    public void setAuthorizedUserOfTheStore(User authorizedUserOfTheStore) {
        this.authorizedUserOfTheStore = authorizedUserOfTheStore;
    }
}