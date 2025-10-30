package Jobsheet07;

import java.util.Scanner;
public class TukangParkir04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jenis;
        int total = 0;
        int durasi;

        do {
            System.out.println("\nMasukkan jenis kendaraan (1 mobil, 2 motor, 0 untuk keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid, masukkan lagi jenis yang valid!!.");
                continue;
            }
            System.out.println("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
        }while (jenis != 0);

        System.out.println("Total pendapatan parkir: Rp " + total);
    }
}
