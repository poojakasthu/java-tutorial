//REVERSE THE NUMBER
import java.util.*;
public class whileloop {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        int rev = 0;
        while(num!=0){
            int pop = num%10;
            rev = rev*10+pop;
            num/=10;
        }
       System.out.println(rev);
    }
}
-----------------------------------
  //COUNT THE DIGIT
import java.util.*;
public class whileloop {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int count =0;
        while(n!=0){
            int pop = n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}


    }
}
