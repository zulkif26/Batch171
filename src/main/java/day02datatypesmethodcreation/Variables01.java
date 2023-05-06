package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args){

        // Ornek : Sehir ismi icin bir variable olusturun ve once "Ankara" sonrada "Izmir" degerlerini
        // atayip ekrana yazdirin

        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        // Ornek : Sehir plaka kodu icin bir variable olusturun once 34 sonrada 35 degeri atayip yazdirin

        byte plaka = 34;

        System.out.println(plaka);

        plaka = 35;
        System.out.println(plaka);

        // Ornek : Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeri atayip ekrana yazdirin

        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);
    }
}
