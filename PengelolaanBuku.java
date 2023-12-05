import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku '" + judul + "' telah dipinjam.");
        } else {
            System.out.println("Buku '" + judul + "' sedang tidak tersedia.");
        }
    }

    public void kembalikan() {
        dipinjam = false;
        System.out.println("Buku '" + judul + "' telah dikembalikan.");
    }

    public void tampilkanInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }
}

public class PengelolaanBuku {
    public static void main(String[] args) {
        // Membuat beberapa objek buku
        Buku buku1 = new Buku("Confession", "Kanae Minato", 2008);
        Buku buku2 = new Buku("Penance", "Kanae Minato", 2020);
        Buku buku3 = new Buku("Your name", "Makoto Shinkai", 2020);

        // Menambahkan buku-buku ke dalam ArrayList
        ArrayList<Buku> koleksiBuku = new ArrayList<>();
        koleksiBuku.add(buku1);
        koleksiBuku.add(buku2);
        koleksiBuku.add(buku3);

        // Menampilkan informasi buku
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : koleksiBuku) {
            buku.tampilkanInformasi();
            System.out.println();
        }

        // Meminjam buku
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judulPeminjaman = scanner.nextLine();

        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judulPeminjaman)) {
                buku.pinjam();
                break;
            }
        }
    }
}
