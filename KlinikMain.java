import java.util.*;

public class KlinikMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Pasien> antrian = new LinkedList<>();
        List<Pasien> riwayat = new ArrayList<>();
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
                    antrian.add(pasien);
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;

                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println(">> Antrian kosong.");
                    } else {
                        System.out.println(">> Daftar Antrian:");
                        for (Pasien p : antrian) {
                            System.out.println("- " + p);
                        }
                    }
                    break;

                case 3:
                    if (!antrian.isEmpty()) {
                        Pasien dilayani = antrian.poll();
                        riwayat.add(dilayani);
                        System.out.println(">> Melayani pasien: " + dilayani.nama);
                    } else {
                        System.out.println(">> Tidak ada pasien dalam antrian.");
                    }
                    break;

                case 4:
                    System.out.println(">> Sisa antrian: " + antrian.size());
                    break;

                case 5:
                    if (riwayat.isEmpty()) {
                        System.out.println(">> Belum ada riwayat transaksi.");
                    } else {
                        System.out.println(">> Riwayat Transaksi:");
                        for (Pasien p : riwayat) {
                            System.out.println("- " + p);
                        }
                    }
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