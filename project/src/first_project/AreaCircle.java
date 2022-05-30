package first_project;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        double r, circle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Value :");
         r = sc.nextDouble();
         circle = 3.1416*(r*r);
        System.out.println("Area Circle : " + circle);

    }
}
