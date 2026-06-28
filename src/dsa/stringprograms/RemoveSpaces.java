package dsa.stringprograms;

public class RemoveSpaces {

    public static void main(String[] args) {
        String s1 = "Java is a programming language";

        String s2 = "Java is platform independent";

        StringBuilder sb = new StringBuilder();

        String result=s1.replaceAll("\\s","_");

        System.out.println(result);

        for(char c:s2.toCharArray()){

            if(c==' '){

                sb.append('*');

            }

            else{

                sb.append(c);
            }
        }
    System.out.println(sb.toString());

    }
}
