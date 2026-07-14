import java.util.*;
public class function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add3();
    }
    //with parameters with return type
    public static int add(int num, int num1){
        return num+num1;
    }
    //without parameters and without return type
    public static void add1(){
        System.out.println("hello");
    }
    //with parameters and without return type
    public static void add2(int a,int b){
        System.out.println(a+b);
    }
    //without paramaters and with return type
    public static void add3(){
        System.out.println("hi");
    }


}
