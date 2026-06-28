package oops;

public class Bank {
    public static void main(String[] args) {
        Account_Info accObj = new Account_Info();
        accObj.setAccUserName("Joey");
        accObj.setAcc_no(12345);
        accObj.setAcc_balance(-1000.00);

        System.out.println(accObj.getAccUserName());
        System.out.println(accObj.getAcc_no());
        System.out.println(accObj.getAcc_balance());

    }
}
