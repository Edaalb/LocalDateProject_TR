import java.util.Scanner;

public class Menu {
    static Registration registration = new Registration();
    static Listing listing=new Listing();


    static void giris() {

        System.out.println("Yapmak istediğiniz işlemi seçiniz\n" +
                "1. İsim girişi\n" +
                "2. Şanslı isimleri listeleme\n" +
                "3. Çıkış\n" +
                "Seçiminiz:");

         //1,2,3 dışında bir şeye bastığımızda sistem çalışmayacak,
        // tekrardan doğru değer girilmesini isteyecek, dopru değer girilinceye kadar değer isteyecek

        Scanner scan = new Scanner(System.in);

        while (true) { //bu şekilde yaptığımızda while döngüsü sürekli çalışır.
            if (scan.hasNextInt()) { //Sayısal değer girdikçe çalışan bir uygulama hasNexInt methodu ile yapılabilir.
                                    // Herhangi bir int değer girilmezse if’in içi çalışmaz
                int secim = scan.nextInt(); //switch’in key’i int bir değişken
                switch (secim) { //
                    case 1: {
                        registration.register(); //register method’unu çağırdık
                        giris(); // register methodu çalıştıktan sonra tekrardan girişe geri döner
                    }
                    case 2: {
                        listing.listele(registration.usersList); //Listele method’unu çağırdığımızda içine
                        // parametre göndermemiz gerekir. Parametreyi user listesi registration
                        // class’ında olduğu için oradan çağırırız. List’i listele method’unun içine gönderdik,
                        // işlemleri yaptıktan sonra giriş’e döner
                        giris();
                    }
                    case 3: {
                        System.out.println("Güle Güle");
                        System.exit(0); //sistemi kapatırız
                    }
                    default: {
                        System.out.println("Geçerli değer giriniz.");
                        giris();
                    }
                }
            } else { //numarik değer girilmezse burası çalışır
                System.out.println("Geçerli değer giriniz");
                giris();
            }
        }
    }

}
