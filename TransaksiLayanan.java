public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public void tampilkanInformasi(){
        System.out.println("Pasien  : " + pasien.nama);
        System.out.println("Dokter  : " + dokter.nama);
        System.out.println("Durasi Layanan  : " + durasiLayanan + " jam");
        System.out.println("Biaya   : Rp. " + hitungBiaya());
        System.out.println("==================================");
    }

    public int hitungBiaya() {
        int tarifPerJam = 50000;
        return durasiLayanan * tarifPerJam;
    }
}