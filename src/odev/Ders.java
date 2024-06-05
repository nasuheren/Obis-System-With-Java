package odev;

import java.util.Scanner;

/**
 * @author Faruk Yilmaz and NasuhEren Demirci.
 * @since 21.11.2020
 */
public class Ders {  // Ders sinifi acildi.
    /**
     * @param ort adinda sayilarin ortalamasini tutmasi icin tanimlandi.
     * @param ogrKredi adinda kredi sayi degerleri icin tanimlandi
     * @param vize,finall,quiz,secim notlarin degerini almak icin tanimlandi
     * @param total adinda toplam cikan degerleri toplamak icin tanimlandi
     * @param gano adinda 4luk puan sistemi icin tanimlandi.
     * @param dongu sonsuz d�ng� yapmak i�in kulland�k.
     */
    public double ort;                //Burda hepsini gerektirdigi turde tanittik(public,int,vb..)
    public int ogrKredi;
    int vize, finall, quiz, secim, dongu = 1;
    public double total, gano;

    Ders(int ogrKredi, double ort, double gano) {  //Burda Ders sinif actim  burda girilen kelimlerin
        this.ogrKredi = ogrKredi;                // yukardaki kelimler oldugunu bilmek icin "this."metodu kullanildi.
        this.ort = ort;
        this.gano = gano;
    }

    public double Ortalama() {                           //Ortalama adinda bir metod actim burda aldigi notlari hesapladim
        Scanner input = new Scanner(System.in);           //Notlari konsoldan almak icin Scanner kullanildi
        while (dongu == 1) {
            System.out.println("Vize notunu giriniz: ");
            vize = input.nextInt();
            if (vize >= 0 && vize <= 100) {
                System.out.println("Quiz notunu giriniz: ");
                quiz = input.nextInt();
                if (quiz >= 0 && quiz <= 100) {
                    System.out.println("Finall notunu giriniz: ");
                    finall = input.nextInt();
                    if (finall >= 0 && finall <= 100) {
                        break;
                    } else {
                        System.out.println("Notu 0 ve 100 aras�nda(0 ve 100 dahil) giriniz.");
                    }
                } else {
                    System.out.println("Notu 0 ve 100 aras�nda(0 ve 100 dahil) giriniz.");
                }
            } else {
                System.out.println("Notu 0 ve 100 aras�nda(0 ve 100 dahil) giriniz.");
            }
        }

        total = ((quiz * 0.2) + (vize * 0.3) + (finall * 0.5));
        this.gano = total / 25;                             // puanlama 4 uzerinden olsun diye 25 ile boldum.
        return this.gano;                                 // gano degerini dondurdum.
        /** @return 'double' burda gano degerini donduruyor */
    }

