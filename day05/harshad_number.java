import java.util.*;
public class harshad_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num == 1 || num <= 9) {
            System.out.println("Number is a Harshad Number");
        }
        while (num != 0) {
            int pop = num % 10;
            sum += pop;
            num /= 10;
            int n = sum;
            if (n/num==0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
