package Praktikum06;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int halaman;
        double biayaCetak, biayaJilid;
        double ongkir, totalBiaya;
        double beratTotal, beratKg;
        double biayaPerHalaman = 200;
        double beratPerLembar = 3; 
        double beratCover = 0; 
        double beratKemasan = 300; 
        double ongkirPerKg = 15000;
        String jenisCover;

        System.out.print("\nMasukkan jumlah halaman: ");
        halaman = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan jenis cover (hard/soft): ");
        jenisCover = sc.nextLine().toLowerCase();

        if (jenisCover.equals("hard")) {
            biayaJilid = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaJilid = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid! Gunakan 'hard' atau 'soft'.");
            return;
        }

        double lembar = halaman / 2.0;
        if (lembar > (int) lembar) {
            lembar = (int) lembar + 1;
        }

        beratTotal = (lembar * beratPerLembar) + beratCover + beratKemasan;

       
        beratKg = beratTotal / 1000.0;
        if (beratKg > (int) beratKg) {
            beratKg = (int) beratKg + 1;
        }

        biayaCetak = halaman * biayaPerHalaman;
        ongkir = beratKg * ongkirPerKg;

      
        totalBiaya = biayaCetak + biayaJilid + ongkir;

        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Jenis cover    : " + jenisCover + " cover");
        System.out.println("Jumlah lembar  : " + (int) lembar);
        System.out.println("Berat total    : " + beratTotal + " gram");
        System.out.println("Berat (kg)     : " + (int) beratKg + " kg");
        System.out.println("Biaya cetak    : Rp " + (int) biayaCetak);
        System.out.println("Biaya jilid    : Rp " + (int) biayaJilid);
        System.out.println("Ongkir         : Rp " + (int) ongkir);
        System.out.println("TOTAL BIAYA    : Rp " + (int) totalBiaya);
    }
}
