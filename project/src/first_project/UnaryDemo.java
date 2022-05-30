package first_project;

public class UnaryDemo {
    public static void main(String[] args) {
        int rslt, x = 10;
        System.out.println("Fixed value x : 10");
        rslt = +x;
        System.out.println("Unary '+' Operator " + rslt );

        rslt = -x;
        System.out.println("Unary '-' Operator " + rslt);

        System.out.println("Unary '++x' before add 1 with x : " + ++x);
        System.out.println("Unary 'x--' after sub 1 with x : " + x--);
        System.out.println("Unary 'x++' after add 1 with x : " + x++);
        System.out.println("Unary '--x' before sub 1 with x : " + --x);


    }
}
