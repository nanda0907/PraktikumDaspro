package Jobsheet07;
import java.util.Scanner;
public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.println("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); 
        } while (true);

        System.out.println("Semua transaksi selesai. Terima kasih!");
    }
}
