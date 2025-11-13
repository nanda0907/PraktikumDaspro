package Jobsheet09;

import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rataRata;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }
        rataRata = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa adalah "+rataRata);
    }
}
