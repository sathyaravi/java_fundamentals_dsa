public class Methods_Demo {

     static void greet(){
        System.out.println("Greetings");
    }

    static void greet(String name){
         System.out.println("Hello, "+name);
    }

    static int sum(int a,int b){
         return a+b;
    }

    static String fruit(String fname){
         return fname;
    }
    static boolean result(int number){
         return number % 2 == 0;
    }
    public static void main(String[] args) {
        greet();
        greet("John Doe");
        System.out.println(sum(10,20));
        System.out.println(fruit("Kiwi"));
        System.out.println(result(15));
    }
}
