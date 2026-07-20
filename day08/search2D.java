public class search2d {
    public static void main(String[] args){
        int[][] arr ={{1,2,3,},{5,6,7,},{8,9,4}};
        int target = 6;
        if(search(arr,target)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
    public static boolean search(int[][] arr,int target){
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

}
