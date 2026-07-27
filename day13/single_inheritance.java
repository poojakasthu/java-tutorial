class abc{ // superclass
    void display(){
        System.out.println("helloo world!");
    }

}
class abc1 extends abc{ //subclass
   void show(){
       System.out.println("welcome to the show");
   }

}

public class supersub {
    public static void main(String[] args){
        abc obj = new abc();
        abc1 obj1 = new abc1();
        obj.display(); 
        obj1.show();
        obj1.display();

    }
}
