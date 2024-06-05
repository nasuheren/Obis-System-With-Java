package odev;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class Ogrenci {
    /**
     * @param ogrNo ��renci numaras�n� girmek i�in tan�mland�
     * @param name ��renci ismini girmek i�in tan�mland�
     * @param yas ��rencinin ya��n� g�stermek i�in kullan�ld�
     * @param tcNo ��rencinin kimlik numaras� i�in kullan�ld�
     * @param devam dan��man�n sistemi kullanmas� i�in tan�mland�
     * @param i for d�ng�s� i�in kullan�ld�
     */
    private int ogrNo;
    private String name;
    private int yas;
    private int tcNo;
    String devam = "E";
    int i = 0;


    Ogrenci(int yas) {
        /**
         * Ogrenci constructor'� ��renci ile ilgili olan bilgilerin yer ald��� metod olarak tan�mland�
         */

        for (i = 0; i < 40; i++) {
            System.out.println("Not girmek i�in 'E', girmemek i�in 'H' ye bas�n�z: ");
            Scanner girdi = new Scanner(System.in);
            devam = girdi.nextLine();
            if (devam.equalsIgnoreCase("E")) {
                System.out.println("��renci ismini giriniz: ");
                System.out.println("��rencinin numaras�n� giriniz: ");
                this.yas = yas;
                Random sayi = new Random();
                tcNo = sayi.nextInt(2147483645);
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
                ogrNo = scanner.nextInt();
                System.out.println("TC No:" + getTcNo() + "\nYas:" + getYas() + "\nAd:" + getName() + "\nOkul Numaras�:" + getOgrNo());
                System.out.println("Not girmek i�in 1'e , Ders program�n� g�rmek i�in 2'ye bas�n�z: ");
                Scanner input = new Scanner(System.in);
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        Ders ders1 = new Ders(0, 0, 0);
                        System.out.println("Ortalamasi: " + ders1.Ortalama());
                        System.out.println("Kredisi: " + ders1.Kredi());
                        System.out.println("Transkript: " + ders1.Transkript());
                        break;
                    case 2:
                        DersProgrami program1 = new DersProgrami();
                        System.out.println("Ogrencinin Ders Programi: " + program1.Program());
                        break;
                }
            } else if (devam.equalsIgnoreCase("H")) {
                break;
            } else {
                System.out.println("Belirtilen harfler d���nda ba�ka bir �ey girmeyiniz.");
            }
        }
        System.out.println("��leminiz tamamlanm��t�r.");
    }

    /**
     * @return ��renci hakk�nda bilgiler private oldu�u i�in onlar� ba�ka kullanmam�z gerekti�inen return olarak d�nd�rd�k
     */
    public int getOgrNo() {

        return ogrNo;
    }


    public String getName() {
        return name;
    }


    public int getYas() {

        return yas;
    }


    public int getTcNo() {

        return tcNo;
    }


}