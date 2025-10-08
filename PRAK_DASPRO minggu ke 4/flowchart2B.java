import java.util.Scanner;

public class flowchart2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayaListrik, biayaListrik;
        double PPN = 0.1;
        double biayaTetap;
        double tarifListrik = 1500;
        double totalBiaya;
        double pajak;

        System.out.println("\nMasukkan daya listrik: ");
        dayaListrik = sc.nextInt();

        biayaListrik = (int) tarifListrik * dayaListrik;
        biayaTetap = biayaListrik + 50000;
        pajak = biayaTetap * PPN;
        totalBiaya = biayaTetap + pajak;

        System.out.println("totalBiaya: Rp " + (int) totalBiaya);
    }
}
