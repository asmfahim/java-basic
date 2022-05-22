package access_inheritance;

class A{
    double width,height,depth;

    //construct clone of an object
    A(A obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //construct used when all dimensions specified.
    A(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //construct has no dimension specified.
    A(){
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth= -1;  //box
    }

    //construct used when cube is created.
    A(double len){
        width = height = depth = len;
    }

    //compute and return volume
    double volume(){
        return width*height*depth;
    }

}
class B extends A{
    double weight;

    //construct for B
    B(double w, double h, double d, double n){
        width = w;
        height = h;
        depth = d;
        weight = n;
    }

}

public class access_inheritance {
    public static void main(String[] args){
        B obj = new B(10,20,15,34.3);

        System.out.println("Volume :" + obj.volume());
        System.out.println("Weight :" + obj.weight);

    }
}
