import java.util.Scanner;

public class StudiKasus2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte peringkat = 0;
        byte jmlDokumen = 0;
        String status = "error";
        System.out.print("Masukkan nama Mahasiswa: ");
        String namaMhs = sc.nextLine();
        System.out.print("Masukkan Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jnsKegiatan = sc.nextLine().trim();
        
        if (jnsKegiatan.equalsIgnoreCase("belmawa") || jnsKegiatan.equalsIgnoreCase("bakorma") || jnsKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Peringkat juara: ");
            peringkat = sc.nextByte();
            if (peringkat == 1 || peringkat == 2 || peringkat == 3) {  
                System.out.print("Jumlah Dokumen: ");
                jmlDokumen = sc.nextByte();
                if (jmlDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan ( " + jnsKegiatan + " lolos pendanaan)";
                } else {
                    status = "Dokumen tidak lengkap ( kurang " + (4 - jmlDokumen) + " dokumen). Dana tidak diberikan.";
                }
            } else {
                status = "Dana tidak diberikan";
            }
            
        } else if (jnsKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Masukkan status pendanaan PKM (1 = lolos, 0 = tidak lolos)");
            byte pkmStatus = sc.nextByte();
            
            if (pkmStatus == 1) {
                System.out.print("Jumlah Dokumen: ");
                jmlDokumen = sc.nextByte();
                if (jmlDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan ( " + jnsKegiatan + " lolos pendanaan)";
                } else {
                    status = "Dokumen tidak lengkap ( kurang " + (4 - jmlDokumen) + " dokumen). Dana tidak diberikan.";
                }
            } else if (pkmStatus == 0) {
                status = "Dana tidak diberikan";
            }
        } else if (jnsKegiatan.equalsIgnoreCase("lainnya")) {
            status = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan)";
        }

        sc.close();

        System.out.println("========================================");
        System.out.println("Validasi Dokumen Prestasi Mahasiswa 2026");
        System.out.println("========================================");
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("Jenis Kegiatan : " + jnsKegiatan);
        System.out.println("Jumlah Dokumen : " + jmlDokumen);
        System.out.println("Peringkat Juara: " + peringkat);
        System.out.println("Status         : " + status);

    }
}
