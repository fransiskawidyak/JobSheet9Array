import java.util.Scanner;
public class utspdaspro108 {
    public static void main(String[] args){
        Scanner input08 = new Scanner(System.in);
        int jumlahPeserta;
        System.out.print("jumlah peserta yang mengikuti : ");
        float jmlPeserta = input08.nextFloat();

        System.out.print("nilai tes potensi akademik : ");
        float potensiAkademik = input08.nextFloat();
        System.out.print("nilai tes bahasa Inggris : ");
        float bahasaInggris = input08.nextFloat();
        System.out.print("nilai tes nasionalisme : ");
        float nasionalisme = input08.nextFloat();
        
        float total = (potensiAkademik * 0.3F) + (bahasaInggris * 0.2F) + (nasionalisme * 0.1F);
        String nilaiHuruf;
        String nilaiSetara;
        float nilaiMutu;

        if (total > 80) {
            nilaiHuruf = "A";
            nilaiSetara = "Sangat Baik";
            nilaiMutu = 4;
        } else if (total > 73) {
            nilaiHuruf = "B+";
            nilaiSetara = "Lebih dari Baik";
            nilaiMutu = 3.5F;
        } else if (total > 65) {
            nilaiHuruf = "B";
            nilaiSetara = "Baik";
            nilaiMutu = 3;
        } else if (total > 60) {
            nilaiHuruf = "C+";
            nilaiSetara = "Lebih dari Cukup";
            nilaiMutu = 2.5F;
        } else if (total > 50) {
            nilaiHuruf = "C";
            nilaiSetara = "Cukup";
            nilaiMutu = 2;
        } else if (total > 39) {
            nilaiHuruf = "D";
            nilaiSetara = "Kurang";
            nilaiMutu = 1;
        } else {
            nilaiHuruf = "E";
            nilaiSetara = "Gagal";
            nilaiMutu = 0;
        }
        
        String message = total >75 ? "lolos" : "tidak lolos";
        System.out.println("Nilai rata rata = " + total + " sehingga " + message);

        System.out.println("Nilai akhir = " + total);
        System.out.println("Nilai Huruf = " + nilaiHuruf);
        System.out.println("Nilai Setara = " + nilaiSetara);
        System.out.println("Nilai Mutu = " + nilaiMutu);

    }
}