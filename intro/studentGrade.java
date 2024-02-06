package intro;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        String[] ogrenciAdlari = new String[ogrenciSayisi];
        String[] ogrenciSoyadlari = new String[ogrenciSayisi];
        int[][] ogrenciNotlari = new int[ogrenciSayisi][3];

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Öğrenci Bilgileri:");

            System.out.print("Adı: ");
            ogrenciAdlari[i] = scanner.next();

            System.out.print("Soyadı: ");
            ogrenciSoyadlari[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print((j + 1) + ". Sınav Notu: ");
                ogrenciNotlari[i][j] = scanner.nextInt();
            }
        }

        double[] ogrenciOrtalamalari = new double[ogrenciSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            double toplamNot = 0;
            for (int j = 0; j < 3; j++) {
                toplamNot += ogrenciNotlari[i][j];
            }
            ogrenciOrtalamalari[i] = toplamNot / 3;
        }

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Öğrenci:");
            System.out.println("Adı: " + ogrenciAdlari[i]);
            System.out.println("Soyadı: " + ogrenciSoyadlari[i]);
            System.out.println("Not Ortalaması: " + ogrenciOrtalamalari[i]);
            System.out.println();
        }
    }
}




