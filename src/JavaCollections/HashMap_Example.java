package JavaCollections;

import java.util.HashMap;

public class HashMap_Example {
    public static void main(String[] args) {

        HashMap<Integer,String> browserMap = new HashMap<>();

        browserMap.put(0,"Chrome");
        browserMap.put(1,"Edge");
        browserMap.put(2,"Firefox");
        browserMap.put(3,"Safari");
        browserMap.put(3,"IE");
        System.out.println("Elements in the browser map:"+browserMap);
        System.out.println("Third browser from the map using key:"+browserMap.get(3));
    }
}
