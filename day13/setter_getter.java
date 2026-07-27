class ip{
    private int a;
    private int b;
    private String name;
    ip(int a,int b,String name){
        this.a =a;
        this.b=b;
        this.name=name;
    }
    void setIP(int a,int b,String name){
        this.a = a;
        this.b = b;
        this.name = name;
    }
    int getIP(){
        return this.a;
    }
    int getIP1(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }
}

public class setget {
    public static void main(String[] args){
        ip obj = new ip(3,6,"pooja");
        obj.display();

    }
}
