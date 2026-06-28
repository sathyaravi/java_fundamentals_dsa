package dsa.stringprograms;

public class ConvertUpperLowercase {

    public static void main(String[] args) {

        String s1 = "AUTOMATION TESTING";

        String s2 = "automation testing";

        System.out.println("Upper to Lowercase conversion:"+convertUpperToLower(s1));

        System.out.println("Lower to Uppercase conversion:"+convertLowerToUpper(s2));

    }

    public static StringBuilder convertUpperToLower(String s1){

        char [] ch = s1.toCharArray();

        StringBuilder newString = new StringBuilder();

        for (char c : ch) {
            if (c >= 'A' && c <= 'Z') {
                int i = (int) c + 32;
                newString.append((char) i);
            }
            else{

                newString.append(c);

            }
        }

        return newString;

    }

    private static StringBuilder convertLowerToUpper(String s2){

        char [] ch = s2.toCharArray();

        StringBuilder newString = new StringBuilder();

        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                int i = (int) c - 32;
                newString.append((char) i);
            }

            else{

                newString.append(c);
            }

        }

        return newString;

    }
}
