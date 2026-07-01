package dsa.hashset;


import java.util.HashSet;


public class CommonElementsinHashset {

    public static void main(String[] args) {

            HashSet<Integer> hash1 = new HashSet<>();

            hash1.add(3);
            hash1.add(5);
            hash1.add(7);
            hash1.add(9);
            HashSet<Integer> hash2 = new HashSet<>();
            hash2.add(5);
            hash2.add(7);
            hash2.add(9);
            hash2.add(11);

            HashSet<Integer> result = new HashSet<>();

            for(int n1:hash1){
                if(hash2.contains(n1)){
                    result.add(n1);

                }
            }


            System.out.println(result);

    }
}
