
package Praktikum06;
import java.util.Scanner;
public class latihan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaPublikasi = 300000;
        int dekorasi = 500000;
        int konsumsiPJ = 500000;
        int hadiah = 4000000;
        int biayaOperasional = 500000;
        int konsumsiPeserta;
        int honor;
        int jumlahTim;
        int jumlahPeserta = 3;
        int biayaPendaftaran = 50000;
        int totalAnggaran;
        int totalSemua;
        double danaPolinema = 0.6;
        double sponsorship;
        double persenBantuan = 0;

        System.out.print("\nMasukkan jumlah tim yang ikut: ");
        jumlahTim = sc.nextInt();

        jumlahPeserta = jumlahTim * 3;
        konsumsiPeserta = jumlahPeserta * 25000;
        honor = jumlahTim * 75000;
        totalAnggaran = biayaPublikasi + dekorasi + konsumsiPJ + hadiah + biayaOperasional + konsumsiPeserta;
        totalSemua = totalAnggaran + honor;

        System.out.print("Apakah Polinema memberi dana bantuan? (ya/tidak): ");
        String jawaban = sc.next();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase dana bantuan: ");
            persenBantuan = sc.nextDouble();
            danaPolinema = totalSemua * (persenBantuan / 100);
        } else {
            danaPolinema = 0;
        }

        biayaPendaftaran = jumlahTim * 50000;

        sponsorship = totalSemua - danaPolinema - biayaPendaftaran;

        System.out.println("Total Anggaran: " + (int) totalAnggaran);
        System.out.println("Dana Polinema: " + (int) danaPolinema);
        System.out.println("Dana yang perlu dipenuhi dari sponsorship: Rp " + sponsorship);
        System.out.println("Totalan Semua: " + (int) totalSemua);

    }
}