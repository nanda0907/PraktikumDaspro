package Jobsheet09;

import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        double[] daftarHarga = { 20000, 22000, 15000, 17000, 13000, 18000, 20000 };
        int totalHarga = 0;

        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp " + daftarHarga[i]);
        }

        System.out.print("Masukkan jumlah jenis pesanan yang ingin di pesan: ");
        int jumlahPesanan = sc.nextInt();

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan menu ke-" + (i + 1) + ": ");
            int pesanan = sc.nextInt();
            totalHarga += daftarHarga[pesanan - 1];
        }

        System.out.println("Total harga: Rp " + totalHarga);
    }
}