package Jobsheet11;

public class PengunjungCafe04 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("\nDaftar Pengunjung Cafe:");
        for(String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        daftarPengunjung();
    }
    
}
