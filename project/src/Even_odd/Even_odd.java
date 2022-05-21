
package Even_odd;
import java.util.* ;

public class Even_odd {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Number");
        n = input.nextInt();

        if(n%2 == 0){
            System.out.println(n+" is an Even Number");
        }
        else {
            System.out.println(n+" is an Odd Number");
        }
    }
}
