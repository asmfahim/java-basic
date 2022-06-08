package DecimalToBinary;

import java.util.Scanner;

class DecimalConvertBinary{

    void DecimalToBinary(int n){
        int arr[],i;
        arr = new int[32];
        for(i=0 ; n>0; i++){
            arr[i] = n%2;
            n=n/2;
        }
        for (i = i-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}

public class DecimalToBinary {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            DecimalConvertBinary obj = new DecimalConvertBinary();
            System.out.println("Enter a number");
            int n = sc.nextInt();
            obj.DecimalToBinary(n);
        }
        catch (Exception e){
            System.out.println("Out of Integer length");
        }

    }
}