    public double Kredi() {                           //Kredi adinda metod actim.
        System.out.println("Lutfen hangi donemde oldugunuzu seciniz: ");
        //burdan donem derken 4yil toplam 8 donemden olusuyor.Mesela biz 2.Yilin 1.donemindeyiz Yani 3.donem oluyor.
        System.out.println("1- 1.Donem\n 2- 2.Donem\n 3- 3.Donem\n 4- 4.Donem\n 5- 5.Donem\n 6- 6.Donem\n 7- 7.Donem\n 8- 8.Donem");
        Scanner input = new Scanner(System.in);            // hangi donemde oldgunu konsoldan aldim.
        System.out.println("Seciminiz:");
        secim = input.nextInt();
        switch (secim) {                         //Girilen donemi switch-case soktum hangi donemde ne olcagini en iyi burda aciklanir diye dusundum.
            case 1:                            //Burda gano alamayiz cunku ilk universite zamani burda okulun verdigi o donemin kredileri yazildi.
                System.out.println("Toplam alabileceginiz kredi sayisi 19'dur.");
                break;
            case 2:                              //Ayni sekil 1.sinif oldugu icin burdada notuna gore ekstra kredi veremiyoruz.
                System.out.println("Toplam alabileceginiz kredi sayisi 19'dur,");
                break;
            case 3:
                // Burda aldigi not 3 ve 3.49 arasinda ise +3 bu if'e giriyo
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    this.ogrKredi = 18;            // bu donemin toplam kredisi 18 oldugu icin boyle tanittim.
                    this.ogrKredi += 3;
                    System.out.println("Basarinizdan dolayi +3 kredi daha fazla alabilirsiniz"
                            + " ve toplamda alabileceginiz kredi sayisi " + ogrKredi);

                } else if (this.gano >= 3.5) {             // 3.5 ve ustu oldugunda bu else-if'e girmis olucak.
                    this.ogrKredi = 18;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);


                } else {                             // Egerki soylenen basarilarda bulunmadiysa o donemin kredisini alabilicek.
                    this.ogrKredi = 18;
                    System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                }
                break;
            case 4:// 2.Yil 2.DONEM
                if (gano >= 3.0 && gano <= 3.49) {
                    this.ogrKredi = 18;
                    this.ogrKredi += 3;
                    System.out.println("Basarinizdan dolayi +3 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);
                } else if (gano >= 3.5) {
                    this.ogrKredi = 18;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);

                } else
                    this.ogrKredi = 18;
                System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                break;
            case 5://3.YIL 1.DONEM
                if (gano >= 3.0 && gano <= 3.49) {
                    this.ogrKredi = 17;
                    this.ogrKredi += 3;
                    System.out.println("Basarinizdan dolayi +3 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);
                } else if (gano >= 3.5) {
                    this.ogrKredi = 17;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);

                } else
                    this.ogrKredi = 17;
                System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                break;
            case 6://3.YIL 2.DONEM
                if (gano >= 3.0 && gano <= 3.49) {
                    this.ogrKredi = 17;
                    this.ogrKredi += 3;
                    System.out.println("Ba�arinizdan dolayi +3 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);
                } else if (gano >= 3.5) {
                    this.ogrKredi = 17;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);

                } else
                    this.ogrKredi = 17;
                System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                break;
            case 7://4.YIL 1.DONEM
                if (gano >= 3.0 && gano <= 3.49) {
                    this.ogrKredi = 14;
                    this.ogrKredi += 3;
                    System.out.println("Basarinizdan dolayi +3 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);
                } else if (gano >= 3.5) {
                    this.ogrKredi = 14;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kerdi daha fazla alabilirsiniz ve "
                            + " toplam alabileceginiz kredi sayisi " + ogrKredi);

                } else
                    this.ogrKredi = 14;
                System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                break;
            case 8://4.YIL 2.DONEM
                if (gano >= 3.0 && gano <= 3.49) {
                    this.ogrKredi = 14;
                    this.ogrKredi += 3;
                    System.out.println("Basarinizdan dolayi +3 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);
                } else if (gano >= 3.5) {
                    this.ogrKredi = 14;
                    this.ogrKredi += 6;
                    System.out.println("Basarinizdan dolayi +6 kredi daha fazla alabilirsiniz ve "
                            + " toplamda alabileceginiz kredi sayisi " + ogrKredi);

                } else
                    this.ogrKredi = 14;
                System.out.println("Toplam alabileceginiz kredi sayisi " + ogrKredi);
                break;
            default:
                System.out.println("Gecersiz sayi girdiniz.Lutfen tekrar deneyiniz...");


        }


