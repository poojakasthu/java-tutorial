public class reverse_row_column {
    public static void main(String[] args){
        int[][] arr ={{1,2,3},{4,5,6}};//2x3
        int[][] transpose = new int[3][2];//3x2
        for(int i =0;i<2;i++){
            for(int j =0;j<3;j++){
               transpose[j][i]= arr[i][j];
            }
        }
        for(int i =0;i<3;i++){
            for(int j =0;j<2;j++){
                System.out.print(transpose[i][j]+" ");

            }
            System.out.println();
        }
    }

}
