package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int input = 0;

        while (input != 3) {
            System.out.println("Input Menu: ");
            input = sc.nextInt();
            sc.nextLine();

            if (input == 1) {
                System.out.println("Masukkan baris (0-3): ");
                int baris = sc.nextInt();
                System.out.println("Masukkan kolom (0-1): ");
                int kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 0 || baris > 3 || kolom < 0 || kolom > 1) {
                    System.out.println("Baris atau kolom tidak tersedia.");
                    continue;
                }
                if (penonton[baris][kolom] != null) {
                    System.out.println("Kursi sudah terisi.");
                    continue;
                }

                System.out.println("Masukkan nama penonton: ");
                String nama = sc.nextLine();
                penonton[baris][kolom] = nama;

            } else if (input == 2) {
                System.out.println("\n=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {

                    // PERBAIKAN DI SINI:
                    System.out.print("Baris " + i + ": ");

                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("****");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }

            } else if (input == 3) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Input tidak valid.");
            }
        }
    }
}
