import java.util.Scanner;

public class Tugaske2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjangTanah, lebarTanah, diameterKolam, sisiKolam;
        double luasTanah, kolamLingkaran, kolamPersegi, luasRumput;

        System.out.print("\nMasukkan panjang tanah: ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam lingkaran: ");
        diameterKolam = sc.nextInt();
        System.out.print("Masukkan panjang sisi kolam persegi: ");
        sisiKolam = sc.nextInt();

        luasTanah = panjangTanah * lebarTanah;
        kolamLingkaran = 3.14 * (diameterKolam / 2.0) * (diameterKolam / 2.0);
        kolamPersegi = sisiKolam * sisiKolam;
        luasRumput = luasTanah - (kolamLingkaran + kolamPersegi);

        System.out.println("Luas tanah yang akan ditanami rumput: " + luasRumput);
    }
}