import java.util.Scanner;

public class StudiKasus1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Jumlah Cup Kopi anda: ");
        int jumlahCup = sc.nextInt();
        System.out.print("Jumlah uang yang anda bayarkan: ");
        int uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } 

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: Rp." + totalHarga);
        System.out.println("Diskon yang didapatkan: Rp." + diskon);
        System.out.println("total yang harus dibayarkan: Rp." + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }
    }
}
