import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InputSiswa {
    public static void main(String[] args) {
        List<Siswa> daftarSiswa = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Aplikasi Input Siswa ===");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Tampilkan Daftar Siswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Kode untuk tambah siswa
                    break;
                case 2:
                    // Kode untuk tampilkan daftar siswa
                    break;
                case 3:
                    // Kode untuk keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}
