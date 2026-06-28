package oops;

public class Account_Info {

    private String accUserName;
    private int acc_no;
    private double acc_balance;


    public void setAccUserName(String accUserName) {
        this.accUserName = accUserName;
    }

    public String getAccUserName() {
        return accUserName;
    }


    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_balance(double acc_balance) {
        if (acc_balance > 0) {
            this.acc_balance = acc_balance;
        }
    }
    public double getAcc_balance() {
        return acc_balance;
    }

}
