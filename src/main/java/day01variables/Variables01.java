package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        // Java da "=" assiginment operator ve Java bu operatoru gordugu zaman once sag tarafi calistirir
        // ve sagdaki degeri alir soldaki kutuya koyar

        // Java da esittir demek ==>> "=="      Matematikte "=", Java da "=="
        // Data type + VariableName ===> Variable declaration
        // Assignment operator (=) + Variable degeri ==> Assignment


        /*
        Java da temel de iki tip data tipi vardir;
            1) primitive data type
                char, boolean, byte, short, int, double, float, long
            2) non-primitive data type
                String
         */

        // Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz

        String ogrenciAdi = "Ali Can";

        // String ler icin default value (==> varsayilan deger) "null" dir

        /*
            String variable olusturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak java o variable
            icin varsayilan deger olarak null koyar
            null demek 0 demek degildir, 0 da coding te bir degerdir, null ise hiclik demektir
            null demek icinde variable veya method bulunmayan bos bir objedir
         */

        char isminIlkHarfi = 'A';
        // Note : char data type inda degerler tek tirnak icine konulmalidir


        boolean dogruMu = true;
        // boolean lar sadece iki farkli deger olabilir; true (dogru)  veya false (yanlis)
        // boolean data type inda emeklimisin sorusu icin bir variable olusturun ve false degerini atayiniz
        boolean isRetired = false;


        // byte data type;
        // tam sayilar icindir hafizada 1 byte yer kaplar
        // byte : -128 den +127 e dahil tamsayi degerleri icin kullanilir
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        // short data type:
        // tam sayilar icindir hafizada 2 byte yer kaplar
        // short : -32768 den +32767 e (dahil) tamsayi degerleri icin kullanilir
        // Ornek : Site nufusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu = 1300;

        // int data type;
        // tam sayilar icindir hafizada 4 byte yer kaplar
        // int : -2,147,483,648 ile 2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir
        // Ornek : Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
         int ulkeNufusu = 123231231;

         // long data type;
        // tam sayilar icindir hafizada 8 byte yer kaplar
        // long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        // Ornek : Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        long cellNumberInHumanBody = 893983384232332L;

        // float data type:
        // (Decimal Numbers==>ondalikli sayilar) icin kullanilir. (fiyatlandirmalar =>12.99)
        // Ornek : Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float gomlek = 23.45F;
        float ayakkabi = 212.89F;
        // Note : Java ondalikli sayilari otomatik olarak double kabul eder
        // float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        // 4 byte yer kaplar


        // double data type:
        // double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        // ondalikli sayilar icin kullanilir
        // Ornek : Hucre agirligi ve Amip in agirligi icin bir variable olusturunuz

        double weightCell = 0.0000000000000023032223223;
        double weightAmip = 0.000000000000000000000000023;
        // Ornek : Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazdiriniz
        // ------------ekranan yazdirmak icin
        System.out.println();
        // -----------------kullanilir
        double studentNot1 = 75;
        double studentNot2 = 45.50;

        System.out.println(studentNot1+studentNot2);




    }
}
