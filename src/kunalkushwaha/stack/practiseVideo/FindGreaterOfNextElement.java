package kunalkushwaha.stack.practiseVideo;
//problem-03-BY ARRAY-FIND NEXT GREATER ELEMENT
public class FindGreaterOfNextElement {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=new int[arr.length]; //size will be arr.length of above
        for (int i = 0; i <arr.length ; i++) {
            res[i]=-1;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]>arr[i]) {
                    res[i]=arr[j];
                    break;
                }

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");

        }
    }
}
