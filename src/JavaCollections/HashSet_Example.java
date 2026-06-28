package JavaCollections;

import java.util.HashSet;

public class HashSet_Example {
    public static void main(String[] args) {


        /*HashSet-contains unordered set of elements.It does not allow duplicates. If we try to enter duplicate element in the
        * hashset then duplicates are automatically removed. It cannot be accessed using index. */

        HashSet<String> browserSet = new HashSet<>();

        browserSet.add("Chrome");
        browserSet.add("Edge");
        browserSet.add("Safari");
        browserSet.add("firefox");
        browserSet.add("Edge");

        System.out.println("Elements in the hashset:"+browserSet);
    }
}
