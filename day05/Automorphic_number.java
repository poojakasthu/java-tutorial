import java.util.*;
public class Automorphic_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int square = num*num;
        if(num%10==square%10){
            num/=10;
            square/=10;
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

}
