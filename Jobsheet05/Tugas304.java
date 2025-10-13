package Jobsheet05;

import java.util.Scanner;

public class Tugas304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, B, C;
        System.out.print("\nMasukkan bilangan A: ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan B: ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan C: ");
        C = sc.nextInt();

        // Menentukan bilangan maksimum
        if (A > B) {
            if (A > C) {
                System.out.println("Bilangan Maksimum = A (" + A + ")");
            } else {
                System.out.println("Bilangan Maksimum = C (" + C + ")");
            }
        } else if (B > C) {
            System.out.println("Bilangan Maksimum = B (" + B + ")");
        } else {
            System.out.println("Bilangan Maksimum = C (" + C + ")");
        }

        // Menentukan bilangan minimum
        if (A < B) {
            if (A < C) {
                System.out.println("Bilangan Minimum = A (" + A + ")");
            } else {
                System.out.println("Bilangan Minimum = C (" + C + ")");
            }
        } else if (B < C) {
            System.out.println("Bilangan Minimum = B (" + B + ")");
        } else {
            System.out.println("Bilangan Minimum = C (" + C + ")");
        }
    }
}