public class ContohVariabel04 {
    public static void main(String[] args) {
        String hobi = "Bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println("\nHobi saya adalah " + hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println("Tinggi saya saat ini adalah " + tinggi);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umur, tinggi));
    }
    
}
