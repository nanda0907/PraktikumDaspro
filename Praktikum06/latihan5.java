package Praktikum06;

import java.util.Scanner;
public class latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int dayaListrik, penggunaanKwh;
        double tarifListrik = 0, biayaListrik, biayaTetap, pajak, totalBiaya, PPN;

        System.out.print("\nMasukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500 VA): ");
        dayaListrik = sc.nextInt();

        if (dayaListrik == 900) {
            tarifListrik = 1300;
        } else if (dayaListrik == 1300 || dayaListrik == 2200) {
            tarifListrik = 1500;
        } else if (dayaListrik == 3500 || dayaListrik == 5500) {
            tarifListrik = 1700;
        } else {
            System.out.println("Daya listrik tidak tersedia!");
            return;
        }

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanKwh = sc.nextInt();

        biayaListrik = tarifListrik * penggunaanKwh;
        biayaTetap = biayaListrik + 50000;

        if (biayaTetap >= 2000000) {
            PPN = 0.1;
        } else {
            PPN = 0.15;
        }

        pajak = biayaTetap * PPN;
        totalBiaya = biayaTetap + pajak;

        System.out.println("Tarif per kWh: " + (int) tarifListrik);
        System.out.println("Biaya listrik: " + (int) biayaListrik);
        System.out.println("Total biaya      : Rp " + (int) totalBiaya);
    }
}