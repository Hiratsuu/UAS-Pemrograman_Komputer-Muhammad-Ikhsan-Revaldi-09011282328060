import java.util.Scanner;

public class HargaSetelahDiskon {
    public static void main(String[] args) {
        Scanner barangScanner = new Scanner(System.in);

        // memasukkan jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = barangScanner.nextInt();

        // memasukkan harga per barang
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = barangScanner.nextDouble();

        // menghitung total harga sebelum diskon
        double totalHargaSebelumDiskon = jumlahBarang * hargaPerBarang;

        // menghitung diskon berdasarkan jumlah pembelian
        double diskon = 0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1; // Diskon 10%
        } else if (jumlahBarang > 20) {
            diskon = 0.2; // Diskon 20%
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHargaSebelumDiskon - (totalHargaSebelumDiskon * diskon);

        // Tampilkan hasil
        System.out.println("Total harga sebelum diskon: " + totalHargaSebelumDiskon);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);
    }
}
