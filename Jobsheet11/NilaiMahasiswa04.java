package Jobsheet11;

import java.util.Scanner;
public class NilaiMahasiswa04 {

    public static void isianArray(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("\nMasukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int nilai : arr) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = sc.nextInt();
        int[] nilaiMahasiswa = new int[n];

        isianArray(nilaiMahasiswa, n, sc);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
