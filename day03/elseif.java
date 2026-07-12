import java.util.*;
public class elseif {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if (a!=b){
            System.out.println("Not Equal");
        }
    }
}
------------
  import java.util.*;
public class elseif {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>=80){
            System.out.println("Good keep rock!");
        }
        else if(mark>=50){
            System.out.println("Good");
        }
        else{
            System.out.println("Study well and try to score good marks");
        }
    }
}
