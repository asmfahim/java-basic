package BMIcheck;

import java.util.Scanner;

class BmiCheck{
    double w,h, temp;
    void bmi(){
        h = h/3.26;
        temp = w / (h * h);
        if(temp >=16.0 && temp <= 18.5){
            System.out.println("Underweight and BMI is : " + String.format("%.2f",temp));
        } else if (temp >=18.6 && temp <=25.0) {
            System.out.println("Normal and BMI is : " + String.format("%.2f",temp) );
        } else if (temp>=25.1 && temp <=40.0) {
            System.out.println("Overweight and BMI is : "+ String.format("%.2f",temp));
        }else {
            System.out.println("Wrong input !");
        }
    }
}

public class BMI {
    public static void main(String[] args) {
        try{
            BmiCheck obj = new BmiCheck();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your weight (60.0):");
            obj.w = sc.nextDouble();
            System.out.println("Enter your height in feet :");
            obj.h = sc.nextDouble();
            obj.bmi();

        }catch (Exception e){
            System.out.println("Something went wrong !");
        }
    }
}
