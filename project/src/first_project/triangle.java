package first_project;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        double a,b,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        a = sc.nextDouble();
        System.out.println("Enter Height: ");
        b = sc.nextDouble();

        area = 0.5 *a*b;
        System.out.println("Area Triangle : "+ area);


    }
}
