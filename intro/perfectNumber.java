import java.util.Scanner;
public class perfectNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (mukemmelSayiMi(sayi)) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }

            // Scanner'ı kapat
            scanner.close();
        }

        // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
        static boolean mukemmelSayiMi(int sayi) {
            if (sayi <= 0) {
                return false;
            }

            int toplam = 0;

            // 1'den sayıya kadar olan pozitif bölenleri bul ve toplamına ekle
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            // Toplam, sayının kendisine eşitse, sayı mükemmel sayıdır
            return toplam == sayi;
        }
    }

