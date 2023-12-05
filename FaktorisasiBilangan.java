import java.util.Scanner;

public class FaktorisasiBilangan {
    public static void main(String[] args) {
        Scanner Faktor = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = Faktor.nextInt();

        if (bilangan <= 0) {
            System.out.println("Masukkan bilangan bulat positif yang valid.");
        } else {
            System.out.print("Faktorisasi " + bilangan + ": ");
            faktorisasi(bilangan);
        }
    }

    //faktorisasi
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n = n / i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
