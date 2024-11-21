package ko_papir_ollo_;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class KoPapirOllo {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ko, papir, ollo?: ");
//        String kpo = sc.nextLine();

//        String kpo;
//        kpo = val();

//        int ko = 0;
//        int papir = 0;
//        int ollo = 0;
//        int val = 0;
//        if (kpo.equals("ko")) {
//            val += 1;
//        } else if (kpo.equals("papir")) {
//            val += 2;
//        } else if (kpo.equals("ollo")) {
//            val += 3;
//        }
        int val;
        val = valertek();

//        int gepko = 0;
//        int geppapir = 0;
//        int gepollo = 0;
        int gepval = 0;

        int szam;
//        Random rnd = new Random();
//        szam = rnd.nextInt(1, 3);
        szam = random();
        if (szam == 1) {
            gepval += 1;
        } else if (szam == 2) {
            gepval += 2;
        } else {
            gepval += 3;
        }

        String gepkpo = "";
        String nyeres = "";

        if (val == 1) {
            if (gepval == 2) {
                gepkpo = "papir";
                nyeres = "veszitettel";

            } else if (gepval == 3) {
                gepkpo = "ollo";
                nyeres = "nyertel";

            } else {
                gepkpo = "ko";
                nyeres = "egyenlo";
            }

        } else if (val == 2) {
            if (gepval == 1) {
                gepkpo = "ko";
                nyeres = "nyertel";

            } else if (gepval == 3) {
                gepkpo = "papir";
                nyeres = "veszitettel";
            } else {
                gepkpo = "ko";
                nyeres = "egyenlo";
            }
            if (val == 3) {
                if (gepval == 1) {
                    gepkpo = "ko";
                    nyeres = "veszitettel";

                } else if (gepval == 2) {
                    gepkpo = "papir";
                    nyeres = "nyertel";
                }

            }
        } else {
            if (gepval == 1) {
                gepkpo = "ko";
                nyeres = "veszitettel";

            } else if (gepval == 2) {
                gepkpo = "papir";
                nyeres = "nyertel";
            } else {
                gepkpo = "ollo";
                nyeres = "egyeno";
            }

        }

        System.out.println("A gep valasztasa: " + gepkpo);
        System.out.println("Az eredmeny: " + nyeres);

    }

    private static int random() {
        int szam;
        Random rnd = new Random();
        szam = rnd.nextInt(1, 3);
        return szam;
    }

    private static String val() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ko, papir, ollo?: ");
        String kpo = sc.nextLine();
//        if (kpo.equals("")) {
//            String cim = "Ures";
//            String uzenet = "Irj be egy valaszt!";
//            int gombok = JOptionPane.OK_CANCEL_OPTION;
//            int valasz = JOptionPane.showConfirmDialog(null, uzenet, cim, gombok);
//
//            if (valasz == JOptionPane.OK_OPTION) {
//                System.out.println("Ko, papir, ollo?: ");
//                kpo = sc.nextLine();
//            }
//        }

        return kpo;
    }

    private static int valertek() {
        String kpo;
        kpo = val();

        int val = 0;
        if (kpo.equals("ko")) {
            val += 1;
        } else if (kpo.equals("papir")) {
            val += 2;
        } else if (kpo.equals("ollo")) {
            val += 3;
        }
        return val;

    }
}
