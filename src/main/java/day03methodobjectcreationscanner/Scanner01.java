package day03methodobjectcreationscanner;
//Java nin util kutuphanesinden scanner class import edildi
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        // 1. Adim : Scanner Class tan object olustur
        Scanner input = new Scanner(System.in);

        // 2. Adim : kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        // 3. Adim : Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        byte age = input.nextByte();

        System.out.println(age);


    }
}
