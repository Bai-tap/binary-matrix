import java.util.Random;
import java.util.Scanner;

public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random random = new Random();
                int rd = random.nextInt(2);
                System.out.print(rd + " ");
            }
            System.out.println();
        }
    }
}
