package odev;

import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class Danisman {
    /**
     * @param kullaniciadi dan��man�n girmesi gerekn kullan�c� ad�
     * @param sifre dan��man�n girmesi gereken �ifre
     * @param i yanl�� girilir ise tekrar sordurmak i�in d�ng�de kullan�ld�
     * @return getSifre i�in kullan�ld� private de�erleri ba�ka class da kullanmak i�in
     * @return getKullaniciadi i�in kullan�ld� private de�erleri ba�ka class da kullanmak i�in
     */
    private String kullaniciadi;
    private int sifre;
    int i = 1;

    Danisman() {
        /**
         * Danisman constructor � dan��manlar�n sisteme girebilmesi i�in kullan�ld�
         */
        while (i == 1) {
            System.out.println("L�tfen kullan�c� ad�n�z� ve �ifrenizi giriniz: ");

            Scanner scanner = new Scanner(System.in);
            setKullaniciadi(scanner.nextLine());
            setSifre(scanner.nextInt());

            if (getKullaniciadi().equalsIgnoreCase("ali") && getSifre() == 1) {
                System.out.println("Say�n Dr.Ali");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("veli") && getSifre() == 2) {
                System.out.println("Say�n Dr.Veli");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ayse") && getSifre() == 3) {
                System.out.println("Say�n Dr.Ay�e");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("muhammet") && getSifre() == 4) {
                System.out.println("Say�n Dr.Muhammet");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ilber") && getSifre() == 5) {
                System.out.println("Say�n Prof.Dr.�lber");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("furkan") && getSifre() == 6) {
                System.out.println("Say�n Dr.Furkan");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("faruk") && getSifre() == 7) {
                System.out.println("Say�n Dr.Faruk");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("nasuh") && getSifre() == 8) {
                System.out.println("Say�n Dr.Nasuh");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ahmet") && getSifre() == 9) {
                System.out.println("Say�n Dr.Ahmet");
                break;
            } else if (getKullaniciadi().equalsIgnoreCase("ridvan") && getSifre() == 10) {
                System.out.println("Say�n Dr.R�dvan");
                break;
            } else {
                System.out.println("Bilgileri yanl�� girdiniz.");
            }
        }

    }

    /**
     * @return getKullaniciadi i�in kullan�ld� private de�erleri ba�ka class da kullanmak i�in
     */

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
}