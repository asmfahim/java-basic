package MonthToDay;

import java.util.Scanner;

class MonthDay{
    void MonthToDay(String a , int n){
        if(a == "January" || a == "March" || a == "May" || a == "July" || a == "August" || a =="October" || a== "December"){
            System.out.println("This month has 31 days");
        } else if (a == "April" || a== "June" || a== "September" || a == "November") {
            System.out.println("This month has 30 days");
        }else {
            if(n%400 == 0 && n%100 !=0 || n%4==0){
                System.out.println("This month has 29 days");
            }else {
                System.out.println("This month has 28 days");
            }
        }
    }
}
public class MonthToDay {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the name of month in CamelCase");
            String m = sc.nextLine();
            System.out.println("Input the years");
            int y = sc.nextInt();
            MonthDay obj = new MonthDay();
            obj.MonthToDay(m,y);
        }catch (Exception e){
            System.out.println("Month First Letter in UpperCase");
        }


    }
}
