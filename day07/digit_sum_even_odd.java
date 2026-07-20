public class digit_sum_even_odd {
    public static void main(String[] args){
        int[] arr = {1,2,34,65,23,65,3,54,686};
        int evensum=0;
        int oddsum=0;
        for(int num:arr){
            int original=num;
            int count =0;
            while(num!=0){
                int pop = num%10;
                count+=pop;
                num/=10;
            }
            if(count%2==0){
                evensum+=original;
            }
            else{
                oddsum+=original;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
