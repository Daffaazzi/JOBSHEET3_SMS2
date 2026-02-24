package Percobaan1;

import java.util.Scanner;

public class percobaan2MD {
    public static void main(String[] args){
        Mahasiswa08[] arrayMahasiswa08 = new Mahasiswa08[3];
        Scanner sc = new Scanner(System.in); {
        String dummy;

      for (int i = 0; i < 3; i++) {
    arrayMahasiswa08[i] = new Mahasiswa08();

    System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
    System.out.print("NIM     : ");
    arrayMahasiswa08[i].nim = sc.nextLine();

    System.out.print("Nama    : ");
    arrayMahasiswa08[i].nama = sc.nextLine();

    System.out.print("Kelas   : ");
    arrayMahasiswa08[i].kelas = sc.nextLine();

    System.out.print("IPK     : ");
    dummy = sc.nextLine();
    arrayMahasiswa08[i].ipk = Float.parseFloat(dummy);
    System.out.println("------------------------------");
}
        }
        arrayMahasiswa08[0] = new Mahasiswa08();
        arrayMahasiswa08[0].nim = "244107060033";
        arrayMahasiswa08[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa08[0].kelas = "SIB-1E";
        arrayMahasiswa08[0].ipk = (float)3.75;

        arrayMahasiswa08[1] = new Mahasiswa08();
        arrayMahasiswa08[1].nim = "2341720172";
        arrayMahasiswa08[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa08[1].kelas = "TI-2A";
        arrayMahasiswa08[1].ipk = (float)3.36;

        arrayMahasiswa08[2] = new Mahasiswa08();
        arrayMahasiswa08[2].nim = "244107023006";
        arrayMahasiswa08[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMahasiswa08[2].kelas = "TI-2E";
        arrayMahasiswa08[2].ipk = (float)3.80;

       for(int i=0; i < 3; i++){
            
            System.out.println(("Data Mahasiswa ke-" + (i+1)));
            System.out.println(("NIM     : " + arrayMahasiswa08[i].nim));
            System.out.println(("Nama    : " + arrayMahasiswa08[i].nama));
            System.out.println(("Kelas   : " + arrayMahasiswa08[i].kelas));
            System.out.println(("IPK     : " + arrayMahasiswa08[i].ipk));
            System.out.println(("------------------------------"));
        }

        }
    }

