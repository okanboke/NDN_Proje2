import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank b1 = new Bank();

        Scanner scan = new Scanner(System.in);
        /*System.out.print("Kısa Vadeli Hesabın Bakiyesini Gir : ");
        int balance = scan.nextInt();
        ShortTerm t1= new ShortTerm(balance);*/

        String islemgoruntule = "0. İşlemleri görüntüle";

        String islemler = "Banka uygulamasına hoşgeldiniz\n"
                    +"Lütfen Yapmak istediğiniz işlemi seçiniz\n"
                    +"1. Kısa vadeli hesap oluştur(%17 faiz en düşük miktar: 1000TL)\n"
                    +"2. Uzun vadeli hesap oluştur(%24 faiz en düşük miktar: 1500TL)\n"
                    +"3. Özel hesap oluştur(%12 Faiz hesap açıldığındaki kadar para olması gerekiyor)\n"
                    +"4. Normal hesap oluştur(Faizsiz hesap para yatırma zorunluluğu yoktur)\n"
                    +"5. Hesapları Görüntüle\n"
                    +"6. Para Çekme\n"
                    +"7. Para Yatırma\n"
                    +"---- Çıkış için q ya basınız ----";

        //işlem seçimi için while döngüsü

        while (true) {
            System.out.println(islemgoruntule);
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            String islemturu = scan.nextLine();

            if(islemturu.equals("q")) {
                System.out.println("Banka Uygulamasından Çıkılıyor...");
                break;
            }
            else if (islemturu.equals("0")) {
                System.out.println(islemler);
            }
            else if (islemturu.equals("1")) {
                b1.createSAccount();


            }
            else if (islemturu.equals("2")) {
                b1.createLAccount();


            }
            else if (islemturu.equals("3")) {


            }
            else if (islemturu.equals("4")) {


            }
            else if (islemturu.equals("5")) {
                b1.getAccount();
            }
            else if (islemturu.equals("6")) {
                b1.withdrawAccounts();


            }
            else if (islemturu.equals("7")) {
                b1.depositAccount();

            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}