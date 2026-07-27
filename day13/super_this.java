class mn{
    mn(){
        //System.out.println("enter a");
    }
    mn(int a){
        this();
        System.out.println("enter the value of a"+a);
    }

}
class mn1 extends mn{
    mn1(){

    }
    mn1(int a){
        this();
        System.out.println("enter the value of b "+a);
    }

}

public class super_this {
    public static void main(String[] args){
        mn obj = new mn(9);
        mn1 obj1 = new mn1(10);

    }
}
