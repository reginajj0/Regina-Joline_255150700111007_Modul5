package PraktikumPemlan.Modul5.SoalPraktikum.No2;

import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Jaket j = new Jaket();

        System.out.print("Jumlah jaket A: ");
        int a = input.nextInt();

        System.out.print("Jumlah jaket B: ");
        int b = input.nextInt();

        System.out.print("Jumlah jaket C: ");
        int c = input.nextInt();

        int totalA = j.hitungJaketA(a);
        int totalB = j.hitungJaketB(b);
        int totalC = j.hitungJaketC(c);

        int total = totalA + totalB + totalC;

        System.out.println("Total harga jaket A: " + totalA);
        System.out.println("Total harga jaket B: " + totalB);
        System.out.println("Total harga jaket C: " + totalC);
        System.out.println("Total keseluruhan  : " + total);

        input.close();
    }
}
