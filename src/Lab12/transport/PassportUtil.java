package Lab12.transport;

public class PassportUtil {

    public static Passport changeOwner(Passport passport, String fio) {
        //Passport newPassport = new Passport("Lada", "Red", "AP0001CB");
        //newPassport = new Passport(fio);
        Passport newPassport = new Passport(passport.getName(), passport.getColor(), passport.getNumberCar(), fio);
        //newPassport.setOwnerName(fio);
        return newPassport;
    }

}
