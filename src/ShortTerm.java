import java.util.Scanner;
import java.util.Date;


public class ShortTerm extends Account {

    public ShortTerm(double balance, int id) {
        setMinBalance(1000);
        setBalance(balance);
        // this.balance = balance
        setId(id);

        double faiz = 0.17;
        int donem = 12;

        for (int i = 0; i<=12; i++){
            double birikimTutar = getBalance()*(1+(faiz));
        }

    }

    public ShortTerm(double balance) {
        super();
    }
}