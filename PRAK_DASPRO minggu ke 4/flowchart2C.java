import java.util.Scanner;
public class flowchart2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaPublikasi = 300000;
        int dekorasi = 500000;
        int konsumsiPJ = 500000;
        int hadiah = 4000000;
        int biayaOperasional = 500000;
        int konsumsiPeserta;
        int honororium;
        int jumlahTim;
        int jumlahPeserta = 3;
        int biayaPendaftaran = 50000;
        int totalAnggaran;
        int totalSemua;
        double danaPolinema = 0.6;
        double sponsorship;

        System.out.print("\nMasukkan jumlah tim yang ikut: ");
        jumlahTim = sc.nextInt();

        jumlahPeserta = jumlahTim * 3;
        konsumsiPeserta = jumlahPeserta * 25000;
        honororium = jumlahTim * 75000;
        totalAnggaran = biayaPublikasi + dekorasi + konsumsiPJ + hadiah + biayaOperasional + konsumsiPeserta;
        totalSemua = totalAnggaran + honororium;
        danaPolinema = totalSemua * 0.6;
        biayaPendaftaran = jumlahTim * 50000;

        sponsorship = totalSemua - danaPolinema - biayaPendaftaran;
        System.out.println("Dana Polinema: " + (int) danaPolinema);
        System.out.println("Sponsorship: " + (int) sponsorship);
        System.out.println("Totalan Semua: " + (int) totalSemua);

    }
}