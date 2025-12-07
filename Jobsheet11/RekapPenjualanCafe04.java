package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe04 {

    public static void inputPenjualan(int[][] data, String[] menu, int m, int h, Scanner sc) {
        for (int i = 0; i < m; i++) {
            System.out.println("Input penjualan menu: " + menu[i]);
            for (int j = 0; j < h; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanData(int[][] data, String[] menu, int m, int h) {
        System.out.println("\n=== Data Penjualan ===");
        for (int i = 0; i < m; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < h; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi(int[][] data, String[] menu, int m, int h) {
        int maxTotal = -1;
        int idxMax = 0;

        for (int i = 0; i < m; i++) {
            int total = 0;
            for (int j = 0; j < h; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                idxMax = i;
            }
        }

        System.out.println("\nMenu dengan total tertinggi:");
        System.out.println(menu[idxMax] + " = " + maxTotal);
    }

    public static void rataRata(int[][] data, String[] menu, int m, int h) {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < m; i++) {
            int total = 0;
            for (int j = 0; j < h; j++) {
                total += data[i][j];
            }
            double rata = (double) total / h;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jumlah hari: ");
        int jmlHari = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlMenu];
        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] penjualan = new int[jmlMenu][jmlHari];

        inputPenjualan(penjualan, menu, jmlMenu, jmlHari, sc);
        tampilkanData(penjualan, menu, jmlMenu, jmlHari);
        penjualanTertinggi(penjualan, menu, jmlMenu, jmlHari);
        rataRata(penjualan, menu, jmlMenu, jmlHari);
    }
}
