class B{
    int B(){   //Constructor methods
        return 1;
    }
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void display(){
        System.out.println("hello world");
    }
}

public class methods {
   public static void main(String[] args){
      B obj = new B();
      int a = obj.add(1,2);
      int b = obj.add(1,3,5);
      int c = obj.B();
       System.out.println(a); 
       System.out.println(b);
       System.out.println(c);
       obj.display();
   }

}
