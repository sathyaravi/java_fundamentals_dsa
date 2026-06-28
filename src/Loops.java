public class Loops {
    public static void main(String[] args) {

        for(int i=0;i<= 5;i++){

            System.out.print(i+" ");
        }
    System.out.println();
        for(int i=0;i<= 55;i+=5){

            System.out.print(i+" ");
        }
   System.out.println();
        for(int i=50;i>= 10;i-=5){

            System.out.print(i+" ");
        }
        System.out.println();
   System.out.println("While loop");
    int j=0;
   while(j<=50){
       System.out.print(j +" ");
       j+=2;
        }


        System.out.println();
        System.out.println("do While loop");
        int k=0;
        do{
            System.out.print(k +" ");
            k+=3;
        }while(k<=50);
    }
}
