package Lab10;

import Lab10.Film;

public class Library {
    private Film[] filmList;

    final private String nameLibrary;

    {
        filmList = new Film[5];

        filmList[0] = new Film("Avatar 0", "6", Film.COMEDY);
        filmList[1] = new Film("Avatar 1", "61", Film.FANTASTIC);

        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String nameLibrary) {
        this.nameLibrary = nameLibrary;
        System.out.println("Библиотека " + nameLibrary + ", успешно создана");

    }

    public Film[] getFilmList() {
        return filmList;
    }

    public void setFilmList(Film[] filmList) {
        this.filmList = filmList;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }
}