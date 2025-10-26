import java.util.Scanner;

public class flowchart2A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaSewa, biayaSupir, bahanBakar, lamaSewa, jarakTempuh, totalBiaya;

        // int a = 5;
        // int b = 3;
        // a = b;
  
        System.out.print("\nMasukkan lama sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan jarak tempuh: ");
        jarakTempuh = sc.nextInt();
        System.out.print("Masukkan biaya supir: ");
        biayaSupir = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        bahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + bahanBakar;

        System.out.println("totalBiaya: Rp " + totalBiaya);
        System.out.println("Jarak Tempuh (km):  " + jarakTempuh);
    } 
}