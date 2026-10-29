import  java.util.Scanner;

public class Tugas2_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan niali n = ");
        int n = sc.nextInt();

        if (n >= 3) {
            int totalSeluruhAngka = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasilKali = i * j;
                    System.out.printf("%4d", hasilKali);
                    totalSeluruhAngka += hasilKali;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + totalSeluruhAngka);
        } else {
            System.out.println("Nilai n mimimal harus 3.");
        }
        sc.close();
    }   
}