package Jobsheet08;

import java.util.Scanner;
public class Star04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
                System.out.print("*");
            }        
    }
}
