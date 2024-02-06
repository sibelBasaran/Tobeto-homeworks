package intro;

public class stringMethods {
    public static void main(String[] args) {
        String string = "Hello Friend!";
        String Str1 = "I'm learning Java";
        String Str2 = "I love JAVA!";

        //charAt =>  Belirtilen dizine göre karakteri döndürür.
        System.out.println(string.charAt(2));

        //length => Bir metnin uzunluğunu (karakter sayısını) döndürür.
        //saymaya 1'den başlar
        //int döndürür!
        System.out.println(string.length());
        int length = string.length();


        //indexOf => bir karakterin baştan konumunu verir
        //saymaya 0'dan başlar.
        //int döndürür
        System.out.println(string.indexOf('!'));
        int indexOf = string.indexOf("love");


        //compareTo
        //ilk str'nin ikincisiyle kıyaslar ve farkını verir
        System.out.println(string.compareTo(Str1));
        System.out.println(string.compareTo(Str2));

        //contains
        //ifadeyi içerip içermediğini sorgular
        //true ya da false döndürür
        System.out.println(string.contains("go"));
        System.out.println(string.contains("lo"));

        //string sonunu kontrol eder
        //büyük küçük harfe dikkat et!!!
        System.out.println(string.endsWith("!"));
        System.out.println(string.endsWith("."));
        System.out.println(string.endsWith("?"));

        //replace
        //ifadeyi değiştirir
        System.out.println(string.replace("A","b"));

        //substring
        //3 ile 10 arasındaki stringi döndürdü
        System.out.println(string.substring(3,10));

        //toUpperCase
        //toLowerCase
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        //concat
        //stringi birleştirir
        System.out.println(string.concat(Str1));

        //trim
        //başta ve sondaki boşlukları kırpar
        String trimTest = "   Bill GATES    ";
        System.out.println(trimTest.trim());
    }

}
