package Lab12.test;

import Lab12.citizen.Passport;
import Lab12.citizen.PassportUtil;

import static Lab12.citizen.PassportUtil.marriageRegistrate;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passport1 = new Passport("Sasha", "Shmurko", "14.02.2002");
        Passport passport2 = new Passport("Masha", "Shmurko", "14.02.2002");

        System.out.println(passport1.getSpouseid());

        marriageRegistrate(passport1, passport2);
        System.out.println(passport1.getSpouseid());
        System.out.println();
        System.out.println(passport2.getSpouseid());

        PassportUtil.marriageRegistrate(passport1, passport2);
        System.out.println(passport2);
        System.out.println();

    }
}
