package kunalkushwaha.linearSearch.A_2D;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4,5},
                {21,23,12,16,19},
                {112,81,90,900,123}
        };

        int target=1;
        //calling the function
        int ans=SearchIn2DArray( arr, target);
        System.out.println(ans);
    }

    public static int SearchIn2DArray(int[][] arr1, int target){

        if(arr1.length==0){
            return -1;
        }

        for(int row=0;row<arr1.length;row++){
            for(int col=0;col<arr1[row].length;col++){
                int element=arr1[row][col];
                if(element==target){
                    return target;//element//arr1[row][col]
                }
            }
        }
        return -1;


    }
}
