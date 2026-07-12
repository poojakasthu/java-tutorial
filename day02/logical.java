import java.util.*;
public class logical {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//5
        int b = scan.nextInt();//8
        boolean c = (a>b) && (a<b);
        System.out.println(c);//false
        System.out.println(a>b || a<b);//true
        System.out.println(!(a<b));//false

    }

}
