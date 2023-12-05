import java.util.ArrayList;
import java.util.Scanner;

class Akun {
    private String username;
    private String password;
    private boolean aktif;

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true; // Akun diaktifkan secara default
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void aktifkan() {
        aktif = true;
        System.out.println("Akun '" + username + "' telah diaktifkan.");
    }

    public void nonaktifkan() {
        aktif = false;
        System.out.println("Akun '" + username + "' telah dinonaktifkan.");
    }

    public void tampilkanInformasi() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }
}

public class MengelolaAkun {
    private static final ArrayList<Akun> daftarAkun = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            tampilkanMenu();

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline setelah membaca integer

            switch (pilihan) {
                case 1:
                    buatAkun();
                    break;
                case 2:
                    tampilkanAkun();
                    break;
                case 3:
                    autentikasiAkun();
                    break;
                case 4:
                    kelolaAkun();
                    break;
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("---------Menu Akun-----------");
        System.out.println("1. Bikin Akun");
        System.out.println("2. Daftar Akun");
        System.out.println("3. Autentikasi Akun");
        System.out.println("4. Kelola Akun");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    private static void buatAkun() {
        System.out.print("Masukkan username baru: ");
        String username = scanner.nextLine();

        // Cek apakah username sudah ada
        if (cariAkun(username) == null) {
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            Akun akunBaru = new Akun(username, password);
            daftarAkun.add(akunBaru);
            System.out.println("Akun berhasil dibuat.");
        } else {
            System.out.println("Username sudah ada. Gagal membuat akun.");
        }
    }

    private static void tampilkanAkun() {
        System.out.println("\nDaftar Akun Pengguna:");
        if (daftarAkun.isEmpty()) {
            System.out.println("Belum ada akun yang dibuat.");
        } else {
            for (Akun akun : daftarAkun) {
                akun.tampilkanInformasi();
                System.out.println();
            }
        }
    }

    private static void autentikasiAkun() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        Akun akun = cariAkun(username);

        if (akun != null && akun.isAktif()) {
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (akun.getPassword().equals(password)) {
                System.out.println("Autentikasi Berhasil.");
            } else {
                System.out.println("\u001B[31mAutentikasi Gagal. Password salah.\u001B[0m");
            }
        } else {
            System.out.println("\u001B[31mAutentikasi Gagal. Akun tidak ditemukan atau tidak aktif.\u001B[0m");
        }
    }

    private static void kelolaAkun() {
        System.out.print("Masukkan username akun yang ingin diaktifkan/nonaktifkan: ");
        String usernamePilihan = scanner.nextLine();

        Akun akun = cariAkun(usernamePilihan);

        if (akun != null) {
            if (akun.isAktif()) {
                akun.nonaktifkan();
            } else {
                akun.aktifkan();
            }
        } else {
            System.out.println("Akun tidak ditemukan.");
        }
    }

    private static Akun cariAkun(String username) {
        for (Akun akun : daftarAkun) {
            if (akun.getUsername().equalsIgnoreCase(username)) {
                return akun;
            }
        }
        return null;
    }
}
