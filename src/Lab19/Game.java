package Lab19;

import java.util.Arrays;
import java.util.Comparator;

public class Game {
    private final String name;
    private final Genre genre;
    private final Type type;

    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    public static GameDisk getDisk(String name, Genre genre, String description) {
        return new GameDisk(name, genre, description);
    }

    public static VirtualGame getVirtualGame(String name, Genre genre) {
        return new VirtualGame(name, genre);
    }

    enum Genre {
        ACTION, SPORT, RACE, PUZZLE, ADVENTURE, SHOOTER
    }

    enum Type {
        VIRTUAL, PHYSICAL
    }

    public static class GameDisk {
        private final String description;
        private final Game data;

        private GameDisk(String name, Genre genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, Type.PHYSICAL);
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return data.getName();
        }

        public Genre getGenre() {
            return data.getGenre();
        }

        public Type getType() {
            return data.getType();
        }
    }

    public static class VirtualGame {
        private int rating;
        private final Game data;

        private VirtualGame(String name, Genre genre) {
            this.rating = 0;
            this.data = new Game(name, genre, Type.VIRTUAL);
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getName() {
            return data.getName();
        }

        public Genre getGenre() {
            return data.getGenre();
        }

        public Type getType() {
            return data.getType();
        }
    }

    static class PlayRoom {
        public static void main(String[] args) {
            GameDisk[] physicalGames = new GameDisk[]{
                    Game.getDisk("GTA V", Genre.ACTION, "Open-world action-adventure game"),
                    Game.getDisk("FIFA 22", Genre.SPORT, "Football simulation game"),
                    Game.getDisk("Need for Speed: Heat", Genre.RACE, "Racing game"),
                    Game.getDisk("Red Dead Redemption 2", Genre.ACTION, "Western-themed action-adventure game")

            };

            VirtualGame[] virtualGames = new VirtualGame[]{
                    Game.getVirtualGame("Among Us", Genre.PUZZLE),
                    Game.getVirtualGame("Minecraft", Genre.ADVENTURE),
                    Game.getVirtualGame("Valorant", Genre.SHOOTER),
                    Game.getVirtualGame("Fortnite", Genre.SHOOTER)
            };
            GameConsole console = new GameConsole("Sony", "XC123QeWR", 0);
            Arrays.sort(physicalGames, new Comparator<GameDisk>() {
                @Override
                public int compare(GameDisk a, GameDisk b) {
                    return a.getGenre().compareTo(b.getGenre());
                }
            });
            Arrays.sort(virtualGames, new Comparator<VirtualGame>() {
                @Override
                public int compare(VirtualGame a, VirtualGame b) {
                    return Integer.compare(a.getRating(), b.getRating());
                }
            });
        }
    }
}