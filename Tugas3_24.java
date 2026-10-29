import java.util.Scanner;

public class Tugas3_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko >= 1) {
            int totalBarangSeluruhToko = 0;
            int maxTotalBarang = -1;
            int tokoTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukan jumlah pelanggan untuk Toko " + i + ": ");
                int pelangganPerToko = sc.nextInt();
                int totalBarangPerToko = 0;

                for (int j = 1; j <= pelangganPerToko; j++) {
                    System.out.print(" Jumlah barang Pelanggan " + j + ": ");
                    int barang = sc.nextInt();
                    totalBarangPerToko += barang;
                }
                System.out.println("Toko " + i + " -> pelanggan: " + pelangganPerToko + ", total barang: " + totalBarangPerToko);
                totalBarangSeluruhToko += totalBarangPerToko;

                if (totalBarangPerToko > maxTotalBarang) {
                    maxTotalBarang = totalBarangPerToko;
                    tokoTerbanyak = i;
                }
            }
            System.out.println("");
            System.out.println("Total barang seluruh toko    : " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak : Toko " + tokoTerbanyak);
        } else {
            System.out.println("Jumlah toko minimal harus 1.");
        }
        sc.close();
    }
}