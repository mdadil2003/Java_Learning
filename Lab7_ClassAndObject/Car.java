package Lab7_ClassAndObject;

    class Car {
    int make;
    String model;
    int year;
    String color;

    Car(int make, String model, int year, String color)
    {
        this.make = 1;
        this.model = "X200";
        this.year = 2026;
        this.color = "blue";
    }
    void display()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
    public static void main(String[] args) {
        Car r= new Car(1, "X200", 2026, "blue");
        r.display();
    }
}
