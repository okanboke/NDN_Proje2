import java.util.Date;


public abstract class Account {

    private int id;
    private double balance;
    private double minBalance;
    private boolean balanceControl = true;
    private int point;
    private double possibility;


    public void deposit(double amount) {

        this.balance += amount;
    }

    public void withdraw(double amount) {
        System.out.print("Çekebileceiğiniz Maksimum Tutar : ");
        System.out.println(this.balance - this.minBalance);
        if (this.balance - amount < this.minBalance)
            System.out.println("Hesabınızda Bulunması Gereken Minimum Tutar : " + minBalance);
        else
            this.balance = this.balance - amount;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        while (balanceControl) {
            if (balance < minBalance) {
                System.out.println("Hesabınızda Minimum Bulunması Gereken Tutar : " + getMinBalance());
            } else {
                this.balance = balance;
                System.out.println("Hesap Oluşturuldu");
                System.out.println("Bakiye : " + balance);
                break;
            }
        }
    }
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        int counter = 0;
        counter=(int) (this.balance/2000);
        this.point=counter;

    }

    public double getPossibility() {
        return possibility;
    }

    public void setPossibility(double possibility) {
        this.possibility = possibility;
    }
}