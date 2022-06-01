package first_project;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter an number : "); // To check the number is positive or not.
        n = sc.nextInt();

        if(n>0){
            System.out.println(n +" is a positive number");
        }else{
            System.out.println(n +" is not a positive number");
        }
    }
}
