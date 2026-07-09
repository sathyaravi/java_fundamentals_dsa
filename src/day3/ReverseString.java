package day3;

public class ReverseString {
    public static void main(String[] args) {

       System.out.println(reverse("Selenium"));

       System.out.println(reverse("madam"));

       System.out.println(reverse("Java"));


    }

    public static String reverse(String s){

       StringBuilder rev = new StringBuilder();

       for(int i=s.length()-1;i>=0;i--){

           rev.append(s.charAt(i));

       }

        return rev.toString();
    }
}
