import java.util.ArrayList;

public class Listing {
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

        void listele(ArrayList<User> pakize) { //Listele method’u herhangi bir return istemez
            // bu yüzden void işlemimizi yapmak için uygundur. İçinde user class’ından
            // oluşturulan objectlerin olduğu bir ArrayList’i tararız Listele methodunun içinde

            if (!pakize.isEmpty()) { //parametre olarak aldığımız List içinde herhangi
                // bir veri var mı bunu tararız. Boş değilse ! diye tararız
                //arrayList’in her elemenanı teker teker kontrol edeceğiz ve her ayın
                // ilk 10 gününde kayıt olanları şanslı kullanıcı olarak belirleyeceğiz.

                //For Each loop array list ile kullanımı rahat olan bir yöntemdir
                for (User abuziddin : pakize) { //for Each user tipinde değişkenler döndürecek,
                    // user listini döndürecek (Pakize)
                    //for each’in user class’ından verilerle çalışacak,
                    // her veri user class’ından üretilmiş objectler olacak ve userList içindeki verileri döndürecek
                    //userList yerine Pakize yazdık
                    //data tipi user, tıpkı String gibi bir veri tipi

                    if (abuziddin.registerDate.getDayOfMonth() <= 10) { //registerDate’in getDayofMonth methodunu kullandık
                        //eğer ilk 10 gündeyse
                        System.out.println(abuziddin.name + " şanslı kullanıcısınız." + abuziddin.registerDate + " tarihinde kaydoldu.");
                    } else { //ilk 10 günde değilse
                        System.out.println(abuziddin.name + " şanslı kullanıcı değilsiniz." + abuziddin.registerDate + " tarihinde kaydoldu.");
                    }
                }
            } else {
                System.out.println("Liste Boş");
            }

        }
    }

