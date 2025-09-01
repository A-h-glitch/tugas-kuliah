import java.util.Scanner;

public class DemoNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nilai data = new Nilai();

        System.out.println("=== Nilai Mahasiswa ===");
        System.out.println("Perintah: input | hitung | cetak | exit");

        while (true) {
            System.out.print("> ");
            String perintah = sc.nextLine();

            if (perintah.equalsIgnoreCase("exit")) {
                System.out.println("Program selesai.");
                break;
            } else if (perintah.equalsIgnoreCase("input")) {
                System.out.print("Masukkan NIM   : ");
                data.nim = sc.nextLine();
                System.out.print("Masukkan Nama  : ");
                data.nama = sc.nextLine();
                System.out.print("Nilai Absen    : ");
                data.absen = sc.nextDouble();
                System.out.print("Nilai Tugas    : ");
                data.tugas = sc.nextDouble();
                System.out.print("Nilai UTS      : ");
                data.uts = sc.nextDouble();
                System.out.print("Nilai UAS      : ");
                data.uas = sc.nextDouble();
                sc.nextLine(); // bersihkan buffer
                System.out.println("Data berhasil dimasukkan!");
            } else if (perintah.equalsIgnoreCase("hitung")) {
                data.Nilai();
                System.out.println("Nilai akhir berhasil dihitung!");
            } else if (perintah.equalsIgnoreCase("cetak")) {
                data.CetakNilai();
            } else {
                System.out.println("Perintah tidak dikenali.");
            }
        }

        sc.close();
    }
}