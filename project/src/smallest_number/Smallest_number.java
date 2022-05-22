package smallest_number;

class Find_small{
    int a,b,c;

    void small_number(){
        if (a<b && a<c){
            System.out.println(a+" is the smallest number.");
        } else if (b<a && b<c) {
            System.out.println(b+" is the smallest number.");
        }else {
            System.out.println(c+" is the smallest number.");
        }
    }
    //parameter by
    void small_check(int x, int y, int z){
        this.a = x;
        this.b = y;
        this.c = z;
        if (a<b && a<c){
            System.out.println(a+" is the smallest number.");
        } else if (b<a && b<c) {
            System.out.println(b+" is the smallest number.");
        }else {
            System.out.println(c+" is the smallest number.");
        }
    }
}

public class Smallest_number {
    public static void main(String[] args){
        Find_small obj = new Find_small();
        obj.a = 73;
        obj.b = 51;
        obj.c = 41;
        obj.small_number();
        //This is checked by parameter wise.
        obj.small_check(55,22,36);
    }
}
