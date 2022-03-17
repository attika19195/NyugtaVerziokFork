package nyugtaprojektek;
public class Nyugta3 {

    public static void main(String[] args) {
        csillagok();
        
        System.out.printf("%14s\n", "Nyugta 3");
        
        csillagok();
        
        final String HUF = "Ft";
        
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        
        tetelekKiiratasa(tetel1, tetel2,tetel3,HUF);

        duplaszaggatott();
        
        int osszesen = osszesen(tetel1, tetel2,tetel3,HUF);
        
        szaggatott();
        
        int szervizDij = szervizDij(osszesen, HUF);
        
        duplaszaggatott();
        
        fizetendo(osszesen, szervizDij, HUF);
        
        szaggatott();
        
        datumEsNevKiiratas();
        
        csillagok();    
        
        System.out.println("        CÉG");
        
        csillagok();
    }

    private static void csillagok() {
        String csillagok = "********************";
        System.out.println(csillagok);
    }

    private static void duplaszaggatott() {
        String duplaVonal = "====================";
        System.out.println(duplaVonal);
    }

    private static void szaggatott() {
        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);
    }

    private static void tetelekKiiratasa(int tetel1, int tetel2, int tetel3, String HUF) {
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
    }

    private static void datumEsNevKiiratas() {
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
    }

    private static int szervizDij(int osszesen, String HUF) {
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        return szervizDij;
    }

    private static int osszesen(int tetel1, int tetel2, int tetel3, String HUF) {
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        return osszesen;
    }

    private static void fizetendo(int osszesen, int szervizDij, String HUF) {
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
    }

}
