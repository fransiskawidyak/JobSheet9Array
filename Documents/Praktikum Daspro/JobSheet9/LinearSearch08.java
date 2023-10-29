import java.util.Scanner;

public class LinearSearch08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        }
    }
}
