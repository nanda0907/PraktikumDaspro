package Jobsheet09;

import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        int nilaiTertinggi = nilaiMhs[0], nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (i == 0) {
                nilaiTertinggi = nilaiMhs[i];
                nilaiTerendah = nilaiMhs[i];
            } else {
                if (nilaiMhs[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[i];
                } else if (nilaiMhs[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiMhs[i];
                }
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i] + " (Lulus)");
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = (jumlahLulus > 0) ? (totalLulus / jumlahLulus) : 0;
        double rataRataTidakLulus = (jumlahTidakLulus > 0) ? (totalTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata-rata nilai mahasiswa lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + rataRataTidakLulus);
        System.out.println("Nilai Tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai Terendah = " + nilaiTerendah);
    }
}
