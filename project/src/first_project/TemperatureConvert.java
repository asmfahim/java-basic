package first_project;

import java.util.*;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cels,farn;
        System.out.println("Enter Celsius : ");
        cels = sc.nextDouble();
        farn = 1.8 * cels +32;
        System.out.println("Fahrenheit : "+ farn);

        System.out.println("Enter Fahrenheit : ");
        farn = sc.nextDouble();
        cels = 0.555555556 * (farn - 32);
        System.out.println("Celsius : "+ cels);
    }
}
