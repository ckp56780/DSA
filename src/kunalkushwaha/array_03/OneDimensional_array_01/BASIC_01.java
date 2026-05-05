package kunalkushwaha.array_03.OneDimensional_array_01;

public class BASIC_01 {
    public static void main(String[] args) {
        //Q. store a roll number
       // int roll=10;//this is declaration of array

        //Q.Store 5 roll number
//        int roll1=10;
//        int roll2=10;
//        int roll3=10;
//        int roll4=10;

        //syntax
        //data_type variable_name=new data+type[size];

       // int[] rollno=new int[5];
        //or
       // int[] rollno= {10,13,12,14,12};


        int[] arr=new int[5];


        //this is declartion of array
        // int[] arr

        //initialisation of array
        // arr=new int[5];  //here the new object will also be created in the heap area.
        //here in the heap area memory is not continuous in nature that depends on the JVM
        System.out.println(arr[0]);

        //for int array all value will be zero if not inserted anything in the array


        //Arrays objects are in heap

        //DMA-Data memory allocation
        //hence may not be continuous it depends on JVM

        // Heap object is not in continuous???
        //1. Arrays in Java
        //✅ Primitive arrays
        //int[] arr = new int[5];Show more lines
        //
        //The array object itself is created on the heap
        //The elements (int) are stored contiguously in memory
        //This allows O(1) index-based access
        //
        //✅ Yes, primitive array elements are continuous
        //
        //✅ Object reference arrays
        //JavaStudent[] students = new Student[3];Show more lines

        //Memory layout:
        //Heap:
        //students → [ ref1 | ref2 | ref3 ]   ✅ continuous
        //ref1 → Student object (anywhere)
        //ref2 → Student object (anywhere)
        //ref3 → Student object (anywhere)
        //
        //
        //The array of references is continuous
        //The actual objects are NOT continuous
        //
        //✅ Array slots → continuous
        //❌ Objects pointed to → not continuous
        //
        //2. Heap Objects (in general)
        //JavaStudent s1 = new Student();Student s2 = new Student();Show more lines
        //
        //Objects allocated on the heap
        //JVM does NOT guarantee contiguous allocation
        //Allocation depends on:
        //
        //Garbage Collector
        //Heap fragmentation
        //JVM implementation
        //
        //
        //
        //❌ Heap objects are not necessarily continuous
        //
        //3. ArrayList in Java
        //JavaArrayList<Integer> list = new ArrayList<>();Show more lines
        //Internally:
        //JavaObject[] elementData;Show more lines
        //✅ What is continuous?
        //
        //The internal array (Object[]) is continuous
        //
        //❌ What is not continuous?
        //
        //The Integer objects stored inside
        //
        //ArrayList
        // → elementData [ ref | ref | ref ]   ✅ continuous
        //     ↓     ↓     ↓
        //   Integer  Integer  Integer        ❌ scattered



        //primitives are nly stored into stack
        //non-primitive-which object always store into heap memory
        //string s=new string[5];
        ///-------------------------------------------------------------------
        String[] arr1=new String[5];
        System.out.println(arr1[0]);
        //for String array all value will be null if not inserted anything in the array


    }
}
