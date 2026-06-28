package JavaCollections;

import java.util.ArrayList;

public class Iterables_LambdaExpression {
    public static void main(String[] args) {

        ArrayList<String> browserName = new ArrayList<>();

        browserName.add("Chrome");
        browserName.add("Edge");
        browserName.add("Firefox");
        browserName.add("Safari");

        //traditional loop
        System.out.println("Traditional for loop");
        for(int i=0;i<browserName.size();i++){

            System.out.println(browserName.get(i));
        }

        System.out.println("Enhanced for loop");
        //Enhanced for loop
        for (String s : browserName) {

            System.out.println(s);
        }

        //Lambda Expression
        browserName.forEach(browser -> {
            System.out.println(browser);
        });
    }
}
