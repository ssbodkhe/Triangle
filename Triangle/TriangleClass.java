
/**
 * Classifying triangle based on user input
 *
 * Shourya Bodkhe
 * 9/26/2026
 */
import java.util.Scanner;
public class TriangleClass
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //getting user input
        System.out.println("Are you entering sides (enter 1) or angles (enter 2) of a triangle? ");
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                //getting user input
                System.out.println("Enter side one of the triangle: ");
                int side1 = scan.nextInt();
                System.out.println("Enter side two: ");
                int side2 = scan.nextInt();
                System.out.println("Enter the third side of the triangle: ");
                int side3 = scan.nextInt();
                
                //processing numbers and printing
                if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
                
                    if (side1==side2 && side2==side3) {
                        System.out.println("This triangle is Equilateral.");
                    }
                    else if (side1==side2 || side2==side3 || side3==side1) {
                        System.out.println("This triangle is Isosceles.");
                    }
                    else if (side1!=side2 && side2!=side3 && side3!=side1) {
                        System.out.println("This triangle is Scalene.");
                    }
                    else {
                        System.out.println("This is not a valid triangle");
                    }
                }
                else {
                    System.out.println("Invalid Side length(s)");
                }
                
                break;
            case 2:
                //getting user input
                System.out.println("Enter angle one of the triangle: ");
                int ang1 = scan.nextInt();
                System.out.println("Enter angle two: ");
                int ang2 = scan.nextInt();
                System.out.println("Enter the third angle of the triangle: ");
                int ang3 = scan.nextInt();
                
                //processing numbers and printing
                int angleSum = ang1 + ang2 + ang3;
                if (angleSum == 180 && ang1 > 0 && ang2 > 0 && ang3 > 0) {
                    if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
                        System.out.println("This is a right triangle");
                    }
                    else if (ang1 == 60 && ang2 == 60 && ang3 == 60) {
                        System.out.println("This is an equiangular triangle");
                    }
                    else if (ang1 == ang2 || ang2 == ang3 || ang3 == ang1) {
                        System.out.println("This triangle is Isosceles");
                    }
                    else if (ang1 != ang2 && ang2 != ang3 && ang3 != ang1) {
                        System.out.println("This triangle is Scalene");
                    }
                    else {
                        System.out.println("Invalid Triangle");
                    }
                }
                else {
                    System.out.println("Invalid Triangle");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        
        
    }
}