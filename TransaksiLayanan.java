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
        System.out.println("Pasien  : " + pasien);
        System.out.println("Dokter  : " + dokter);
        System.out.println("Durasi Layanan  : " + durasiLayanan);
        System.out.println("Biaya   : " + hitungBiaya());
    }

    public int hitungBiaya() {
        int tarifPerJam = 50000;
        return durasiLayanan * tarifPerJam;
    }
}