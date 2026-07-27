class ab{
    void display(){
        System.out.println("hiii");
    }

}
class ab1 extends ab{
    void show(){
        System.out.println("hello");
    }

}
class ab2 extends ab1{
    void fly(){
        System.out.println("heyy");

    }
}
public class multi {
    public static void main(String[] args){
        ab obj = new ab();
        ab1 obj1 = new ab1();
        ab2 obj2 = new ab2();
        obj.display();
        obj1.show();
        obj2.fly();
        obj1.display();
        obj2.display();
        obj2.show();

    }
}
