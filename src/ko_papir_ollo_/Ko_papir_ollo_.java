
package ko_papir_ollo_;

import java.util.Scanner;


public class Ko_papir_ollo_ {

    public static void main(String[] args) {
        /*Konzolrol valo beolvasast a Scanner osztaly valositja meg Java nyelven azaz a Java API biztositja.
         A Scanner osztaly hasznalatahoz
         Scanner osztalybol letrehozunk 1 objektumot sc nevvel, majd az sc-n keresztul elerjuk az osztaly szolgaltatasait:
        */
        Scanner sc = new Scanner(System.in);
        
        
        /*kerdes amire varjuk a valaszt*/
        System.out.println("egesz: ");
        /*eltarol megfelelo tipusban a valaszt*/
        int egesz = sc.nextInt();
        /*a bekeres eredmenyenek felhasznalasa*/
        System.out.println("A bekert szam duplaja:" + egesz*2);
        
        /*csak akkor kell ha szam utan szoveget kerunk, mert a szam utani enter (\r\n) "ott marad",ezt olvassa ki*/
        sc.nextLine();
                
        /*kerdes amire varjuk a valaszt*/
        System.out.println("szoveg: ");
        /*eltarol megfelelo tipusban a valaszt*/
        String szoveg = sc.nextLine();
        /*a bekeres eredmenyenek felhasznalasa*/
        System.out.println("A bekert szoveg:" + szoveg);
        
        
        
        
    }
    
}
