//guess the number game.
import java.util.*;
import java.util.Random;
public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int key = rand.nextInt(100);
        int guess;
        do{
            System.out.println("enter the value of your guess");
            guess = sc.nextInt();
            if(guess>key){
                System.out.println("guess is too high");
            }
            else if(guess<key){
                System.out.println("guess is too low");
            }
        }while(key!=guess);{
            System.out.println("you guessed it");
        }
    }
}
