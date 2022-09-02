import java.util.Scanner;

public class Kahve {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static Scanner scan = new Scanner(System.in);


    public static void anaMenu() throws InterruptedException {

        System.out.println(ANSI_BLUE + "*********    SEVGININ    ********" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "********* KAHVE DIYARINA ********" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "********** HOSGELDINIZ **********" + ANSI_RESET);
        Thread.sleep(1000);
        System.out.println(ANSI_YELLOW + "=================================" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "   Lutfen Seciminizi Yapiniz" + ANSI_RESET + ANSI_YELLOW +
                "\n=================================\n" + ANSI_RESET +
                "1.Capicuno\n" +
                "2.Mocca\n" +
                "3.Latte\n" +
                "4.Espresso\n" +
                "5.Filtre Kahve\n" +
                "6.Klasik Kahve\n" +
                "7.Sicak Cikolata\n");
        String secim = scan.next();
        switch (secim) {
            case "1":
                scan.nextLine();
                System.out.println(KahveCesidi.getKahve1() + "'nuz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                scan.nextLine();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "2":
                System.out.println(KahveCesidi.getKahve2() + "'niz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "3":
                System.out.println(KahveCesidi.getKahve3() + "'niz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "4":
                System.out.println(KahveCesidi.getKahve4() + "'nuz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "5":
                System.out.println(KahveCesidi.getKahve5() + "'niz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "6":
                System.out.println(KahveCesidi.getKahve6() + "'niz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            case "7":
                System.out.println(KahveCesidi.getKahve7() + "'niz hazirlaniyor");
                kahveBoyutu();
                sutEklemeMenusu();
                sekerEklemeMenusu();
                cikisMenusu();
                break;
            default:
                System.out.println("Yanlis bir secim yaptiniz");
                anaMenu();
        }

    }

    public static void sutEklemeMenusu() throws InterruptedException {
        scan.nextLine();
        System.out.println(ANSI_PURPLE+"Sut eklememizi ister misiniz ?" +ANSI_RESET+
                " \n1-Evet\n2-Hayir    ");
        String sut = scan.next();
        switch (sut) {
            case "1":

                System.out.println("Kahvenize Sut Ekleniyor...");
                Thread.sleep(3000);
                break;
            case "2":

                System.out.println("Kahvenize Sut Eklemedik");
                Thread.sleep(3000);
                break;
            default:
                System.err.println("Yanlis Bir Secim Yaptiniz");
                Thread.sleep(3000);
                sutEklemeMenusu();
        }

    }

    public static void sekerEklemeMenusu() {
        System.out.println(ANSI_PURPLE+"Seker ister misiniz ?" +ANSI_RESET+
                " \n1-Evet\n2-Hayir  ");
        String seker = scan.next();
        if (seker.equalsIgnoreCase("1")) {
            System.out.println("Kac Seker Istersiniz");
            String kacSeker = scan.next();
            System.out.println("Kahvenize " + kacSeker + " adet seker koyduk:)");
        } else System.out.println("Kahvenize seker koymadik:)");
    }

    public static void cikisMenusu() {
        System.out.println("****  Afiyet olsun ****");
        System.out.println("**** Yine Bekleriz ****");
    }

    public static void kahveBoyutu() throws InterruptedException { // todo

        System.out.println(ANSI_PURPLE+"Kahvenizi Hangi Boy Istersiniz" +ANSI_RESET+
                "\n1-Buyuk Boy\n2-Orta Boy\n3-Kucuk Boy");
        String kahveBoyu = scan.next();
        switch (kahveBoyu) {
            case "1":
                System.out.println("Buyuk boy seciminiz alindi");
                Thread.sleep(3000);
                break;
            case "2":
                System.out.println("Orta boy seciminiz alindi");
                Thread.sleep(3000);
                break;
            case "3":
                System.out.println("Kucuk boy seciminiz alindi");
                Thread.sleep(3000);
                break;
            default:
                System.out.println("Yanlis bir secim yaptiniz");
                Thread.sleep(3000);
                kahveBoyutu();
        }


    }
}