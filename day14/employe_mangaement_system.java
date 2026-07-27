abstract class emp{
    protected int id;
    protected String name;
    protected int salary;
    emp(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    abstract public void display();
    void displayinfo(){
        System.out.println("id: "+id+" " +"name: "+name+" "+"salary: "+salary);
    }
}
class manager extends emp{
    manager(int id,String name,int salary){
        super(id, name, salary);
    }
    @Override
    public void display(){
       System.out.println(salary+salary*0.10);
    }
}
class developer extends emp{
    developer(int id,String name,int salary){
        super(id, name, salary);
    }
    @Override
    public void display(){
        System.out.println(salary+salary*0.05);
    }

}
class intern extends emp{
    intern(int id,String name,int salary){
        super(id, name, salary);
    }

    @Override
    public void display() {
        System.out.println(salary);

    }
}
public class Employee_management {
    public static void main(String[] args){
        emp m = new manager(12,"anu",7800);
        emp d = new developer(13,"kaviya",5600);
        emp i = new intern(10,"priya",8000);
        m.displayinfo();
        m.display();
        d.displayinfo();
        d.display();
        i.displayinfo();
        i.display();

    }
}
