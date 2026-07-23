public class longestword {
    public static void main(String[] args){
        String arr = "Once upon the time they was an elephant";
        String[] arr1 =arr.split(" ");
        String longword = arr1[0];
        for(String s : arr1){
            if(s.length()>longword.length()){
                longword = s;
            }
        }
        System.out.println(longword);
    }
}

