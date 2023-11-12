import java.util.Scanner;
public class Atlet08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] atletBadminton = new String[5];
        String[] atletTenisMeja = new String[5];
        String[] atletBasket = new String[5];
        String[] atletBolaVoli = new String[5];

        System.out.println("Masukkan nama atlet untuk cabang Badminton:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Atlet " + (i + 1) + ": ");
            atletBadminton[i] = sc.nextLine();
        }

        System.out.println("Masukkan nama atlet untuk cabang Tenis Meja:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Atlet " + (i + 1) + ": ");
            atletTenisMeja[i] = sc.nextLine();
        }

        System.out.println("Masukkan nama atlet untuk cabang Basket:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Atlet " + (i + 1) + ": ");
            atletBasket[i] = sc.nextLine();
        }

        System.out.println("Masukkan nama atlet untuk cabang Bola Voli:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Atlet " + (i + 1) + ": ");
            atletBolaVoli[i] = sc.nextLine();
        }

        java.util.Arrays.sort(atletBadminton);
        java.util.Arrays.sort(atletTenisMeja);
        java.util.Arrays.sort(atletBasket);
        java.util.Arrays.sort(atletBolaVoli);

        System.out.println("\nAtlet-atlet Badminton yang akan bertanding:");
        for (String namaAtlet : atletBadminton) {
            System.out.println(namaAtlet);
        }

        System.out.println("\nAtlet-atlet Tenis Meja yang akan bertanding:");
        for (String namaAtlet : atletTenisMeja) {
            System.out.println(namaAtlet);
        }

        System.out.println("\nAtlet-atlet Basket yang akan bertanding:");
        for (String namaAtlet : atletBasket) {
            System.out.println(namaAtlet);
        }

        System.out.println("\nAtlet-atlet Bola Voli yang akan bertanding:");
        for (String namaAtlet : atletBolaVoli) {
            System.out.println(namaAtlet);
        }
    }
}
