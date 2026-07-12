import java.util.*;
public class arthimeticoperator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(++a);

    }
}
------------------------------
import java.util.*;
public class arthimeticoperator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("add"+c);
        c = 0;
        c = a-b;
        System.out.println("sub"+c);
        c = 0;
        c = a*b;
        System.out.println("mul"+c);
        c = 0;
        c = a/b;
        System.out.println("div"+c);

    }
}
