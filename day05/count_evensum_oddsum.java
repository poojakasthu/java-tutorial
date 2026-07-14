import java.util.*;
public class numbercrunchinngg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int sum =0;
        while(num!=0){
            int pop = num%10;
            if(pop%2==0){
                evensum+=pop;
            }
            else{
                oddsum+=pop;
            }
            sum+=pop;
            num/=10;
        }
        System.out.println("evensum :"+evensum);
        System.out.println("oddsum:"+oddsum);
        System.out.println("Totalsum:"+sum);
    }

}
--------------------------------
  //count the even count and odd count
  import java.util.*;
public class numbercrunchinngg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int evensum =0;
        int oddsum =0;
        int evencount =0;
        int oddcount =0;
        while(num!=0){
            int pop = num%10;
            if(pop%2==0){
                evensum +=pop;
                evencount++;

            }
            else{
                oddsum +=pop;
                oddcount++;

            }
            num/=10;
        }
        System.out.println("evensum:"+evensum);
        System.out.println("oddsum:"+oddsum);
        System.out.println("total evencount:"+evencount);
        System.out.println("total evencount:"+oddcount);
    }
}
