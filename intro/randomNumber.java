import java.util.Random;
import java.util.Scanner;


public class randomNumber {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                // 1 ile 10 arasında rastgele bir sayı üret
                int rastgeleSayi = random.nextInt(10) + 1;

                int tahmin;
                int denemeSayisi = 0;

                System.out.println("1 ile 10 arasında bir sayı tahmin ediniz.");

                do {
                    System.out.print("Tahmininizi giriniz: ");
                    tahmin = scanner.nextInt();
                    denemeSayisi++;

                    if (tahmin < 1 || tahmin > 10) {
                        System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz.");
                    } else if (tahmin < rastgeleSayi) {
                        System.out.println("Daha yüksek bir sayı tahmin ediniz.");
                    } else if (tahmin > rastgeleSayi) {
                        System.out.println("Daha düşük bir sayı tahmin ediniz.");
                    } else {
                        System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
                    }

                } while (tahmin != rastgeleSayi);

                scanner.close();
            }
        }
