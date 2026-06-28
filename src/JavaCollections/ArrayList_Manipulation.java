package JavaCollections;

import java.util.*;

public class ArrayList_Manipulation {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(5);
        list.add(5);
        list.add(35);
        list.add(20);

        list.add(100);

        System.out.println(list);

        System.out.println("First element from the list:"+list.getFirst());


        System.out.println("Last element from the list:"+list.getLast());


        System.out.println("Remove the last element:"+list.remove(3));

        System.out.println("Remove using value:"+list.remove(Integer.valueOf(100)));


        //Finding duplicates in the Array List
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        ArrayList<Integer> list1 = new ArrayList<>();


        for (Integer integer : list) {

            if (set.contains(integer)) {

                list1.add(integer);

            } else {

                set.add(integer);

            }

        }
        System.out.println(list1);

    //Reverse an arraylist

    for(int i=list.size()-1;i>=0;i--){

        System.out.print(list.get(i)+" ");
    }


    System.out.println();
    //Convert an ArrayList to array

    int array_len = list.size();
    Integer[] array = new Integer[array_len];

    array = list.toArray(array);

    for(int i:array){

        System.out.print(i+" ");
    }
    System.out.println();

    //Array to ArrayList
    List<Integer> newList = new ArrayList<>(Arrays.asList(array));


    System.out.println("New list:"+newList);


    //Sort the ArrayList alphabetically

     ArrayList<String> fruitList = new ArrayList<>();

     fruitList.add("grapes");
     fruitList.add("apple");
     fruitList.add("kiwi");
     fruitList.add("orange");

    Collections.sort(fruitList);



     System.out.println(fruitList);

    }



}
