import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = kalkulator.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char Kabataku = kalkulator.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = kalkulator.nextDouble();

        double hasil = 0;

        switch (Kabataku) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }

    //penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    //pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    //perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    //pembagian
    public static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak bisa melakukan pembagian dengan nol.");
            return Double.NaN; // NaN (Not a Number) sebagai penanda operasi tidak valid
        }
    }
}
