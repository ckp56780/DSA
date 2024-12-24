package kunalkushwaha.hashMap.problemOnIt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}; //element is each value of array

        Map<Integer, Integer> fre = new HashMap<>();
        for (int element : arr) {  //traverse each element into the array
            if (!fre.containsKey(element)) {  //if element nhi mila tho-element and one kr do value me
                fre.put(element, 1);
            } else {
                fre.put(element, fre.get(element) + 1);  //if same element found then update value at corresponding key
            }
        }
        //method-1 to traverse
        System.out.println(fre.entrySet()); //[1=3, 2=2, 3=1, 4=6, 5=4]
        System.out.println(fre); //{1=3, 2=2, 3=1, 4=6, 5=4}
        int maxFre = 0, ansKey = -1;
//        for (var e:fre.entrySet()){
//            if (e.getValue()>maxFre){
//                maxFre=e.getValue();
//                ansKey=e.getKey();
//            }
//        }
        //method-2 to traverse
        for (var key : fre.keySet()) {
            if (fre.get(key) > maxFre) {
                maxFre = fre.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max fre ans has it occurs %d times", ansKey, maxFre);
    }
}
