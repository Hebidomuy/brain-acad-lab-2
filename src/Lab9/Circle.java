package Lab9;

public class Circle {
    private double Circumference;
    private double Square;
    private int Radius;
    private int Diameter;
    String Color;
    private double Pi;

    public Circle(int Diameter) {
        //public Circle(int Radius) {
        //this.Radius = Radius;
        this.Diameter = Diameter;
    }

    public Circle(int Radius, String Color) {
        this.Radius = Radius;
        this.Color = Color;
    }

    public Circle(int Radius, double Pi) {
        this.Radius = Radius;
        this.Pi = Pi;
    }

    /**
     * TRATATA
     * @param Square dfsdfsdfsdf
     * @param Circumference fffffff
     * @param Color ghfhghfgh
     */
    public void SquareAndCircumference(double Square, double Circumference, String Color) {
        Square = Pi * (Radius * Radius);
        Circumference = 2 * Pi * Radius;
        System.out.println("\nПлощадь: " + Square + "\nДлина окружности: " + Circumference + "\nЦвет: " + Color);
    }

}

