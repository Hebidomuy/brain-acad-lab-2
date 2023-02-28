package Lab9;

public class Pizza {
    String Basis;
    String Composition;
    String Name;
    private int Cost;
    private int Diameter;

    public Pizza(String Name, String Composition, int Cost, int Diameter) {
        this.Name = Name;
        this.Composition = Composition;
        this.Cost = Cost;
        this.Diameter = Diameter;

        System.out.println(Name + Composition + Cost + " " + Diameter);
    }

    public class Pizzeria {
        public void getPizzeriaAndPizza(int pizza) {
            System.out.println(pizza);
        }
    }

    @Override
    public String toString() {

        return "Pizza{" +
                ", Basis='" + Basis + '\'' +
                ", Composition='" + Composition + '\'' +
                ", Name='" + Name + '\'' +
                ", Cost=" + Cost +
                ", Diameter=" + Diameter +
                '}';
    }
}