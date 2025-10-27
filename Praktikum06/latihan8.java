package Praktikum06;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetak;
        int totalBerat;
        int biayaJilid;
        int halaman;
        int lembar;
        int beratKertas;
        int biayaOngkir;
        int totalBiaya;
        int biayaCover = 0;
        int beratCover = 0;
        String jenisCover;

        System.out.println("Masukkan jumlah halaman = ");
        halaman = sc.nextInt();

        System.out.println("Masukkan jenis cover (hard/soft) = ");
        jenisCover = sc.next();

        if (jenisCover.equalsIgnoreCase("hard")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equalsIgnoreCase("soft")) {
            biayaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak ditemukan");
            return;
        }
        
        biayaCetak = halaman * 200;

        lembar = halaman / 2;
        if (halaman % 2 != 0) {
            lembar = lembar + 1;
        }

        beratKertas = lembar * 3;
        totalBerat = beratKertas + beratCover + 300;
        int beratKg = totalBerat / 1000;
        if (totalBerat % 1000 != 0) {
            beratKg = beratKg + 1;
        }
        biayaOngkir = beratKg * 15000;
        biayaJilid = biayaCover;
        totalBiaya = biayaCetak + biayaJilid + biayaOngkir;

        System.out.println("Total biaya cetak = Rp " + totalBiaya);
    }
}
