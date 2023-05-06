package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
        Java da method nasil olusturulur?
        1) main method un disinda class in icinde olusturulur
        2) Access Modifier + return type + method ismi + () + {}

        Olusturulan method lar nasil kullanilir?
        1) Methodu olusturmak methodu calistirmak icin yeterli degildir, Kullanilmak istenen
           method main methodun icinden kullanilir
        2) method un ismi + () yazin
           varsa islem yapacaginiz datalari parantezin icine koyun
           bu islem method call (method cagirma) olarak adlandirilir
        3) methodun ismi + parametreler ===> method signature olarak adlandiriliyor
     */

    public static void main(String[] args) {

      int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long sonuc1 = carpmaYap(5,5);
      System.out.println(sonuc1);

      System.out.println(ucIslem(5,5,5));

      int result = dikdortgenAlan(6,7);
      System.out.println(result);

        System.out.println(dikdortgenCevresi(2, 3));
    }


    // Ornek : toplama islemi yapan bir method olusturun ve kullaniniz
    public static int toplamaYap(int a, int b){ //method kapsaminda kullanilmasini ve islenmesini istedigimiz datalar
        return a+b;

        //return demek bu methodun cagrildigi yere bu degeri return et demek
        // main method static oldugu icin main method icinde kullanacagimiz method static olmalidir

    }

    // Ornek : 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin

    protected static long carpmaYap(int a, int b){

        return a*b;
    }

    // Ornek : verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin

    private static double ucIslem(int a, int b, int c){

        return a*b+c;
    }

    /*
        1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullanin
        2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullanin.
     */

    private static int dikdortgenAlan(int a, int b){

        return a*b;
    }

    protected static int dikdortgenCevresi(int a, int b){

        return (2*(a+b));
    }
}
