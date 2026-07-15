import java.util.*;
public class First_last_digits_sum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int lastdigit = num%10;
        while(num>=10){
            num/=10;
        }
        int firstdigit = num;
        int sum = firstdigit+lastdigit;
        System.out.println(sum);
    }

}
