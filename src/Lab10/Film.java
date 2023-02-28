package Lab10;

public class Film {
    private String name;
    private String duration;
    private String janr;

    public static final String COMEDY = "Комедія";
    public static final String FANTASTIC = "Фантастика";
    public static final String HORROR = "Жахи";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    {
        System.out.println("Создается новый Фильм");
    }

    public Film(String name, String duration, String janr) {
        System.out.println("Фильм " + name + ", успешно создана");
    }
}

