import java.util.Scanner;

public class StudiKasus2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama Mahasiswa: ");
        String namaMhs = sc.nextLine();
        System.out.print("Masukkan Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jnsKegiatan = sc.nextLine();
        
        String status = "error";
        
        if (jnsKegiatan.equalsIgnoreCase("belmawa") || jnsKegiatan.equalsIgnoreCase("bakorma") || jnsKegiatan.equalsIgnoreCase("mandiri")) {
            byte peringkat = sc.nextByte();
            System.out.print("Peringkat juara: ");
            if (peringkat == 1 || peringkat == 2 || peringkat == 3) {  
                byte jmlDokumen = sc.nextByte();
                System.out.print("Jumlah Dokumen: ");
                if (jmlDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan ( " + jnsKegiatan + " lolos pendanaan)";
                } else {
                    status = "Dokumen tidak lengkap {4 - jmlDokumen}. Dana tidak diberikan.";
                }
            } else {
                status = "Dana tidak diberikan";
            }
            
        } 

        System.out.println("Status: " + status);

    }
}
