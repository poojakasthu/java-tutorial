public class linear_search {
    public static void main(String[] args){
        int[] arr ={1,2,6,8,9,5,7};
        int target =6;
        if(ls(arr,target)){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }

    }
    public static boolean ls(int[] arr, int target){
        for(int num :arr){
            if(num==target){
                return true;
            }
        }
        return false;
    }

}
