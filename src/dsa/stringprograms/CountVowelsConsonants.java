package dsa.stringprograms;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        String s1 = "Java is a programming language";

        String[] s2 = s1.split(" ");

        int vowelCount = 0;

        int consonantCount = 0;

        for (int i = 0; i < s2.length; i++) {

            for (char ch1 : s2[i].toLowerCase().toCharArray()) {

                if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){

                    vowelCount++;

                }
                else if (Character.isLetter(ch1))  {
                        consonantCount++;

                    }
                }
            }

        System.out.println("Vowel Count:" + vowelCount);

        System.out.println("Consonant Count:" + consonantCount);

    }
}