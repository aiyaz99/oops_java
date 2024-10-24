import java.util.Scanner;
import java.lang.Math;

class Quadratic_eqn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        
        if (a == 0) {
            System.out.println("'a' cannot be zero for a quadratic equation.");
            sc.close();
            return;
        }

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("There are no real solutions.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are equal: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2);
        }

        
        sc.close();
    }
}
