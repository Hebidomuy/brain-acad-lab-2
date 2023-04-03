package Lab17;

public class User {
    String login;
    private String password;
    String name;
    PositionsOfEmployees role;

    public User(String login, String password, String name, PositionsOfEmployees role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public PositionsOfEmployees getRole() {
        return role;
    }
}
