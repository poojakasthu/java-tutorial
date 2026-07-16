public class solidsquare {
    public static void main(String[] args){
        int n =5;//nxn
        for(int i =1;i<=n;i++){//outer loop (row)
            for(int j =1;j<=n;j++){//inner loop(column)
                System.out.print("*");
            }
            System.out.println();//next go to a new line
        }
    }
}
