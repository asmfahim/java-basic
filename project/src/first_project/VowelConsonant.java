package first_project;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char c;
        System.out.println("Enter a Character : ");
        c = sc.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println(c +" is a vowel");
                break;

            case 'e':
                System.out.println(c +" is a vowel");
                break;

            case 'i':
                System.out.println(c +" is a vowel");
                break;

            case 'o':
                System.out.println(c +" is a vowel");
                break;

            case 'u':
                System.out.println(c +" is a vowel");
                break;

            case 'A':
                System.out.println(c +" is a vowel");
                break;

            case 'E':
                System.out.println(c +" is a vowel");
                break;

            case 'I':
                System.out.println(c +" is a vowel");
                break;

            case 'O':
                System.out.println(c +" is a vowel");
                break;

            case 'U':
                System.out.println(c +" is a vowel");
                break;

            default:
                System.out.println(c +" is a consonant");
        }
    }
}
