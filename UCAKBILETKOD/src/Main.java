import java.util.Scanner;

 class main {
    public static void main(String[] args) {
        int km, yas, yolculukTip;
        double perKm = 0.10, normalTutar, iTutar, yasiTutar, ggitutar, total;

        Scanner input = new Scanner(System.in);
        System.out.print(" Mesafeyi Giriniz : ");
        km = input.nextInt();


        System.out.print("Yaşınız : ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Belirtiniz   ");
        System.out.print("Tek Yön için 1  Gidiş Dönüş İçin 2 :");
        yolculukTip = input.nextInt();

        if (yas > 0 && km > 0) {

            switch (yolculukTip) {
                case 1 -> {
                    if (yas <= 12) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.05;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret : " + iTutar + "TL");

                    } else if (yas <= 24) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret : " + iTutar + "Tl");

                    } else if (yas <= 65) {
                        normalTutar = (km * perKm);
                        System.out.println("Toplam Ücret : " + normalTutar + "TL");

                    } else {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam Ücret" + iTutar + "TL");
                    }
                }
                case 2 -> {
                    if (yas <= 12) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.5;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if ((yas >= 12) && (yas <= 24)) {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if (yas < 65) {
                        normalTutar = (km * perKm);
                        ggitutar = normalTutar * 0.2;
                        total = normalTutar - ggitutar;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else {
                        normalTutar = (km * perKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar);
                        System.out.println("Toplam Ücret : " + total + "TL");
                    }

                }
                default -> System.out.println("Hatalı Giriş Yaptınız.");
            }
        } else {
            System.out.println("Geçersiz Değer Girdiniz.");
        }

    }
}