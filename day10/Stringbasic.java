public class stringBasic {
    public static void main(String[] args) {
        /*String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1==str2);
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));*/

        /*char[] chars ={'h','e','l','l','o'};
        String name = new String(chars);
        System.out.println(name);*/

        /*String str4 =" ";
        String str5 = new String();
        System.out.println(str5);*/

        /*StringBuilder name = new StringBuilder("hello");
        StringBuilder name1 = new StringBuilder("hello");
        System.out.println(name==name1);
        String name2 = name.toString();
        String name3 = name1.toString();
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));*/

        /*String name = "hello world!";
        int len = name.length();
        System.out.println("length: "+ len);*/

        /*String word ="hello";
        char ch = word.charAt(3);
        System.out.println(ch);*/

        /*System.out.println("hello".equalsIgnoreCase("Hello"));*/

        /*String name = new String ("hello");
        String name1 = new String ("hello      ");
        System.out.println(name.compareTo(name1));*/

        /*String name = "hellooo guysss";
        String name2 = "WELCOME TO OUR JAVA LEARNING";
        System.out.println(name.toUpperCase());
        System.out.println(name2.toLowerCase());*/

        /*String name = "   helo    ";
        System.out.println(name.trim());*/

        /*String name = "hello";
        String name1 = " hello guyss hello mam hello to all";
        String name3 = "hello welcome to our house";
        System.out.println(name.replace('o','x'));
        System.out.println(name1.replaceAll("hello","hii"));
        System.out.println(name3.replaceFirst("hello","hii"));*/

        /*String sentence =" the quick browm fox is running in the forest";
        System.out.println(sentence.contains("fox"));
        System.out.println(sentence.contains("Forest"));*/

        String str ="hello,world,java";
        String[] words = str.split(",");
        StringString[] arr = new String[]
        for(int i =0;i<words.length;i++){
           System.out.println(words[i]);
        }



    }
}
