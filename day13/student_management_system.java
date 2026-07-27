class student{
    int StudentId;
    String StudentName;
    student(int StudentId,String StudentName){
        this.StudentId=StudentId;
        this.StudentName=StudentName;
    }
    void display(){
        System.out.println(StudentId+" "+StudentName);
    }

}
class mentor extends student {
    int MentorId;
    String MentorName;
    mentor(int StudentId ,String StudentName,int MentorId,String MentorName){
        super(StudentId,StudentName);
        this.MentorId=MentorId;
        this.MentorName=MentorName;
    }
    @Override
    void display(){
        super.display();
        System.out.println(MentorId+" "+MentorName);

    }
}
class HOD extends mentor{
    int HODId;
    String HODName;
    HOD(int StudentId ,String StudentName,int MentorId,String MentorName,int HODId,String HODName){
        super(StudentId,StudentName,MentorId,MentorName);
        this.HODId = HODId;
        this.HODName=HODName;
    }
    @Override
    void display(){

        super.display();
        System.out.println(HODId+" "+HODName);
    }

}

public class student_management {
    public static void main(String[] args){
        student obj = new student(100,"pooja");
        mentor obj1 = new mentor(100,"pooja",123,"sandhiya");
        HOD obj2 = new HOD(100,"pooja",123,"sandhiya",678,"basha");
        obj.display();
        obj1.display();
        obj2.display();
    }
}
