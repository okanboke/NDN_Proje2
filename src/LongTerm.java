import java.util.Scanner;
import java.util.Date;

public class LongTerm extends Account {

    public LongTerm(double balance,int id) {
        setMinBalance(1500);
        setBalance(balance);
        // this.balance = balance
        setId(id);

        double faiz = 0.24;
        int donem = 12;

        for (int i = 0; i<=12; i++){
            double birikimTutar = getBalance()*(1+(faiz));
        }

    }
}