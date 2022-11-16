import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5.00, toplam;
        int armutK, elmaK, domatesK, muzK, patlicanK;

        Scanner armutkg = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        armutK = armutkg.nextInt();

        Scanner elmakg = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo? : ");
        elmaK = elmakg.nextInt();

        Scanner domateskg = new Scanner(System.in);
        System.out.print("Domates Kaç Kilo? : ");
        domatesK = domateskg.nextInt();

        Scanner muzkg = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo? : ");
        muzK = muzkg.nextInt();

        Scanner patlicankg = new Scanner(System.in);
        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanK = patlicankg.nextInt();

        toplam = (armutK * armutF) + (elmaK * elmaF) + (domatesK * domatesF) + (muzK * muzF) + (patlicanK * patlicanF);

        System.out.println("Toplam Tutar : " + toplam + "TL");
    }
}
