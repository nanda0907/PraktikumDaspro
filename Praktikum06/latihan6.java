package Praktikum06;

import java.util.Scanner;
public class latihan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayaListrik, penggunaanKwh;
        double tarifListrik = 0, biayaListrik, biayaTetap, pajak, totalBiaya, PPN;

        System.out.print("\nMasukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500 VA): ");
        dayaListrik = sc.nextInt();

        switch (dayaListrik) {
            case 900:
                tarifListrik = 1300;
                break;
            case 1300:
            case 2200:
                tarifListrik = 1500;
                break;
            case 3500:
            case 5500:
                tarifListrik = 1700;
                break;
            default:
                System.out.println("Daya yang dimasukkan tidak valid!");
                return;
        }

        System.out.println("Masukkan jumlah penggunaan listrik (kWh): ");
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

        System.out.println("Daya listrik: " + dayaListrik + " VA");
        System.out.println("Tarif per kWh: " + (int) tarifListrik);
        System.out.println("Biaya listrik: " + (int) biayaListrik);
        System.out.println("PPN: " + (int) pajak);
        System.out.println("Total Biaya: Rp " + (int) totalBiaya);
     }
}
