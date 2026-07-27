abstract class animal{
    abstract public void makesound();
    void makingSound(){
        System.out.println("animal makings sounds");
    }
}
class dogs extends animal{
    @Override
    public void makesound() {
        System.out.println("bow bow");
    }
}
class cats extends animal{
    @Override
    public void makesound() {
        System.out.println("meow meow");
    }
}
public class abstractClass {
    public static void main(String[] args){
        animal obj = new dogs();
        animal obj1 = new cats();
        obj.makesound();
        obj1.makesound();
        obj.makingSound();

    }
}
