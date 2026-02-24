package Percobaan1;

public class MahasiswaMain08 {
    public static void main(String[] args){
        Mahasiswa08[] arrayMahasiswa08 = new Mahasiswa08[3];
        arrayMahasiswa08[0] = new Mahasiswa08();
        arrayMahasiswa08[0].nim = "24410706033";
        arrayMahasiswa08[0].nama = "Andi";
        arrayMahasiswa08[0].kelas = "TI-1A";
        arrayMahasiswa08[0].ipk = (float)3.5f;

        arrayMahasiswa08[1] = new Mahasiswa08();
        arrayMahasiswa08[1].nim = "2341720172";
        arrayMahasiswa08[1].nama = "Budi";
        arrayMahasiswa08[1].kelas = "TI-1B";
        arrayMahasiswa08[1].ipk = 3.7f;

        arrayMahasiswa08[2] = new Mahasiswa08();
        arrayMahasiswa08[2].nim = "244107023006";
        arrayMahasiswa08[2].nama = "Citra";
        arrayMahasiswa08[2].kelas = "TI-1C";
        arrayMahasiswa08[2].ipk = (float)3.9f;

        System.out.println(("NIM     : " + arrayMahasiswa08[0].nim));
        System.out.println(("Nama    : " + arrayMahasiswa08[0].nama));
        System.out.println(("Kelas   : " + arrayMahasiswa08[0].kelas));
        System.out.println(("IPK     : " + arrayMahasiswa08[0].ipk));
        System.out.println(("------------------------------"));
        System.out.println(("NIM     : " + arrayMahasiswa08[1].nim));
        System.out.println(("Nama    : " + arrayMahasiswa08[1].nama));
        System.out.println(("Kelas   : " + arrayMahasiswa08[1].kelas));
        System.out.println(("IPK     : " + arrayMahasiswa08[1].ipk));
        System.out.println(("------------------------------"));
        System.out.println(("NIM     : " + arrayMahasiswa08[2].nim));
        System.out.println(("Nama    : " + arrayMahasiswa08[2].nama));
        System.out.println(("Kelas   : " + arrayMahasiswa08[2].kelas));
        System.out.println(("IPK     : " + arrayMahasiswa08[2].ipk));
        System.out.println(("------------------------------"));
    }
}
