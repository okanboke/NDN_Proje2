import java.util.Scanner;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Bank {

    Scanner scan = new Scanner(System.in);
    private int accountID = 0;
    private static int numOfAccounts = 0;
    Account accounts[] = new Account[100];

    public void createSAccount() {
        System.out.print("Bakiye Giriniz : ");
        double balance = scan.nextDouble();
        Account shortT = new ShortTerm(balance, accountID);
        if (shortT.getBalance() < shortT.getMinBalance()) {

        } else {
            accounts[accountID] = shortT;
            accountID++;
        }
    }

    public void createLAccount() {
        System.out.print("Bakiye Giriniz : ");
        double balance = scan.nextDouble();
        Account longT = new LongTerm(balance, accountID);
        accounts[accountID] = longT;
        accountID++;
    }

    public void getAccount() {
        if (numOfAccounts == 0) {
            System.out.println("Hesap Oluşturulamadı...");
        }
        for (int i = 0; accounts[i] != null; i++) {
            System.out.println("*************************************");
            System.out.println(i + ".HESAP BİLGİLERİ");
            System.out.println("BAKİYE  : " + accounts[i].getBalance());
            System.out.println("ID      : " + accounts[i].getId());
            //Tarih
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("14/02/2022");
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Hesap Oluşturulma Tarihi: " + formattedDate);
            System.out.println("*************************************");
        }
    }

    public void depositAccount() {
        getAccount();
        System.out.print("Hesap No Giriniz : ");
        int no = scan.nextInt();
        System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
        double tutar = scan.nextDouble();

        for (int i = 0; i < accounts.length; i++) {

            if (i == no) {
                accounts[i].deposit(tutar);
                break;
            }
        }
        getAccount();
    }

    public void withdrawAccounts() {

        getAccount();
        System.out.print("Hesap No Giriniz : ");
        int no = scan.nextInt();
        System.out.print("Çekmek istediğiniz tutarı giriniz : ");
        double tutar = scan.nextDouble();

        for (int i = 0; i < accounts.length; i++) {

            if (i == no) {
                accounts[i].withdraw(tutar);
                break;
            }
        }
        getAccount();
    }

    public void sortion() {

        double totalPoint=0;
        for (int i = 0; i < accounts.length; i++) {
            totalPoint += accounts[i].getPoint();
        }
        for(int i = 0;i<accounts.length; i++){
            accounts[i].setPossibility(accounts[i].getPoint()/totalPoint);
        }
    }
}
