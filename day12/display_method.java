import java.util.*;
class I{
    int a;
    int b;
    String c;
    String d;
    I(){

    }
    void display(){
        System.out.println("display it ");
    }
     I(int a,int b){
         this.a = a;
         this.b = b;
     }
     void display(int a,int b){
         System.out.println(a+" "+b);
     }
     I(String c,String d){
         this.c=c;
         this.d = d;
     }
     void display(String c,String d){
         System.out.println(c +" "+d);
     }
     I(String d){
         this.d = d;
     }
     void display(String d){
        System.out.println(d);

     }
}

public class display_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input1 = sc.nextInt();
        I obj = new I(input,input1);
        obj.display(input,input1);
        String name = sc.nextLine();
        String name1 = sc.nextLine();
        I obj1 = new I(name,name1);
        obj1.display(name,name1);
        obj1.display(name1);



    }
}
