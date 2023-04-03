package Lab21;

import java.util.HashSet;

public class User {
    private String name;
    private int old;
    private String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (old != user.old) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return phone != null ? phone.equals(user.phone) : user.phone == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    //@Override
    //public int hashCode() {
    //    int result = name != null ? name.hashCode() : 0;
    //    result = 31 * result + old;
    //    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    //    return result;
    //}

    public static void main(String[] args) {
        User user1 = new User("Nikita", 30, "123-456-7890");
        User user2 = new User("Nikita", 30, "123-456-7890");
        User user3 = new User("Nikita", 35, "123-456-7890");

        HashSet<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
        System.out.println(user.getName() + ", " + user.getOld() + ", " + user.getPhone());
        }

        System.out.println();

        for (User user : userSet) {
        System.out.println(user.getName() + ", " + user.getOld() + ", " + user.getPhone());
        }

        System.out.println();

        for (User user : userSet) {
        System.out.println(user.getName() + ", " + user.getOld() + ", " + user.getPhone());
        }
        }
        }