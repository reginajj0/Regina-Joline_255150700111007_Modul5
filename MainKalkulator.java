package PraktikumPemlan.Modul5.SoalPraktikum.No1;

import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // penjumlahan
        System.out.print("Masukkan nilai 1 (penjumlahan): ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai 2 (penjumlahan): ");
        int b = in.nextInt();
        Kalkulator.penjumlahan(a, b);

        // pengurangan
        System.out.print("Masukkan nilai 1 (pengurangan): ");
        int c = in.nextInt();
        System.out.print("Masukkan nilai 2 (pengurangan): ");
        int d = in.nextInt();
        Kalkulator.pengurangan(c, d);

        // perkalian
        System.out.print("Masukkan nilai 1 (perkalian): ");
        int e = in.nextInt();
        System.out.print("Masukkan nilai 2 (perkalian): ");
        int f = in.nextInt();

        Kalkulator obj = new Kalkulator();
        obj.perkalian(e, f);

        // pembagian
        System.out.print("Masukkan nilai 1 (pembagian): ");
        int g = in.nextInt();
        System.out.print("Masukkan nilai 2 (pembagian): ");
        int h = in.nextInt();

        double hasil = obj.pembagian(g, h);
        System.out.println("Hasil pembagian: " + hasil);

        // penyederhanaan pecahan
        System.out.print("Masukkan pembilang: ");
        int p = in.nextInt();
        System.out.print("Masukkan penyebut: ");
        int q = in.nextInt();

        obj.sederhana(p, q);

        in.close();
    }
}