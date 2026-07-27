interface A{
    void show();
}
interface B extends A{
    void display();

}
class C implements B{
    public void show(){

        System.out.println("hello");
    }
    public void display(){

        System.out.println("hiii");
    }

}
public class interface1 {
    public static void main(String[] args){
        C obj = new C();
        obj.display();

    }
}
