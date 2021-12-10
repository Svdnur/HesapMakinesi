import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, select;

        System.out.println("Klavyenizden bir sayı giriniz:");
        sayi1 = input.nextInt();

        System.out.println("Klavyenizden bir sayı daha giriniz:");
        sayi2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
        select = input.nextInt();

        switch (select) {
            case 1:

                System.out.println("Toplama işlemi sonucunuz :" + (sayi1 + sayi2));
                break;

            case 2:

                System.out.println("Çıkarma işlemi sonucunuz :" + (sayi1 - sayi2));
                break;

            case 3:

                System.out.println("Çarpma işlemi sonucunuz :" + (sayi1 * sayi2));
                break;

            case 4:

                if (sayi2 == 0) {
                    System.out.println("Bir sayının 0'a bölümü tanımsızdır.");
                } else

                    System.out.println("Bölme işlemi sonucunuz :" + (sayi1 / sayi2));

                break;

            default:

                System.out.println("Geçersiz bir sayı girdiniz.");

        }

    }
}
