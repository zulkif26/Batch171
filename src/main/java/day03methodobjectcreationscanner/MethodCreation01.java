package day03methodobjectcreationscanner;


public class MethodCreation01 {

    public static void main(String[] args) {

        double hesapla = getCube(5);
        System.out.println("hesapla = " + hesapla);

        monitorPrint("Java is easy");
        // method olusturmak icin ikinci yol
        // Ornek ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
        // main method icinde iken method ta kullanilacak olan variable lari olusturunuz
        String str = "Techproedu";
        // method ismi ve parametreleri yazari
        // kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur
        // daha sonra kendi istegimize gore dizayn ederiz
        printConsole(str);

        // Ornek : Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz

        int a = 3;
        int b = 5;
        carpmaYapp(a,b);

        // Ornek ; Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz
        int c = 5;
        kareHesapla(c);


    }

    private static void kareHesapla(int c) {
        System.out.println(c*c);
    }

    private static void carpmaYapp(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    // Ornek : Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz

    static double getCube(double a){

        return a*a*a;
    }
    // NOte : Access modifier i default yapmak isterseniz access modifier i YAZMAYINIZ.

    // Ornek : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

    public static void monitorPrint(String str){
        System.out.println(str);
    }
    // Eger bir method yeni bir data uretmiyor ise return type i void olur
    // Method un return type i void ise method body icinde return keywordu yazilmaz

    /*
    Homework
    1) Cemberin cevresini hesaplayan methodu olusturunuz ve kullanininz
    2) Dairenin alanini hesaplayan methodu olusturunuz
     */
}
