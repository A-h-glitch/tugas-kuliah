import java.util.Scanner;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== Aksi Mahasiswa ===");
        System.out.println("Ketik perintah: membaca | nyontek | modifikasi | exit");

        while (true) {
            System.out.print("> ");
            String perintah = sc.nextLine();

            if (perintah.equalsIgnoreCase("exit")) {
                System.out.println("Program selesai.");
                break;
            } else if (perintah.equalsIgnoreCase("membaca")) {
                mhs.membaca();
            } else if (perintah.equalsIgnoreCase("nyontek")) {
                mhs.nyontek();
            } else if (perintah.equalsIgnoreCase("modifikasi")) {
                mhs.modifikasi();
            } else {
                System.out.println("Perintah tidak dikenali.");
            }
        }

        sc.close();
    }
}