        return this.ogrKredi;                   /** @return 'int' Burda da hangi case'e girerse ve hangi kosula girerse ordaki degeri donduruyor.*/

    }


    public double Transkript() {
        int sec;                                       /**@param 'int'  sec adinda bir deger tanimladik bu degere konsoldan deger girip switch-case girecek*/
        String ek1, ek2, ek3, ek4, ek5, ek6, ek7, ek8;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hangi donemin transkritptini gormek istedginizi seciniz:");
        System.out.println("1- 1.Donem\n 2- 2.Donem\n 3- 3.Donem\n 4- 4.Donem\n 5- 5.Donem\n 6- 6.Donem\n 7- 7.Donem\n 8- 8.Donem"
                + "\nSeciminiz:");
        sec = input.nextInt();
        switch (sec) {
            case 1:
                System.out.println("Bu donemde aldiginiz dersler : \nB�LG�SAYAR M�HEND�SL���NE G�R��\nMATEMAT�K I\nF�Z�K I\nB�LG�SAYAR PROGRAMLAMA I\nYABANCI D�L I (�NG.)\nT�RK D�L� I ");
                System.out.println("Aldigi toplam ortalama:" + this.gano);
                break;
            case 2:
                System.out.println("Bu donemde aldiginiz dersler: \nL�NEER CEB�R\nMATEMAT�K II\nF�Z�K II\nB�LG�SAYAR PROGRAMLAMA II\nYABANCI D�L II (�NG.)\nT�RK D�L� II ");
                System.out.println("Aldigi toplam ortalama:" + this.gano);
                break;
            case 3:
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +1 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nD�FERANS�YEL DENKLEMLER \nOLASILIK VE �STAT�ST�K\nELEKTR�K M�HEND�SL���N�N TEMELLER� \n" +
                            "NESNE Y�NEL�ML� PROGRAMLAMA \nATAT�RK �LK. VE �NK. TAR�H� I \nSOSYAL SE�MEL� I\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);
                } else if (this.gano >= 3.5) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +2 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nD�FERANS�YEL DENKLEMLER \nOLASILIK VE �STAT�ST�K\nELEKTR�K M�HEND�SL���N�N TEMELLER� \n" +
                            "NESNE Y�NEL�ML� PROGRAMLAMA \nATAT�RK �LK. VE �NK. TAR�H� I \nSOSYAL SE�MEL� I\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);


                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde ald���n�z dersler:\nD�FERANS�YEL DENKLEMLER \nOLASILIK VE �STAT�ST�K\nELEKTR�K M�HEND�SL���N�N TEMELLER� \n" +
                            "NESNE Y�NEL�ML� PROGRAMLAMA \nATAT�RK �LK. VE �NK. TAR�H� I \nSOSYAL SE�MEL� I");
                }
                break;
            case 4:
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +1 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nATAT�RK �LK. VE �NK. TAR�H� II \nAYRIK MATEMAT�K \nELEKTRON�K DEVRELER \n" +
                            "B�LG�SAYAR M�MAR�S� \nVER� YAPILARI VE ALGOR�TMALAR \nG�RSEL PROGRAMLAMA\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);
                } else if (this.gano >= 3.5) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +2 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nATAT�RK �LK. VE �NK. TAR�H� II \nAYRIK MATEMAT�K \nELEKTRON�K DEVRELER \n" +
                            "B�LG�SAYAR M�MAR�S� \nVER� YAPILARI VE ALGOR�TMALAR \nG�RSEL PROGRAMLAMA\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);

                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde ald���n�z dersler:\nATAT�RK �LK. VE �NK. TAR�H� II \nAYRIK MATEMAT�K \nELEKTRON�K DEVRELER \n" +
                            "B�LG�SAYAR M�MAR�S� \nVER� YAPILARI VE ALGOR�TMALAR \nG�RSEL PROGRAMLAMA\n");

                }
                break;
            case 5:
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +1 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\n��LET�M S�STEMLER�\nVER�TABANI Y�NET�M� \nYAZ STAJI I\n" +
                            "MANTIKSAL DEVRE TASARIMI \nSAYISAL ANAL�Z \nB�L���M ET��� VE HUKUKU I\nB�L�M SE�MEL� I \nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7.8)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    ek8 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7 + "\n" + ek8);
                } else if (this.gano >= 3.5) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +2 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\n��LET�M S�STEMLER�\nVER�TABANI Y�NET�M� \nYAZ STAJI I\n" +
                            "MANTIKSAL DEVRE TASARIMI \nSAYISAL ANAL�Z \nB�L���M ET��� VE HUKUKU I\nB�L�M SE�MEL� I \nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7.8)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    ek8 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7 + "\n" + ek8);

                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde ald���n�z dersler:\n��LET�M S�STEMLER�\nVER�TABANI Y�NET�M� \nYAZ STAJI I\n" +
                            "MANTIKSAL DEVRE TASARIMI \nSAYISAL ANAL�Z \nB�L���M ET��� VE HUKUKU I\nB�L�M SE�MEL� I");

                }
                break;
            case 6:
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +1 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nB�L�M DI�I SE�MEL� I \nB�L�M SE�MEL� II \nYAZILIM M�HEND�SL��� \n" +
                            "M�KRO��LEMC�LER \n�STAT�ST�KSEL ANAL�Z \nA� TEKNOLOJ�LER� I\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);
                } else if (this.gano >= 3.5) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra +1 ders daha alabilirsiniz, bunun i�in b�l�m ba�kan�n�z ile ileti�ime ge�iniz.\n" +
                            "Bu donemde alabilece�iniz dersler:\nB�L�M DI�I SE�MEL� I \nB�L�M SE�MEL� II \nYAZILIM M�HEND�SL��� \n" +
                            "M�KRO��LEMC�LER \n�STAT�ST�KSEL ANAL�Z \nA� TEKNOLOJ�LER� I\nHangi dersleri eklemek istiyorsunuz: \n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine(); /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);

                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde ald���n�z dersler:\nB�L�M DI�I SE�MEL� I \nB�L�M SE�MEL� II \nYAZILIM M�HEND�SL��� \n" +
                            "M�KRO��LEMC�LER \n�STAT�ST�KSEL ANAL�Z \nA� TEKNOLOJ�LER� I");

                }
                break;
            case 7:
                if (this.gano >= 3.0 && this.gano <= 3.49) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra 3 ders daha alabilirsiniz.\n Hangi dersleri eklemek istiyorsunuz:");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine();      /**@param 'String' burda ek(1.2.3.4)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek4 = input.nextLine();
                    System.out.println("Bu donemde aldiginiz dersler: \n  Yaz Staji2:\n Bilgisayar Projesi:\n Bolum Secmeli3:"
                            + "\n Bolum Secmeli4:\n Bolum Secmeli5: \n Is Sagligi Ve Guvenligi: \n Sosyal Secmeli2: \n   " + "Ekstra sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4);
                } else if (this.gano >= 3.5) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Basarinizdan dolayi ekstra 6 ders daha alabilirsiniz.Hangi dersleri eklemek istiyorsunuz:");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();
                    ek3 = input.nextLine();
                    ek4 = input.nextLine();    /**@param 'String' burda ek(1.2.3.4.5.6.7)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek5 = input.nextLine();
                    ek6 = input.nextLine();
                    ek7 = input.nextLine();
                    System.out.println("Bu donemde aldiginiz dersler: \n  Yaz Staji2:\n  Bilgisayar Projesi :\n Bolum Secmeli3:"
                            + "\n Bolum Secmeli4:\n Bolum Secmeli5:\n Is Sagligi Guvenligi: \n Sosyal Secmeli2:\n  " + "Ekstra sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3 + "\n" + ek4 + "\n" + ek5 + "\n" + ek6 + "\n" + ek7);

                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde aldiginiz dersler: \n  Yaz Staji2:\n Bilgisayar Projesi:\n Bolum Secmeli3:"
                            + "\n Bolum Secmeli4: \n Bolum Secmeli5: \n Is Sagligi Ve Guvenligi: \n Sosyal Secmeli2: ");

                }
                break;
            case 8:
                if (this.gano < 2.0) {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Alttan kaldiginiz dersleri alin veya Ortalamanizi yukseltmek icin iki adet ders seciniz:\n");
                    ek1 = input.nextLine();
                    ek2 = input.nextLine();   /**@param 'String' burda ek(1.2.3)'ler konsoldan ders girmeleri icin tanimlandi.*/
                    ek3 = input.nextLine();
                    System.out.println("Bu donemde aldiginiz dersler: \nBolum Disi Secmeli2:\nBitirme Projesi:\nBolum Secmeli 6:"
                            + "\nBolum Secmeli7:\nGirisimcilik: \nIs Sagligi Ve Guvenligi2: \n" + "Ekstra alttan sectiginiz dersler:\n"
                            + ek1 + "\n" + ek2 + "\n" + ek3);
                } else {
                    System.out.println("Aldiginiz toplam ortalama: " + this.gano);
                    System.out.println("Bu donemde aldiginiz dersler: \n  Bolum Disi Secmeli2:\n Bitirme Projesi:\n Bolum Secmeli 6:"
                            + "\n Bolum Secmeli7:\n Girisimcilik: \n Is Sagligi Ve Guvenligi2: \n  ");

                }
                break;
            default:
                System.out.println("Gecersiz bir sayi girdiniz.Lutfen 1-8 arasinda bir donem seciniz...");

        }

        return this.ogrKredi; /** @return 'ogrKredi' burda kredi degerini donduruyor */

    }
}