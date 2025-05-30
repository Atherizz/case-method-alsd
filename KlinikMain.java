import java.util.*;

public class KlinikMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah antrian maksimal : ");
        int max = input.nextInt();
        AntrianPasien antrian = new AntrianPasien(max);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();

                    Pasien pasien = new Pasien(nama, nik, keluhan);
                    antrian.tambahAntrian(pasien);
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;

                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println(">> Antrian kosong.");
                    } else {
                        System.out.println(">> Daftar Antrian:");
                        antrian.tampilkanSemua();
                    }
                    break;

                case 3:
                    if (!antrian.isEmpty()) {
                        Pasien dilayani = antrian.layaniPasien();
                        System.out.println(">> Melayani pasien: " + dilayani.nama);
                    } else {
                        System.out.println(">> Tidak ada pasien dalam antrian.");
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa antrian: " + antrian.getJumlahAntrian());
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println(">> Terima kasih telah menggunakan sistem antrian.");
                    break;

                default:
                    System.out.println(">> Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}