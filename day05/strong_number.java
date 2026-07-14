import java.util.*;
public class funstrngnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isStrong(n)){
            System.out.println("strong number");
        }
        else {
            System.out.println("not a strong number");
        }
    }
    public static boolean isStrong(int n){
        int sum =0;
        int temp = n;
        while(n!=0){
            int pop = n%10;
            sum+=fact(pop);
            n/=10;//helper function
        }
        return sum==temp;
    }
    public static int fact(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        return fact;

    }


}
