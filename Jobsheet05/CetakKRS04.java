package Jobsheet05;

import java.util.Scanner;
public class CetakKRS04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variabel UKT Lunas
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT sudah terverifikasi.");
            System.out.println("Silahkan cetak KRS Anda dan minta tanda tangan DPA");
        }
    }
}