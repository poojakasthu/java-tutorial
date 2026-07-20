import java.util.*;
public class character_forloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int a = sc.nextInt();
        String[] name = new String[a];
        for(int i =0;i<a;i++){
            String name1 = sc.next();
            name[i] =name1;

        }
        for(String value1: name){
            System.out.println(value1);
        }

    }

}
