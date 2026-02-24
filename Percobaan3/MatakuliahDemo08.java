package Percobaan3;
import java.util.Scanner;
public class MatakuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah08[] arrayMatakuliahDemo08 = new Matakuliah08[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i + 1) + " : ");
            System.out.print("Kode       :  ");
            kode = sc.nextLine();
            System.out.print("Nama       :  ");
            nama = sc.nextLine();
            System.out.print("SKS        :  ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            
            arrayMatakuliahDemo08[i] = new Matakuliah08(kode, nama, sks, jumlahJam);
        }

         for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i + 1) + " : ");
            System.out.println("Kode       : " + arrayMatakuliahDemo08[i].kode);
            System.out.println("Nama       : " + arrayMatakuliahDemo08[i].nama);
            System.out.println("SKS        : " + arrayMatakuliahDemo08[i].sks);
            System.out.println("Jumlah Jam : " + arrayMatakuliahDemo08[i].jumlahJam);
        }

    }
}