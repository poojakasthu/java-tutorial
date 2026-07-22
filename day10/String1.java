public class String1 {
    public static void main(String[] args){
        String name = "hello world";
        char[] arr = name.toCharArray();
        int start =0,end= arr.length-1;
        while(start<=end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String s = new String(arr);
        System.out.print(s);
    }
}
