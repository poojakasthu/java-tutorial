import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*[] num = new int[5];
        char[] name = new char[5];
        double[] price = new double[20];*/
        //--------------------
        /*int[] num = {1,2,3,4,5};
        System.out.println(num[2]);*/
        //----------------------
        /*int[] num = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        System.out.println(num[2]);*/
        int[] id = new int[5];
        for(int i =0;i<5;i++){
            int a = sc.nextInt();
            id[i] = a;
        }
        for(int i =0;i<5;i++){
            System.out.println(id[i]);
        }


    }

}
