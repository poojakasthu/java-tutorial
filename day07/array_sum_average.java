import java.util.*;
public class array_sum_average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
            int b = sc.nextInt();
            arr[i]=b;
        }
        int sum =0;
        int length = arr.length;
        for(int value:arr){
            sum+=value;
        }
        float avg =(float) sum/length;
        System.out.println(sum);
        System.out.println(avg);

    }
}
