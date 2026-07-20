import java.util.*;
public class linearString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char[] name1 = name.toCharArray();
        char target = sc.next().charAt(0);
        if(search(name1,target)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
    public static boolean search(char[] name1,char target){
        for(char value:name1){
            if(value ==target){
                return true;
            }
        }
        return false;
    }
}
