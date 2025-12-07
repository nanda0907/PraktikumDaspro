package Jobsheet11;

import java.util.Scanner;

public class Kafe04 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member. Dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            totalKeseluruhan += hitungTotalHarga04(pilihanMenu, banyakItem);
        }

        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = sc.next();

        // Terapkan diskon
        totalKeseluruhan = terapkanDiskon(totalKeseluruhan, kodePromo);

        System.out.println("TOTAL KESELURUHAN PESANAN: Rp " + totalKeseluruhan);
    }

    public static int hitungTotalHarga04(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Menu tidak valid! Harga dianggap 0.");
            return 0;
        }

        int harga = hargaItems[pilihanMenu - 1] * banyakItem;

        System.out.println("Subtotal menu ini: Rp " + harga);
        return harga;
    }

    public static int terapkanDiskon(int total, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            total *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            total *= 0.7;
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return total;
    }
}
