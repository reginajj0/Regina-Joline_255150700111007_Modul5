package PraktikumPemlan.Modul5.SoalPraktikum.No2;

public class Jaket {

    private final int hargaA = 100000;
    private final int hargaB = 125000;
    private final int hargaC = 175000;

    public int hitungJaketA(int jumlah){
        if(jumlah > 100){
            return jumlah * 95000;
        } else {
            return jumlah * hargaA;
        }
    }

    public int hitungJaketB(int jumlah){
        if(jumlah > 100){
            return jumlah * 120000;
        } else {
            return jumlah * hargaB;
        }
    }

    public int hitungJaketC(int jumlah){
        if(jumlah > 100){
            return jumlah * 160000;
        } else {
            return jumlah * hargaC;
        }
    }
}