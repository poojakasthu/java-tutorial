import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter the name : "+name);
        int a = scan.nextInt();
        System.out.println("Enter the number : " +a);
        float num = scan.nextFloat();
        System.out.println("Enter the Float value : " +num);
        double num1 = scan.nextDouble();
        System.out.println("Enter the Double value : " +num);

    }
}
/*output
pooja
Enter the name : pooja
678
Enter the number : 678
2.678945
Enter the Float value : 2.678945
23.8965321678924556
Enter the Double value : 2.678945*/
