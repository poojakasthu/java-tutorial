public class string_builder {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder("hello");
        name.append(" world");
        name.insert(4,'o');
        System.out.print(name);

        //replace

        name.replace(0,9,"hello guyss");
        System.out.println(name);

        //delete

        name.delete(2,8);
        System.out.println(name);
    }
}
