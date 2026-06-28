package dsa.stringprograms;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String s = "httpsparabankparasoftcom";

        char ch = 'a';

        int frequency = 0;

        char[] c = s.toLowerCase().toCharArray();

        for (char value : c) {

            if (ch == value) {

                frequency++;
            }
        }
        System.out.println("Frequency of the given character:"+frequency);

    }
}
