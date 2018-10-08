/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan40.objectorientedwarnakepribadian;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Menampilkan data hasil dari pemilihan Warna 
 * yang disukai oleh User. program ini diselesaikan dengan cara object oriented
 * 
 */
public class PBO310117104Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String warnaK;
        String nama;
        Warna warni = new Warna();
        Scanner scn = new Scanner(System.in);

        System.out.print(Warna.ANSI_RED + "YUK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN + "CEK "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW + "KEPRIBADIANMU "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_CYAN + "DARI "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE + "WARNA "
                + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE + "FAVORITMU "
                + Warna.ANSI_RESET + "\n");

        System.out.print("\n" + Warna.ANSI_RED_BACKGROUND + Warna.ANSI_WHITE
                + "\t MERAH \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_GREEN_BACKGROUND + Warna.ANSI_WHITE
                + "\t HIJAU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_YELLOW_BACKGROUND + Warna.ANSI_WHITE
                + "\t KUNING \t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_BLUE_BACKGROUND + Warna.ANSI_WHITE
                + "\t BIRU \t\t\n" + Warna.ANSI_RESET);
        System.out.print(Warna.ANSI_PURPLE_BACKGROUND + Warna.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + Warna.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaK = scn.next();
        System.out.print("NAMA KAMU : ");
        nama = scn.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        Warna.hasilTest(warnaK);
    }
    
}
