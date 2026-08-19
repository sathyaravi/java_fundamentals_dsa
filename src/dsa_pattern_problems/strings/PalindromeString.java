package dsa_pattern_problems.strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(palindromeString(s));
        System.out.println(palindromeString("madam"));
    }

    public static boolean palindromeString(String s){

        if(s.isEmpty()){
            return false;
        }
        char[] ch=s.toLowerCase().toCharArray();

        int left=0;
        int right=ch.length-1;
        while(left<right){

            if(ch[left]==ch[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
