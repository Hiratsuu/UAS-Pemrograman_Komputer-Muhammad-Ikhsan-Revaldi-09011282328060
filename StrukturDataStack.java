import java.util.Scanner;
import java.util.Stack;

public class StrukturDataStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan = "y";

        while (pilihan.equalsIgnoreCase("y")) {
            System.out.println("Masukkan ekspresi matematika:");
            String ekspresi = scanner.nextLine();

            if (cekKurung(ekspresi)) {
                System.out.println("Urutan kurung pada ekspresi sudah benar.");
            } else {
                System.out.println("Urutan kurung pada ekspresi tidak benar.");
            }

            System.out.println("Cek ekspresi lain? (y/n)");
            pilihan = scanner.nextLine();
        }
    }

    public static boolean cekKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char c = ekspresi.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (top != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
