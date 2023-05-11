/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Shape shape = null;
    while (true) {
      System.out.println("Choose an option:");
      System.out.println("1. Create a new shape");
      System.out.println("2. Compute the volume and surface area of an existing shape");
      System.out.println("3. Exit");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Choose a shape:");
          System.out.println("1. Sphere");
          System.out.println("2. Cube");
          System.out.println("3. Cylinder");
          System.out.println("4. Cone");
          int shapeChoice = scanner.nextInt();
          switch (shapeChoice) {
            case 1:
              System.out.println("Enter the radius of the sphere:");
              double sphereRadius = scanner.nextDouble();
              shape = new Sphere(sphereRadius);
              break;
            case 2:
              System.out.println("Enter the side length of the cube:");
              double cubeSideLength = scanner.nextDouble();
              shape = new Cube(cubeSideLength);
              break;
            case 3:
              System.out.println("Enter the radius of the cylinder:");
              double cylinderRadius = scanner.nextDouble();
              System.out.println("Enter the height of the cylinder:");
              double cylinderHeight = scanner.nextDouble();
              shape = new Cylinder(cylinderRadius, cylinderHeight);
              break;
            case 4:
              System.out.println("Enter the radius of the cone:");
              double coneRadius = scanner.nextDouble();
              System.out.println("Enter the height of the cone:");
              double coneHeight = scanner.nextDouble();
              shape = new Cone(coneRadius, coneHeight);
              break;
            default:
              System.out.println("Invalid choice");
              break;
          }
          break;
        case 2:
          if (shape == null) {
            System.out.println("No shape created yet");
            break;
          }
          System.out.println("The volume of the shape is: " + shape.getVolume()+"cubic units");
          System.out.println("The surface area of the shape is: " + shape.getSurfaceArea()+"square units");
          break;
        case 3:
          System.out.println("Exiting program");
          scanner.close();
          return;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }
}

abstract class Shape {
  public abstract double getVolume();
  public abstract double getSurfaceArea();
}

class Sphere extends Shape {
  private final double radius;
  public Sphere(double radius) {
    this.radius = radius;
  }
  @Override
  public double getVolume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
  @Override
  public double getSurfaceArea() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }
}

class Cube extends Shape {
  private final double sideLength;
  public Cube(double sideLength) {
    this.sideLength = sideLength;
  }
  @Override
  public double getVolume() {
    return Math.pow(sideLength, 3);
  }
  @Override
  public double getSurfaceArea() {
    return 6 * Math.pow(sideLength, 2);
  }
}

class Cylinder extends Shape {
  private final double radius;
  private final double height;
  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }
  @Override
  public double getVolume() {
    return Math.PI * Math.pow(radius, 2) * height;
  }
  @Override
  public double getSurfaceArea() {
    return 2 * Math.PI * Math.pow(height,3) * radius;
  }
}
 class Cone extends Shape {
    private final double radius;
    private final double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getvolume() {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * radius;               
    }
    public double getsurface() {
        double slantHeight = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        return Math.PI * radius * slantHeight + Math.PI * Math.pow( radius,2);
    }

    @Override
    public double getVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * radius;   
    }

    @Override
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        return Math.PI * radius * slantHeight + Math.PI * Math.pow( radius,2);
    }
}
