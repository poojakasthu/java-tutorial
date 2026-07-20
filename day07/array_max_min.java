public class array_max_min {
    public static void main(String[] args){
        int[] arr = {34,12,89,56,4,7};
        int max = arr[0];
        int min = arr[0];
        for(int num:arr){
            if(num>max){
                max= num;
            }
            else if(num<min){
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
