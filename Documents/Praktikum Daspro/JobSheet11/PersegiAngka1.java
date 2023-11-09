import java.util.Scanner;

public class PersegiAngka1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            if (iOuter == 1 || iOuter == 3) {
                for (int i = 0; i <= N; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i <= N; i++) {
                    if (i == 0 || i == N) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
