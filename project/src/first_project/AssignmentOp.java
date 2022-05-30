package first_project;
import java.util.*;

public class AssignmentOp {
    public static void main(String[] args) {
        int x,y,z,v,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        x=a+b;
        System.out.println("Assignment Operator '=' x=a+b Add : " + x );
        a+=b;
        System.out.println("Assignment Operator '+=' a+=b Add : " + a );
        b-=x;
        System.out.println("Assignment Operator '-=' b-=x Sub : " + b );
        y=b;
        y*=a;
        System.out.println("Assignment Operator '*=' y=b,y*=a Multi : " + y );
        z=a;
        z/=b;
        System.out.println("Assignment Operator '/=' z=a,z/=b divide : " + z );
        x%=z;
        System.out.println("Assignment Operator '%=' x%=z Modulus : " + x );

    }
}
