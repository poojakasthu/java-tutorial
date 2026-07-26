class A{
    int age;
    String name;
    String name1;
    A(int age,String name){
        this.age=age;
        this.name = name;
    }
    A(String name,String name1){
        this.name = name;
        this.name1= name1;
    }
    A(String name1){
        this.name1 = name1;

    }
    void display(){
        System.out.println(age+" "+name);
    }

}
public class constructor_overloading {
    public static void main(String[] args){
        A obj = new A(19,"pooja");
        A obj1 = new A("pooja");
        A obj2 = new A("pooja","sandhiya");
        obj.display();
        obj1.display();
        obj2.display();

    }
}
