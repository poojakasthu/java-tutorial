public class String2 {
    public static void main(String[] args){
        String name = "madam";
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
        System.out.println(name.equals(s)?"yess":"no");
    }
}
