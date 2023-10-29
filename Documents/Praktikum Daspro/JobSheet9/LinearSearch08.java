import java.util.Scanner;

public class LinearSearch08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int banyakElemen = sc.nextInt();

        int[] arrayInt = new int[banyakElemen];
        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < banyakElemen; i++) {
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
