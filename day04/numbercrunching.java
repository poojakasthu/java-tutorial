import java.util.*;
public class numcrunchingprblm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int key = scan.nextInt();
        int count=0;
        while(num!=0){
            int pop = num%10;
            if(pop==key){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
----------------------------------------------------------------------

  import java.util.*;
public class numcrunchingprblm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num!=0){
            int pop = num%10;
            if(pop==0){
                System.out.println("the number contains zero");
                break;
            }
            num = num/10;
        }

    }


}
