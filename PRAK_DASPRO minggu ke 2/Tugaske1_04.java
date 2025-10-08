import java.util.Scanner;

public class Tugaske1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok, jumlahAnak, tunjangan, totalTunjangan, gajiKotor, gajiBersih;
        double persenPensiun = 0.05, potonganPensiun;

        System.out.print("\nMasukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();
        System.out.print("Masukkan tunjangan per anak: ");
        tunjangan = sc.nextInt();

        totalTunjangan = tunjangan * jumlahAnak;
        potonganPensiun = gajiPokok * persenPensiun;
        gajiKotor = gajiPokok + totalTunjangan;
        gajiBersih = (int) (gajiKotor - potonganPensiun);

        System.out.println("Gaji bersih: " + gajiBersih); 
    }
}
