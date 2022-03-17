package nyugtaprojektek;
public class Nyugta3 {
    static int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
    static final String HUF = "Ft";
    static int osszesen = tetel1 + tetel2 + tetel3;
    static int szervizDijMertek = 10;
    static int szervizDij = osszesen / szervizDijMertek;
    
    
    public static void main(String[] args) {
        csillagokKiiratás();
        
        System.out.printf("%14s\n", "Nyugta 3");
        
        csillagokKiiratás();
        
        tetelekKiiratasa();

        duplaszaggatottVonalKiiratás();
        
        osszesenKiiratasa();
        
        szaggatottKiiratasa();
        
        szervizDijKiiratasa();
        
        duplaszaggatottVonalKiiratás();
        
        fizetendoKiiratasa();
        
        szaggatottKiiratasa();
        
        datumEsNevKiiratas();
        
        csillagokKiiratás();    
        
        System.out.println("        CÉG");
        
        csillagokKiiratás();
    }

    private static void csillagokKiiratás() {
        String csillagok = "********************";
        System.out.println(csillagok);
    }

    private static void duplaszaggatottVonalKiiratás() {
        String duplaVonal = "====================";
        System.out.println(duplaVonal);
    }

    private static void szaggatottKiiratasa() {
        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);
    }

    private static void tetelekKiiratasa() {
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

    private static void szervizDijKiiratasa() {
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
    }

    private static void osszesenKiiratasa() {
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
    }

    private static void fizetendoKiiratasa() {
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
    }

}
