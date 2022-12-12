import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Registration {
    /*
Bu uygulama kulanıcıların bir ArrayListe kayıt tarihini random alarak ekleyen
ve sonrasında her ayın ilk 10 gününde kaydolanları şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.

Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
ay degiskeni icin 1 ila 12 arasinda random sayi uretin
gun degiskeni icin 1 ila 28 arasinda random sayi uretin
LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin

Bunun için;
1- Bir user class oluşturun fields: name , registerDate (LocalDate cinsinden)

2- Registration isminde bir class oluşturun ve register isminde bir metod
ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin

3-Listing isminde bir class oluşturun ve printHappyUsers isminde bir metod ekleyerek
ArrayListteki userlardan her ayın ilk 10 gününde kaydolanları yazdıran metodu oluşturun.

*/
    ArrayList<User> usersList = new ArrayList<>(); //bu array list içinde user class’ından oluşturulan objectlerin verilerini tutacağız.
//buradaki amaç her kullanıcıya bir isim ve localDate veri tipinde bir değişken eklemek. Bunları User class’ında oluşturacağız ve oluşturulan bu objectleri teker teker array list’e atacağız


    void register() { //method ile bizden herhangi bir şey döndürmemizi istemiyor
        Scanner scan = new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String isim = scan.nextLine();
//kullanıcıdan ismini istedikten sonra random bir tarih belirleriz
        User user = new User(isim, rndTarih()); //user class’ından bir object oluştururuz. Constructor bizden parametre istiyor, bu yüzden user class’ının içine bir tane parametresiz constructor oluştururuz. Burada kullanıcıdan ismini aldık ve gönderdik, localdate tipinde bir veri göndermemiz gerekiyor. rndTarih yazdıktan sonra sağ click ile method oluştur deriz ve aşağıda method oluşur.
        usersList.add(user); //user class’ınan bir user object’i oluşturmuştuk, onu burada ArrayList’e alırız
    }

    private LocalDate rndTarih() {
        LocalDate tarih = null;
        //Math.random()*(max-min+1)+min; - formül


        /* Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
        ay degiskeni icin 1 ila 12 arasinda random sayi uretin
        gun degiskeni icin 1 ila 28 arasinda random sayi uretin */

        //farklılık olsun diye Math.random methodunu kullanmayı tercih ettik

        int rndYil = (int) (Math.random()* (2022 - 2013 + 1) + 2013);
        // Math.random double bir değişken döndürür, bu değişken 0 ile 1 arasında,double sayı döndürür.
        // Ancak biz dönüş tipini integer olarak tanımladığımız için casting yapmamız gerekti
        //değeri istediğimiz aralıkta tutabilmek için yukarıdaki formülü kullanırız

        int rndAy = 0;
        int rndGun = 0;
         /*
        Random random =new Random();
        int rndGun=random.nextInt(1,28);
        int rndAy=random.nextInt(1,12);
        int rndYil=random.nextInt(2013,2022);
        */
        // tarih bu random değerleri oluşturduktan sonra oluşturduğumuz localDate
        // tipindeki tarih variable’ına eklememiz gerekir. bunun için

        tarih = LocalDate.of(rndYil, rndAy, rndGun);//yyyy-MM-dd sıralama bu şekildedir.
        // Burada random bir tarih oluşturduk ve bunu localdate tipinde değişkenimiz olan tarih’e aktardık
        // ve return yapıp parametreli constructor’a gönderdik

        return tarih; //tarihi döndürür

    }  //2.şıkkın istediği her şeyi bu class’ta yapmış olduk

}
