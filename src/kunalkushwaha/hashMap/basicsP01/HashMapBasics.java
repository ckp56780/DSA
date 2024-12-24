package kunalkushwaha.hashMap.basicsP01;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void basics(){
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("chandan",12);
        hs.put("Mohan",13);
        hs.put("Rohan",14);
        hs.put("Sohan",15);
        hs.put("Raju",16);

        System.out.println(hs); //{Mohan=13, chandan=12, Sohan=15, Raju=16, Rohan=14}

        //get the value to corresponding element
        System.out.println(hs.get("chandan")); //12
        System.out.println(hs.get("motu"));  //null-if key is not present, then it will return null

        //update the value
        hs.put("Raju",112); // Initial-- "Raju",16--after change-"Raju",112 [Key should always be unique, if same key inter then then it will replace the value]
        // [if new value inters then it fgthyyuj21`76will add the value by put method]
        System.out.println(hs); //{Mohan=13, chandan=12, Sohan=15, Raju=112, Rohan=14}

        //remove the element
        hs.remove("Raju");  //Two behaviors are
        // -1.if key is present then it will remove.
        // 2.if key is not present, then it will return null value
        System.out.println(hs); //{Mohan=13, chandan=12, Sohan=15, Rohan=14}

        System.out.println(hs.remove("riya")); //null [key is not present into above hashmap]

        //checking the behavior is present into the hashmap or not?
        System.out.println(hs.containsKey("riya")); //false
        System.out.println(hs.containsKey("chandan")); //true

        System.out.println(hs.containsValue(113)); //false
        System.out.println(hs.containsValue(12)); //true

        //adding a new entry if the new key does not exist already
        hs.putIfAbsent("chandan",111); //it will not enter
        hs.putIfAbsent("ranjan",111); //it will enter
        System.out.println(hs); //{Mohan=13, chandan=12, ranjan=111, Sohan=15, Rohan=14}


        //get all keys in the map
        System.out.println(hs.keySet()); //[Mohan, chandan, ranjan, Sohan, Rohan]
        //get all value into the map
        System.out.println(hs.values()); //[13, 12, 111, 15, 14]

        //get all entries into the map
        System.out.println(hs.entrySet()); //[Mohan=13, chandan=12, ranjan=111, Sohan=15, Rohan=14]


        //traverse all entries into the hashmap
        //method-01
        for (String key:hs.keySet()){
            System.out.printf("Age of %s is %d\n",key,hs.get(key));
        }
        //The Age of Mohan is 13
        //Age of chandan is 12
        //Age of ranjan is 111
        //Age of Sohan is 15
        //Age of Rohan is 14

        System.out.println("...................");
        ////method-02
        for (var e:hs.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

        //output:
        //Age of Mohan is 13
        //Age of chandan is 12
        //Age of ranjan is 111
        //Age of Sohan is 15
        //Age of Rohan is 14

        System.out.println("...........");
        //method-03
        for (Map.Entry<String,Integer> e:hs.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        //output:
        //Age of Mohan is 13
        //Age of chandan is 12
        //Age of ranjan is 111
        //Age of Sohan is 15
        //Age of Rohan is 14 --all elements are unordered

    }
    public static void main(String[] args) {

        basics();
    }
}
