import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the shape: ");
        String input = scanner.next();

        if ("rectangle".equalsIgnoreCase(input)) {
            System.out.println("Enter the length of rectangle: ");
            double lSquare = scanner.nextDouble();
            System.out.println("Enter the weidth of rectangle: ");
            double wSquare = scanner.nextDouble();
            double aSquare = lSquare * wSquare;
            double pSquare = 2 * (lSquare + wSquare);
            System.out.println("The area of the square is: " + aSquare);
            System.out.println("The area of rectangle is: " + pSquare);
        }

        if ("circle".equalsIgnoreCase(input)) {
            System.out.print("Enter the radius: ");
            double rCircle = scanner.nextDouble();
            double aCircle = Math.PI * (rCircle * rCircle);
            System.out.println("The area of circle is: " + aCircle);
            double circumferenceCircle = Math.PI * 2 * rCircle;
            System.out.println("The circumference of the circle is:" + circumferenceCircle);
        }

        if ("cylinder".equalsIgnoreCase(input)) {
            System.out.print("Enter the radius of the cylinder: ");
            double rCylinder = scanner.nextDouble();
            double rCylinder_Sqrt = rCylinder * rCylinder;
            System.out.print("Enter the height of the cylinder: ");
            double hCylinder = scanner.nextDouble();
            double vCylinder = Math.PI * rCylinder_Sqrt * hCylinder;
            double aCylinder = (2 * Math.PI * rCylinder * hCylinder + 2 * Math.PI * rCylinder_Sqrt);
            System.out.println("The volume of the cylinder is: " + vCylinder);
            System.out.println("The surface area of the cylinder is: " + aCylinder);
        }
    }
}
