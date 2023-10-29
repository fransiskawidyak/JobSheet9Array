import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahNilai = sc.nextInt();
        int[] nilaiMhs = new int[jumlahNilai];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rata2Lulus = totalLulus / jumlahLulus;
        double rata2TidakLulus = totalTidakLulus / jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
}
