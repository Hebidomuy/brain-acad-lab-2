package Lab12.citizen;

public class Passport {
    private String number;
    private String name;
    private String surname;
    private String dateOfBirth;

    private String spouseidstr;

    private Passport spouseid;


    public String getNumber() {
        return number;
    }

    public String getSpouseidstr() {
        return spouseidstr;
    }

    public void setSpouseidstr(String spouseidstr) {
        this.spouseidstr = spouseidstr;
    }

    public Passport getSpouseid() {
        return spouseid;
    }

    public void setSpouseid(Passport spouseid) {
        this.spouseid = spouseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameff) {
        name = nameff;
    }

    public Passport(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

}
