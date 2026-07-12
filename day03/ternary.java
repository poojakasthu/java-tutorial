import java.util.*;
public class ternary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        String number = (num%2==0)? "even" : "odd";
        System.out.println(number);


    }
}
