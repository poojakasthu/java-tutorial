public class String3 {
    public static void main(String[] args){
        String name = "APPLE12";
         String name1 = name.toLowerCase();
        char[] chars = name1.toCharArray();
        int vowelsCount = 0;
        int consonantcount =0;
        for(int i =0;i<chars.length;i++){
            if(chars[i]=='a'|| chars[i]=='e'|| chars[i]=='i'|| chars[i]=='o'|| chars[i]=='u'){
                vowelsCount++;
            }
            else if(chars[i]!='a'|| chars[i]!='e'|| chars[i]!='i'|| chars[i]!='o'|| chars[i]!='u'){
                consonantcount++;
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonantcount);

    }

}
