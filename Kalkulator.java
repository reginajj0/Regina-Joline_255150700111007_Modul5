package PraktikumPemlan.Modul5.SoalPraktikum.No1;

public class Kalkulator {

    // static method
    public static void penjumlahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void pengurangan(int a, int b){
        int hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    // non static method
    public void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }

    public double pembagian(int a, int b){
        return (double) a / b;
    }

    // method sederhana pecahan (non static)
    public void sederhana(int pembilang, int penyebut){
        int a = pembilang;
        int b = penyebut;

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        int fpb = a;

        pembilang /= fpb;
        penyebut /= fpb;

        System.out.println("Hasil sederhana: " + pembilang + "/" + penyebut);
    }
}

