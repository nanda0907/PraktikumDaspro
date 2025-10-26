package Praktikum06;

import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh;
        double totalBiaya;
        String jenisBahanBakar;

        System.out.print("\nMasukkan lama sewa: ");
        lamaSewa = sc.nextInt();

        if (lamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari!");
            return;
        }

        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();
        System.out.print("Masukkan jenis bahan bakar (Pertalite/Pertamax): ");
        jenisBahanBakar = sc.next();

        if (jenisBahanBakar.equalsIgnoreCase("Pertalite")) {
            bahanBakar = 1000 * jarakTempuh;
        } else if (jenisBahanBakar.equalsIgnoreCase("Pertamax")) {
            bahanBakar = 1300 * jarakTempuh;
        } else {
            System.out.println("Jenis bahan bakar tidak valid. Gunakan Pertalite atau Pertamax!");
            return;
        }

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        totalBiaya = biayaSewa + biayaSupir + bahanBakar;

        if (totalBiaya > 2000000) {
            totalBiaya = totalBiaya - (totalBiaya * 0.05);
            System.out.println("Anda mendapatkan diskon 5%");
        }

        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Biaya Supir: Rp " + biayaSupir);
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
