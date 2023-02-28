package Lab12;

import Lab12.citizen.Passport;
import Lab12.citizen.PassportUtil;

public class Test {
    public static void main(String[] args) {
        Passport passport1 = new Passport("Sasha", "Shmurko", "14.02.2002");
        Passport passport2 = new Passport("Masha", "Shmurko", "14.02.2002");
        PassportUtil.marriageRegistrate(passport1, passport2);

        // Passport passport2 = new Passport("Sasha", "Shmurko", "14.02.2002");
        // String str = "desdfsdfsdf";
        // Lab12.technics.Passport passport1 = new Lab12.technics.Passport("Bathroom", "White", "15.01.1995");
        // Lab12.transport.Passport passport = new Lab12.transport.Passport("Lada", "Red", "AP0001CB");
    }
}
