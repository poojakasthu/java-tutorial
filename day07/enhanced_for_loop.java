import java.util.*;
public class enhanced_for_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a = sc.nextInt();
        int[] num = new int[a];
        for(int i =0;i<a;i++){
            int b = sc.nextInt();
            num[i]=b;
        }
        for(int value:num){
            System.out.println(value);
        }
    }
}
