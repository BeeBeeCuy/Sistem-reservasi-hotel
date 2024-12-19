import java.util.Scanner;

public class ReservasiGUI {
    private InterfaceReservasi sistemReservasi;

    public ReservasiGUI(InterfaceReservasi sistemReservasi) {
        this.sistemReservasi = sistemReservasi;
    }

    public void tampilkanFormReservasi() {
        System.out.println("=== Form Reservasi ===");
        System.out.println("1. Buat Reservasi");
        System.out.println("2. Batalkan Reservasi");
        System.out.println("Pilih opsi: ");
    }

    public void validkanDaftarKamar() {
        System.out.println("Menampilkan daftar kamar...");
    }

    public void prosesInputPelanggan() {
        Scanner scanner = new Scanner(System.in);
        tampilkanFormReservasi();
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        switch (pilihan) {
            case 1:
                sistemReservasi.buatReservasi();
                break;
            case 2:
                sistemReservasi.batalkanReservasi();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}