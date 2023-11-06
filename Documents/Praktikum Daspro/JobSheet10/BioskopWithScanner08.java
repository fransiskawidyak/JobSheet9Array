import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxKolom = 15;
        int maxBaris = 100;
        String nama;
        String next;
        String[][] penonton = new String[100][15];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    inputDataPenonton(penonton, maxBaris, maxKolom, sc);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

        public static void inputDataPenonton(String[][] penonton, int baris, int kolom, Scanner sc) {
        System.out.print("Nama penonton: ");
        String nama = sc.nextLine();

        int Baris;
        int Kolom;
        boolean kursiTersedia = false;

        do {
            System.out.print("Nomor baris (1 - " + baris + "): ");
            baris = sc.nextInt();
            System.out.print("Nomor kolom (1 - " + kolom + "): ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 1 && baris <= baris && kolom >= 1 && kolom <= kolom) {
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    kursiTersedia = true;
                } else {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Nomor baris atau kolom kursi tidak valid. Silakan coba lagi.");
            }
        } while (!kursiTersedia);
    }

    public static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + ": ***");
                }
            }
        }
    }
}
