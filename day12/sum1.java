import java.util.*;
class rev{
    int rev_int(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            int rev =0;
            while(num!=0){
                int pop = num%10;
                rev = rev*10+pop;
                num/=10;
            }
            return rev;

    }
}
public class sum1 {
    public static void main(String[] args){
        rev obj = new rev();
        System.out.println(obj.rev_int());

    }
}
