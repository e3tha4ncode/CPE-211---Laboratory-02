import java.util.Scanner;

// Base class
class Cylinder {
    protected double radius;
    protected double height;

    // Calculates the area of cylinder
    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;   // Area formula
    }
}

// Derived class
class CylinderVolume extends Cylinder {
    // Calculates the volume of cylinder
    public double volume() {
        return Math.PI * radius * radius * height;  // Volume formula
    }
}

public class BADILLA_Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CYLINDER CALCULATIONS");
	      System.out.println();
        
        // Input value
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        CylinderVolume cylinder = new CylinderVolume();
        cylinder.radius = radius;
        cylinder.height = height;

        double area = cylinder.area();
        double volume = cylinder.volume();
        
        // Print
        System.out.println();
        System.out.println("Area of the cylinder: " + area);
        System.out.println("Volume of the cylinder: " + volume);
    }
}
