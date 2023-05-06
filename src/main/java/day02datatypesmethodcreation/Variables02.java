package day02datatypesmethodcreation;

public class Variables02 {

    public static void main(String[] args){
        /*
            Java da temelde 2 tip data vardir
            1) Primitive data type :
                char, boolean, byte, short, int, long, float, double
            2) Non-primitive data type :
                String.....
         */

        /*
        Note 1 : primitive data typelarini java olusturmustur, biz olusturmayiz
        Note 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
        Note 3 : primitive datalar data typelarina gore memory de farkli yer kaplarlar
        Note 4 : primitive datalar iclerinde sadece sizin atadiginiz degerleri barindirirlar
         */

        /*
        Non-primitive Data types
        Ornek : String non-primitive bir data typedir
        - Uretilen her bir class ayni zamanda bir "non-primitive" data type dir. Bu yuzden "non-primitive"
        data type lar sinirsiz sayidadir denilebilir
        - Non-primitive data typelarin isimleri buyuk harf ile baslar
        - Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
         */


        // Ornek : Ulke ismi icin bir variable olusturun ve bir deger atayip console yazdirin

        String ulkeIsmi = "Hollanda";
        System.out.println(ulkeIsmi);

        /*
        Soru : primitive ve non-primitive data type lari arasindaki farklar nelerdir?

        1) "primitive" ler sadece bizim atadigimiz degeri icerir
            "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir
        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3) "primitive" leri Java uretmistir ve 8 tanedir
            "non-primitive" leri Java ve developerlar uretebilir, sinirsiz sayidadir
        4) "primitive" ler memory de data type larina gore sabit boyutta bellek kullanir
        5) "non-primitive" ler icin Java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler


         */
    }

}
