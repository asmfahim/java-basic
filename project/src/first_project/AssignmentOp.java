package first_project;
import java.util.*;

public class AssignmentOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a+=b;
        System.out.println("Assignment Operator '+=' a+=b Add : " + a );
        a-=b;
        System.out.println("Assignment Operator '-=' a-=b Sub : " + a );
        a*=b;
        System.out.println("Assignment Operator '*=' a*=b Multi : " + a );
        a/=b;
        System.out.println("Assignment Operator '/=' a/=b divide : " + a );
        a%=b;
        System.out.println("Assignment Operator '%=' a%=b Modulus : " + a );

    }
}
