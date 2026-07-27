class animal{
    void animal(){
        System.out.println("animals sounds");
    }
}
class dog extends animal{
    void animal(){
        System.out.println("bow bow");
    }
}
class cat extends animal{
    void animal(){
        System.out.println("meow meow");
    }
}
class crow extends animal{
    void animal(){
        System.out.println("kaa kaa");
    }
}
public class overriding {
    public static void main(String[] args){
        dog dogs = new dog();
        cat cats = new cat();
        crow crows = new crow();
        dogs.animal();
        cats.animal();
        animal ani = new animal();
        crows.animal();

    }
}
