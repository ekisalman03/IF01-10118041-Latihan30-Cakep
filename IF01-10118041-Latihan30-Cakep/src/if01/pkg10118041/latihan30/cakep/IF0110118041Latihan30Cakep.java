/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan30.cakep;
import java.util.Scanner;
/**

 * Nama      : Eki salman sya'bani

 * Kelas     : IF-1

 * NIM       : 10118041

 * Deskripsi : Cakep

 * @author Eki

 */

public class IF0110118041Latihan30Cakep {



    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //var
        String konfirmasi, kondisi;
        Scanner masuk = new Scanner(System.in);

        //input

        System.out.println(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + BLUE + "latihan 30 ini?");
        System.out.print(BLUE + "Jawab " + RED + "(Yoi/Enggak) : ");
        konfirmasi = masuk.nextLine();
        kondisi = konfirmasi.toUpperCase();

        //logic
        if (kondisi.equals("YOI")) {
            System.out.println(RED + "\nCakep bener. " + PURPLE + "Good Job");
        } else {
            System.out.println("\nTetep cakep sih." + RED);
            System.out.println(CYAN + "Sing penting paham konsep nya ye");
            System.out.println("Keep the code works dude");
    }

    }

}