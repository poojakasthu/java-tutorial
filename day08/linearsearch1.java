import java.util.*;
public class linearserach1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;

            }
        }
        return -1;
    }

}
