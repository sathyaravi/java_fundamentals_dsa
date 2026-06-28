import javax.xml.transform.stream.StreamSource;

public class Datatypes_example {
    public static void  main(String[] args){
        int num =10;
        char p = 'A';
        boolean is_true = true;
        float f = 4.5f;
        String s1 = "Hello World";
        int[] arr = {1,2,3,4,5};

        System.out.println("Integer value:"+num);
        System.out.println("character value:"+p);
        System.out.println("Boolean value:"+is_true);
        System.out.println("float value:"+f);
        System.out.println("String:"+s1);

        System.out.println("Array:");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
