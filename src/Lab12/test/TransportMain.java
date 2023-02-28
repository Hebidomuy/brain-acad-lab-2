package Lab12.test;

//import Lab12.transport.PassportUtil;

//import Lab12.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Lab12.transport.Passport passport = new Lab12.transport.Passport("Lada", "Red", "AP0001CB");

        System.out.println(passport);

        passport.changeOwner("Ivanov Aleksandr Sergeevich");

        System.out.println(passport);
    }
}
