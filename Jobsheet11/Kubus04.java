package Jobsheet11;

public class Kubus04 {
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume: " + hitungVolume(sisi));
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan(sisi));
    }
}
