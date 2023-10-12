import java.util.Scanner;

public class WhileKelipatanNoAbsen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        int total = 0;
        float rataRata = 0;

        int i;

        System.out.print("Masukkan bilangan kelipatan (1-9):");
        kelipatan = scan.nextInt();

        if (kelipatan < 1 || kelipatan > 9) {
            System.out.println("Nilai kelipatan harus lebih besar dari 1 dan kurang dari atau sama dengan 9");
            return;
        }

        i = 5;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah++;
                total += i;
                rataRata = total / jumlah;
            }
            i++;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
