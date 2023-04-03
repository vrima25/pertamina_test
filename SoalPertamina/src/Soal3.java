import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int n, i, num1 = 1, num2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang ingin ditampilkan: ");
        n = scanner.nextInt();
        System.out.print("Deret Fibonacci: ");
        for (i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
