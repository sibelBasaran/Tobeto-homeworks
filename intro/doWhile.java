import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        /*
Do-While Döngüsü:

Do-while döngüsü, kod bloğunu en az bir kere çalıştıran ve ardından koşul sağlandığı sürece tekrarlayan bir döngü türüdür.
Koşul, döngü gövdesinin sonunda kontrol edilir.Do-while döngüleri, kod bloğunu en az bir kere çalıştırmak istediğiniz durumlarda kullanılır.
 Örneğin, bir kullanıcıdan veri almadan önce veri girişi doğrulama işlemi yapmak için do-while döngüsü kullanılabilir. */
       Scanner input = new Scanner(System.in);
        String parola;

        do {
            System.out.println("Parolanızı giriniz: ");
            parola = input.nextLine();
        } while (!parola.equals("dogruParola"));

        System.out.println("Parolanız doğru.");

/*While Döngüsü:

While döngüsü, koşul sağlandığı sürece kod bloğunu tekrarlayan bir döngü türüdür.
Koşul, döngü gövdesinin başında kontrol edilir.While döngüleri ise koşul sağlandığı sürece bir işlemi tekrarlamak istediğiniz durumlarda kullanılır.
Örneğin, bir oyun döngüsü oluşturmak veya bir veri akışını işlemek için while döngüsü kullanılabilir.


       */
        Scanner input= new Scanner(System.in);

        int sayi;

        System.out.print("Lütfen bir pozitif sayı giriniz: ");
        sayi = input.nextInt();

        while (sayi <= 0) {
            System.out.println("Girdiğiniz sayı pozitif değil!");
            System.out.print("Lütfen bir pozitif sayı giriniz: ");
            sayi = input.nextInt();
        }

        System.out.println("Girilen pozitif sayı: " + sayi);


        input.close();
    }
}


