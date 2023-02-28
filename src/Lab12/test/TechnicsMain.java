package Lab12.test;

import Lab12.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        Lab12.technics.Passport passport = new Lab12.technics.Passport("Bathroom", "White", "15.01.1995");

        System.out.println(passport);

//   passport = PassportUtil.warrantyReplace(passport);

        PassportUtil.warrantyReplace(passport);

        System.out.println(passport);

    }
}
