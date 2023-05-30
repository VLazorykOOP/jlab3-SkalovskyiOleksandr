abstract class Body {
    public abstract double calculateSurfaceArea();
    public abstract double calculateVolume();

    public abstract String toStringUkr();
}

class Parallelepiped extends Body {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public String toStringUkr() {
        return "Паралелепіпед - Довжина: " + length + ", Ширина: " + width + ", Висота: " + height;
    }
}

class Ball extends Body {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public String toStringUkr() {
        return "Куля - Радіус: " + radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Body[] bodies = new Body[2];

        bodies[0] = new Parallelepiped(3, 4, 5);
        bodies[1] = new Ball(2);

        for (Body body : bodies) {
            System.out.println(body.toStringUkr());
            System.out.println("Площа поверхні: " + body.calculateSurfaceArea());
            System.out.println("Об'єм: " + body.calculateVolume());
            System.out.println();
        }
    }
}
