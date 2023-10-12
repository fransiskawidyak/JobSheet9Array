import java.util.Scanner;

public class DoWhileCuti08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jatahCuti;
        int jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Jumlah hari yang Anda inginkan melebihi sisa jatah cuti.");
                    System.out.print("Silakan masukkan kembali jumlah hari: ");
                    jumlahHari = scan.nextInt();
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}
