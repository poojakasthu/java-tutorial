import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
---------------------------------
import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =scan.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("sum = " + sum);
    }
}
--------------------------------------
import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int fact =1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial " +fact);
    }
}
--------------------------------------------------
import java.util.*;
public class forloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        for(char ch='a';ch<='z';ch++){
            System.out.println("the ascii values of "+ch+"  is "+(int)ch);
        }
    }
}
-----------------------------------
