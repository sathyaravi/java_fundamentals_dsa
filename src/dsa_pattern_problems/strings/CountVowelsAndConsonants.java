package dsa_pattern_problems.strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        String s = "automation";

        int vowels=0;
        int consonants=0;

        for(char ch:s.toLowerCase().toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}
