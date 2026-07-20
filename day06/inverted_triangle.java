public class inverted_right_triangle {
    public static void main(String[] args){
        int n =5;//nxn
        for(int i =0;i<n;i++)
        {//outer loop (row)
            for(int j =n;j>i;j--){//inner loop(column)
                System.out.print("*");
            }
            System.out.println();//next go to a new line
        }

    }
}
