import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int hak=3;
        int balance=1500;
        int select;
        while (hak>0){
            String user, password;
            System.out.print("Kullanıcı Adınızı Giriniz");
            user=input.nextLine();
            System.out.print("Şifrenizi Giriniz");
            password=input.nextLine();
            if (user.equals("yiğit") && password.equals("123")) {
                System.out.println("Merhaba bankamıza hoşgeldiniz");
                do {
                    System.out.println("Lütfen Yapmak istediğiniz işlemi giriniz");
                    System.out.println("1-Para Yatırma\n"+ "2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    select=input.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktarı: ");
                        int price= input.nextInt();
                        balance+=price;
                    } else if (select==2) {
                        System.out.println("Para Miktarı: ");
                        int price= input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz!!!!!");
                        }
                        else{
                            balance-=price;
                        }
                    } else if (select==3) {
                        System.out.println("Bakiyeniz : "+balance);
                    }
                }while (select!=4);
                System.out.println("Tekrar Görüşmek üzere.");
                break;
            }
            else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre");
                if (hak == 0) {
                    System.out.println("Hesap Bloke olmuştur!!!!!");
                }
                System.out.println("Kalan Hakkınız: "+ hak);
            }
        }

    }
}