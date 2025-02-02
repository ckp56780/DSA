package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class iii3rd_FindTheduplicate_byhashtable {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,6,2,6,7,7,8,9,9,9,9};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int no:arr){
            Integer count = hm.get(no);
            if (count==null){

                hm.put(no,1);
            }else {
                count=count+1;
                hm.put(no,count);
            }
        }
        System.out.println("Duplicate elements are:" );
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for (Map.Entry<Integer,Integer> me:es){
            if (me.getValue()>1){
                System.out.println(me.getKey()+" ");
            }
        }
    }
}
