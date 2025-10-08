package Jobsheet05;
import java.util.Scanner;
public class PemilihanHariDenganIf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan angka hari (1-7): ");
        int hari = sc.nextInt();

        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}