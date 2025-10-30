package Jobsheet07;

import java.util.Scanner;
public class TugasBioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0;
        double totalHarga = 0;
        int hargaTiket = 50000;

        while (true) {
            System.out.println("\nMasukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan lagi jumlah yang valid!!.");
                continue;
            }

            double totalHargaPembelian = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHargaPembelian *= 0.85;
            }else if (jumlahTiket > 4) {
                totalHargaPembelian *= 0.90;
            }

            totalHarga += totalHargaPembelian;
            totalTiket += jumlahTiket;

            System.out.println("Total harga untuk pelanggan ini: Rp " + totalHargaPembelian );
        }

        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total pendapatan bioskop: Rp " + (int) totalHarga);
    }
}
