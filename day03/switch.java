import java.util.*;
public class switchcase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        switch (days){
            case 1:
                    System.out.println("sunday");
                    break;
            case 2:
                    System.out.println("monday");
                    break;
            case 3:
                    System.out.println("tuesday");
                    break;
            case 4:
                    System.out.println("wednesday");
                    break;
            case 5:
                    System.out.println("thursday");
                    break;
            case 6:
                    System.out.println("friday");
                    break;
            case 7:
                    System.out.println("saturday");
                    break;
        }
    }
}
-------------------------------------
import java.util.*;
public class switchcase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();
        switch(letter){
            case"a":

            case"e":

            case"i":

            case"o":

            case"u":
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonent");
        }
    }
}
-------------------------------------------
            default:
                System.out.println("invalid input");
        }
