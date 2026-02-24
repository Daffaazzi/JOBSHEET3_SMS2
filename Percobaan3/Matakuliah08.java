package Percobaan3;

public class Matakuliah08 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;                                                  //void untuk menambah data
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakData() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);                   //void untuk mencetak data
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }
}