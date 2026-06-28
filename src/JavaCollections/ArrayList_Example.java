package JavaCollections;

import java.util.ArrayList;

public class ArrayList_Example {

    public static void main(String[] args) {

        /**ArrayList- like an array stores an ordered collections of elments of the same datatype.It allows duplicate values
         * Elements can be accessed and removed using an index. Index starts from 0.you want to quickly find or check for an item without caring about order, HashSet and HashMap are generally faster than ArrayList.
         * But if you need ordered access by position, ArrayList is your go-to.**/
        ArrayList<String> browserList = new ArrayList<>();

        browserList.add("Chrome");
        browserList.add("Edge");
        browserList.add("Firefox");
        browserList.add("Safari");

        System.out.println("Browsers in the list:"+browserList);
        System.out.println("Second browser in the list:"+browserList.get(1));

        browserList.remove(2);
        System.out.println("After removal:"+browserList);
    }
}
