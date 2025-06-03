import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Let's calculate the area of a triangle!");
        System.out.println("What is the length of the base of your triangle?");
        Scanner scanner = new Scanner(System.in);
        double numBase = scanner.nextDouble();
        System.out.println("What is the height of your triangle?");
        double numHeight = scanner.nextDouble();
        double numFinal = ((numBase * numHeight) / 2);
        System.out.println("The area of your triangle is " + numFinal + " units.");
    }
}