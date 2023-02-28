package Lab12.citizen;

public class PassportUtil {

    private PassportUtil() {
        System.out.println("«закрытый конструктор»");
    }

    public static void marriageRegistrate(Passport passport1, Passport passport2) {
        passport1.setSpouseid(passport2);
        passport2.setSpouseid(passport1);

        passport1.setSpouseidstr(passport2.getNumber());
        passport2.setSpouseidstr(passport1.getNumber());

        //System.out.println(passport1.getSpouseid());
        //System.out.println(passport2.getSpouseid());

    }
}
