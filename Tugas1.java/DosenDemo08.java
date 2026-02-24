import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen08[] arrayOfDosen = new Dosen08[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria/false=Wanita) : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen08 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            i++;
        }

        sc.close();
      
    }
}