import java.util.Scanner;

public class Autentikasi {
    public static void main(String[] args) {
        // Nilai username dan password yang benar
        String usernameBenar = "Mahasiswa Unsri";
        String passwordBenar = "Fasilkom23";

        // Membaca input dari pengguna
        Scanner autentikasi = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = autentikasi.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = autentikasi.nextLine();

        // Memeriksa kecocokan username dan password
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}

