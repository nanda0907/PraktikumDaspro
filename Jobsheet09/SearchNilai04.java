package Jobsheet09;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan banyaknya nilai yang diinput: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();

        int posisi = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (key == nilai[i]) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (posisi + 1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
