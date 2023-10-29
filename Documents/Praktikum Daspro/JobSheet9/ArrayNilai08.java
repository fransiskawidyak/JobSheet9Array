import java.util.Scanner;

public class ArrayNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();

            // Menentukan status kelulusan
            if (nilaiAkhir[i] >= 75) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i] + " (" + status[i] + ")");
        }
    }
}
