package Lab12.technics;

import java.util.Date;

public class Passport {
    private String name;
    private String color;
    private String data;
    private Date warrantyStartDate;

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public Passport(String name, String color, String data) {
        this.name = name;
        this.color = color;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", data='" + data + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
