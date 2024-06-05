package odev;

import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */

public class DersProgrami {
    /**
     * @param gun burda switch-case girilicek olan sayilar icin tanimlandi.
     * @param donem donemi se�mek i�in tan�mlad�k.
     */
    int gun, donem;


    public double Program() {
        /**
         * Program  adinda metod actik. Burda hangi gun hangi dersi varsa onu ogrenmesi icin program yazdik ve istedigi gunu konsoldan giricek sekilde kodladik.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hangi d�nemin programina bakmak istiyorsaniz o d�nemin yanindaki sayi degerini giriniz:");
        System.out.println("1- 1.Donem\n 2- 2.Donem\n 3- 3.Donem\n 4- 4.Donem\n 5- 5.Donem\n 6- 6.Donem\n 7- 7.Donem\n 8- 8.Donem");
        System.out.println(" Seciminiz: ");
        donem = input.nextInt();
        // her d�neme ait ders program�n� g�rmek i�in buradan se�im yapt�r�yoruz.
        switch (donem) {
            case 1:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt();
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu Nesne B�LG�SAYAR PROGRAMLAMA I dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu F�Z�K I dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MATEMAT�K I dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu B�LG�SAYAR M�HEND�SL���NE G�R�� dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu T�RK D�L� I ve YABANCI D�L I (�NG.) var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 2:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu T�RK D�L� II dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu YABANCI D�L II (�NG.) ve B�LG�SAYAR PROGRAMLAMA II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MATEMAT�K II dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu F�Z�K II dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu L�NEER CEB�R dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 3:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu Nesne Yonelimli Programlama dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu dersiniz bulunmamaktadir.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu Diferansiyel Denklemler dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu Elektrik Muhendisliginin Temelleri dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu Olasilik ve istatistik dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 4:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu ATAT�RK �LK. VE �NK. TAR�H� II dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu AYRIK MATEMAT�K dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu ELEKTRON�K DEVRELER dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu B�LG�SAYAR M�MAR�S� ve G�RSEL PROGRAMLAMA dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu VER� YAPILARI VE ALGOR�TMALAR dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 5:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu ��LET�M S�STEMLER� dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu VER�TABANI Y�NET�M� dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu MANTIKSAL DEVRE TASARIMI dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu SAYISAL ANAL�Z dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu B�L���M ET��� VE HUKUKU ve B�L�M SE�MEL� I dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 6:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu B�L�M DI�I SE�MEL� I dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu B�L�M SE�MEL� II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu YAZILIM M�HEND�SL��� dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu M�KRO��LEMC�LER dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu �STAT�ST�KSEL ANAL�Z ve A� TEKNOLOJ�LER� dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 7:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu B�LG�SAYAR PROJES� dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu SOSYAL SE�MEL� II dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu �� SA�LI�I VE G�VENL��� I ve B�L�M SE�MEL� V dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu B�L�M SE�MEL� III dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu B�L�M SE�MEL� IV dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
            case 8:
                System.out.println("Lutfen hangi gunun programina bakmak istiyorsaniz o gunun yanindaki sayi degerini giriniz:");
                System.out.println("1- Pazartesi:\n 2- Sali:\n 3- Carsamba:\n 4- Persembe:\n 5- Cuma:\n 6-Cumartesi:\n 7-Pazar:");
                System.out.println(" Seciminiz: ");
                gun = input.nextInt(); /** @param 'int' gun'unun icine konsoldan deger aliyoruz.*/
                switch (gun) {
                    // Burda gunlerin karsiligi gelen sayilardan birini girerek o gunun porgraminda dersi varmi varsada hangi dersi var onu ogreniyor.
                    case 1:
                        System.out.println("Pazartesi gunu B�L�M SE�MEL� VI dersiniz var.");
                        break;
                    case 2:
                        System.out.println("Sali gunu B�L�M SE�MEL� VII dersiniz var.");
                        break;
                    case 3:
                        System.out.println("Carsamba gunu B�L�M DI�I SE�MEL� II dersiniz var. ");
                        break;
                    case 4:
                        System.out.println("Persembe gunu G�R���MC�L�K dersiniz var.");
                        break;
                    case 5:
                        System.out.println("Cuma gunu �� SA�LI�I VE G�VENL��� II dersiniz var.");
                        break;
                    case 6:
                        System.out.println("Cumartesi gunu dersiniz bulunmamaktadir");
                        break;
                    case 7:
                        System.out.println("Pazar gunu dersiniz bulunmamaktadir.");
                        break;
                    default:
                        System.out.println("Gecersiz bir islem.Lutfen tekrar giriniz.");
                }
                break;
        }


        return gun; /** @return 'gun'  burda hangi gun girildiyse o degeri dondurucek*/

    }
}