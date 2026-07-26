class AB{
    int age;
    String name;
    int id;
    AB(){
        System.out.println("Default constructor"); 

    }
    AB(int n){
        System.out.println(n+n);
    }
    AB(String s){
        System.out.println(s); 
    }
    AB(int age,String name ,int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(age+ " "+name+" "+id);
    }
}


class BA{
    String model;
    int year;
    BA(){
        this.model = "Unknown";
        this.year = 2024;

    }
    void display(){
        System.out.println(model+" "+year);
    }
}

class C{
    String model;
    int year;

    C(String model, int year){
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println(model+ " "+year);
    }
}

public class constructor {
    public static void main(String[] args){
        AB obj = new AB(19,"pooja",15);
        BA obj1 = new BA();
        C obj2 = new C("vivo",2018);
        obj.display();
        obj1.display();
        obj2.display();

    }

}
