import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String input = cek.nextLine();

        if (isPalindrom(input)) {
            System.out.println("kata '" + input + "' adalah palindrom.");
        } else {
            System.out.println("kata '" + input + "' bukan palindrom.");
        }
    }

    // mengecek apakah suatu kata itu palindrom atau tidak
    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah semua karakter ke huruf kecil
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
