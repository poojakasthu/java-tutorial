class xy{
    void display(){
        System.out.println("xy");
    }

}
class xy1 extends xy{
    void show(){
        System.out.println("xy1");
    }

}
class xy2 extends xy1{
    void fly(){
        System.out.println("xy2");
    }

}
public class multi_level {
    public static void main(String[] args){
        xy obj = new xy();
        xy1 obj1 = new xy1();
        xy2 obj2 = new xy2();
        obj.display();
        obj1.show();
        obj2.fly();
        obj1.display();
        obj2.display();
        obj2.show();


    }
}
